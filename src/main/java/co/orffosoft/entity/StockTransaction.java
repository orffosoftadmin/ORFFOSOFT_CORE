package co.orffosoft.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode(callSuper = false, of = "stock_tran_pk")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "stock_transaction")
@Getter
@Setter
public class StockTransaction implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_transaction_stock_tran_pk_seq" )
	@SequenceGenerator(name = "stock_transaction_stock_tran_pk_seq", sequenceName = "stock_transaction_stock_tran_pk_seq" )
	private Long stock_tran_pk;
	
	@Column(name = "stock_tran_grn_h_id_fk")
	private Long stock_tran_grn_h_id_fk;
	
	@Column(name = "stock_tran_supplier_id_fk")
	private Long stock_tran_supplier_id_fk;
	
//	@Column(name = "stock_tran_sku_id_fk")
//	private Long stock_tran_sku_id_fk;
	
	@ManyToOne
	@JoinColumn(name = "stock_tran_sku_id_fk", columnDefinition = "id", foreignKey = @ForeignKey(name = "stock_tran_sku_id_fk"))
	private ProductVarietyMaster productVarietyMaster;
	
	@Column(name = "stock_tran_date")
	private Date stock_tran_date;
	
	@Column(name = "stock_tran_opening_bal")
	private Double stock_tran_opening_bal;
	
	@Column(name = "stock_tran_received_qnty")
	private Double stock_tran_received_qnty;
	
	@Column(name = "stock_tran_type_fk")
	private Long stock_tran_type_fk;
	
	@Column(name = "stock_tran_issued_qnty")
	private Double stock_tran_issued_qnty;
	
	@Column(name = "stock_tran_closing_bal")
	private Double stock_tran_closing_bal;
	
	@Column(name = "stock_tran_purchaseprice")
	private Double stock_tran_purchaseprice;
	
	@Column(name = "stock_tran_sellingprice")
	private Double stock_tran_sellingprice;
	
	@Column(name = "created_by")
	private Long created_by;
	
	@Column(name = "created_date")
	private Date created_date;
	
	@Column(name = "modified_by")
	private Long modified_by;
	
	@Column(name = "modified_date")
	private Date modified_date;
	
	@Column(name = "bill_d_fk")
	private long bill_d_fk;
	
	@Column(name = "bill_d_bill_h_fk")
	private long bill_d_bill_h_fk;
	
	@ManyToOne
	@JoinColumn(name = "stock_tran_store_entity_fk", columnDefinition = "id", foreignKey = @ForeignKey(name = "fk_entity_id"))
	private EntityMaster storeEntity;
	
	@Column(name = "stock_tran_item_price_fk")
	private Long stock_tran_item_price_fk;
	
	@Column(name = "expiry_date")
	private Date expiryDate;
	
	@Column(name="item_barcode_number")
	private String item_barcode_number;
	
	@Column(name = "cgst_value")
	private Double cgstvalue;
	
	@Column(name = "sgst_value")
	private Double sgstvalue;
	
	@Column(name = "discount_value")
	private Double discountvalue;
	
	@Transient
	private Date todate;
	
	
	

}

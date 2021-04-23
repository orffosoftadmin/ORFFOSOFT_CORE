package co.orffosoft.entity;

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

import lombok.Data;

@Entity
@Data
@Table(name = "goods_change_history")
public class Goods_Change_History {
	
	@Id
	@SequenceGenerator(name = "goods_change_history_id_seq", sequenceName = "goods_change_history_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "goods_change_history_id_seq")
	@Column(name = "id", updatable = false)
	private Long id;
	
	@Column(name = "grn_id")
	private Long grnId;
	
	@Column(name = "old_qty")
	private Double oldQty;
	
	@Column(name = "new_qty")
	private Double newQty;
	
	@Column(name = "old_purchaes_price")
	private Double oldPurchaesPrice;
	
	@Column(name = "new_purchaes_price")
	private Double newPurchaesPrice;
	
	@Column(name = "old_sell_price")
	private Double oldSellPrise;
	
	@Column(name = "new_sell_price")
	private Double newSellPrise;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "created_by")
	private Long createdBy;
	
	@Column(name = "remarks")
	private String remarks;
	
	@ManyToOne
	@JoinColumn(name = "product_variety_id", columnDefinition = "id", foreignKey = @ForeignKey(name = "st_tran_sku_id_fk"))
	private ProductVarietyMaster product_variety_id;
	

}

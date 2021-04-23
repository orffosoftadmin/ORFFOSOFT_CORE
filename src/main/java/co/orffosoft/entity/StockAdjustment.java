package co.orffosoft.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "stock_adjustment")
public class StockAdjustment {
	
	
	@Id
	@SequenceGenerator(name = "stock_adjustment_id_seq", sequenceName = "stock_adjustment_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_adjustment_id_seq")
	@Column(name = "id", updatable = false)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "userid")
	private Long userId;
	
	@Column(name = "storecode")
	private String storeCode;
	
	@Column(name = "storename")
	private String storeName;
	
	@Column(name = "itemid")
	private Long itemId;
	
	@Column(name = "action")
	private String action="null";
	
	@Column(name = "actionqty")
	private Double actionQty;
	
	
	@Column(name = "createdate")
	private Date createdate;
	
	@Column(name = "itemrate")
	private double itemrate;
	
	@Column(name = "stock_tran_adj_date")
	private Date stockdate;
	
	@Column(name = "purchase_price")
	private Double purchasePrice;

}

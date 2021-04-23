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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode(callSuper = false, of = "id")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "direct_billing_d")
@ToString
@Getter
@Setter
public class DirectBilling_D implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4079082470058446880L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "direct_billing_d_id_seq")
	@SequenceGenerator(name = "direct_billing_d_id_seq", sequenceName = "direct_billing_d_id_seq")
	@Column(name = "id", updatable = false)
	private Long id;

	@Column(name = "direct_billing_h_fk")
	private Long direct_billing_h_fk;

	@ManyToOne
	@JoinColumn(name = "product_variety_id", columnDefinition = "id", foreignKey = @ForeignKey(name = "fk_bill_items_productvarietyid"))

	private ProductVarietyMaster product_variety_id;

	@Column(name = "uom_id")
	private Long uom_id;
	
	@Column(name = "unit_rate")
	private Double unit_rate;

	@Column(name = "item_qty")
	private Long item_qty;

	@Column(name = "discount_percent")
	private Double discount_percent;
	
	@Column(name = "discount_value")
	private Double discount_value;

	@Column(name = "total_netprice")
	private Double total_netprice;

	@Column(name = "created_by")
	private Long created_by;
	
	@Column(name = "created_date")
	private Date created_date;

	@Column(name = "modified_by")
	private Long modified_by;

	@Column(name = "modified_date")
	private Date modified_date;

}

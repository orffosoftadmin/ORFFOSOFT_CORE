package co.orffosoft.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode(callSuper = false, of = "id")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "direct_billing_h", uniqueConstraints = {
		@UniqueConstraint(name = "bill_number", columnNames = "bill_number"),
		@UniqueConstraint(name = "entityid", columnNames = "entityid") })
@ToString
@Getter
@Setter
public class DirectBilling_H implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2844827113823787772L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "direct_billing_h_id_seq")
	@SequenceGenerator(name = "direct_billing_h_id_seq", sequenceName = "direct_billing_h_id_seq")
	@Column(name = "id", updatable = false)
	private Long id;

	@Column(name = "bill_number")
	private String billNumber;

	@Column(name = "entityid")
	private Long entityid;

	@Column(name = "customername")
	private String customername;
	
	@Column(name = "mobile_number")
	private Long mobileNumber;

	@Column(name = "bill_date")
	private Date billDate;

	@Column(name = "bill_value")
	private Double billValue;
	
	@Column(name = "discount_percent")
	private Double discountPercent;

	@Column(name = "discount_value")
	private Double discountValue;

	@Column(name = "net_total")
	private Double netTotal;
	
	@Column(name = "payment_type_id")
	private Long paymentTypeId;

//	@Column(name = "created_by")
//	private Long createdBy;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "created_by", columnDefinition = "id", foreignKey = @ForeignKey(name = "created_by"))
	private UserMaster createdBy;

	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "modified_by")
	private Long modifiedBy;

	@Column(name = "modified_date")
	private Date modifiedDate;
	
	@Transient
	private String date;
	
	@Transient
	private String username;

}

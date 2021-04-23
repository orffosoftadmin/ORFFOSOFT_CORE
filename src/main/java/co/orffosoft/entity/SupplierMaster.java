/**
 * 
 */
package co.orffosoft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.orffosoft.core.util.Trackable;
import co.orffosoft.dto.PaginationDTO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
// @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@EqualsAndHashCode(callSuper = false, of = "id")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "supplier_master", uniqueConstraints = {
		@UniqueConstraint(name = "uq_supplier_master_code", columnNames = "code"),
		@UniqueConstraint(name = "uq_supplier_master_name", columnNames = "name") })
@AssociationOverrides({
		@AssociationOverride(name = "created_by", joinColumns = @JoinColumn(name = "fk_supplier_master_createdby")),
		@AssociationOverride(name = "modified_by", joinColumns = @JoinColumn(name = "fk_supplier_master_modifiedby")) })
@ToString
@Getter
@Setter
public class SupplierMaster extends Trackable implements Serializable {

	private static final long serialVersionUID = -3772243515279792934L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_master_id_seq")
	@SequenceGenerator(name = "supplier_master_id_seq", sequenceName = "supplier_master_id_seq")
	@Column(name = "id", updatable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id", columnDefinition = "id", foreignKey = @ForeignKey(name = "fk_supplier_master_parentid"))
	private SupplierMaster parent;

	@Column(name = "code")
	private String code;

	@Column(name = "name")
	private String name;

	@Column(name = "l_name")
	private String localName;

	@Column(name = "registration_date")
	private Date registrationDate;

	@Column(name = "gst_number")
	private String gstNumber;

	@Column(name = "primary_contact_name")
	private String primaryContactName;

	@Column(name = "primary_contact_number")
	private String primaryContactNumber;

	@Column(name = "primary_email")
	private String primaryEmail;

	@Column(name = "secondary_contact_name")
	private String secondaryContactName;

	@Column(name = "secondary_contact_number")
	private String secondaryContactNumber;

	@Column(name = "secondary_email")
	private String secondaryEmail;

	@Column(name = "active_status")
	private Boolean activeStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", columnDefinition = "id", foreignKey = @ForeignKey(name = "fk_supplier_master_addressid"))
	AddressMaster addressId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", columnDefinition = "id", foreignKey = @ForeignKey(name = "fk_supplier_master_userid"))
	private UserMaster userMaster;

	@Column(name = "version")
	@Version
	private Long version;

	@Column(name = "description")
	private String description;

	@Transient
	PaginationDTO paginationDTO;

	@Transient
	Map<String, Object> filters;

	@Transient
	private Double currentReqQty;

	@Transient
	private Double openingStockQty;

	@Column(name = "registration_number")
	private String registrationNumber;

	@Column(name = "aadhaar_number")
	private String aadharNumber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "supplier_state")
	private String state;
	
	@Column(name = "supplier_city")
	private String city;
	
	@Column(name = "account_holder_name")
	private String accountholdername;
	
	@Column(name = "ifsccode")
	private String ifsccode;
	
	@Column(name = "bank_name")
	private String bankname;
	
	@Column(name = "account_number")
	private String accountNumber;

	public SupplierMaster() {
		// TODO Auto-generated constructor stub
	}

	public SupplierMaster(Long id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}

	public SupplierMaster(String code, String name) {
		this.code = code;
		this.name = name;
	}
	

	public SupplierMaster(Long id, String code, String name ,String gstNumber) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.gstNumber= gstNumber;
	}

	@Transient 
	 String UserName;

}

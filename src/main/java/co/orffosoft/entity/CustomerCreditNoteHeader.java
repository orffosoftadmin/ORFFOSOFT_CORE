package co.orffosoft.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.engine.spi.CascadeStyle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "customer_credit_note_header")
@Getter
@Setter
public class CustomerCreditNoteHeader implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3216659733318332424L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_credit_note_h_pk_seq")
	@SequenceGenerator(name = "customer_credit_note_h_pk_seq", sequenceName = "customer_credit_note_h_pk_seq")
	@Column(name = "cus_credit_note_pk", updatable = false)
	private Long cusCreditNotePk;
	
	@ManyToOne
	@JoinColumn(name = "customer_fk", columnDefinition = "id", foreignKey = @ForeignKey(name = "fk_cus_credit_header_customer_fk"))
	private CustomerMaster customerMaster;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="customerCreditNoteHeader",cascade= CascadeType.ALL)
	private List<CustomerCreditNoteDetail> customerCreditNoteDetail  =new ArrayList<CustomerCreditNoteDetail>();
	
	@ManyToOne
	@JoinColumn(name = "bill_h_fk", columnDefinition = "bill_h_pk", foreignKey = @ForeignKey(name = "bill_h_fk"))
	private Bill_H billhfk;
	
	@Column(name = "cus_credit_bill_no")
	private String cusCreditBillNo;
	
//	@Column(name = "cus_mob_no")
//	private Long cusMobileNo;
	
	@Column(name = "transaction_date")
	private Date transactionDate;

	@Column(name = "total_credit_amount")
	private Double  totalCreditAmount;

	@Column(name = "created_by")
	private Long created_by;

	@Column(name = "created_date")
	private Date created_date;

	@Column(name = "modified_by")
	private Long modified_by;

	@Column(name = "modified_date")
	private Date modified_date;
	
	
	@ManyToOne
	@JoinColumn(name = "entity_id", columnDefinition = "id", foreignKey = @ForeignKey(name = "entity_id"))
	private EntityMaster entitymaster;
	
	
//	@Column(name = "cus_name")
//	private String cus_Name;
//	
//	@Column(name = "address")
//	private String cus_Address;

}

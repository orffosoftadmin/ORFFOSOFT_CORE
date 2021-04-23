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

import lombok.Getter;
import lombok.Setter;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "customer_credit_note_detail")
@Getter
@Setter
public class CustomerCreditNoteDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6281785322588879996L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_credit_note_d_pk_seq")
	@SequenceGenerator(name = "customer_credit_note_d_pk_seq", sequenceName = "customer_credit_note_d_pk_seq")
	@Column(name = "cus_credit_note_d_pk", updatable = false)
	private Long cusCreditNote_d_Pk;

	@ManyToOne
	@JoinColumn(name = "cus_credit_note_h_fk", columnDefinition = "cusCreditNotePk", foreignKey = @ForeignKey(name = "fk_cus_credit_note_header"))
	private CustomerCreditNoteHeader customerCreditNoteHeader;
	
	@ManyToOne
	@JoinColumn(name = "bill_h_fk", columnDefinition = "bill_h_pk", foreignKey = @ForeignKey(name = "bill_h_fk"))
	private Bill_H billhfk;
	
	@ManyToOne
	@JoinColumn(name = "entity_id", columnDefinition = "id", foreignKey = @ForeignKey(name = "entity_id"))
	private EntityMaster entitymaster;

	@Column(name = "paid_amount")
	private Double paidAmount;
	
	@Column(name = "credit_amount")
	private Double creditAmount;

	
	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "modified_by")
	private Long modifiedBy;

	@Column(name = "modified_date")
	private Date modifiedDate;
	
	@Column(name = "trnsaction_date")
	private Date transaction;  

	@Column(name = "transaction_type")
	private String transactiontype;
	
	@Column(name = "bill_h_bill_no")
	private String billh_billno;
	
	
}

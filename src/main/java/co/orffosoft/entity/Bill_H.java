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
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode(callSuper = false, of = "bill_h_pk")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "bill_h", uniqueConstraints = {
		@UniqueConstraint(name = "bill_h_pk", columnNames = "bill_h_pk"),
		@UniqueConstraint(name = "bill_h_bill_no", columnNames = "bill_h_bill_no") })
@ToString
@Getter
@Setter
public class Bill_H implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 3212189960156721419L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bill_h_bill_h_pk_seq")
	@SequenceGenerator(name = "bill_h_bill_h_pk_seq", sequenceName = "bill_h_bill_h_pk_seq")
	@Column(name = "bill_h_pk", updatable = false)
	private Long bill_h_pk;

	@Column(name = "bill_h_date")
	private Date bill_h_date;

	@Column(name = "bill_h_customer_fk")
	private Long bill_h_customer_fk;

	@Column(name = "bill_h_bill_no")
	private String bill_h_bill_no;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bill_h_entity_fk", columnDefinition = "id", foreignKey = @ForeignKey(name = "bill_h_entity_fk"))
	private EntityMaster storeEntity;

	@Column(name = "bill_h_net_amount")
	private Double bill_h_net_amount;
	
	@Column(name = "created_by")
	private Long created_by;

	@Column(name = "created_date")
	private Date created_date;

	@Column(name = "modified_by")
	private Long modified_by;

	@Column(name = "modified_date")
	private Date modified_date;
	
	@Column(name = "collect_amount")
	private Double collect_amount;
	
	@Column(name = "case_mode")
	private Integer case_mode;
	
	@Column(name = "bill_status")
	private String bill_status;

}

package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "payment_mode")
@ToString
@Getter
@Setter
public class PaymentMode implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7642584150823468286L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_mode_id_seq")
	@SequenceGenerator(name = "payment_mode_id_seq", sequenceName = "payment_mode_id_seq")
	@Column(name = "id", updatable = false)
	private Long id;

	@Column(name = "payment_mode")
	private String paymentMode;

	@Column(name = "created_by")
	private Long createdBy;
	
	@Column(name = "created_date")
	private Date createdDate;

}

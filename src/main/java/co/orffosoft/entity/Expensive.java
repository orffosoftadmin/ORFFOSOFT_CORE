package co.orffosoft.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import co.orffosoft.dto.CustomerBillingDTO;
import lombok.Data;

@Entity
@Data
@Table(name = "expensive")
public class Expensive {
	
	@Id
	@SequenceGenerator(name = "expensive", sequenceName = "expensive", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expensive")
	@Column(name = "id", updatable = false)
	private Long id;
	
	@Column(name = "item_name")
	private String itemname;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "gst_amount")
	private Double gstamount;
	
	@Column(name = "gst_number")
	private String gstnumber;
	
	@Column(name = "vendor_name")
	private String vendorname;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "created_date")
	private Date createddate;
	
	@Column(name = "created_by")
	private Long createdby;
	
	@Column(name = "modify_date")
	private Date modifydate;
	
	@Column(name = "modify_by")
	private Long modifyby;
	
	@Column(name = "entity_id")
	private Long entityid;
	
	
	
	

}

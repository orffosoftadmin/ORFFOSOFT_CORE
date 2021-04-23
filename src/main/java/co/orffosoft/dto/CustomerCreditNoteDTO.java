package co.orffosoft.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import co.orffosoft.entity.Bill_H;
import co.orffosoft.entity.CustomerCreditNoteDetail;
import co.orffosoft.entity.CustomerMaster;
import lombok.Data;

@Data
public class CustomerCreditNoteDTO implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 8951182018703042941L;

	Long cusHeaderCreditNotePk;
	
	CustomerMaster customerMaster;
	
	Long cusHeaderCreditNoteFk;
	
	Long cusDetailCreditNotePk;
	
	String customerName;
	
	String customerAddress;
	
	Long customerMobileNo;
	
	Double totalCreditAmount;
	
	Double totalPaidAmount;
	
	Double paidAmount;
	
	Date paidAmountdate;
	
	Double addamount;
	
	Double totalPendingAmount;
	
	Double lastPaidAmount;
	
	Double receiveAmount;
	
	String note;
	
	String creditBillNo;
	
	Date transactionDate;
	
	Long createdBy;
	
	String createdByStr;
	
	String username;
	
	Date createdDate;
	
	Long modifiedBy;
	
	String modifiedByStr;

	Date modifiedDate;
	
	Long custmermasterpk;
	
	String transactiontype;
	
	String billhbillno;
	
	Long bill_h_fk;
	

	
	@Transient
	PaginationDTO paginationDTO;

	@Transient
	Map<String, Object> filters;
	
	List<CustomerCreditNoteDTO> customerCreditNoteDTOList;
	List<CustomerCreditNoteDTO> listCreditNotedtl;
	
	String action;
	
}

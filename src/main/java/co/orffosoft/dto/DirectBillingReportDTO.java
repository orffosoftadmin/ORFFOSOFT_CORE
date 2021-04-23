package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
public class DirectBillingReportDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String storeName;
	
	String customername;
	
	Long directBillingH;
	
	Long directBillingD;
	
	Long mobilenumber;
	
	Long productVarietyId;
	
	String itemname;
	
	Long billedQnty;
	
	Double sellingPrice;
	
	Double totalSellingPrice;
	
	Double discountAmt;
	
	Double totalNetPrice;
	
	String billNo;
	
	Date billdate;
	
	String date;
	
	Date fromdate;
	Date todate;
	
	@JsonBackReference
	List<DirectBillingDTO> directBillingDTOList;

}

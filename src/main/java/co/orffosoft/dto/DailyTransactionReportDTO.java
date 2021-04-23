package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class DailyTransactionReportDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3803663386621461351L;
	
	Long bill_Id;
	
	Long billhpk;

	String customerName;
	
	String storeCode;
	
	String storeName;
	
	Long userId;
	
	Long customerMobileNo;

	String billNo;
	
	Date billDate;
	
	String billDateStr;
	
	Date fromDate;
	
	String fromDateStr;
	
	Date toDate;
	
	String toDateStr;
	
	String itemName;
	
	Double qnty;
	
	Double unitPrice;
	
	Double cgst;
	
	Double sgst;
	
	Double discount;
	
	Double discountpersentage;
	
	Double netPrice;
	
	String userName;
	
	Double cgstPercent;
	
	Double cgstAmount;
	
	Double sgstPercent;
	
	Double sgstAmount;
	
	Double totalUnitPrice;
	
	Long itemId;
	
}


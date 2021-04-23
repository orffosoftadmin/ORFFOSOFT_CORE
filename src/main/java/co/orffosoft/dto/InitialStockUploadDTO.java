package co.orffosoft.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class InitialStockUploadDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7794042911312265943L;

	String itemName;

	Double quantity;

	Double cgstPercentage;

	Double sgstPercentage;

	Double purchaseAmout;

	Double sellingAmount;

	Double cgstAmount;

	Double sgstAmount;

	Double netAmount;

	Long itemCode;

	Double totalPurchaseAmt;

	Double totalSellingAmt;
	
	String status;
	
	double discountAmount;
	
	double discountPercentage;
	
	long hsncode;

}

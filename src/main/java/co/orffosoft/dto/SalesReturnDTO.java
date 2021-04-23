package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class SalesReturnDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4734555980938145396L;
	
	Date fromDate;
	
	Date toDate;
	
	String fromDateStr;
	
	String toDateStr;
	
	Long customerMobileNo;
	
	String customerName;
	
	String billNo;
	
	Date billDate;
	
	String itemName;
	
	Double qnty;
	
	Double unitPrice;
	
    Long cgst;
	
	Long sgst;
	
	Double discount;
	
	Double discountPercentage;
	
	Double netPrice;
	
	Double netPrice1;
	
	String userName;
	
	Double cgstPercent;
	
	Double cgstAmount;
	
	Double sgstPercent;
	
	Double sgstAmount;
	
	Double returnedCgstPercent;
	
	Double returnedCgstAmount;
	
	Double returnedSgstPercent;
	
	Double returnedSgstAmount;
	
	Double totalUnitPrice;
	
	Long userId;
	
	String storeCode;
	
	String storeName;
	
	Boolean isSelected;
	
	Long billId;
	
	List<SalesReturnDTO> salesReturnDTOList;
	
	String hsnCode;
	
	Long customerFk;
	
	Long itemId;
	
	Double returnedQnty;
	
	Double returnedAmount;
	
	Long bill_h_pk;
	
	Long bill_d_pk;
	
	Long stock_tran_sku_id_fk;
	
	String barcode;
	
	Long itemPricePk;
	
	Double purchesprice;
	
	String uomName;
	
	Long feet;
	
	Double inches;

}

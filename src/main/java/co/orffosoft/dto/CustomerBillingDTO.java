package co.orffosoft.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.orffosoft.entity.CustomerMaster;
import co.orffosoft.entity.ProductVarietyMaster;
import lombok.Data;

@Data
public class CustomerBillingDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3803663386621461351L;
	
	String barcode;
	
	boolean barcodebool= true;
	
	Long tableId;

	Long bill_H_Pk;
	
	Date billDate;
	
	Date expiryDate;
	
	List<Date> list_expiryDate;
	
	Long bill_H_CustomerFK;
	
	String bill_H_BillNo;
	
	Long bill_D_Pk;
	
	Long bill_D_Bill_H_Fk;
	
	Long bill_D_SkuFk;
	
	Double bill_D_ItemQnty;
	
	Double bill_D_SellingPrice;
	
	Double bill_D_PurchasePrice;
	
	Double bill_D_DiscountPercentage;
	
	Double bill_D_DiscountValue=0D;
	
	Double bll_D_CgstPercentage;
	
	Double bill_D_CgstValue;
	
	Double bill_D_Sgst_Percentage;
	
	Double bill_D_SgstValue;
	
	Double bill_D_NetAmount;
	
	String ItemCode;
	
	String itemName;
	
	String itemCodeName;
	
	String storeName;
	
	String hsnCode;
	
	Double stockQnty;
	
	Long created_By;
	
	Date created_Date;
	
	Long modified_By;
	
	Date modified_date;
	
	String uomName;
	
	String paymentmode;
	
	Double billedQnty;
	
	Double unitRate;
	
	Double totalRate;
	
	Double discountPercent= 0D;
	
	Double cgstPercent;
	
	Double cgstAmount;
	
    Double sgstPercent;
	
	Double sgstAmount; 
	
	Double totalNetPrice;
	
//	Double sellingPrice;
	
	List<Double> sellingPrices;
	
//	HashMap<Double, Long> rateStockQty;
//	HashMap<Double, Double> purchesprice;
	
	Double rateQTY;
	
	Long itemId;
	
	List<Double> itemUnitRates;
	
	Long supplierId;
	
	String supplierName;
	
	List<CustomerBillingDTO> customerBillingDTOList = new ArrayList<>();
	
	List<CustomerBillingDTO> billingDtoList;
	
	Double reciveAmount;
	
	CustomerMaster customerMaster;
	
	String customerBillingType;
	
//	List<Long> itemPricePk;
//	HashMap<Double, Long> rateWithitemPricePk;
	
	Double totalRate1;
	Double totalGst;
	Double netAmount1;
	
	Double purchasePrice;
	Double sellingPrice;
	Long itemPricePk;
	Double rateStockQty;
	Double totalgstamount;
	Long feet;
	Double inches;
	Double remainingClosingStockForFeetInches;
	
	ProductVarietyMaster productVarietyMaster;
	
	
	
}

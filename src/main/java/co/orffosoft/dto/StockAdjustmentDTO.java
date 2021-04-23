package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

@Data
public class StockAdjustmentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4448185337860239935L;

	String name;
	Long userId;
	String storeCode;
	String storeName;
	Long itemId;
	Double itemQty;
	Double rateWiseQnty;
	Double unitRate;
	boolean chngeprice;
	
	String action="null";
	Double actionQty;
//	List<Double> sellingPrices;
	Map<Double,Long> sellingPrices;
	Map<Double, Double> rateWiseQnty1; 
	Long itemPricePk;
    String barcode;
    String uomName;
    Long feet;
    Double inches;
    Double purchesprice;
    Double sellingprice;
    
    Double cgstamount;
    Double sgstamount; 
}

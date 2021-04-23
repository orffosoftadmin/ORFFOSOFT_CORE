package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;

import co.orffosoft.entity.EntityMaster;
import co.orffosoft.entity.ProductVarietyMaster;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class DailyStockTransactionReportDTO implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 2284750849933451699L;
	
	String itemName;
	
	Date fromDate;
	
	String fromDateStr;
	
	Date toDate;
	
	String toDateStr;
	
	
	Long itemId;
	
	Long userId;
	
	EntityMaster entityMaster;
	
	
	ProductVarietyMaster productVarietyMaster;
	
	Date stockTransactionDate;
	
	String saleType;
	
	Double openingStockQty;
	
	Double totalClosingStockQnty;
	
	Double saleQnty;
	
	Double saleReturnQnty;
	
	String TransactionType;
	
	Double stockAdjuestMentAddQnty;
	
	Double stockadjusmtneMinusQnty;
	
	Double expiredQnty;
	
	Double damageQnty;
	
	String storeCode;
	
	String storeName;
	
	Double grnReceivedQnty;
	
	Double itemIssuedQnty;
	
	Double itemReceivedQnty;
	
	Long autoIncrement;
	
	Double itemPrice;
	
	Long itemPricePK;

}

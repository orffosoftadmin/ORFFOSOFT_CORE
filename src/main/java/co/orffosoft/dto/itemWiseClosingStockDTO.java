package co.orffosoft.dto;

import java.util.Date;

import co.orffosoft.entity.ProductVarietyMaster;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class itemWiseClosingStockDTO {
	
	

	private String itemName;
	
	private double itemPrice;
	
	private double itemPurchesPrice;
	
	private Date toDate;
	
	private Date stockTransactionDate;
	
	private double totalClosingStockQnty;
	
	ProductVarietyMaster productVarietyMaster;
}


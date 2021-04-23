package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;

import co.orffosoft.entity.EntityMaster;
import lombok.Data;

@Data
public class ProfitAndLossReportDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4670220995425398944L;
	
	Date fromdate;
	Date todate;
	String fromDateStr;
	String toDateStr;
	String itemName;
	Double soldQnty;
	Double purchasePrice;
	Double sellingPrice;
	Double totalPurchasePrice;
	Double totalSellingPrice;
	Double totalNetProfit;
	Double returnedQnty=0D;
	Double expiredQnty=0D;
	Double damagedQnty=0D;
	Double stockAddQnty=0D;
	Double StockMinusQnty=0D;
	Double discount;
	Date stocktrandate;
	
	EntityMaster entityMaster;
	
}

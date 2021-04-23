package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class CollectAmountDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4824867306610406776L;
	
	
	Date fromdate;
	Date todate;
	
	Date transactiondate;
	String type;
	String storename;
	Long userid;
	String username;
	Double billedamount;
	Double collectamount;

}

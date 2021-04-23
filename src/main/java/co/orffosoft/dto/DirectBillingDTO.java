package co.orffosoft.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DirectBillingDTO implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -499400060888284778L;

	String storeName;
	
	String customerName;
	
	Long directBillingH;
	
	Long directBillingD;
	
	Long mobileNumber;
	
	Long productVarietyId;
	
	String itemName;
	
	Long billedQnty;
	
	Double sellingPrice;
	
	Double totalSellingPrice;
	
	Double discountAmt;
	
	Double totalNetPrice;
	
	String billNo;
	
	@JsonBackReference
	List<DirectBillingDTO> directBillingDTOList;
	
	

}

package co.orffosoft.dto;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class OnlineShopResponse {
	
	
	private Long varityId;
	
	private String storeName;
	
	private String varityName;
	
	private String varityCodeorName;
	private long stock;
	
	private Double itemPrice;
	private Double closingBlance;
	
	PaginationDTO paginationDTO = new PaginationDTO();

	public OnlineShopResponse() {
		
		
	}
}

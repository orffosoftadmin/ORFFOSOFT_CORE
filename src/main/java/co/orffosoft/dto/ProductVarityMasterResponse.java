package co.orffosoft.dto;

import java.util.Date;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class ProductVarityMasterResponse {
	
	private Long varityId;
	private String varityName;
	private String varitycode;
	Date createdDate;
	Date modifyDate;
	private Long catageoryId;
	private String catageoryName;
	private String catageoryCode;
	private String status;
	private String catageoryCodeorName;
	private String varityCodeorName;
	private String username;
	private Boolean activeStatus;
	private Integer first;
	private Integer size;
	private String hsnCode;
	private Double cgstPercentage;
	private Double sgstPercentage;
	PaginationDTO paginationDTO = new PaginationDTO();
	
	public ProductVarityMasterResponse(){
		
	}
	

}

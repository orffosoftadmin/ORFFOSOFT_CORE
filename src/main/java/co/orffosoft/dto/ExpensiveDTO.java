package co.orffosoft.dto;

import java.util.Date;

import co.orffosoft.entity.EntityMaster;
import lombok.Data;

@Data
public class ExpensiveDTO {
	
	 String itemname;
	Long id;
	 Double amount;
	 Date date;
	 Date fromdate;
	 Date todate;
	 Double gstamount;
	 String gstno;
	 String vendorname;
	 
	 String username;
	 
	 Date modifydate;
	 
	 EntityMaster entitymaster;
	 
	 PaginationDTO paginationDTO;
	 
	 

}

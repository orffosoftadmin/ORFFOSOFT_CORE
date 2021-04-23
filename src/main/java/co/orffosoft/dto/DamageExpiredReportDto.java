package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;

import co.orffosoft.entity.EntityMaster;
import co.orffosoft.entity.ProductVarietyMaster;
import lombok.Data;

@Data
public class DamageExpiredReportDto implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = -1218467981997263074L;
	
	Date fromdate;
	
	Date todate;
	
	String itemname;
	
	String fromdatee;
	String todatee;
	
	Double expiredqnty;
	
	Double damageqnty;
	
	Double lossamount;
	
    Double expireamount;	
    
    Double damageamount;
	ProductVarietyMaster productvaritymaster;
	
	
	
	

}

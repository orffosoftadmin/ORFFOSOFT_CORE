package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;

import co.orffosoft.entity.GoodsReceiptNote_H;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class GoodsChangesHistoryReportDTO implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String grnnumber;
	
	private Date todate;

	private Date fromdate;
	
	private Double price;
	
	private Date date;
	
	private GoodsReceiptNote_H grnh;
}

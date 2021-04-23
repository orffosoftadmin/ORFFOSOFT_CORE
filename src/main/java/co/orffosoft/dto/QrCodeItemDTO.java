 package co.orffosoft.dto;

import java.io.Serializable;

import co.orffosoft.entity.GoodsReceiptNote_H;
import lombok.Data;


@Data
public class QrCodeItemDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1998320505226100969L;
	
	//
	private String qrCode;
	private String qrCodeJsonText;
	private String labelOne;
	private String valueOne;
	//
	private String labelTwo;
	private String valueTwo;
	//
	private String labelThree;
	private String valueThree;
	//
	private String labelFour;
	//
	private String labelFive;
	
	private String grnnumber;
	
	private GoodsReceiptNote_H goodsReceiptNote_H;
	
}

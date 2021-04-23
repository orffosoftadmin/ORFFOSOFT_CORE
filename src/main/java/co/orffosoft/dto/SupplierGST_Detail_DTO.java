package co.orffosoft.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import co.orffosoft.entity.EntityTypeMaster;
import co.orffosoft.entity.GoodsReceiptNote_D;
import co.orffosoft.entity.GoodsReceiptNote_H;
import co.orffosoft.entity.SupplierMaster;
import co.orffosoft.entity.UserMaster;
import lombok.Data;

@Data
public class SupplierGST_Detail_DTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6705449766270296676L;

	String suppliername;
	Date fromdate;
	Date todate;
	String transactiondate;
	Double cgstpersentage;
	Double sgstpersentage;
	Double cgstamt;
	Double sgstamt;
	String gstno;
	String fromDateStr;
	String toDateStr;
	Double netamount;
	Double purchesamount;
	Double sellingamount;
	Double discounramount;
	Double mrp;
	Long grnhpk;
	Long grndpk;
	
	String itemname;
	Double orderQnty;
	Double accpetqnty;
	private SupplierMaster supplierMaster;
}

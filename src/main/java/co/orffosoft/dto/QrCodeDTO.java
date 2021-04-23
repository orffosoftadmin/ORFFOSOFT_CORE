package co.orffosoft.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class QrCodeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3446466156835485160L;
	
	
	private String pdfFilePath;
	
	List<QrCodeItemDTO> qrCodeItemDTOList;

}

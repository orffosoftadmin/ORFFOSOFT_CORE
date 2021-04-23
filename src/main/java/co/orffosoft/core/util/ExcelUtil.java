package co.orffosoft.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import lombok.extern.log4j.Log4j2;

/**
 * @author PRATAP
 *
 */
@Log4j2
public class ExcelUtil {

	/**
	 * @param empId
	 * @param filePath
	 * @param sheetName
	 */
	public void buildExcel(String filePath, String sheetName, List<Map<String, Object>> dataMapList) {
		XSSFWorkbook workbook = null;

		try {
			workbook = new XSSFWorkbook();
			createSheets(workbook, sheetName);
			writeContent(workbook, dataMapList, sheetName);
			writeExcelFile(filePath, workbook);
			log.info("Excel Written");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * @param workbook
	 * @param sheetName
	 */
	private void createSheets(XSSFWorkbook workbook, String sheetName) {

		workbook.createSheet(sheetName);

	}

	/**
	 * @param workbook
	 * @param dataMapList
	 * @param sheetName
	 */
	private static void writeContent(XSSFWorkbook workbook, List<Map<String, Object>> dataMapList, String sheetName) {
		Map<String, Object> colDataMap = null;
		Set<String> keySet = null;
		try {
			if (dataMapList != null && !dataMapList.isEmpty()) {
				colDataMap = dataMapList.get(0);
				keySet = colDataMap.keySet();
			}
			if (colDataMap == null) {
				log.error("colDataMap is empty");
				return;
			}

			if (sheetName != null) {

				XSSFSheet sheet = workbook.getSheet(sheetName);
				XSSFRow row = sheet.createRow(0);
				int colNum = 0;
				for (String colName : keySet) {
					XSSFCell cell = row.createCell(colNum++);
					cell.setCellValue(colName);
					// colNum++;
				}

				int rowNum = 1;
				for (Map<String, Object> dataMap : dataMapList) {
					XSSFRow valueRow = sheet.createRow(rowNum);
					int cellColNum = 0;
					for (String key : keySet) {
						XSSFCell valueCell = valueRow.createCell(cellColNum);
						if (dataMap.get(key) == null) {
							// If column value is String with null
							if (dataMap.get(key) instanceof String) {
								dataMap.put(key, "");
							} else {
								// If column value is Integer/Double/Float with null
								dataMap.put(key, 0);
							}
						}
						
						valueCell.setCellValue(String.valueOf(dataMap.get(key)));
						sheet.autoSizeColumn(cellColNum);
						cellColNum++;
					}
					rowNum++;
				}
			}

		} catch (Exception ex) {
			log.error("Exception at writeSheetColumnsHeaders() ", ex);
		}
	}

	/**
	 * @param filePath
	 * @param workbook
	 */
	private void writeExcelFile(String filePath, XSSFWorkbook workbook) {
		log.info("Inside writeExcelFile()");
		FileOutputStream outputStream = null;
		try {
			if (workbook == null) {
				throw new Exception("Workbook is empty");
			}
			File file = new File(filePath);
			if (file.isFile()) {
				file.delete();
			}
			outputStream = new FileOutputStream(filePath);
			workbook.write(outputStream);
		} catch (FileNotFoundException ex) {
			log.error("writeExcelFile()-FileNotFoundException ", ex);
		} catch (IOException ex) {
			log.error("writeExcelFile()-IOException ", ex);
		} catch (Exception ex) {
			log.error("writeExcelFile()-Exception ", ex);
		} finally {

			try {
				if (workbook != null) {
					//workbook.close();
				}
			} catch (Exception ex) {
				log.error(""+ex);
			}

			try {
				if (outputStream != null) {
					outputStream.close();
				}
			} catch (Exception ex) {
				log.error(""+ex);
			}

		}
	}
	
	/**
	 * This method is used to .
	 *
	 */
	public StreamedContent getDownloadFile(String downloadFilePath) {
		StreamedContent file = null;
		InputStream input = null;
		try {
			File files = new File(downloadFilePath);
			Path path = Paths.get(downloadFilePath);
			if (Files.notExists(path)) {
				Files.createDirectories(path);
			}
			input = new FileInputStream(files);
			if (input != null) {
				FacesContext context = FacesContext.getCurrentInstance();
				ExternalContext externalContext = context.getExternalContext();
				file = (new DefaultStreamedContent(input, externalContext.getMimeType(files.getName()),
						files.getName()));
			}
		
		} catch (Exception ex) {
			log.error(" Error in while getting getDownloadFile", ex);
			AppUtil.addError("Download Error");
		}
		return file;
	}

}

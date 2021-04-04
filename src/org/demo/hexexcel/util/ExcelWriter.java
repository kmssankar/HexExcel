package org.demo.hexexcel.util;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.demo.hexexcel.HexDecimalDTO;

public class ExcelWriter {
	
	public Workbook createExcelSheet(List<HexDecimalDTO> hexDecimalList) {
		Workbook wb = new HSSFWorkbook(); 
		Sheet sheet = wb.createSheet("Hex Converted");
		//Add headers
		Row headerRow = sheet.createRow(0);
		Cell cellheader1 = headerRow.createCell(0);
		cellheader1.setCellValue("Hex Value");
		Cell cellheader2 = headerRow.createCell(1);
		cellheader2.setCellValue("Decimal value");
		Cell cellheader3 = headerRow.createCell(2);
		cellheader3.setCellValue("Hex Value");
		Cell cellheader4 = headerRow.createCell(3);
		cellheader4.setCellValue("Decimal value");
		// Add Contents from input Hex Decimal List
		int rowCount = 1;
		for(HexDecimalDTO hexdecimal : hexDecimalList) {
			Row row = sheet.createRow(rowCount);
			Cell cell = row.createCell(0);
			cell.setCellValue(hexdecimal.getHexNumber1());
			Cell cell2 = row.createCell(1);
			cell2.setCellValue(hexdecimal.getNumber1());
			Cell cell3 = row.createCell(2);
			cell3.setCellValue(hexdecimal.getHexNumber2());
			Cell cell4 = row.createCell(3);
			cell4.setCellValue(hexdecimal.getNumber2());
			rowCount++;
		}
		return wb;
	}

}

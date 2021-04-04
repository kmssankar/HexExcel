package org.demo.hexexcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.demo.hexexcel.util.ConvertorUtils;
import org.demo.hexexcel.util.ExcelWriter;

public class HexConvertor {
	
	public static void main(String[] args) throws IOException {
		ConvertorUtils convertorUtils = new ConvertorUtils();
		ExcelWriter excelWriter = new ExcelWriter();
		List<HexDecimalDTO> outList = convertorUtils.getHexfromFile(Constants.fileInp);
		Workbook  workbook = excelWriter.createExcelSheet(outList);
		try (FileOutputStream outputStream = new FileOutputStream(Constants.fileOut)) {
			workbook.write(outputStream);
		}
	}

}

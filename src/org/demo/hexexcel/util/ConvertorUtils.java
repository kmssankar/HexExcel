package org.demo.hexexcel.util;

import java.util.ArrayList;
import java.util.List;

import org.demo.hexexcel.Constants;
import org.demo.hexexcel.HexDecimalDTO;

public class ConvertorUtils {
	FileUtils fileUtils = new FileUtils();

	public int getDecimal(String inp) {
		return Integer.parseInt(inp, Constants.radix);
	}

	public List<HexDecimalDTO> getHexfromFile(String fileString) {
		List<String> filelines = fileUtils.getFileContent(fileString);
		List<HexDecimalDTO> hexDtoList = new ArrayList<>();
		for (String str : filelines) {
			System.out.println("Eac line " + str);
			// Index of 0046 in each Line
			int idx = str.indexOf("0046");
			// convert and add to hex list output
			hexDtoList.add(
					new HexDecimalDTO(str.substring(idx - 8, idx - 4), getDecimal(str.substring(idx - 8, idx - 4)) + "",
							str.substring(idx - 4, idx), getDecimal(str.substring(idx - 4, idx)) + ""));

		}

		return hexDtoList;
	}

}

package org.demo.hexexcel.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	
	public List<String> getFileContent(String path) {
		
		List<String> outFile = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String str;
				while((str=br.readLine())!=null) {
					outFile.add(str);
				}
			} catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e){
				e.printStackTrace();
			}
		
		return outFile;
	}

}

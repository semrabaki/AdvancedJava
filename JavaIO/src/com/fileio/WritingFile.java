package com.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) {
		
		
//		File folder=new File("src/com/fileio/folder1"); //to create a folder
//		folder.mkdir();
//		
		File file1=new File("src/com/fileio/folder1/MyFile.text"); //creating file
//		try {
//			file1.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		try {
//			FileWriter fwriter= new FileWriter(file1);
//			fwriter.write("Hello FileWriter");
//			fwriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	//if you desogn the prgram like below the close method willl be called automatically
	try(BufferedWriter bfw= new BufferedWriter(new FileWriter(file1,true))) {
//		FileWriter fwriter= new FileWriter(file1,true); //if you put true in here you prevent rewrite on the file. It continues with the last row and add the text
//		BufferedWriter bfw= new BufferedWriter(fwriter);
		bfw.write("Hello Java");
		bfw.newLine();
		bfw.write("Hello FileWriter");
		bfw.newLine();
		bfw.write("Hello BufferedWriter");
		//bfw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	}

}

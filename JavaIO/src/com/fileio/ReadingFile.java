package com.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
	
	//Scanner
	/*
	 * 1)Not multithereading
	 * 2)not syncronized
	 * 3)uses little size buffer size than BufferedReader
	 * 4)slower becuase the scanner does the parsing of the input data and BufferReader simply reads a sequence of characters
	 */
	
	//BuffereedReader
	/*
	 * 1)Multithreaded
	 * 2)Syncronozed
	 * 3)Uses larger buffer 
	 * 4) Faster
	 */

	public static void main(String[] args) {
		
		//1. way of reading from file
		try(BufferedReader bfr=new BufferedReader(new FileReader("src/com/fileio/folder1/MyFile.text"))){
		//treats everything as chaarcter
			String line;
			while((line=bfr.readLine())!=null) {
				System.out.println(line);
			}}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		//2. way of reading from file
		try(Scanner scan=new Scanner(new File("src/com/fileio/folder1/MyFile.text"))){
			//scanner gets the file and parse the file and give it to you
			while(scan.hasNextLine()) {
				String line=scan.nextLine();
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("You have an error while reading file");
		}
		//Buffered reader use character stream
		//FileInoutSystem uses bytestream
		
		//if there is a file with turkiish arabic characters you need to use buffered readeer. File inout Stream is not able to to read arabic or turkish characters sin
		//since there is no ASCII value of those characters
		
		//3.way of reading from file
		
		try(FileInputStream fis= new FileInputStream("src/com/fileio/folder1/MyFile.text"))
		{
			int k;
			while((k=fis.read())!=-1) {
				System.out.println((char)k);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		

	}

}

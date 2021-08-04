package com.subis.day4;
import java.io.*;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\io.txt");
		//exists
		System.out.println(f.exists()?"exists ": "not exists");
		//canwrite 
		System.out.println(f.canWrite()?"write ":"Not Write");
		//can read
		System.out.println(f.canRead()?"read":"Not Read");
		//Dirtectory
		System.out.println("is "+ (f.isDirectory()?"Dir":"NotDir"));
		//normal or piped file
		System.out.println(f.isFile()?"normal file":"might be a named pipe");
		//Absoluate
		System.out.println(f.isAbsolute()?"Absolate ":"Not Abosulate");
		//lastmodified
		System.out.println("last modified is " +f.lastModified());
		//File Size
		System.out.println("File Size "+f.length() + " Bytes");

	}

}

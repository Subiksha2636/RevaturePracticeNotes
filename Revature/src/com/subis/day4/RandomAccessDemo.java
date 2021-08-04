package com.subis.day4;
import java.io.*;

public class RandomAccessDemo {

	public static void main(String[] args)throws IOException {
		//Scanner input file
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String str = b.readLine();
		File f = new File(str);
		
		if(!(f.exists())){
			System.out.print("Npt Exists");
		}
		try{
			RandomAccessFile raf = new RandomAccessFile(f,"r");
			int i=(int)raf.length();
			System.out.println("length "+i);
			raf.seek(130);//starting of the point
			for(int c=0;c<i;i++){
				byte b1 = raf.readByte();
				System.out.print((char)b1);
			}
			raf.close();
		}
		catch(IOException e){
			System.out.print(e);
		}
		

	}

}

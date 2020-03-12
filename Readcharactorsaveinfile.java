package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readcharactorsaveinfile {

	public static void main(String[] args) throws IOException {
		// Create input stream reader to read a character from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//declare char type variable
		char ch;
		//prompt the user for a character
		System.out.println("Enter a character:");
		ch=br.readLine().charAt(0);
		//create file object
		File file = new File("C:\\Users\\unnava.vasavi\\Documents\\Onechar.txt");
		//create FileWriter Object
		FileWriter fw = new FileWriter(file);
		//Write into the file
		fw.write((int)ch);
		//accept a string and add it to the file
		String addingStringtoFile = br.readLine();
		/*Char Sequence is an interface that represents a sequence of characters. Mutability id not Of course, an */
		//stream objects must be closed after usage
		CharSequence charSequence = addingStringtoFile;
		//adding to a file writer stream happens with append()
		fw.append(' ');
		//char seq is a n interface
		fw.append(charSequence);
	//stream objects be closed after usage
		fw.close();
		System.out.println("Character saved successfully");
		System.out.println("Now, we wll read data from Onechar.txt into character array");
		String readdatafromFile= new String();
		char readfromFile[]=readdatafromFile.toCharArray();
		//to read data from a file,create file reader object
		FileReader fr = new FileReader(file);
		int i=0;
		try
		{
		while(true)
		{
			if((readfromFile[i]=(char)fr.read())!=-1)
				
	           i++;
			else 
				break;
				
		}
		}catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Data read from file");
			for(char c: readfromFile)
			{
				System.out.println(c);
		}
		}
		fr.close();

	}
}

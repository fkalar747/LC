package lingualcore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import node.Layer;
import node.Network;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		
		char mode = ' ';
		
		try {
			Scanner input = new Scanner(new File("test.txt"));
			
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String[] strings = line.split("\\s+");
				
			
				for(int i = 0 ; i < strings.length ; i ++){
					String str = strings[i];
					if(str.length() ==0)continue;
					if(str.charAt(0) == '/' && str.length()>1) {
						mode = str.charAt(1);
						switch(mode) {
						case('s'):
							Network.showNodes(1);
							mode = ' '; 
							break;	
						}
						continue;
					}
					
					switch(mode) {
					case('t'):
						Network.addNode(1, str);
						break;
					case('c'):
						Network.provokeNode(1,str);
						break;
					default:
						System.out.println("mode in default");
						break;
					}
				
				
				
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("end of main");
	}
}

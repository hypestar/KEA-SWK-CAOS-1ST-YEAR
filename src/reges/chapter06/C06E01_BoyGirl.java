package reges.chapter06;

import java.io.*;
import java.util.*;


public class C06E01_BoyGirl {

	public static void main(String[] args) throws FileNotFoundException {
		int boys = 0;
		int girls = 0;
		int boySum = 0;
		int girlSum = 0;
		int tokenNum = 0;
		
		Scanner input = new Scanner(new File("/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E01_BoyGirl"));
		
				
				while (input.hasNext()){
				if (tokenNum % 2 == 0){
					boys++;
					input.next();
					boySum += input.nextInt();
				}else if (tokenNum % 2 != 0) {
					girls++;
					input.next();
					girlSum += input.nextInt();
				}
				tokenNum++;	
				}
				int diff = Math.abs((girlSum - boySum));
				System.out.println(girls + " girls, " + boys + " boys");
				System.out.print("Differencse between boys' and girls' sums: " + diff);
		
	}

}

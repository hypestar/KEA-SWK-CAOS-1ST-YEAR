package reges.projects;

import java.util.*;

public class C05P01_PigLatin {


	public static void main(String[] args) {
		Scanner sentence;
		Scanner console = new Scanner(System.in);
		while (true){
			System.out.print("Type a sentence and press enter : ");
			sentence = new Scanner(console.nextLine());
			if(!sentence.hasNext()){
				break;
			}

			while (sentence.hasNext()){
				System.out.print(wordToPigLatin(sentence.next()) + " ");
			}
			System.out.println();
		}
	}

	public static String wordToPigLatin(String word){
		StringBuffer ending = new StringBuffer();
		StringBuffer pigLatin = new StringBuffer();

		if(!isAConsonant(word.charAt(0))){    //the first letter is a vowel
			pigLatin.append(word + "-ay"); 
			return pigLatin.toString();
		}


		for (int i = 0; i < word.length();i++){
			if (isAConsonant(word.charAt(i))){
				ending.append(word.charAt(i));
			}else if(!isAConsonant(word.charAt(i))){    
				pigLatin.append(word.substring(i, word.length()));
				ending.append("ay");
				pigLatin.append("-");
				pigLatin.append(ending);
				break;	
			}
		}


		return pigLatin.toString();
	}

	public static boolean isAConsonant(char c){
		if( c == 'a' ||
				c == 'A' ||
				c == 'e' ||
				c == 'E' ||
				c == 'i' ||
				c == 'I' ||
				c == 'o' ||
				c == 'O' ||
				c == 'u' ||
				c == 'U' ||
				c == 'y' ||
				c == 'Y'){
			return false;
		}else{
			return true;

		}

	}


}

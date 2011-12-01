package reges.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class C11E20_Vocabulary {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		C11E20_Vocabulary vocabulary = new C11E20_Vocabulary();
		Scanner file1, file2;
		HashSet<String> file1Words, file2Words, commonWords;	
		file1 = new Scanner(new File("/home/hypestar/EclipseWorkspace/KEA 2. Sem/src/dk/hypestar/kea/reges/exercises/chapter11/mobydick.txt"));
		file2 = new Scanner(new File("/home/hypestar/EclipseWorkspace/KEA 2. Sem/src/dk/hypestar/kea/reges/exercises/chapter11/hamlet.txt"));
		
		file1Words = vocabulary.getWords(file1);
		file2Words = vocabulary.getWords(file2);
		commonWords = vocabulary.getCommon(file1Words, file2Words);
		
		vocabulary.getCommon(file1Words, file2Words);
		vocabulary.reportResults(file1Words, file2Words, commonWords);
		
	
	}
		
	
	public C11E20_Vocabulary(){
		
	}
	
	
	public HashSet<String> getWords(Scanner file){
		HashSet<String> words = new HashSet<String>();
		
		file.useDelimiter("[^a-zA-Z']+");
		
		while(file.hasNext()){
			words.add(file.next().toLowerCase());
		}
		return words;
	}
	
	public HashSet<String> getCommon(HashSet<String> file1Words, HashSet<String> file2Words){
		HashSet<String> common = new HashSet<String>();
		common.addAll(file1Words);
		common.retainAll(file2Words);
		return common;
	}

	public void reportResults(HashSet<String> file1Words, HashSet<String> file2Words, HashSet<String> common){
		System.out.println("File #1 words = " + file1Words.size());
		System.out.println("File #2 words = " + file2Words.size());
		System.out.println("Common words = " + common.size());
		
		double pct1 = 100.0 * common.size() / file1Words.size();
		double pct2 = 100.0 * common.size() / file2Words.size();
		System.out.println("% of file 1 in overlap = " + pct1);
		System.out.println("% of file 2 in overlap = " + pct2);
	}
	
	
}

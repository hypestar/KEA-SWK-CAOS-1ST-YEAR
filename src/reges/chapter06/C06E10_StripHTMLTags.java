package reges.chapter06;

import java.io.*;
import java.util.*;

public class C06E10_StripHTMLTags {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File(
				"/home/hypestar/workspace/KEA 1.Sem/assets/chapter6/C06E10_StripHTMLTags.html"));

		stripHtmlTags(input);

	}

	public static void stripHtmlTags(Scanner input) {
		String htmlFile = "";
		while (input.hasNextLine()) {
			htmlFile += input.nextLine() + "\n";
		}
		
		htmlFile = htmlFile.replaceAll("</?\\w+((\\s+\\w+(\\s*=\\s*(?:\".*?\"|'.*?'|[^'\">\\s]+))?)+\\s*|\\s*)/?>", "");
		System.out.print(htmlFile);
		
	}

}

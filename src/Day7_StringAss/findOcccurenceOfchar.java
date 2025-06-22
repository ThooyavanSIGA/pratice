package Day7_StringAss;

import java.util.Arrays;

public class findOcccurenceOfchar {

	public static void main(String[] args) {
	String word ="nndduufhhh";
	String replaced=word.replace("f", "");
	int word_len =word.length();
	int replaced_len =replaced.length();
	int output =word_len - replaced_len;
	System.out.println("count of f = "+output);

	}

}

package Day7_StringAss;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String word ="@hello$$bro";
		String output = word.replace("@", "").replace("$$", " ");
		System.out.println(output);
	}

}

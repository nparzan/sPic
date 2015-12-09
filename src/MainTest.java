import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class MainTest {
	static String path = "C:\\Images";
	static String im_path;
	//TEST
	public static void main(String[] args) {
		List<Entry> dictio = Parser.get_dictionary(path);
		for (int i = 0; i < dictio.size(); i++) {
			System.out.println("Entry " + dictio.get(i).word);
		}
		String sentence = "i want to do you";
		List<Entry> entries = Parser.get_entries(path, sentence, dictio);
		System.out.println("Size of entries is " + entries.size() + " and dict is " + dictio.size());
		List<File> reverse = new ArrayList<File>();
		for (int i = 0; i < entries.size(); i++) {
			/*
			 * System.out.println(entries.get(i).word);
			 * System.out.println(entries.get(i).image);
			 * System.out.println(entries.get(i).category);
			 */
			System.out.println(entries.get(i));
			reverse.add(entries.get(i).image);
		}

		String fin = Parser.get_sentence_from_images(reverse);
		System.out.println("Got " + fin);

	}
}
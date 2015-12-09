
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Parser {
	/**
	 * Convert a list of images from the user Into a string representing the
	 * sentence To be sent via chat
	 * 
	 * @param images
	 *            (List<File>)
	 * @return sentence (String)
	 **/
	public static String get_sentence_from_images(List<File> images) {
		String res = "";
		for (int i = 0; i < images.size(); i++) {
			res += trim(images.get(i).toString()).toLowerCase();
			if (i < images.size() - 1)
				res += " ";
		}
		return res;
	}

	/**
	 * Convert a sentence from the user Into a list of entries to be printed in
	 * The chat console
	 * 
	 * @param path
	 *            (String - full path)
	 * @param sentence
	 *            (String)
	 * @param dictio
	 *            (List<String>)
	 * @return entries (List<Entry> containing touples of word and file)
	 */
	public static List<Entry> get_entries(String path, String sentence, List<Entry> dictio) {
		List<Entry> res = new ArrayList<Entry>();
		sentence = sentence.toLowerCase();
		String[] words = sentence.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < dictio.size(); j++) {
				if (dictio.get(j).word.equals(words[i])) {
					res.add(dictio.get(j));
					break;
				}
			}
		}
		return res;
	}

	/**
	 * Construct the dictionary of available images Once the dictionary is
	 * constructed, only words that have corresponding images will be used when
	 * translating from picture to text
	 * 
	 * @param path
	 *            (String - full path to images directory)
	 * @return List of available entries (List<Entry>)
	 */
	public static List<Entry> get_dictionary(String path) {
		List<Entry> dictio = new ArrayList<Entry>();
		int i = 0;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		for (i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isDirectory()) {
				dictio = get_dictionary_single_directory(listOfFiles[i].toString(), dictio);
			}
		}
		return dictio;
	}

	/**
	 * Add entries from specific category to dictionary
	 * 
	 * @param path
	 *            (String - Full path the specific category)
	 * @param dictio
	 *            (List<Entry> - Temporary)
	 * @return dictio (List<Entry> - After adding entries)
	 */
	public static List<Entry> get_dictionary_single_directory(String path, List<Entry> dictio) {
		int i = 0;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		for (i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				dictio.add(new Entry(path, trim(listOfFiles[i].toString()).toLowerCase()));
			}
		}
		return dictio;
	}

	/**
	 * Get word name from full path
	 * 
	 * @param source
	 *            (String - full path to word)
	 * @return word (String)
	 */
	public static String trim(String source) {
		int len = source.length();
		int start = 0, end = 0;
		boolean found_end = false;
		for (int i = len - 1; i >= 0; i--) {
			if (source.charAt(i) == '.') {
				end = i;
				found_end = true;
			}
			if (source.charAt(i) == '\\') {
				start = i + 1;
				if (found_end)
					break;
			}
		}
		return source.substring(start, end);
	}
}

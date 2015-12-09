import java.io.File;

public class Entry {
	File image;
	String word;
	String category;

	/**
	 * Entry constructor, adds the word, file and category to the object
	 * 
	 * @param path
	 *            (String - full path to image including category directory)
	 * @param word
	 *            (String)
	 */
	public Entry(String path, String word) {
		this.word = word;
		this.image = new File(path + "\\" + word + ".jpg");
		this.category = get_category(this.image.toString());
	}

	@Override
	public String toString() {
		return "Word: " + word + "\nCategory: " + category + "\n";
	}

	/**
	 * Get the category from the path
	 * 
	 * @param path
	 *            (String - full path)
	 * @return category name (String)
	 */
	public static String get_category(String path) {
		boolean first = false;
		int start = 0;
		int end = 0;
		for (int i = path.length() - 1; i >= 0; i--) {
			if (path.charAt(i) == '\\' && !first) {
				first = true;
				end = i;
				continue;
			}
			if (path.charAt(i) == '\\' && first) {
				start = i;
				break;
			}
		}
		return path.substring(start + 1, end);
	}
}
# sPic
A chat application for autistic individuals enabling image-to-text and text-to-image capabilities

API for Parser:
1. Save full path to images directory as:
	String path = "C:\\Images";
2. Generate list of all existing images:
	List<Entry> dictio = Parser.get_dictionary(path);
	Entry object:
		public class Entry {
			File image;
			String word;
			String category;
		}
3. Convert sentence to list of entries:
	List<Entry> entries = Parser.get_entries(path, sentence, dictio);
4. Convert List of Files to sentence:
	List<File> list = ...;
	String sentence = Parser.get_sentence_from_images(list);

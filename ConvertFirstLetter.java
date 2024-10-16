public class ConvertFirstLetter{
	public static void main(String[] args){
		ConvertToTittleCast("stupid is as stupid does");
	}
	public static String ConvertToTittleCast(String sentence){
		String [] tokens = sentence.Split(" ");
		String word;
		String letter;
		String newWord;
		String [] array = new String[tokens.length];
		for(int index = 0;index<tokens.length;index++){
			word = tokens [index];
			letter = word.charAt[0];
			if(letter.isUpperCase){
				array[index] = word;
			}
			else{
				newWord = word.charAt[0].toUpperCase;
				array[index] = newWord;
			}
		}
		return array;
	}
}
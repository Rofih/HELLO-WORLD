
import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter sentence:");
		String word =input.next();
		reversoSentence(word);
	}
	public static void reversoSentence(String word){
		
		String [] words = word.split(" ");
		String [] plays = new String [words.length];

		for(int count =words.length - 1 ; count > 0; count--){
			plays[count] = words[count];
			System.out.println(words[count]);
		}
		for(int counter = 0;counter>=words.length;counter++){
			System.out.print(plays[counter]);
		}

		
	}
}
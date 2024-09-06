import java.util.Scanner;
public class Christmas{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("\n1-chorus\n2-firstStanza\n3-secondStanza\n4-thirdStnza\n5-fourthStanza\n6-fifthStanza\n7-sixthStanza\n8-sevenStanza\n9-eightStanza\n10-nineStanza\n11-tenStanza\n12-elevenStanza\n13-twelvethStanza");
		int button=input.nextInt();
		switch (button){
			case 1:
				chorus();
			case 2:
				firstStanza();
			case 3:
				secondStanza();
			case 4:
				thirdStanza();
			case 5:
				fourthStanza();
			case 6:
				fifthStanza();
			case 7:
				sixthStanza();
			case 8:
				sevenStanza();
			case 9:
				eightStanza();
			case 10:
				nineStanza();
			case 11:
				tenStanza();
			case 12:
				elevenStanza();
			case 13:
				twelvethStanza();







}	

}
	public static void chorus(){
		System.out.print("And a patridge in a pear tree...");
}
	public static void firstStanza(){
		System.out.print("On the first day of Christmas,my true love gave to me...");
}	
	public static void secondStanza(){
		System.out.print("Two Turtle Doves\nOn the second day of Christmas,my true love gave to me...\nTwo turtle doves,\nAnd a patridge in a pear tree...");
}
	public static void thirdStanza(){
		System.out.print("Three French Hens\nOn the third day of Christmas,my true love gave to me...\nThree French hens\nTwo turtle doves,\nAnd a patridge in a pear tree...");	
}
	public static void fourthStanza(){
		System.out.print("Four Calling Birds\nOn the fourth day of Christmas,my true love gave to me...\nFour calling birds,\nThree French hens\nTwo turtle doves,\nAnd a patridge in a pear tree...");
}
	public static void fifthStanza(){
		System.out.print("Five Golden Rings\nOn the fifth day of Christmas,\n my true love gave to me...\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");
}
	public static void sixthStanza(){
		System.out.print("Six Geese a-laying\nOn the sixth day of Christmas,my true love gave to me...\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");
}
	public static void sevenStanza(){
		System.out.print("Seven Swans a-Swimming\nOn the seventh day of Christmas,\n my true love gave to me...\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");
}
	public static void eightStanza(){
		System.out.print("Eight Maids a-Milking\nOn the eighth day of Christmas, my true love gave to me...\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");
}
	public static void nineStanza(){
		System.out.print("Nine Ladies Dancing\nOn the ninth day of Christmas, my true love gave to me...\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");
}
	public static void tenStanza(){
		System.out.print("Ten Lords a-Leaping\nOn the tenth day of Christmas,\n my true love gave to me...\nTen lords a-leaping,\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");
}
	public static void elevenStanza(){
		System.out.print("Eleven Pipers Piping\nOn the eleventh day of Christmas, my true love gave to me...\nEleven pipers piping,\nTen lords a-leaping,\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");

}
	public static void twelvethStanza(){
		System.out.print("Twelve Drummers Drumming\nOn the twelfth day of Christmas,\n my true love gave to me...\nTwelve drummers drumming,\nEleven pipers piping,\nTen lords a-leaping,\nNine ladies dancing,\nEight maids a-milking,\nSeven swans a-swimming,\nSix geese a-laying,\nFive golden rings,\nFour calling birds,\nThree French hens,\nTwo turtle doves,\nAnd a partridge in a pear tree...");
}
}
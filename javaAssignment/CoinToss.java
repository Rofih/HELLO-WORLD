import java.util.Random;
public class CoinToss{
	public static int flip(){
		int heads=1;
		int tails=0;
		int toss=0;
		while(toss==1){
			Random rand=new Random();
			int coin=rand.nextInt(2);
			
			if(coin==1){
				return "heads";
				int count+=heads;
				return count;
			}
			if(coin==0){
				return "tails";
				int counter+=tails;
				return counter;
			}
											}
	
	}
}
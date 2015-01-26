
public class Tutorial_6_E {
public static void main(String[] args) {
	
	int moneyInMyWallet = 10;
	
	while (moneyInMyWallet >= 10){
		System.out.printf("I have more than a tenner in my wallet. I currently have %d\n", moneyInMyWallet);
		
		moneyInMyWallet++;
		
		if (moneyInMyWallet > 30){
			break;
		}
	}
}
}

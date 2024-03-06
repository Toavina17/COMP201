package uk.ac.liv.comp201;

public class Main {

	public static void main(String[] args) {
//		String cardName="coopesabc";
//		// TODO Auto-generated method stub
//		try {
//			Card.createNewCard(cardName);
//		} catch (CardException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Card card;
//		try {
//			card = Card.loadCard(cardName);
//			System.out.println("fire code is "+card.getCardFireCode());
//			System.out.println("status "+card.getCardStatus());
//			
//		} catch (CardException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//TEST CODE
//		//create a card for great codes
//		try {
//			Card.createNewCard("letstryth");
//		} catch (CardException e) {
//			e.printStackTrace();
//		}
//		
//		Card card1;
//		try {
//			card1 = Card.loadCard("letstryth");
//			String firecode = "uwqoncspojowju";
//			String burglarcode = "761936290";
//			card1.setCodes(firecode, burglarcode);
//			System.out.println("The card name: card1" );
//			System.out.println("The fire code is " + card1.getCardFireCode());
//			System.out.println("The burglar code is " + card1.getCardBurlaryCode());
//			
//			Authenticator a1 = new Authenticator(card1);
//			System.out.println(a1.checkFireCode("uwqoncspojowju"));
//		} catch (CardException e) {
//			e.printStackTrace();
//		}
		
		
		
		//create a card with an invalid fire code
//		try {
//			Card.createNewCard("jdiownoej");
//		} catch (CardException e) {
//			e.printStackTrace();
//		}
//		
//		Card card2;
//		try {
//			card2 = Card.loadCard("jdiownoej");
//			String firecode = "ampoiqh5euboer";
//			String burglarcode = "761936291";
//			card2.setCodes(firecode, burglarcode);
//			System.out.println("The card name: card2" );
//			System.out.println("The fire code is " + card2.getCardFireCode());
//			System.out.println("The burglar code is " + card2.getCardBurlaryCode());
//		} catch (CardException e) {
//			e.printStackTrace();
//		}
		
		//use card 1 and try to successfully authenticate
		
		//create a card
		
		String cardName="sebsebseb";
		// TODO Auto-generated method stub
		try {
			Card.createNewCard(cardName);
		} catch (CardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Card card;
		try {
			card = Card.loadCard(cardName);
			System.out.println("fire code is "+card.getCardFireCode());
			System.out.println("burglar code is " + card.getCardBurlaryCode());
     		System.out.println("status "+ card.getCardStatus());
			System.out.println("Now, we are going to set codes");
			String fireCode = "uwqon5spoj2wju";
			String burglarCode = "7291748391";
			card.setCodes(fireCode, burglarCode);
			System.out.println("new fire code is "+card.getCardFireCode());
			System.out.println("new burglar code is " + card.getCardBurlaryCode());
			System.out.println("Now it's time to try to authenticate");
			Authenticator a1 = new Authenticator(card); //define a new authenticator 
			System.out.println(a1.checkFireCode("uwqon5spo82w4u"));
			System.out.println("Number of tries: " + card.getCountFire());
		} catch (CardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
			
	}

	

}

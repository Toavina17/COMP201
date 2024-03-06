package uk.ac.liv.comp201;

import static uk.ac.liv.comp201.ResponseCode.*;

public class Authenticator {
	private Card card;
	private String passcodeFire;
	private String passcodeBurglary;
	
	
	
	public Authenticator(Card card) {
		this.card=card;
	}
	
	
	public ResponseCode checkFireCode(String passCodeFire) {
		ResponseCode returnValue=OK;
		// TO DO	
		// 1. Add code to validate fire code
		// 2. Code to check fire code is correct for card
		// 3. Code to return appropriate response
		// 4. Add code to lock card, if wrong fire code is
		// entered wrong 3 times in sequence, lockout works
		// independently for the two codes					
		//Ask the user for another code and retry everything 
		
		//check the status of the card first
		if(card.getCardStatus() == 3) {
			returnValue= CARD_STATUS_BAD;
		} else if (card.getCardStatus() == 2) {
			returnValue = CARD_LOCKED;
		} else if (this.card.getCardStatus() == 1) {
			//check the fire code
			if(this.card.checkFireCode(passCodeFire) == true) {
				// check of the fire code is correct
				if(passCodeFire == this.card.getCardFireCode() && this.card.getCountFire() < 2) {	
					this.card.setCountFire(0);
					returnValue = OK;
				} else if (passCodeFire != this.card.getCardFireCode() && this.card.getCountFire() < 2){	
					int CountFire = this.card.getCountFire();
					this.card.setCountFire(CountFire + 1);					
					returnValue = BAD_FIRE_CODE;					
				} 	else if (passCodeFire != this.card.getCardFireCode() && this.card.getCountFire() == 2) {
					//need to block the card
					this.card.setCountFire(3);
					this.card.setCardStatus(2);
					returnValue = CARD_LOCKED;
				}
			} else { 
				returnValue = INVALID_FIRE_CODE;
			} 
			
		} 			
		//code to return the appropriate response
		return(returnValue);
	}
	
	public ResponseCode checkBurglaryCode(String passCodeBurglary){
		ResponseCode returnValue=OK;
		// TO DO
		// 1. Add code to validate burglary code
		// 2. Code to check burglary code is correct for card
		// 3. Code to return appropriate response	
		// 4. Add code to lock card, if wrong code is
		// entered wrong 3 times in sequence, lockout works
		// independently for the two codes
		
		
		// Check the status of the card 
		if(card.getCardStatus() == 3) {
			returnValue= CARD_STATUS_BAD;
		} else if (card.getCardStatus() == 2) {
			returnValue = CARD_LOCKED;
		} else if (this.card.getCardStatus() == 1) {
			//validate burglar code
			
			if(this.card.checkBurglaryCode(passCodeBurglary) == true	) {
				if(passCodeBurglary == this.card.getCardBurlaryCode() && this.card.getcountBurglar() < 2) {	
					returnValue = OK;
					this.card.setCountBurglar(0);
				} else if (passCodeBurglary != this.card.getCardBurlaryCode() && this.card.getcountBurglar() < 2){	
					int CountBurglarWrong = this.card.getCountFire();
					this.card.setCountBurglar(CountBurglarWrong + 1);						
					returnValue = BAD_BURGLARY_CODE;					
				} 	else if (passCodeBurglary != this.card.getCardBurlaryCode() && this.card.getcountBurglar() == 2) {
					this.card.setCountBurglar(3);
					this.card.setCardStatus(2);
					returnValue = CARD_LOCKED;
				}
			} else {
				returnValue = INVALID_BURGLARY_CODE;
			}
			
		}	
				
		return(returnValue);
	}
	

}

package Lambdapets;

public class LambdaPetMaster { 
	
	public static void main(String[] args) {

    Talkative dogTalkRules = (name) -> {
         System.out.println("I'm a dog. My name is " + name);
		return name;
    };
    
    Pet myDog = new Pet(dogTalkRules, "Bruno");

    myDog.speakup();
    

    Talkative parrotTalkRules = (name) -> {
        System.out.println("I'm a parrot. Don't call me " + name);
    	return name; 
    };
    
    Pet myParrot = new Pet(parrotTalkRules, "Daisy");

    myParrot.speakup();
    }
}



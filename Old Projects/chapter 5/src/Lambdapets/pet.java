package Lambdapets;

public class Pet implements Talkative {

	 String name;
	    Talkative myTalkingRules;

	    Pet(Talkative talkRules, String name){
	        this.name = name;
	        myTalkingRules = talkRules;
	    }

	    public String speakup(){

	        return myTalkingRules.talk(name);
	    }

		
		public String talk(String petName) {
			
			return null;
		}
	
}

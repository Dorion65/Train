package pet;

public class Dog extends Pet implements Swimmable, Talkable {

	Dog(String name) {
		super(name);
	}

	public void talk(){
	        System.out.println("Bark! My Name is "+ name + " Bark-bark!");
	    }

	    public void swim(int howFar){
	        System.out.println("Will swim about a half of this distance: " + howFar/2 + " feet");
	    }
	    
	    public void dive(int howDeep){
	        System.out.println("C'mon, don't ask a dog to dive, please!");
	    }

}

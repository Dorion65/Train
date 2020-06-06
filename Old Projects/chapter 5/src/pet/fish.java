package pet;

public class Fish extends Pet implements Swimmable, Talkable {
	
		

	  Fish(String name) {
		super(name);
	}
	public void swim(int howFar){
	        System.out.println("OK, will swim " + howFar + " feet");
	    }
	    public void dive(int howDeep){
	        System.out.println("OK, will dive " + howDeep + " feet");
	    }
	    public void talk(){
	        System.out.println("Blub! My Name is "+ name + " Blub!");
	    }
}
	



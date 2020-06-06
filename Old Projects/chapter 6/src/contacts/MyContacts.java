package contacts;
import java.util.ArrayList;

public class MyContacts {
	
	public static void main(String[] args) {
		ContactDetails contact1 = new ContactDetails();
		ContactDetails contact2 = new ContactDetails();
		
		contact1.setEmail("jallen@gmail.com");
		contact1.setFullName("Jackie Allen");
		contact1.setFacebookID("jallen");
		contact1.setPhone("212-545-5545");
		
		contact2.setEmail("ajones@gmail.com");
		contact2.setFullName("Art Jones");
		contact2.setFacebookID("ajones");
		contact2.setPhone("212-333-2121");
		
		ArrayList<ContactDetails> friends = new ArrayList<>();
		friends.add(contact1);
		friends.add(contact2);
		
		for (ContactDetails contact: friends){
			System.out.println(contact);
}


	}
}

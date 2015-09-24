import java.util.ArrayList;

public class AddressBook {
	ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();
	public void addBuddy(BuddyInfo buddy){
		buddies.add(buddy);
	}
	public void removeBuddy(BuddyInfo buddy){
		buddies.remove(buddy);
	}
	public static void main(String[] args){
		System.out.println("Address book");
		AddressBook addressBook = new AddressBook();
		BuddyInfo buddy1 = new BuddyInfo();
		addressBook.addBuddy(buddy1);
		///addressBook.removeBuddy(buddy1);
	}
}
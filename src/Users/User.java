package Users;

import java.util.*;

public class User {

	static long ID = 0;
	long UserID, ParentID;
	String name, pwd;
	Double TotalCommission, MonthlyCommission;

	List<User> ChildrenList = new ArrayList<User>();

	User(String name, String pwd, long ParentID) {
		this.name = name;
		this.ParentID = ParentID;
		UserID = ID++;
		this.pwd = pwd;
	}

	static User root = new User("Company", "dsd", 0);

}

class Test {

	public static User FindParent(User root, long id) {
		Queue<User> q = new LinkedList<User>();
		q.add(root);
		int match = 0;
		while (!q.isEmpty() && match == 0) {
			int n = q.size();

			while (n > 0 && match == 0) {

				User u = q.peek();
				System.out.print(u.name + "    ");
				if (u.UserID == id) {
					match = 1;
					System.out.println();
					return u;
				}
				q.remove();
				for (int i = 0; i < u.ChildrenList.size(); i++) {
					q.add(u.ChildrenList.get(i));
				}
				n--;
			}
			System.out.println();
		}
		System.out.println("No such user");
		return null;
	}

	public static void main(String[] ddv) {
		System.out.println("added 1");
		User u1 = new User("a", "passwrd", 0);
		User x = FindParent(User.root, 0);
		x.ChildrenList.add(u1);

		System.out.println();

		System.out.println("added 2");
		User u2 = new User("b", "passwrd", 1);
		User y = FindParent(User.root, 1);
		y.ChildrenList.add(u2);

		System.out.println();

		System.out.println("added 3");

		User u3 = new User("c", "passwrd", 1);
		User z = FindParent(User.root, 1);
		z.ChildrenList.add(u3);
		System.out.println();

		System.out.println("added 4");
		User u4 = new User("d","passwrd",3); 
		User a = FindParent(User.root, 3);
		  a.ChildrenList.add(u4); 
		 
		System.out.println("treee printing");
		LevelOrderTraversal(User.root);

	}
	
	
	static void LevelOrderTraversal(User root)
	{
	    if (root == null)
	        return;
	 
	    // Standard level order traversal code
	    // using queue
	    Queue<User > q = new LinkedList<>(); // Create a queue
	    q.add(root); // Enqueue root
	    while (!q.isEmpty())
	    {
	        int n = q.size();
	 
	        // If this User has children
	        while (n > 0)
	        {
	            // Dequeue an item from queue
	            // and print it
	            User p = q.peek();
	            q.remove();
	            System.out.print(p.name + " ");
	 
	            // Enqueue all children of
	            // the dequeued item
	            for (int i = 0; i < p.ChildrenList.size(); i++)
	                q.add(p.ChildrenList.get(i));
	            n--;
	        }
	         
	        // Print new line between two levels
	        System.out.println();
	    }
	}
}
package Users;

import java.util.*;

 class User1 {

	static long ID = 0;
	long User1ID, ParentID;
	String name, pwd;
	Double TotalCommission, MonthlyCommission;

	List<User1> ChildrenList = new ArrayList<User1>();

	User1(String name, long ParentID) {
		this.name = name;
		this.ParentID = ParentID;
		User1ID = ID++;
		
	}

	static User1 root = new User1("Company", 0);

}

public class Printing {

	public static User1 FindParent(User1 root, long id) {
		Queue<User1> q = new LinkedList<User1>();
		q.add(root);
		int match = 0;
		while (!q.isEmpty() && match == 0) {
			int n = q.size();

			while (n > 0 && match == 0) {

				User1 u = q.peek();
				
				if (u.User1ID == id) {
					match = 1;
					
					return u;
				}
				q.remove();
				for (int i = 0; i < u.ChildrenList.size(); i++) {
					q.add(u.ChildrenList.get(i));
				}
				n--;
			}
		}
		System.out.println("No such User1");
		return null;
	}

	public static void main(String[] ddv) {
		
		User1 u1 = new User1("10",0);
		User1 u11 = FindParent(User1.root, 0);
		u11.ChildrenList.add(u1);
		
		User1 u2 = new User1("2",1);
		User1 u22 = FindParent(User1.root, 1);
		u22.ChildrenList.add(u2);
		
		User1 u3 = new User1("34",1);
		User1 u33 = FindParent(User1.root, 1);
		u33.ChildrenList.add(u3);
		
		User1 u4 = new User1("56",1);
		User1 u44 = FindParent(User1.root, 1);
		u44.ChildrenList.add(u4);
		
		User1 u5 = new User1("100",1);
		User1 u55 = FindParent(User1.root, 1);
		u55.ChildrenList.add(u5);
		
		User1 u6 = new User1("77",2);
		User1 u66 = FindParent(User1.root, 2);
		u66.ChildrenList.add(u6);
		
		User1 u7 = new User1("88",2);
		User1 u77 = FindParent(User1.root, 2);
		u77.ChildrenList.add(u7);
		
		User1 u8 = new User1("1",4);
		User1 u88 = FindParent(User1.root, 4);
		u88.ChildrenList.add(u8);
		
		User1 u9 = new User1("7",5);
		User1 u99 = FindParent(User1.root, 5);
		u99.ChildrenList.add(u9);
		
		User1 u0 = new User1("8",5);
		User1 u00 = FindParent(User1.root, 5);
		u00.ChildrenList.add(u0);
		
		
		System.out.println("treee printing");
		LevelOrderTraversal(User1.root);

	}
	
	
	static void LevelOrderTraversal(User1 root)
	{
	    if (root == null)
	        return;
	 
	    // Standard level order traversal code
	    // using queue
	    Queue<User1 > q = new LinkedList<>(); // Create a queue
	    q.add(root); // Enqueue root
	    while (!q.isEmpty())
	    {
	        int n = q.size();
	 
	        // If this User1 has children
	        while (n > 0)
	        {
	            // Dequeue an item from queue
	            // and print it
	            User1 p = q.peek();
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
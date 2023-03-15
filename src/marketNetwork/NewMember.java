package marketNetwork;

public class NewMember {
	static long ID = 0;
	long UserID; 
	long parentID;
	String name;
	String password;
	//Double TotalCommission, MonthlyCommission;
	
	public NewMember(long userId,long parentId,String name,String password)
	{
		
		this.parentID=parentId;
		this.UserID=userId;
		this.name=name;
		this.password=password;
		
	}
	
}

package dataPackage;

import java.util.HashMap;
import java.util.Map;

import marketNetwork.NewMember;

public class Data {

	public static Map<Long,NewMember> data=new HashMap();
	 
	static{
		long l=0;
		data.put(l,new NewMember(l,l,"TrueId","TrueId@123"));
		
		
	}
}

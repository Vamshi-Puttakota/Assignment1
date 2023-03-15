package dataPackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DataSerialisation {

	static public void dataS()
	{
		try 
		{
			Data d1=new Data();
			FileOutputStream fos=new FileOutputStream("NetworkData2S.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d1);
		}catch(Exception e) {};
	}
}

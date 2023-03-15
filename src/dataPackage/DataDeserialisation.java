package dataPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataDeserialisation {

static int count=0;
	
	static public void dataS()throws Exception
	{
		
			Data d1=new Data();
			FileOutputStream fos=new FileOutputStream("NetworkData2.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d1);
		
	}
	public static Data dataDS()throws Exception
	{
			if(count==0)
			{
				dataS();
				count++;
			}
			FileInputStream fis=new FileInputStream("\"C:\\Users\\TrueID Pvt Ltd\\Documents\\Narendra\\STS2\\Java_Core\\NetworkData2S.ser\"");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Data d2=(Data)ois.readObject();
		    return d2;
	}
}

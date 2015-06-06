package Join.MapJoin;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
public class Reducer1 extends Reducer<Text, Text, Text, Text>{
	
	@Override
	protected void reduce(Text arg0, Iterable<Text> arg1,
			Reducer<Text, Text, Text, Text>.Context arg2) throws IOException,
			InterruptedException {
		// TODO Auto-generated method stub
		//super.reduce(arg0, arg1, arg2);
		String dname = "";
		
		ArrayList<String> records = new ArrayList<String>();
		for(Text tuple:arg1)
		{
			if(tuple.toString().contains("&&"))
			{
				String[] arr1 =tuple.toString().split(",");
				dname = arr1[0];				
			}			
			else
			{
				String[] arr =tuple.toString().split(",");
				records.add(arr[0]+" "+arr[1]);				
			}
		}
		
		for(String l : records)
		arg2.write(new Text(l), new Text(dname));
		
		
		
		
		
	}
	

}

package unique.UniqueUser;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Redu extends Reducer<Text, Text, Text, IntWritable> {
	
	
	@Override
	protected void reduce(Text arg0, Iterable<Text> arg1,
			Reducer<Text, Text, Text, IntWritable>.Context arg2)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	  //	super.reduce(arg0, arg1, arg2);
	
		
		int counter = 0;
		ArrayList<String> ar = new ArrayList<String>();		
		for(Text count: arg1)
		{	
			
			if(!ar.contains(count))
			{
				counter++;
				
			}
		}
				
		arg2.write(arg0,new IntWritable(counter));
		
		
	}
}

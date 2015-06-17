package Sec.SecondarySort;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Reducer1 extends Reducer<CompositeKey, Text, Text, Text>{
	
	
	@Override
	protected void reduce(CompositeKey arg0, Iterable<Text> arg1,
			Reducer<CompositeKey, Text, Text, Text>.Context arg2) throws IOException,
			InterruptedException {
		// TODO Auto-generated method stub
	//	super.reduce(arg0, arg1, arg2);
		
		String dname = arg1.iterator().next().toString();
		while(arg1.iterator().hasNext())
		{
			arg2.write(new Text(arg1.iterator().next().toString()), new Text(dname));
			
		}
						
		
	}

}

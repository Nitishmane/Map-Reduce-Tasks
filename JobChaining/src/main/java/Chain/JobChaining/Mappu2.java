package Chain.JobChaining;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mappu2 extends Mapper<LongWritable, Text, Text,Text>{

	
	
	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	//	super.map(key, value, context);
				
		String line = value.toString();
		String[] arr = line.split(",");
		
			if(arr[2].equals("Nitish"))
			{
				context.write(new Text(arr[2]), new Text(line));
				
			}
		
	}
}

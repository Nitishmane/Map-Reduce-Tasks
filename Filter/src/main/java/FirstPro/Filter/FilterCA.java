package FirstPro.Filter;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FilterCA extends Mapper<LongWritable,Text, Text, Text>{

	
	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//super.map(key, value, context);
	
		
		String line = value.toString();
		String[] arr = line.split(",");
		
			if(arr[1].equals("CA"))
			{
				context.write(new Text(arr[1]), new Text(line));
				
			}
	}	

}

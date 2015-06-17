package Sec.SecondarySort;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mapper2 extends Mapper<LongWritable, Text, CompositeKey, Text>{

	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, CompositeKey, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	//	super.map(key, value, context);
		
		String line = value.toString();
		String [] arr = line.split(",");
		
		CompositeKey compositeKey = new CompositeKey(arr[0], 0);
		context.write(compositeKey, new Text(arr[1]));
		
		
	}
}

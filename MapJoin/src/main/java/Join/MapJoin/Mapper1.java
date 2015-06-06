package Join.MapJoin;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mapper1 extends Mapper<LongWritable, Text, Text, Text>{
	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	//	super.map(key, value, context);
		
		String line = value.toString();
		String[] arr = line.split(",");
		String ar = arr[0]+" ,"+arr[1] + ", @@ "; 
		context.write(new Text(arr[2]), new Text(ar));
				
			
		
		
	}

}

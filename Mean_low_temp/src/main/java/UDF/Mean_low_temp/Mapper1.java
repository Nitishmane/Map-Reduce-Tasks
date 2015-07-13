package UDF.Mean_low_temp;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mapper1 extends Mapper<LongWritable, Text, Text, Text> {
	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, Text, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// super.map(key, value, context);

		String line = value.toString();
		String[] arr = line.split(",");
		String tuple = arr[1]+ ","+ arr[3];
		if (Integer.parseInt(arr[1]) > 1950 && Integer.parseInt(arr[1]) < 2015) {
			if (arr[0].equals("010170")) {
				context.write(new Text(arr[0]),
						new Text(tuple));

			}
		}
	}
}

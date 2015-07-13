package UDF.Mean_low_temp;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Reducer1 extends Reducer<Text, Text, Text, IntWritable> {
	@Override
	protected void reduce(Text arg0, Iterable<Text> arg1,
			Reducer<Text, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// super.reduce(arg0, arg1, arg2);
		int total1 = 0;
		int count1 = 0;

		int total2 = 0;
		int count2 = 0;

		int total3 = 0;
		int count3 = 0;

		for (Text count : arg1) {
			String line = count.toString();
			String[] arr = line.split(",");

			if (Integer.parseInt(arr[0]) > 1950
					&& Integer.parseInt(arr[0]) < 1976) {
				total1 = total1 + Integer.parseInt(arr[1]);
				count1++;
			}
			if (Integer.parseInt(arr[0]) > 1975
					&& Integer.parseInt(arr[0]) < 2001) {
				total2 = total2 + Integer.parseInt(arr[1]);
				count2++;

			}
			if (Integer.parseInt(arr[0]) > 2000
					&& Integer.parseInt(arr[0]) < 2015) {
				total3 = total3 + Integer.parseInt(arr[1]);
				count3++;

			}

		}
		int mean1 = 0;
		if (count1 != 0)
			mean1 = total1 / count1;
		int mean2 = 0;
		if (count2 != 0)
			mean2 = total2 / count2;
		int mean3 = 0;
		if (count3 != 0)
			mean3 = total3 / count3;
		String set1 = "Station:010170, year:1950-1975";
		String set2 = "Station:010170, year:1976-2000";
		String set3 = "Station:010170, year:2001-2014";
		context.write(new Text(set1), new IntWritable(mean1));
		context.write(new Text(set2), new IntWritable(mean2));
		context.write(new Text(set3), new IntWritable(mean3));
	}

}

package Join.DistributedCache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mapper1 extends Mapper<LongWritable, Text, IntWritable, Text> {

	private BufferedReader bufferreader;
	  private static HashMap<String, String> DepartmentMap = new HashMap<String, String>();

	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, IntWritable, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// super.map(key, value, context);
		String[] words = value.toString().split(",");
        String deptName = DepartmentMap.get(words[2]);
        context.write(new IntWritable(Integer.parseInt(words[0])), new Text(words[1] + "," + deptName));
		
	}	

	@Override
	protected void setup(Mapper<LongWritable, Text, IntWritable, Text>.Context context)
			throws IOException, InterruptedException {
		// TODO Auto-generated method stub	
	//	super.setup(context);
		Path[] cacheFilesLocal = DistributedCache.getLocalCacheFiles(context.getConfiguration());
		System.out.println(cacheFilesLocal[0].toString());
		BufferedReader brReader = new BufferedReader(new FileReader(cacheFilesLocal[0].getName().toString()));
		String strLineRead = "";
		while ((strLineRead = brReader.readLine()) != null) {
            String deptEntries[] = strLineRead.split(",");
            DepartmentMap.put(deptEntries[0], deptEntries[1]);
        }
    }
		
		
		
	
}

package Sec.SecondarySort;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.io.Text;


public class Driver extends Configured implements Tool{

	public int run(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if (args.length != 3) {
            System.out.printf(
                    "Usage: %s [generic options] <input dir> <output dir>\n", getClass()
                    .getSimpleName());
            ToolRunner.printGenericCommandUsage(System.out);
            return -1;
	}

	Job job = new Job(getConf());
	job.setJarByClass(Driver.class);
	job.setJobName(this.getClass().getName());
	
	
	FileOutputFormat.setOutputPath(job, new Path(args[2]));
	
	job.setReducerClass(Reducer1.class);
	
	job.setMapOutputKeyClass(CompositeKey.class);
	job.setMapOutputValueClass(Text.class);
	
	job.setOutputKeyClass(Text.class);
	job.setOutputValueClass(Text.class);
	
	
	job.setPartitionerClass(CustomPartitioner.class);
	job.setSortComparatorClass(CustomSC.class);
	job.setGroupingComparatorClass(CustomGC.class);
	
	
	
	MultipleInputs.addInputPath(job, new Path(args[0]),TextInputFormat.class, Mapper1.class);
	MultipleInputs.addInputPath(job, new Path(args[1]),TextInputFormat.class, Mapper2.class);
	
	
	 if (job.waitForCompletion(true)) {
         return 0;
     }
     return 1;
 }
	public static void main(String[] args) throws Exception {
		int exitCode = ToolRunner.run(new Driver(), args);
		System.exit(exitCode);
	}
}

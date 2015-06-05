package Chain.JobChaining;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import com.sun.jersey.api.model.Parameter;




public class ChainDriver extends Configured implements Tool {
	
	
	private static final String OUTPUT_PATH = "intermediate_output";
    public int run(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.printf(
                    "Usage: %s [generic options] <input dir> <output dir>\n", getClass()
                    .getSimpleName());
            ToolRunner.printGenericCommandUsage(System.out);
            return -1;
        }
        
       
   
        
        Job job1 = new Job(getConf());
        String output_path = new String(); 
        
        job1.setJarByClass(MultipleInputs.class);
        
        job1.setJarByClass(ChainDriver.class);
        job1.setJobName(this.getClass().getName());

        FileOutputFormat.setOutputPath(job1, new Path(OUTPUT_PATH));
        FileInputFormat.setInputPaths(job1, new Path(args[0]));
    
        job1.setMapperClass(Mappu1.class);
      //  job1.setReducerClass(Reddu.class);
  
        job1.setMapOutputKeyClass(Text.class);
        job1.setMapOutputValueClass(Text.class);

        job1.setOutputKeyClass(Text.class);
        job1.setOutputValueClass(Text.class);
        
        job1.waitForCompletion(true);
        
//////////////////////////////////////////////////////////////////////////////////////////////////////        
        Job job2 = new Job(getConf());
        
        job2.setJarByClass(MultipleInputs.class);
        
        job2.setJarByClass(ChainDriver.class);
        job2.setJobName(this.getClass().getName());

        FileOutputFormat.setOutputPath(job2, new Path(args[1]));
        FileInputFormat.setInputPaths(job2, new Path(OUTPUT_PATH));
    
        job2.setMapperClass(Mappu2.class);
   //     job2.setReducerClass(Reddu.class);
  
        job2.setMapOutputKeyClass(Text.class);
        job2.setMapOutputValueClass(Text.class);

        job2.setOutputKeyClass(Text.class);
        job2.setOutputValueClass(Text.class);
        
        job2.waitForCompletion(true);
        
        
        if (job2.waitForCompletion(true)) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws Exception {
    
    	int exitCode = ToolRunner.run(new ChainDriver(), args);
        System.exit(exitCode);
        
    }
}

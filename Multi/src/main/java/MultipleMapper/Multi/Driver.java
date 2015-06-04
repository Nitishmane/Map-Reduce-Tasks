package MultipleMapper.Multi;

import java.security.Policy.Parameters;

import javax.naming.Context;

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




public class Driver extends Configured implements Tool {
	
    public int run(String[] args) throws Exception {

        if (args.length != 3) {
            System.out.printf(
                    "Usage: %s [generic options] <input dir> <output dir>\n", getClass()
                    .getSimpleName());
            ToolRunner.printGenericCommandUsage(System.out);
            return -1;
        }
        
       
   
        
        Job job = new Job(getConf());
        
   
        job.setJarByClass(MultipleInputs.class);
        
        job.setJarByClass(Driver.class);
        job.setJobName(this.getClass().getName());

   
     
        FileOutputFormat.setOutputPath(job, new Path(args[2]));
         
    
        
        
        job.setMapperClass(Mapper1.class);
        job.setMapperClass(Mapper2.class);
        //job.setReducerClass(FilterRed.class);
   

        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Text.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, Mapper1.class);
        MultipleInputs.addInputPath(job,new Path(args[1]), TextInputFormat.class, Mapper2.class);

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

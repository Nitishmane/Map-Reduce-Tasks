package Uni.Union;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class Red extends Reducer<Text, Text,Text, Text>{

	@Override
	protected void reduce(Text arg0, Iterable<Text> arg1,
			Reducer<Text, Text, Text, Text>.Context arg2) throws IOException,
			InterruptedException {
		// TODO Auto-generated method stub
	//	super.reduce(arg0, arg1, arg2);
		
		//Set s = new HashSet();
		//s.addAll((Collection) arg1);
		arg2.write(arg0,new Text(arg1.iterator().next().toString()));
		
	}
	
}

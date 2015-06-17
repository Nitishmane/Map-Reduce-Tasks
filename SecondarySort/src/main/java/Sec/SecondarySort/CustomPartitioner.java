package Sec.SecondarySort;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class CustomPartitioner extends Partitioner<CompositeKey, Text> {

	

	public int getPartition(CompositeKey arg0, Text arg1, int arg2) {
		// TODO Auto-generated method stub
		
		return arg0.getDid().hashCode() % arg2;
	}

	
	

}

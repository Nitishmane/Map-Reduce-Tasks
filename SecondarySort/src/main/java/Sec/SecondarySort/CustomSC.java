package Sec.SecondarySort;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class CustomSC extends WritableComparator {

	protected CustomSC() {
		super(CompositeKey.class, true);
	}
	
	@Override
	public int compare(WritableComparable w1, WritableComparable w2) {
		CompositeKey key1 = (CompositeKey) w1;
		CompositeKey key2 = (CompositeKey) w2;
 
		int cmpResult = key1.getDid().compareTo(key2.getDid());
		if (cmpResult == 0)
		{
			//such that dept value comes 1st in the output
			return key1.getRest() - key2.getRest(); 
		}
		return cmpResult;
	}
	
	
	
}

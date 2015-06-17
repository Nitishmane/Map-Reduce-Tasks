package Sec.SecondarySort;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class CustomGC extends WritableComparator{

	 protected CustomGC() {
			super(CompositeKey.class, true);
		}
	  
	  @Override
		public int compare(WritableComparable w1, WritableComparable w2) {
			CompositeKey key1 = (CompositeKey) w1;
			CompositeKey key2 = (CompositeKey) w2;
			return key1.getDid().compareTo(key2.getDid());
		}

	
}
	
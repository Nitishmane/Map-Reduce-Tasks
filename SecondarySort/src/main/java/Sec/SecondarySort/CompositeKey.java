package Sec.SecondarySort;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableUtils;


public class CompositeKey implements WritableComparable<CompositeKey>{

	private String Did;
	private int rest;
	
	/**
	 * @return the did
	 */
	
	
public CompositeKey(){
		
		
	}
	public CompositeKey(String Did, int rest)
	{
		this.Did = Did;
		this.rest=rest;
		
	}
	public String getDid() {
		return Did;
	}

	/**
	 * @param did the did to set
	 */
	public void setDid(String did) {
		Did = did;
	}

	/**
	 * @return the rest
	 */
	public int getRest() {
		return rest;
	}

	/**
	 * @param rest the rest to set
	 */
	
	
/*
	@Override
	public String toString() {
		return (new StringBuilder().append(Did).append(",").append(rest))
				.toString();
	}
	*/
	public void setRest(int rest) {
		this.rest = rest;
	}

	public void readFields(DataInput args) throws IOException {
		// TODO Auto-generated method stub
		
		Did = WritableUtils.readString(args);
		rest =WritableUtils.readVInt(args);	
		
	}

	public void write(DataOutput args) throws IOException {
		// TODO Auto-generated method stub
		
		WritableUtils.writeString(args, Did);
		WritableUtils.writeVInt(args, rest);
		
	}

	public int compareTo(CompositeKey o) {
		// TODO Auto-generated method stub
		int result = Did.compareTo(o.Did);
		if (result == 0) {
			result = rest - o.rest;
		}
		return result;
	}

	
	
}

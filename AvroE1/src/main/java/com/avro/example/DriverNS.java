package com.avro.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;


public class DriverNS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		BufferedReader fileReader = null;
		 List<GenericRecord> emplist = new ArrayList();
		        try {
		            //Create a new list of student to be filled by CSV file data
		          
		        	Schema schema = new Schema.Parser().parse(new File("Avr.avsc"));
		            String line = "";
		            //Create the file reader
		            fileReader = new BufferedReader(new FileReader("abc.csv"));
		            //Read the CSV file header to skip it
		            fileReader.readLine();
		            //Read the file line by line starting from the second line
		            while ((line = fileReader.readLine()) != null) 
		            {
		                String[] tokens = line.split(",");
		                GenericRecord emp = new GenericData.Record(schema);
		                emp.put("id", (Integer.parseInt(tokens[0])));
		                emp.put("name",tokens[1]);
		                emp.put("designation",tokens[2]);
		                emp.put("mgrid",(Integer.parseInt(tokens[3])));
		                emp.put("hiredate",tokens[4]);
		                emp.put("salary",(double) Integer.parseInt(tokens[5]));
		                emp.put("commission",(double) Integer.parseInt(tokens[6]));
		                emp.put("deptid",Integer.parseInt(tokens[7]));		                		    
		                
		                emplist.add(emp);
		                
		            }
				
		            
		            File file = new File("usersNS.avro");
		            DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<GenericRecord>(schema);
		            DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(datumWriter);
		            dataFileWriter.create(schema, file);
		            dataFileWriter.append(emplist.get(0));
		            dataFileWriter.append(emplist.get(1));
		            dataFileWriter.append(emplist.get(2));
		            
		            dataFileWriter.close();
		        
		           
		            File ab = new File("abctextNS.txt");
		            FileWriter fw = new FileWriter(ab);
		            BufferedWriter bw = new BufferedWriter(fw);
		        
		            DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>(schema);
		        	DataFileReader<GenericRecord> dataFileReader = new DataFileReader<GenericRecord>(file, datumReader);
		        	GenericRecord user = null;
		        	while (dataFileReader.hasNext()) {
		        	// Reuse user object by passing it to next(). This saves us from
		        	// allocating and garbage collecting many objects for files with
		        	// many items.
		        	user = dataFileReader.next(user);		        	
		        	bw.write(user.toString());
		        	bw.newLine();
		        	System.out.println(user);
		        	}
		        	bw.close();
		        	
		        	
		        	
		        	
		        	
		        }
		        
		        
		        finally{
		        	
	

		
		        }

		        }
}

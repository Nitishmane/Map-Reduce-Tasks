package com.avro.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;


public class Driver {

/*	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		BufferedReader fileReader = null;
		 List<Employee> emplist = new ArrayList();
		        try {
		            //Create a new list of student to be filled by CSV file data
		          
		            String line = "";
		            //Create the file reader
		            fileReader = new BufferedReader(new FileReader("abc.csv"));
		            //Read the CSV file header to skip it
		            fileReader.readLine();
		            //Read the file line by line starting from the second line
		            while ((line = fileReader.readLine()) != null) 
		            {
		                String[] tokens = line.split(",");
		                Employee emp = new Employee();
		                emp.setId(Integer.parseInt(tokens[0]));
		                emp.setName(tokens[1]);
		                emp.setDesignation(tokens[2]);
		                emp.setMgrid(Integer.parseInt(tokens[3]));
		                emp.setHiredate(tokens[4]);
		                emp.setSalary((double) Integer.parseInt(tokens[5]));
		                emp.setCommission((double) Integer.parseInt(tokens[6]));
		                emp.setDeptid(Integer.parseInt(tokens[7]));		                		    
		                
		                emplist.add(emp);
		                
		            }
				
		            
		            DatumWriter<Employee> userDatumWriter = new SpecificDatumWriter<Employee>(Employee.class);
		            DataFileWriter<Employee> dataFileWriter = new DataFileWriter<Employee>(userDatumWriter);
		            dataFileWriter.create((emplist.get(0)).getSchema(), new File("users.avro"));
		            dataFileWriter.append(emplist.get(0));
		            dataFileWriter.append(emplist.get(1));
		            dataFileWriter.append(emplist.get(2));
		            
		            dataFileWriter.close();
		        
		            
		            File ab = new File("abctext.txt");
		            FileWriter fw = new FileWriter(ab);
		            BufferedWriter bw = new BufferedWriter(fw);
		        
		            DatumReader<Employee> userDatumReader = new SpecificDatumReader<Employee>(Employee.class);
		        	DataFileReader<Employee> dataFileReader = new DataFileReader<Employee>(new File("users.avro"), userDatumReader);
		        	Employee user = null;
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

		        }*/
}

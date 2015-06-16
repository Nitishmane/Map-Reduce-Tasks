/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.avro.example;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"com.avro.example\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"designation\",\"type\":[\"string\",\"null\"]},{\"name\":\"mgrid\",\"type\":[\"int\",\"null\"]},{\"name\":\"hiredate\",\"type\":\"string\"},{\"name\":\"salary\",\"type\":\"double\"},{\"name\":\"commission\",\"type\":[\"double\",\"null\"]},{\"name\":\"deptid\",\"type\":[\"int\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence designation;
  @Deprecated public java.lang.Integer mgrid;
  @Deprecated public java.lang.CharSequence hiredate;
  @Deprecated public double salary;
  @Deprecated public java.lang.Double commission;
  @Deprecated public java.lang.Integer deptid;

  /**
   * Default constructor.
   */
  public Employee() {}

  /**
   * All-args constructor.
   */
  public Employee(java.lang.Integer id, java.lang.CharSequence name, java.lang.CharSequence designation, java.lang.Integer mgrid, java.lang.CharSequence hiredate, java.lang.Double salary, java.lang.Double commission, java.lang.Integer deptid) {
    this.id = id;
    this.name = name;
    this.designation = designation;
    this.mgrid = mgrid;
    this.hiredate = hiredate;
    this.salary = salary;
    this.commission = commission;
    this.deptid = deptid;
  }

  public Employee(int i, String string, String string2, int j, String string3,
		int k, int l, int m) {
	// TODO Auto-generated constructor stub
}

public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return designation;
    case 3: return mgrid;
    case 4: return hiredate;
    case 5: return salary;
    case 6: return commission;
    case 7: return deptid;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: designation = (java.lang.CharSequence)value$; break;
    case 3: mgrid = (java.lang.Integer)value$; break;
    case 4: hiredate = (java.lang.CharSequence)value$; break;
    case 5: salary = (java.lang.Double)value$; break;
    case 6: commission = (java.lang.Double)value$; break;
    case 7: deptid = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'designation' field.
   */
  public java.lang.CharSequence getDesignation() {
    return designation;
  }

  /**
   * Sets the value of the 'designation' field.
   * @param value the value to set.
   */
  public void setDesignation(java.lang.CharSequence value) {
    this.designation = value;
  }

  /**
   * Gets the value of the 'mgrid' field.
   */
  public java.lang.Integer getMgrid() {
    return mgrid;
  }

  /**
   * Sets the value of the 'mgrid' field.
   * @param value the value to set.
   */
  public void setMgrid(java.lang.Integer value) {
    this.mgrid = value;
  }

  /**
   * Gets the value of the 'hiredate' field.
   */
  public java.lang.CharSequence getHiredate() {
    return hiredate;
  }

  /**
   * Sets the value of the 'hiredate' field.
   * @param value the value to set.
   */
  public void setHiredate(java.lang.CharSequence value) {
    this.hiredate = value;
  }

  /**
   * Gets the value of the 'salary' field.
   */
  public java.lang.Double getSalary() {
    return salary;
  }

  /**
   * Sets the value of the 'salary' field.
   * @param value the value to set.
   */
  public void setSalary(java.lang.Double value) {
    this.salary = value;
  }

  /**
   * Gets the value of the 'commission' field.
   */
  public java.lang.Double getCommission() {
    return commission;
  }

  /**
   * Sets the value of the 'commission' field.
   * @param value the value to set.
   */
  public void setCommission(java.lang.Double value) {
    this.commission = value;
  }

  /**
   * Gets the value of the 'deptid' field.
   */
  public java.lang.Integer getDeptid() {
    return deptid;
  }

  /**
   * Sets the value of the 'deptid' field.
   * @param value the value to set.
   */
  public void setDeptid(java.lang.Integer value) {
    this.deptid = value;
  }

  /** Creates a new Employee RecordBuilder */
  public static com.avro.example.Employee.Builder newBuilder() {
    return new com.avro.example.Employee.Builder();
  }
  
  /** Creates a new Employee RecordBuilder by copying an existing Builder */
  public static com.avro.example.Employee.Builder newBuilder(com.avro.example.Employee.Builder other) {
    return new com.avro.example.Employee.Builder(other);
  }
  
  /** Creates a new Employee RecordBuilder by copying an existing Employee instance */
  public static com.avro.example.Employee.Builder newBuilder(com.avro.example.Employee other) {
    return new com.avro.example.Employee.Builder(other);
  }
  
  /**
   * RecordBuilder for Employee instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
    implements org.apache.avro.data.RecordBuilder<Employee> {

    private int id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence designation;
    private java.lang.Integer mgrid;
    private java.lang.CharSequence hiredate;
    private double salary;
    private java.lang.Double commission;
    private java.lang.Integer deptid;

    /** Creates a new Builder */
    private Builder() {
      super(com.avro.example.Employee.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.avro.example.Employee.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Employee instance */
    private Builder(com.avro.example.Employee other) {
            super(com.avro.example.Employee.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.designation)) {
        this.designation = data().deepCopy(fields()[2].schema(), other.designation);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.mgrid)) {
        this.mgrid = data().deepCopy(fields()[3].schema(), other.mgrid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.hiredate)) {
        this.hiredate = data().deepCopy(fields()[4].schema(), other.hiredate);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.salary)) {
        this.salary = data().deepCopy(fields()[5].schema(), other.salary);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.commission)) {
        this.commission = data().deepCopy(fields()[6].schema(), other.commission);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.deptid)) {
        this.deptid = data().deepCopy(fields()[7].schema(), other.deptid);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.Integer getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.avro.example.Employee.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.avro.example.Employee.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public com.avro.example.Employee.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public com.avro.example.Employee.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'designation' field */
    public java.lang.CharSequence getDesignation() {
      return designation;
    }
    
    /** Sets the value of the 'designation' field */
    public com.avro.example.Employee.Builder setDesignation(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.designation = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'designation' field has been set */
    public boolean hasDesignation() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'designation' field */
    public com.avro.example.Employee.Builder clearDesignation() {
      designation = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'mgrid' field */
    public java.lang.Integer getMgrid() {
      return mgrid;
    }
    
    /** Sets the value of the 'mgrid' field */
    public com.avro.example.Employee.Builder setMgrid(java.lang.Integer value) {
      validate(fields()[3], value);
      this.mgrid = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'mgrid' field has been set */
    public boolean hasMgrid() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'mgrid' field */
    public com.avro.example.Employee.Builder clearMgrid() {
      mgrid = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'hiredate' field */
    public java.lang.CharSequence getHiredate() {
      return hiredate;
    }
    
    /** Sets the value of the 'hiredate' field */
    public com.avro.example.Employee.Builder setHiredate(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.hiredate = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'hiredate' field has been set */
    public boolean hasHiredate() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'hiredate' field */
    public com.avro.example.Employee.Builder clearHiredate() {
      hiredate = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'salary' field */
    public java.lang.Double getSalary() {
      return salary;
    }
    
    /** Sets the value of the 'salary' field */
    public com.avro.example.Employee.Builder setSalary(double value) {
      validate(fields()[5], value);
      this.salary = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'salary' field has been set */
    public boolean hasSalary() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'salary' field */
    public com.avro.example.Employee.Builder clearSalary() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'commission' field */
    public java.lang.Double getCommission() {
      return commission;
    }
    
    /** Sets the value of the 'commission' field */
    public com.avro.example.Employee.Builder setCommission(java.lang.Double value) {
      validate(fields()[6], value);
      this.commission = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'commission' field has been set */
    public boolean hasCommission() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'commission' field */
    public com.avro.example.Employee.Builder clearCommission() {
      commission = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'deptid' field */
    public java.lang.Integer getDeptid() {
      return deptid;
    }
    
    /** Sets the value of the 'deptid' field */
    public com.avro.example.Employee.Builder setDeptid(java.lang.Integer value) {
      validate(fields()[7], value);
      this.deptid = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'deptid' field has been set */
    public boolean hasDeptid() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'deptid' field */
    public com.avro.example.Employee.Builder clearDeptid() {
      deptid = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    //@Override
    public Employee build() {
      try {
        Employee record = new Employee();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.designation = fieldSetFlags()[2] ? this.designation : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.mgrid = fieldSetFlags()[3] ? this.mgrid : (java.lang.Integer) defaultValue(fields()[3]);
        record.hiredate = fieldSetFlags()[4] ? this.hiredate : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.salary = fieldSetFlags()[5] ? this.salary : (java.lang.Double) defaultValue(fields()[5]);
        record.commission = fieldSetFlags()[6] ? this.commission : (java.lang.Double) defaultValue(fields()[6]);
        record.deptid = fieldSetFlags()[7] ? this.deptid : (java.lang.Integer) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}

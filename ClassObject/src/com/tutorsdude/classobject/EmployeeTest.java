package com.tutorsdude.classobject;

public class EmployeeTest{

	  private String firstName;
	  private String lastName;

	  public EmployeeTest(String firstName, String lastName) {
	    this.firstName = firstName;
	    this.lastName = lastName;
	  }

	  public String getfirstName() {
	    return firstName;
	  }

	  public void setfirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getlastName() {
	    return lastName;
	  }

	  public void setlastName(String lastName) {
	    this.lastName = lastName;
	  }

	  @Override
	  public String toString() {
	    return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	  }


		
}

package org.sam;


public class Employee {
	
	public class Parameterized {
		public Parameterized(String name) {
			
			System.out.println(name);
			
		}
		public Parameterized(String mail,int id) {
			System.out.println(mail);
			System.out.println(id);
			
			
		}
		private void empId() {
			System.out.println("employee id is 12345");

		}
		public void main(String[] args) {
			Parameterized p=new Parameterized("kishore");
			Parameterized p1= new Parameterized("kishore12@gmail.com",12345);
			Parameterized p2= new Parameterized(null);
			p2.empId();
			
			
			
			
		}
	}}
	

	



package project;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

public class test {
	
	@Test
	public void testTask1() {
		bankAccount b=new bankAccount();
		System.out.println(b.customers);
		String name="Sarah";
		String lastName="Mclain";
		Integer balance=1000;
		String city="chicago";
		accountInfo accountinfo=new accountInfo(name,lastName,balance,city);
		b.customers.add(accountinfo);
		assertEquals("Sarah Mclain,1000,chicago",b.customers.get(b.customers.size()-1).toString());
	}
	
	@Test
	public void testHighestBalance() {
		bankAccount b=new bankAccount();
		String name="Pete";
		assertEquals(name,b.highestBalance());
	}
	
	@Test
	public void testAddArray() {
		bankAccount b=new bankAccount();
		accountInfo[] newCustom=new accountInfo[] {new accountInfo("john","peterson", 500,"chicago"),new accountInfo("colleen","clark", 2500,"los angeles"),new accountInfo("David","Mel", 99000,"chicago")};
		assertEquals(63,b.addArray(newCustom).size());
	}
	
	@Test
	public void testCountChicago() {
		bankAccount b=new bankAccount();
		assertEquals(20,b.countChicagoCustomers());
	}
	
	@Test
	public void testUpdateBalance1() {
		bankAccount b=new bankAccount();
		accountInfo customer1=new accountInfo("Henry", "Holloway",200,"los angeles");
		accountInfo customer2=new accountInfo("Juan", "Wilkins",200,"seattle");
		assertEquals(new accountInfo("Henry", "Holloway",1800,"los angeles").toString(),b.updateBalance(customer1).toString());
		assertEquals(new accountInfo("Juan", "Wilkins",8800,"seattle").toString(),b.updateBalance(customer2).toString());
	}
	
	
	@Test
	public void testUpdateBalance2() {
		bankAccount b=new bankAccount();
		accountInfo customer=new accountInfo("Joann", "Scott",200,"seattle");
		assertEquals(null,b.updateBalance(customer));
	}
	
	@Test
	public void testRemoveDuplicates() {
		bankAccount b=new bankAccount();
		assertEquals(54,b.removeDuplicate());
	}
	
	

}

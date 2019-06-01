/**
 * Copyright 2019 Techtorial LLC
 */
package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bankAccount {
 
	ArrayList<accountInfo> customers;

	{
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("data/names.txt"));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			customers = new ArrayList<>();
			while (line != null) {
				String[] accountDetails = line.split(",");
				String[] nameLastName = accountDetails[0].split(" ");
				accountInfo o1 = new accountInfo(nameLastName[0], nameLastName[1], Integer.parseInt(accountDetails[1]),
						accountDetails[2]);
				customers.add(o1);
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			String everything = sb.toString();
		} catch (Exception e) {
			System.out.println("File not loaded");
		} finally {
		}
	}

	/**
	 * Write a method that will count customers only from chicago 
	 * Use customers -> holds all Customer information
	 * 
	 * @return int -> number of customers from Chicago
	 */
	public int countChicagoCustomers() {
		int count=0;
		for(int i=0;i<customers.size(); i++) {
			if(customers.get(i).getCity().equals("chicago")) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Write a method that will return person name who has highest balance
	 * 
	 * Use customers -> holds all Customer information
	 * 
	 * @return String (name of person who has highest balance)
	 */

	public String highestBalance() {
		String nameHighestBalance="";
		Integer maxBalance=0;
		for(int i=0;i<customers.size(); i++) {
			
			if(customers.get(i).getBalance()>maxBalance) {
				maxBalance=customers.get(i).getBalance();
				nameHighestBalance=customers.get(i).getName();
				
			}
		}
		return nameHighestBalance;
	}

	/**
	 * Write a method that will accept Arrays of accountInfo object and 
	 * will add them to ArrayList customers
	 * 
	 * @parameter array of accountInfo
	 * @return ArrayList -> added with new customers
	 */
	public ArrayList<accountInfo> addArray(accountInfo[] newCustomers) {
		List<accountInfo> accountInfo=Arrays.asList(newCustomers);
		for(int i=0; i<newCustomers.length;i++) {
		customers.add(newCustomers[i]);
		

		}

		return customers;
	}

	/**
	 * Write a code that will set up a new balance for the customer who made some
	 * some transaction. If customer is not in the list then return null 
	 * Use customers -> holds all Customer information
	 * 
	 * for example: 
	 * original record: Anna Dennis,300,atlanta -> parameter provided to
	 * method updateCustomer(new accountInfo("Anna", "Dennis", 50, "atlanta")); ->
	 * return should be Anna Dennis,250,atlanta
	 * 
	 * @parameter accountInfo Object
	 * @return accountInfo object
	 * 
	 */

	public accountInfo updateBalance(accountInfo transaction) {
		Integer newBalance=0;
		
	
		for(int i=0; i<customers.size();i++) {
			if(transaction.getName().equals(customers.get(i).getName())&&
					transaction.getLastName().equals(customers.get(i).getLastName())
					&&transaction.getCity().equals(customers.get(i).getCity())){
				 newBalance=customers.get(i).getBalance()-transaction.getBalance();
				
		
	return new accountInfo(transaction.getName(),transaction.getLastName(),newBalance,transaction.getCity());
			
			}
		}
		
		return null;
	}

	/**
	 * Write a method that will remove all duplicate customers from customers
	 * ArrayList and return number of unique customers
	 * 
	 * @return ArrayList of unique customers
	 */

	public int removeDuplicate() {
		
		for(int i=0; i<customers.size();i++) {
			for(int j=i+
					
					1; j<customers.size();j++) {
				if (customers.get(i).toString().equals(customers.get(j).toString())) {
					customers.remove(j);
				}
					
				
			}
			
		}
		return customers.size();
	}

}

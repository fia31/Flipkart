package org.base;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Flipkart extends Methods{
static Methods m = new Methods();
	
	@Rule
	public TestName test = new TestName();
	
	@BeforeClass
	public static void BeforeClass() {	
		m.setDriver();
		m.launch("");
		m.maximize();
	}
	
	@Before
	public void Before() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void test1() throws IOException {
		Login l = new Login();
		l.getCancel().click();
		String user = m.excelread("C:\\Users\\solo\\Documents\\Flip.xlsx", "Flip", 0, 0, "ya");
		l.getUsername(user);
		String pass = m.excelread("C:\\Users\\solo\\Documents\\Flip.xlsx", "Flip", 0, 1, "");
		l.getPassword(pass);
		l.getLogin().click();
	}
	
	@Test
	public void test2() throws IOException {
		Search se = new Search();
		String pro1 = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 2, "");
		se.getSearchbox(pro1);
		se.getEnter().click();
		se.getProselect().click();
	}
	
	@Test
	public void test3() {
		AddCart ad = new AddCart();
		m.switchtobyindex(1);
		ad.getAddcart().click();
		ad.getPlaceorder().click();
	}
	
	@Test
	public void test4() throws IOException {
		Address a = new Address();
		a.getAddAddress().click();
		a.getNewaddress().click();
		String name = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 3, "");
		a.getName(name);
		String num = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 0, "");
		a.getMobilenumber(num);
		String pincode = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 4, "");
		a.getPincode(pincode);
		String locality = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 5, "");
		a.getLocality(locality);
		String adrress = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 6, "");
		a.getAddress(adrress);
		String city = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 7, "");
		a.getCity(city);
		String state = a.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 8, "");
		a.getState(state);
		String landmark = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 9, "");
		a.getLandmark(landmark);
		String altnum = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 10, "");
		a.getAlternatenumber(altnum);
		a.getAddresstype().click();
		a.getDeliverhere().click();
		a.getTime().click();
		a.getContin().click();
	}
	
	@Test
	public void test5() throws IOException {
		Payment p = new Payment();
		String cardnum = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 11, "");
		p.getCardnum(cardnum);
		String mon = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 12, "");
		p.getMonth(mon);
		String year = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 13, "");
		p.getYear(year);
		String cvv = m.excelread("C:\\\\Users\\\\solo\\\\Documents\\\\Flip.xlsx", "Flip", 0, 14, "");
		p.getCvv(cvv);
	}
	
	@After
	public void After() throws IOException {
		Date d1 = new Date();
		System.out.println(d1);
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("Done");
	}
}

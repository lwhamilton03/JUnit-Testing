package com.qa.testingBlack.TestingBlack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingJack {

	BlackJack testing = new BlackJack(); 
	
	@Test 
	public void testOver21()
	{
		assertEquals(0, testing.blackJack(23, 24));
	}
	
	@Test 
	public void testLeft1Over1Under()
	{
		assertEquals(19, testing.blackJack(23, 19));
	}
	
	@Test 
	public void testRight1Over1Under()
	{
		assertEquals(17, testing.blackJack(17, 200));
	}
	
	@Test 
	public void testSame()
	{
		assertEquals(2, testing.blackJack(2, 2));
	}
	

}

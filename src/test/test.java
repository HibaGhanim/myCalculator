package test;

import static org.junit.Assert.*;

import org.junit.Test;

import myCalculator.Calculator;

public class test {

	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber()
	{
		Calculator c=new Calculator();
		int result=c.add(2,3);
		assertTrue("true",result>0);
	}
	
	@Test
	public void testSum_BothNumbersAreNegative_ShouldReturnNegativeNumber()
	{
		Calculator c=new Calculator();
		int result=c.add(-2,-3);
		assertTrue(result<0);
	}
	

	@Test
	public void testSum_OneNumberIsNegativeAndOtherIsPositiveAndTheyAreEqual_ShouldReturnZero()
	{
		Calculator c=new Calculator();
		int result=c.add(-2,2);
		assertTrue(result==0);
	}
	
	@Test
	public void testSum_OneNumberIsNegativeAndOtherIsPositiveAndPositiveIsBigger_ShouldReturnPositive()
	{
		Calculator c=new Calculator();
		int result=c.add(-2,3);
		assertTrue(result>0);
	}
	
	@Test
	public void testSum_OneNumberIsNegativeAndOtherIsPositiveAndNegativeIsBigger_ShouldReturnNegative()
	{
		Calculator c=new Calculator();
		int result=c.add(2,-3);
		assertTrue(result<0);
	}
}

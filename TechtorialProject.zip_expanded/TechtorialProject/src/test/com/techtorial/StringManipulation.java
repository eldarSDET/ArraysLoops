package test.com.techtorial;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.com.techtorial.StringManipulations;

public class StringManipulation {

	@Test
	public void getWordSubstringTest() {
		String result = StringManipulations.getWordSubstring();
		assertEquals(result, "wor");
	}

	@Test
	public void trimTest() {
		String trimmedWord = StringManipulations.getWordTrimmed();
		assertEquals(trimmedWord, "trimmed");
	}

	@Test
	public void reverseMeTest() {
		String reversedWord = StringManipulations.reverseMe();
		assertEquals(reversedWord, "drow");
	}

	@Test
	public void trimReverseToUpperCaseTest() {
		String reverseTrimToUpperCase = StringManipulations.trimReverseToUpperCase();
		assertEquals(reverseTrimToUpperCase, "OLLEH DLROW");
	}

	@Test
	public void getSum() {
		int sum = StringManipulations.getSum();
		assertEquals(sum, 166);

	}
	
	@Test
	public void printOdd() {
		String num = "1,3,5,7,9,11,13,15,17,19,21,23,25,27,29";
		assertEquals(num, StringManipulations.getOddNumbers());
	}
	public static void main(String[] args) {
		
		String loop = "WeHaveBeenGoingOverWhileLoopFor10";
		System.out.println(loop.length());
	}
	@Test
	public void loopOver() {
		String loop = "WeHaveBeenGoingOverWhileLoopFor10";
		assertEquals(loop.length(), StringManipulations.loopOver10Times().length());
	}

}

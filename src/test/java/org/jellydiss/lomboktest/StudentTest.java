package org.jellydiss.lomboktest;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		Student student = new Student();
		student.setNumber(1);
		student.setName("abcd");
		student.setMath(50);
		student.setKor(80);
		student.setEng(100);
		student.setAverage();
		
		Assert.assertEquals(1, student.getNumber());
		Assert.assertEquals("abcd", student.getName());
		Assert.assertEquals(50, student.getMath());
		Assert.assertEquals(80,student.getKor());
		Assert.assertEquals(100, student.getEng());
		System.out.println(student.getAverage());
		System.out.println(student.toString());

	}

}

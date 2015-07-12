package org.jellydiss.lomboktest;

import lombok.Data;

@Data
public class Student {
	private int number;
	private String name;
	private int math;
	private int kor;
	private int eng;
	private double average;
	
	public double setAverage(){
		return (math + kor + eng ) / 3l;
	}
}

package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	public int[] getPrimes(int[] numbers) {
		return Arrays.stream(numbers)
							.asLongStream()
							.filter(s -> (s % 2 != 0))
							.mapToInt(s -> (int)s)
							.toArray();
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
        return (int)string.chars()
        						.filter(s -> Character.isLowerCase(s))
        						.count();
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
		double[] xco = points.stream()
									.mapToDouble(s -> s.getX())
									.toArray();
		return Arrays.stream(xco)
									.mapToInt(s -> (int)s)
									.sum();				
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		String result = "";
		return points.stream()
						.filter(s -> s.getX() >= 2)
						.map(s-> result + "(" + s.getX() + "," + s.getY() + "), ")
						.toString();
	}
}

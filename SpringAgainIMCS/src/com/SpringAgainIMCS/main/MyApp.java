package com.SpringAgainIMCS.main;

import com.SpringAgainIMCS.Coaches.BaseBallCoach;

public class MyApp {

	public static void main(String[] args) {
		
		
		BaseBallCoach theCoach = new BaseBallCoach();
		System.out.println(theCoach.getDailyWorkout());
	}

}

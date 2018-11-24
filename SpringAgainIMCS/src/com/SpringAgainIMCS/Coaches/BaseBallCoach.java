package com.SpringAgainIMCS.Coaches;

import com.SpringAgainIMCS.service.WorkoutService;

public class BaseBallCoach implements WorkoutService {
	
	@Override
	public String getDailyWorkout() 
	{
		return "Spend 30 minutes training";
	}
	

}

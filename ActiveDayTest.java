package pao36_FitnessTracker;

import static org.junit.Assert.*;

import org.junit.Test;

public class ActiveDayTest {

	String totalActivities;

	@Test
	public void check_String_input() {
		String runActivity = "Run: ";
		        if (runActivity == null) {
		        	runActivity = " ";
		        }
		        totalActivities = runActivity;
		        assertEquals("Run: ",runActivity);
	}
	@Test
	public void check_String_True() {
		String bikeActivity = null;
		        if (bikeActivity == null) {
		        	bikeActivity = " ";
		        }
		        totalActivities = bikeActivity;
		        assertEquals(" ",totalActivities);
	}
	@Test
	public void totalMinute_check_true() {
		int run = 30;
		int bike = 60;
		int swim = 70;
		int ski = 20;
		
		int total = run + bike + swim + ski;
		
		
		assertTrue(total > 0);		
	
	}
	@Test
	public void totalMinute_check_false() {
		int run = 30;
		int bike = 60;
		int swim = 70;
		int ski = -300;
		
		int total = run + bike + swim + ski;
		
		assertFalse(total > 0);		
	
	}
	@Test
	public void totalMinute_check() {
		int run = 30;
		int bike = -60;
		int swim = -70;
		int ski = -300;
		if(run < 0) {
			run = -1;
		}
		
		assertFalse(run < 0);		
	
	}
	@Test
	public void bike_time() {
		int run = 30;
		int bike = -60;
		int swim = -70;
		int ski = -300;
		if(bike < 0) {
			bike = -1;
		}
		
		assertTrue(bike < 0);		
	}
	
	@Test
	public void swim_time() {
		int run = 30;
		int bike = -60;
		int swim = -70;
		int ski = -300;
		if(swim < 0) {
			swim = -1;
		}
		
		assertTrue(swim < 0);		
	}
	@Test
	public void ski_time() {
		int run = 30;
		int bike = -60;
		int swim = -70;
		int ski = -300;
		if(ski < 0) {
			ski = -1;
		}
		
		assertTrue(ski < 0);		
	}
		
}
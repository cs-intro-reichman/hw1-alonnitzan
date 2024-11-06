// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
				
		String timeLabel = "";

		// Checks if the hour should be AM or PM
		if(hours < 12){
			timeLabel = "AM";
		}
		else{
			timeLabel = "PM";

			// convert the hours to the PM format
			if (hours > 12) hours = hours - 12;
		}

		String newTime = Integer.toString(hours) + ":";

		// add 0 to minutes if needed
		if (minutes < 10) {
			newTime = newTime + "0" + Integer.toString(minutes);
		}
		else{
			newTime = newTime + Integer.toString(minutes);
		}

		System.out.println(newTime + " " + timeLabel);

	}
}
package Wiley_core_java;

enum WeekDay {
	  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public class EnumExample {
	  public static void main(String[] args) {
	    
	    for(WeekDay wd:WeekDay.values()) {
	        System.out.print(wd + " ");
	    }

	  }
	}

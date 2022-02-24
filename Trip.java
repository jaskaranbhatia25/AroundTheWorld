package edu.ucalgary.ensf409;
public class Trip {
    private String arrival;
    private String departure;
    private String city;
    private String country;

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
		return (value + " (" + key + ")");
    }

    // Constructor
    public Trip(String[] array) {
		this.arrival = array[0];
		this.departure = array[1];
		this.city = array[2];
		this.country = array[3];
    }

    // Given a date string, return just the year
    public static int getYear(String date) {
		String year = date.substring(0,4);
		return Integer.valueOf(year);
    }

    // Given a date string, return just the month
    // Since it is an int, a date like "2022-01-12" returns 1
    public static int getMonth(String date) {
			String month = date.substring(5,7);
			return Integer.valueOf(month);
    }

    // Return a formatted string of key/value pairs, with commas
    // between each. See the output for an example.
    public String formatTrip() {
		String formatted = (this.arrival + " (Arrival), " + this.departure + " (Departure), " + this.city + " (City), " + this.country + " (Country)");
		return formatted;
    }

    // Getter
    public String getArrival() {
		return this.arrival;
    }

    // Getter
    public String getDeparture() {
		return this.departure;
    }

    // Getter
    public String getCity() {
		return this.city;
    }

    // Getter
    public String getCountry() {
		return this.country;
    }

    // Setter
    public void setArrival(String date) {
		this.arrival  =  date;
    }

    // Setter
    public void setDeparture(String date) {
		this.departure = date;
    }

    // Setter 
    public void setCity(String city) {
		this.city = city;
    }

    // Setter 
    public void setCountry(String country) {
		this.country = country;
    }

}

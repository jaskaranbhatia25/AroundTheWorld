package edu.ucalgary.ensf409;
public class Itinerary {
    private Trip[] trips = new Trip[20];
	int lengthOfString;

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
		return  (value +  " (" + key + ")");
    }

    // Constructor
    public Itinerary(String[][] myTrips) {
		lengthOfString = myTrips.length;
		int i=0;
		while(i<lengthOfString)
		{
			this.trips[i]=new Trip(myTrips[i]);
			i++;
		}
    }
	

    // Getter
    public Trip[] getTrips() {
		return this.trips;
    }

    public String formatByArrival() {
		int i=0;
		int currentYear = Integer.valueOf(this.trips[i].getArrival().substring(0,4));
		int currentMonth = Integer.valueOf(this.trips[i].getArrival().substring(5,7));
		String formatString = " ";
		formatString = (currentYear + " (Year) ");
		formatString += ("\n--" + currentMonth + " (Month) ");
		
		while(i<lengthOfString)
		{
			int year = Integer.valueOf(this.trips[i].getArrival().substring(0,4));
			int month = Integer.valueOf(this.trips[i].getArrival().substring(5,7));
			if(currentYear!=year){
				formatString += ("\n"+year+" (Year) ");
				if (currentMonth!=month){
		            formatString += ("\n--"+month+" (Month)");
					formatString+= ("\n----"+this.trips[i].getCity()+ " (City), "+ this.trips[i].getCountry()+" (Country) (Place)");
				}
				
		  		else{
					formatString+= ("\n----"+this.trips[i].getCity()+ " (City), "+ this.trips[i].getCountry()+" (Country) (Place)");
				}
			}
			else{
				if(currentMonth!=month){
					formatString += ("\n--"+month+" (Month)");
				    formatString+= ("\n----"+this.trips[i].getCity()+ " (City), "+ this.trips[i].getCountry()+" (Country) (Place)");
				}		
				else{
					formatString+= ("\n----"+this.trips[i].getCity()+ " (City), "+ this.trips[i].getCountry()+" (Country) (Place)");
				}
			}
			currentYear =Integer.valueOf(this.trips[i].getArrival().substring(0,4));
			currentMonth=  Integer.valueOf(this.trips[i].getArrival().substring(5,7));
			i++;
		}
		
	    return formatString;
	}
	
    public String formatLocation (String City, String Country){
		return (fmtString("City",City)+", "+fmtString("Country",Country));
	}

	
		
    

    // The first array holds years (2021-2023).
    // The second array holds months.
    // The third array holds formatted locations occurring in the year/month 
    String[][][] byDate() {
		String[][][] tripdataStored = new String[3][12][20];
		int z=0;
		
		for(int i =0;i<tripdataStored.length;i++){
			for(int j=0;j<tripdataStored[i].length;j++){
				
			    for(int k=0;k<this.lengthOfString;k++){
					if(z>=this.lengthOfString){
						break;
					}
					else if (((Trip.getYear(this.trips[z].getArrival())==2021)) && (i==0) && (Trip.getMonth(this.trips[z].getArrival())==j+1)){
						tripdataStored[i][j][k] = formatLocation(this.trips[z].getCity(),this.trips[z].getCountry());
						z++;
					}
					
					else if(((Trip.getYear(this.trips[z].getArrival())==2022)) && (i==1) && (Trip.getMonth(this.trips[z].getArrival())==j+1)){
						tripdataStored[i][j][k] = formatLocation(this.trips[z].getCity(),this.trips[z].getCountry());
						z++;
					}
					else if(((Trip.getYear(this.trips[z].getArrival())==2023)) && (i==2) && (Trip.getMonth(this.trips[z].getArrival())==j+1)){
						tripdataStored[i][j][k] = formatLocation(this.trips[z].getCity(),this.trips[z].getCountry());
						z++;
					}
				}
			}
		}
		return tripdataStored;
	}
}

						
					
					
				
				
			
		
		

		
				
				
    
	


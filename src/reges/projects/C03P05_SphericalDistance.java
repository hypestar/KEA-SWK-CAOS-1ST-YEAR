package reges.projects;


/* Nashville 		Latitude	 36degres  and  7.2seconds		
 * 					Longitude 	 86degres  and 40.2seconds
 * Los Angeles 		Latitude	 33degres  and 56.4seconds
 * 					Longitude 	118degres  and 24.0seconds
 * 
 * 	Δlat = lat2− lat1
 *	Δlong = long2− long1
 *	a = sin²(Δlat/2) + cos(lat1).cos(lat2).sin²(Δlong/2)
 *	c = 2.atan2(√a, √(1−a))
 *	d = R.c 
 * 
 */

public class C03P05_SphericalDistance {

	// Nashville	
	public static final double LAT1DEGRES = 36;
	public static final double LAT1MINUTES = 7.2;
	public static final double LONG1DEGRES = 86;
	public static final double LONG1MINUTES = 40.2;
	// Los Angeles	
	public static final double LAT2DEGRES = 33;
	public static final double LAT2MINUTES = 56.4;
	public static final double LONG2DEGRES = 118;
	public static final double LONG2MINUTES = 24.0;

	public static final double EARTH_RADIUS = 6372.795;
	
	public static void main(String[] args) {

		
		double lat1, long1, lat2, long2, latDiff, longDiff, a, c;
		lat1 = DMtoRads(LAT1DEGRES, LAT1MINUTES);
		long1 = DMtoRads(LONG1DEGRES, LONG1MINUTES);
		lat2 = DMtoRads(LAT2DEGRES, LAT2MINUTES);
		long2 = DMtoRads(LONG2DEGRES, LONG2MINUTES);
		
		latDiff = lat2 - lat1;
		longDiff = long2 - long2;
		
		/*
		*System.out.print(EARTH_RADIUS * ( Math.acos( Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * longDiff) ) );
		*/
		
		a = Math.pow(Math.sin((latDiff/2)),2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin((longDiff/2)),2); 
//		a = sin²(Δlat/2) + cos(lat1).cos(lat2).sin²(Δlong/2)
//		c = 2.atan2(√a, √(1−a))
		c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
		System.out.print(c * EARTH_RADIUS);
	}

	public static double DMtoRads(double d, double m){

		return Math.toRadians(d + m/60);
	}
}

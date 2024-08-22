public class conversionFeetMeters {
    //make methods here to get later 
   public static double footToMeter(double foot) {
     return 0.305 * foot;
   }
 
   public static double meterToFoot(double meter) {
     return 3.279 * meter;
   }
   //feet to meters
   public static void main(String[] args) {
     for (double feet = 1.0; feet <= 10.0; feet++) {
       System.out.println(footToMeter(feet));
     }
 
     System.out.println("---------Divider-Line----------");
     //meters to feet but why is it not matching up but the feet to meters was? can't be formatting 
     //because first part was matching
     for (double meters = 20.0; meters <= 65.0; meters+=5) {
       System.out.println(meterToFoot(meters));
     }
     
 
 
 
 
 
   }
 }
public class date {
    public static void main(String[] args) {
        /*DATE FEATURE IS MOST IMPORTANT ASPECT PF ANY MACHINE CUZ THERE ARE MANY TASKS GOING ON THAT NEEDS 
         * SPECIFIC DATE AND TIME .
         * JAVA IN THIS CASE USEES JAVA TIME PACKAGE TO INVOKE TIME FUNCTIONS 
         * BEFORE JAVA.UTIL PAKAGES WERE USER FOR DATE AND TIME BUTT NOW THEU ARE DEPRICATED 
         * 
         * JAVA STORES OR TRACKS TIME IN MILLISECONDS WICH IS HIGHLY ACCURATE AND IT KEEPS RECORD FORN 1 JAN 1970 IN MILLISECONDS OFFCOURSE 
         * AND IT ASSUMES THAT WORLD STARTED FORM 1900'S
         * 
         * JAVA USES "SYSTEM.CURRENTTIMEMILLIS()" TO GET EXACT MILLISECONDS AND THEN USER CAN USE THIS TO REMV EXACT TIME AND DATE 
         */

         //NUMBER OF MILLISECONDS SINCE 1 JAN  1970
         System.out.println(System.currentTimeMillis());
         //NUMBER OF sconds 
        System.out.println(System.currentTimeMillis()/1000);
        //NUMBER OF HOURS 
        System.out.println(System.currentTimeMillis()/1000/3600);
        //NUMBER OF DAYS 
        System.out.println(System.currentTimeMillis()/1000/3600/24);
        //number of years 
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        try {
            long a;
        a=System.currentTimeMillis();
        System.out.println("THE NUMBER OF MILLISECONDS SINCE I JAN 1970 "+a);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
        
    }
}

public class SwitchAndEnhancedSwitch {
    public static void main(String[] args) {
        String month = "APRIL";

//        System.out.println(months(month));
//        System.out.println(getSeason(month));
        System.out.println(dayOfWeek(6));

        //dayOfWeek(6);
    }

    public static String months(String m){
         switch(m){
             case "JANUARY": case "FEBRUARY": case "MARCH":
                 return "This is SUMMER";

             case "APRIL": case "MAY": case "JUNE":
                 return "This is SPRING";

             case "JULY": case "AUGUST": case "SEPTEMBER":
                 return "This is WINTER";

             case "OCTOBER": case "NOVEMBER": case "DECEMBER":
                 return "This is AUTHOMNE";
         }

         return "Invalid input!!";
     }


     public static String getSeason(String m){
        return switch(m){
            case "JANUARY", "FEBRUARY", "MARCH"    ->  "This is SUMMER";
            case "APRIL", "MAY", "JUNE"            ->  "This is SPRING";
            case "JULY", "AUGUST", "SEPTEMBER"     ->  "This is WINTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" ->  "This is AUTHOMNE";

            default    ->   "Invalid input!!";
        };
     }

     public static String dayOfWeek(int day){
        String weekDays = switch(day) {
            case 0 -> {yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saterday";

            default -> "Invalid day";
        };

         System.out.println(day + " stands for " + weekDays);
         return weekDays;
     }
}

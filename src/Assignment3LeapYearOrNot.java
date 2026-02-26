class LeapYear {
    public static void main(String[] args){
        int year = 2024;
        int year1 = 2023;
        if (year % 4 == 0) {
           System.out.println("2024 is a Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
        if (year1 % 4 == 0) {
            System.out.println("2023 is a Leap Year");
        }
        else {
            System.out.println("2023 is Not a leap year");
        }
    }

}

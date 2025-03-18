package practice;

//Author- KIRAN
// Enum class representing Days of the Week
public enum EnumDay {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    // a method inside an enum
    public boolean isWeekend() {
        return this == SUNDAY || this == SATURDAY;
    }

    public boolean isWeekday() {
        return !isWeekend();
    }
}

 class EnumExample {
    public static void main(String[] args) {
        // Accessing enum constants
        EnumDay today = EnumDay.MONDAY;
        System.out.println("Today is: " + today);

        // Using the enum method to check if it's a weekend or weekday
        if (today.isWeekend()) {
            System.out.println(today + " is a weekend!");
        } else {
            System.out.println(today + " is a weekday.");
        }

        // Looping through all enum constants
        System.out.println("\nAll days of the week:");
        for (EnumDay day : EnumDay.values()) {
            System.out.println(day);
        }

        // Using valueOf() to get the enum constant from a string
        EnumDay anotherDay = EnumDay.valueOf("FRIDAY");
        System.out.println("\nAnother day: " + anotherDay);

        // Comparing two enum constants
        EnumDay day1 = EnumDay.MONDAY;
        EnumDay day2 = EnumDay.TUESDAY;

        if (day1 == day2) {
            System.out.println(day1 + " and " + day2 + " are the same.");
        } else {
            System.out.println(day1 + " and " + day2 + " are different.");
        }
    }
}

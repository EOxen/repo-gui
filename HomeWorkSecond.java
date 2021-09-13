class HomeWorkSecond {
    public static void main (String[] args) {
        System.out.println (within10and20(8, 2));
        isPositiveOrNegative(-15);
        System.out.println (isNegative(-10));
        printWordNTimes("Hello", 3);
        System.out.println (liapYear(1000));
    }
	
    public static boolean within10and20(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
	
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println ("Positive");
        } else {
            System.out.println ("Negative");
        }
    }
	
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }
	
    public static void printWordNTimes(String word, int times) {
        do {
            times--;
            System.out.println (word);
        } while (times > 0);
    }
	
    public static boolean liapYear(int x) {
        if (x % 400 == 0) {
            return true;
            } else if (x % 100 == 0) {
                    return false;
                } else if (x % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
    }
}

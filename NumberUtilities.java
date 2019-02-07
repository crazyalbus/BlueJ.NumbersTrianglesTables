


public class NumberUtilities {

    public static String getRange(int stop) {
        String numList = "";
        for (int i=0; i<stop; i++) {
         numList = numList + i;   
        }
        return numList;
    }

    public static String getRange(int start, int stop) {
        String numList = "";
        for (int i=start; i<stop; i++) {
         numList = numList + i;   
        }
        return numList;
    }


    public static String getRange(int start, int stop, int step) {
        String numList = ("" + start);
        int current = start;
        do {
         numList = numList + (current + step);  
         current = current + step;
        } while (current < stop - step);
        return numList;
    }

    public static String getEvenNumbers(int start, int stop) {
        String numList = "";
        for (int i=start; i<stop; i++) {
            if(i % 2 == 0) {
                numList = numList + i;
            }
        }
        return numList;
    }


    public static String getOddNumbers(int start, int stop) {
        String numList = "";
        for (int i=start; i<stop; i++) {
            if(i % 2 != 0) {
                numList = numList + i;
            }
        }
        return numList;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String numList = "";
        for (int i=start; i<=stop; i++) {
            numList = numList + (int) Math.pow(i, exponent);
        }
        return numList;
    }
}

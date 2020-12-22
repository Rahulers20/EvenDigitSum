public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int sum = 0;
        int evenDigitsSum = 0;

        if(number >= 0) {

            while (number > 0) {

                int digit = number % 10;
                if(digit % 2 == 0) {
                    evenDigitsSum += digit;
                }
                sum += digit;
                number /= 10;
            }
            return evenDigitsSum;
        } else {
            return -1;
        }
    }
}

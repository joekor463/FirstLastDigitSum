public class FirstLastDigitSum {
    public static void main (String[] args ) {
        sumFirstAndLastDigit ( 547);
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0) return -1;
        int num = number;
        int lastdigit = number % 10;
        int firstdigit = 0;

        while (num != 0){
            firstdigit = num % 10;
            num = num / 10;
        }
        int summa = lastdigit+firstdigit;
        System.out.println (summa);
        return summa;
    }


}

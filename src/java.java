public class java {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }


    public static boolean isPalindrome(int num){
        number = Math.abs(num);

        int numberClone = num;
        int reverse = 0;

        while (number > 0){
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }


        lastDigit = num % 10{
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        return reverse == numberClone;



    }

}




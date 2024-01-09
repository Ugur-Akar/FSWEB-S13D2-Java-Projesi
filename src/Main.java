public class Main {
    public static void main(String[] args) {
        System.out.println("Number is palindrome: " + isPalindrome(101));
        System.out.println("Perfect number:" + isPerfectNumber(7));

        System.out.println(numberToWords(30));


    }

    public static boolean isPalindrome(int n){
        int r, sum = 0, temp = n;

        while(n > 0){
            r = n%10;
            sum=(sum*10)+r;
            n/=10;
        }

        return temp == sum;
    }

    public static boolean isPerfectNumber(int num){
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0) sum+=i;
        }

        return num == sum;
    }

    public static String numberToWords(int num){
        if(num < 0) return "Invalid Value";

        int temp = num, r;
        String str = "";
        String tmp = "";

        do{
            r = temp % 10;
            switch(r){
                case 0:
                    tmp = "Zero";
                    break;
                case 1:
                    tmp = "One";
                    break;
                case 2:
                    tmp = "Two";
                    break;
                case 3:
                    tmp = "Three";
                    break;
                case 4:
                    tmp = "Four";
                    break;
                case 5:
                    tmp = "Five";
                    break;
                case 6:
                    tmp = "Six";
                    break;
                case 7:
                    tmp = "Seven";
                    break;
                case 8:
                    tmp = "Eight";
                    break;
                default:
                    tmp = "Nine";
                    break;
            }

            str = tmp + " " + str;
            temp /= 10;
        }
        while(temp > 0);

        return str;
    }
}
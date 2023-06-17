import java.util.Scanner;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1276757347;
        int temp, count = 0;
        while(n>0) {
            temp = n % 10;
            if(temp == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Number of occurrences of 7 is "+count);
    }
}

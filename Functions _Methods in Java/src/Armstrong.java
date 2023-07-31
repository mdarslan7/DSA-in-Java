//Printing All 3 digitsArmstrong Numbers
public class Armstrong {
    public static void main(String[] args) {
        for(int i=100; i<=999; i++) {
            int num = i;
            int temp, arm=0;
            while(i > 0) {
                temp = i % 10;
                arm = arm + (temp * temp * temp);
                i = i / 10;
            }
            if(arm == num)
                System.out.println(num);
            i = num;
        }
    }
}

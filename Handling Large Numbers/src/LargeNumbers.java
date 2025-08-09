import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(432);
        BigInteger b = BigInteger.valueOf(123);
        BigInteger c = new BigInteger("567091893022");

        BigInteger sum = a.add(b);
        BigInteger sub = a.subtract(b);
        BigInteger mul = a.multiply(b);
        BigInteger div = a.divide(b);
        System.out.println(sum + " " + sub + " " + mul + " " + div);
    }
}
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LargeDecimalNumbers {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.04");
        BigDecimal b = new BigDecimal("0.03");

        BigDecimal sum = a.add(b);
        BigDecimal sub = a.subtract(b);
        BigDecimal mul = a.multiply(b);
        BigDecimal div = a.divide(b, 10, RoundingMode.HALF_UP);

        System.out.println(0.04 - 0.03);
        System.out.println(sum + " " + sub + " " + mul + " " + div);
    }
}

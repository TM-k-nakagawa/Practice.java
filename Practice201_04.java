import java.math.BigDecimal;

public class Practice201_04 {
  public static void main(String[] args) {
    BigDecimal a = new BigDecimal("1.1");
    BigDecimal b = new BigDecimal("1.1");
    BigDecimal result1 = b.add(a).add(a);
    BigDecimal result2 = b.multiply(a).multiply(a);
    System.out.println( a +"+"+ a +"+" + a + "=" + result1);
    System.out.println( a +"x"+ a +"x"+ a  + "=" + result2);
  }
}

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Practice203_04 {
    public static void main(String[] args){ 
    //福利   
    BigDecimal welfare = new BigDecimal("1.07");
    //年数カウント
    int yearCount = 1;
    //1年の月数
    BigDecimal month = new BigDecimal("12");
    
    BigDecimal price = new BigDecimal("20000");
    //元本
    BigDecimal savings = new BigDecimal("100000");
    //運用してない額
    BigDecimal savingPrice = savings;
    //トータルの運用額
    BigDecimal totalPrice = savings;
 

        for (; yearCount< 11; yearCount++){
            //貯金額
            savingPrice = savingPrice.add(month.multiply(price));
            //複利計算
            totalPrice = (totalPrice.add(month.multiply(price)).multiply(welfare)).setScale(0, RoundingMode.HALF_UP);
            //貯金額コンマ区切り
            NumberFormat commasavingPrice = NumberFormat.getNumberInstance(); 
            //複利計算コンマ区切り
            NumberFormat commatotalPrice = NumberFormat.getNumberInstance(); 

            System.out.println(yearCount + "年目" + commasavingPrice.format(savingPrice)+ "円" + commatotalPrice.format(totalPrice) + "円"); 
     
        }
    }
}
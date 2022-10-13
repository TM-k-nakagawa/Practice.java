import java.math.BigDecimal;

public class Practice203_04 {
    public static void main(String[] args){ 
    //福利   
    BigDecimal welfare = new BigDecimal("1.07");
    //年数カウント
    int yearcount = 1;
    //1年の月数
    BigDecimal month = new BigDecimal("12");
    //毎月入れる貯金額
    BigDecimal price = new BigDecimal("20000");
    //元本
    BigDecimal savings = new BigDecimal("100000");
    //運用してない額
    BigDecimal savingPrice = savings;
    //トータルの運用額
    BigDecimal TotalPrice = savings;
 

        for (; yearcount< 11; yearcount++){
            //貯金額
            savingPrice = savingPrice.add(month.multiply(price));
            //複利計算
            TotalPrice = TotalPrice.add(month.multiply(price)).multiply(welfare);
            
            System.out.println(yearcount+ "年目" + String.format("%,d", savingPrice) + "+" +String.format("%,d",TotalPrice)); 
     
        }
    }
}
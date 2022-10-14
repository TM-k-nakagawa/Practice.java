import java.lang.Math;
public class Practice203_03 {
    public static void main(String[] args){
    long Number = 2;
    long Power = 1;
        for (; Power < 35 ; Power++){ 
            double result = Math.pow(Number,Power);
            if ((int)result <= 1000000000)
                System.out.println((int)result);
        }
    }
}
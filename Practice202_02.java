public class Practice202_02 {
  public static void main(String[] args){
  int a = 100;
  int b = 300;
  int answer = a * 25 + b * 25;
  System.out.println(a +"円のバナナを25個、" + b +"円の桃を25個買ったら、合計" + String.format("%,d", answer) + "円になりました。");
  }    
}

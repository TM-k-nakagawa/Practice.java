public class Practice203_02_01 {
  public static void main(String[] args){
  int Count = 1;
  int FirstSum = 0; 
  int SecondSum = 0;
    for(; Count < 100; Count = Count + 2 ){
      FirstSum = SecondSum + Count;
      SecondSum = FirstSum;
      System.out.println(SecondSum + "+" + Count + "="+ FirstSum);
    }
  }  
}

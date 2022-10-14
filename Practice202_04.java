import java.util.Scanner;

public class Practice202_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  
        System.out.println("あなたの名前を入力して下さい");
        String name = scanner.next();
        System.out.println( name +"さんこんにちは。");
        System.out.println("あなたは何歳ですか？");
        String age = scanner.next();
        System.out.println(age +"歳なんですね。よろしくお願いします。");
        scanner.close();
    }  
}

public class Practice204_02 {
    public static void main(String[] args){
        //文字列1
        String str1 = "   panda";
        //文字列2
        String str2 = " pan da ";
        //文字列3   
        String str3 = "panda   ";
        // 文字列除去の結果
        String result1 = str1.trim();
        String result2 = str2.trim();
        String result3 = str3.trim();
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }    
}

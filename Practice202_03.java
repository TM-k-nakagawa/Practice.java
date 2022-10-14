public class Practice202_03 {
    public static void main(String args[]){
        String a = "1234567890";
        String b = "１２３４５６７８９０";
        String c = "飛べない豚は、ただの豚だ。";
        int num_a = a.length();
        int num_b = b.length();
        int num_c = c.length();
        System.out.println("1行目の文字数は" + num_a);
        System.out.println("2行目の文字数は" + num_b);
        System.out.println("3行目の文字数は" + num_c);
    }  
}

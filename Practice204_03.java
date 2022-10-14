public class Practice204_03 {
    public static void main(String[] args){
        //文字列の定義    
        String word = "サクサクのクッキー";
        String replaceWord =  word.replace("キ","ま").replace("サ","キ").replace("ま","サ");
        System.out.println(word);
        System.out.println(replaceWord);
    }
}

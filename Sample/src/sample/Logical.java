package sample;

public class Logical {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int score=59;
        
        
        System.out.print("scoreが40以上、かつ５０以下：");
        System.out.println(score>=40 && score<=50);
        
        System.out.print("scoreが４０以上、または５０以下：");
        System.out.println(score >= 40 || score <= 50);
        
        System.out.print("scoreが６０以上ではない：");
        System.out.println(!(score>=60));
    }

}

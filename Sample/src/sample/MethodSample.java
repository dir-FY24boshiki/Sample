package sample;

public class MethodSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int number1=100;
        int number2=10;
        
        sumMethod1(number1,number2);
        
        int result2 = sumMethod2(number1, number2);
        System.out.println("sumMethod2の結果は" + result2);
    }

    private static void sumMethod1(int num1, int num2) {
        // TODO 自動生成されたメソッド・スタブ
        int result=num1+num2;
        System.out.println("sumMethod1の結果は"+ result);
    }
    public static int sumMethod2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

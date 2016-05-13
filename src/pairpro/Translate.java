package pairpro;
import java.util.Scanner;

public class Translate {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String[] s = {"one","two","three","four","five"};
        return s[n-1];
    }
}

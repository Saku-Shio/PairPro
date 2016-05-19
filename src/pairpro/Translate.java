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
    	String[] s = {"one",
    			"two",
    			"three",
    			"four",
    			"five",
    			"six",
    			"seven",
    			"eight",
    			"nine",
    			"ten",
    			"eleven",
    			"twelve",
    			"thirteen",
    			"fourteen",
    			"fifteen",
    			"sixteen",
    			"seventeen",
    			"eighteen",
    			"nineteen",
    			"twenty",
    			"twenty one",
    			"twenty two",
    			"twenty three",
    			"twenty four",
    			"twenty five",
    			"twenty six",
    			"twenty seven",
    			"twenty eight",
    			"twenty nine",
    			"thirty",
    			"thirty one",
    			"thirty two",
    			"thirty three",
    			"thirty four",
    			"thirty five",
    			"thirty six",
    			"thirty seven",
    			"thirty eight",
    			"thirty nine",
    			"fourty",
    			"fourty one",
    			"fourty two",
    			"fourty three",
    			"fourty four",
    			"fourty five",
    			"fourty six",
    			"fourty seven",
    			"fourty eight",
    			"fourty nine",
    			"fifty",
    			"fifty one",
    			"fifty two",
    			"fifty three",
    			"fifty four",
    			"fifty five",
    			"fifty six",
    			"fifty seven",
    			"fifty eight",
    			"fifty nine",
    			"sixty",
    			"sixty one",
    			"sixty two",
    			"sixty three",
    			"sixty four",
    			"sixty five"
    		
    			};
        return s[n-1];
        
    }
}

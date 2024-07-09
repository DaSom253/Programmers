import java.util.Scanner;


//두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
//입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
public class Solution {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a+b);
        //print : 괄호 안 내용만 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.
        //printf : C언어 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함안됨.
        //println : 괄호 안 내용을 출력. 개행문자가 포함됨, 출력 후 한 줄 띄워짐.
    }
}

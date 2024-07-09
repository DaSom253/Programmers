import java.util.Scanner;


//문자열 str이 주어집니다.
//문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
public class Solution02 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;

        for(int i=0; i < a.length(); i++){
            b = a.charAt(i);
            System.out.println(b);
        }
    }
    //char.at 으로 하나씩 받아와서
    //a.lenght만큼(for)
    //print로 출력하면 되지 않을까?
}

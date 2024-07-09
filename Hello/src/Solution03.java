import java.util.Scanner;


//자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을
//홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
public class Solution03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if(n%2 == 0) {
                System.out.println(n+" is even");
            } else {
                System.out.println(n+" is odd");
            }
    }
    //입력 시 : 100
    //출력 : 100 is even

    //2로 나눴을 때 몫이 0이면 짝수고
    //몫이 1이면 홀수
    //if로 홀수 짝수 판별 가능한 조건 만들고
    //각 조건에 맞는 print 실행

    //다른 사람이 작성한 코드를 확인해보니
    //System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
    //이렇게 삼항연산자를 활용했다.
    //단순한 if문은 삼항연산자를 활용하는 것이 좋겠다.
}

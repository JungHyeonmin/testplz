// 숫자야구 컴퓨터랑 뜨기
// 볼만 있을때 오류, 중복되는 숫자 사용시 다시 입력하도록 변경

/*
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class NumberBaseball {

    static int[] checkArray(int[] save, int[] Com_Num) {
        int ball = 0, stk = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && save[i] == Com_Num[j])
                    stk++;
                else if (i != j && save[i] == Com_Num[j])
                    ball++;
            }
        }
        save[0] = ball;
        save[1] = stk;
        if (ball == 0 && stk == 0)
            save[2] = 1;
        else
            save[2] = 0;
        return save;
    }

    static void RandNumber(int[] a) {
        Random rand = new Random();
        HashSet<Integer> Hash = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            a[i] = rand.nextInt(9) + 1;
            if (!Hash.add(a[i])) // Hash.add()는 중복된 값을 넣으면 false를 반환한다.
                i--;
        }
    }

    static void Insert_Swap(int save[], int answer) {
        for (int i = 0; i < 3; i++) {
            save[i] = answer % 10;
            answer /= 10;
        }
        int temp = save[0];
        save[0] = save[2];
        save[2] = temp;
    }

    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);

        int end, answer;
        int[] save = new int[3];
        int[] Com_Num = new int[3];

        System.out.println("숫자 야구 게임을 시작합니다.");

        RandNumber(Com_Num);
       // System.out.println(Arrays.toString(Com_Num)); // 확인용

        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            answer = stdIn.nextInt();

            Insert_Swap(save, answer);
            if (save[0] == save[1] || save[0] == save[2] || save[1] == save[2]) {
                System.out.println("중복된 숫자를 입력하셨습니다. 다시 입력하세요.");
            //    continue;
            }
            
            if (Arrays.equals(save, Com_Num)) { // Arrays.eqauls매서드는 두 배열의 내용을 비교한다. 같으면 t, 아니면 f
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                end = stdIn.nextInt();

                if (end == 1) {
                    RandNumber(Com_Num); // 다시 난수 설정
                    //System.out.println(Arrays.toString(Com_Num)); // 확인용
                    continue;
                } else
                    return;
            } else { // 아닐때 조건
                checkArray(save, Com_Num);

                if (save[0] != 0 && save[1] == 0 && save[2] == 0) // 볼일때 조건 -> check 함수에 따라서 print문 출력
                    System.out.printf("%d볼\n", save[0]);

                else if (save[0] == 0 && save[1] != 0 && save[2] == 0) // 스트라이크일때 조건
                    System.out.printf("%d스트라이크\n", save[1]);

                else if (save[0] != 0 && save[1] != 0 && save[2] == 0) // 볼 + 스트라이크일때 조건
                    System.out.printf("%d볼 %d스트라이크\n", save[0], save[1]);

                else if (save[2] == 1)// 낫싱일때 조건
                    System.out.printf("낫싱\n");
            }
        }
    }
}
*/
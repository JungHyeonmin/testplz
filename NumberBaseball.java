// ���ھ߱� ��ǻ�Ͷ� �߱�
// ���� ������ ����, �ߺ��Ǵ� ���� ���� �ٽ� �Է��ϵ��� ����

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
            if (!Hash.add(a[i])) // Hash.add()�� �ߺ��� ���� ������ false�� ��ȯ�Ѵ�.
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

        System.out.println("���� �߱� ������ �����մϴ�.");

        RandNumber(Com_Num);
       // System.out.println(Arrays.toString(Com_Num)); // Ȯ�ο�

        while (true) {
            System.out.print("���ڸ� �Է����ּ��� : ");
            answer = stdIn.nextInt();

            Insert_Swap(save, answer);
            if (save[0] == save[1] || save[0] == save[2] || save[1] == save[2]) {
                System.out.println("�ߺ��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
            //    continue;
            }
            
            if (Arrays.equals(save, Com_Num)) { // Arrays.eqauls�ż���� �� �迭�� ������ ���Ѵ�. ������ t, �ƴϸ� f
                System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ���� ����");
                System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���.");
                end = stdIn.nextInt();

                if (end == 1) {
                    RandNumber(Com_Num); // �ٽ� ���� ����
                    //System.out.println(Arrays.toString(Com_Num)); // Ȯ�ο�
                    continue;
                } else
                    return;
            } else { // �ƴҶ� ����
                checkArray(save, Com_Num);

                if (save[0] != 0 && save[1] == 0 && save[2] == 0) // ���϶� ���� -> check �Լ��� ���� print�� ���
                    System.out.printf("%d��\n", save[0]);

                else if (save[0] == 0 && save[1] != 0 && save[2] == 0) // ��Ʈ����ũ�϶� ����
                    System.out.printf("%d��Ʈ����ũ\n", save[1]);

                else if (save[0] != 0 && save[1] != 0 && save[2] == 0) // �� + ��Ʈ����ũ�϶� ����
                    System.out.printf("%d�� %d��Ʈ����ũ\n", save[0], save[1]);

                else if (save[2] == 1)// �����϶� ����
                    System.out.printf("����\n");
            }
        }
    }
}
*/
import java.util.Scanner;


    public class 练习 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[] scores = {59, 58, 60, 100};

            System.out.println("学生成绩依次为: 59, 58, 60, 100");

            double total = 0;
            for (int i = 0; i < scores.length; i++) {
                total += scores[i];
            }
            double avg = total / scores.length;

            double maxScore = scores[0];
            double minScore = scores[0];
            for (int i = 1; i < scores.length; i++) {
                if (scores[i] > maxScore) maxScore = scores[i];
                if (scores[i] < minScore) minScore = scores[i];
            }

            int passCount = 0;
            int excellentCount = 0;
            int failCount = 0;

            for (int i = 0; i < scores.length; i++) {
                if (scores[i] >= 60) passCount++;
                if (scores[i] >= 90) excellentCount++;
                if (scores[i] < 60) failCount++;
            }
            System.out.println("\n====== 成绩统计结果 ======");
            System.out.println("总分: " + total);
            System.out.println("平均分: " + avg);
            System.out.println("最高分: " + maxScore);
            System.out.println("最低分: " + minScore);
            System.out.println("及格人数（>= 60）: " + passCount);
            System.out.println("优秀人数（>= 90）: " + excellentCount);
            System.out.println("不及格人数: " + failCount);
            sc.close();
        }
    }






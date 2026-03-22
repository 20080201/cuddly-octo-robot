import java.util.Scanner;

public class 练习 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("一共有4个学生（a,b,c,d,)");
        System.out.println("学生成绩依次为:74,80,90,100");
        double a, b, c, d;
        a = 74;
        b = 80;
        c = 90;
        d = 100;
        double total = a + b + c + d;
        double average = total/4;
        double maxScore = Math.max(Math.max(a, b), Math.max(c, d));
        double minScore = Math.min(Math.min(a, b), Math.min(c, d));
        int passCount = 0;
        int excellentCount = 0;
        if (a >= 60)passCount++;
        if (b >= 60)passCount++;
        if (c >= 60)passCount++;
        if (d >= 60)passCount++;
        if (a >= 90)excellentCount++;
        if (b >= 90)excellentCount++;
        if (c >= 90)excellentCount++;
        if (d >= 90)excellentCount++;
        System.out.println("\n======成绩统计结果======");
        System.out.println("总分: " + total);
        System.out.println("平均分: " + average);
        System.out.println("最高分: " + maxScore);
        System.out.println("最低分: " + minScore);
        System.out.println("及格人数（>= 60）: " + passCount + "优秀人数（>= 90）" + excellentCount);
        sc.close();
    }
}

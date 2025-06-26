
public class MethodTask0 {

}


public class MethodTask0 {
    public static void main(String[] args) {
        MethodTask0 task = new MethodTask0();

        System.out.println(task.checkNum(7));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(task.getSum(arr));

        System.out.println(task.reverseStr("hello"));
        System.out.println(task.contains(arr, 10));

        task.printGugudan(3);

        System.out.println(task.compareLength("java", "code"));

        task.loginTry("admin", "1234");
    }

    public String checkNum(int num) {
        return (num % 2 == 0) ? "짝수입니다" : "홀수입니다";
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public String reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public boolean contains(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public void printGugudan(int dan) {
        for (int i = 1; i <= 19; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
    }

    public String compareLength(String str1, String str2) {
        return (str1.length() == str2.length()) ? "같음" : "다름";
    }

    public void loginTry(String inputId, String inputPw) {
        String adminId = "admin";
        String adminPw = "1234";
        int tryCount = 0;

        while (tryCount < 3) {
            if (inputId.equals(adminId) && inputPw.equals(adminPw)) {
                System.out.println("로그인 성공");
                return;
            } else {
                tryCount++;
                System.out.println("로그인 실패 (" + tryCount + "회)");
                if (tryCount == 3) {
                    System.out.println("잠금");
                }
                break;
            }
        }
    }
}

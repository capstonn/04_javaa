package v20250423.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try{
            int result = data.length();
            System.out.println("문자 수 : " + result);
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("[마무리 실행]\n");
        }


    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("This is Java");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

// 기존 코드 문제점 : data가 null일 경우 NullPointerException이 발생한다.
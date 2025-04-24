package v20250424.exam;

public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for(int i=0;i<6;i++) {
                System.out.println("음악을 재생합니다.");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("스레드 중단" + e.getMessage());
        }
    }


    public static void main(String[] args) {
        MusicRunnable music = new MusicRunnable();
        Thread thread = new Thread(music);
        thread.start();
    }
}
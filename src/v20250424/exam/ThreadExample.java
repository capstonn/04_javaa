package v20250424.exam;


public class ThreadExample {
    public static void main(String[] args) {
        Thread movieThread = new MovieThread();
        Thread musicThread = new Thread(new MusicRunnable());

        movieThread.start();
        musicThread.start();
    }
}
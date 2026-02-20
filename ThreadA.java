class ThreadA implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running thread " + i + " from Class A");
        }
        System.out.println("Exit from Class A");
    }
}
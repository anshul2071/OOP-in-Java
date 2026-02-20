class ThreadC implements Runnable {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("Running thread " + k + " from Class C");
        }
        System.out.println("Exit from Class C");
    }
}
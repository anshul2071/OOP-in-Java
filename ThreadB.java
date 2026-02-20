class ThreadB implements Runnable {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Running thread " + j + " from Class B");
        }
        System.out.println("Exit from Class B");
    }
}
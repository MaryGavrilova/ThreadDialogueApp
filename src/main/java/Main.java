public class Main {
    public static void main(String[] args) throws InterruptedException {

        ThreadGroup group = new ThreadGroup("group");
        MyThread myThread1 = new MyThread(group, "Поток 1");
        MyThread myThread2 = new MyThread(group, "Поток 2");
        MyThread myThread3 = new MyThread(group, "Поток 3");
        MyThread myThread4 = new MyThread(group, "Поток 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(15000);
        System.out.println("Завершаю все потоки");
        group.interrupt();
    }
}

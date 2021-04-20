public class Concurrecy {
    public static void main(String[] args) {
        /*by runnerble object
        * annonyms function*/
        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "starded");
                System.out.println(Thread.currentThread().getName() + "end");
            }
        };
        // lamda function
        Runnable thread2 = () ->{
            String name = Thread.currentThread().getName();
            System.out.println(name+"started");
            System.out.println(name+"end");
        };

        (new Thread(thread1)).start();
        (new Thread(thread2)).start();
    }
}

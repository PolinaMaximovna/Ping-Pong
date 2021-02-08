

public class PingPong {
    public static void main(String[] args) throws InterruptedException{

        Data d = new Data();
        Worker t1 = new Worker(d,2);
        Worker t2 = new Worker(d,1);

        t2.join();
        System.out.println("END");

    }
}

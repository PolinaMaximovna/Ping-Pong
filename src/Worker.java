
public class Worker extends Thread {

    Data data;
    int state;

    Worker(Data data, int state) {
        this.data = data;
        this.state = state;
        this.start();
    }
    public void run() {
        for( int i=0;  i<5; i++ ) {
            synchronized(data) {
                while ( data.state!=state ){
                    try{
                        data.wait();
                    }

                    catch (InterruptedException ex){

                    }
                }
             if ( state == 1 )  data.ping();
             else if( state == 2 ) data.pong();

             data.notifyAll();
            }
        }
    }

}

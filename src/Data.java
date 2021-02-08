
public class Data {

    int state = 1;

    public void ping(){
        System.out.println("Ping");
        state = 2;
    }

    public void pong(){
        System.out.println("Pong");
        state = 1;
    }

    public int getState(){
        return state;
    }

}

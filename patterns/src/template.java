abstract class Game{
    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}

class Chess extends Game{
    
    void initialize(){
        System.out.println("Chess Initialized");
    }
  
    void start(){
        System.out.println("Chess Started");
    }
  
    void end(){
        System.out.println("Chess Finished");
    }

}


class BasketBall extends Game{
    
    void initialize(){
        System.out.println("BasketBall Initialized");
    }
    
    void start(){
        System.out.println("BasketBall Started");
    }
    
    void end(){
        System.out.println("BasketBall Finished");
    }

}


public class template{
    public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException {
        Class c = Class.forName("org.example.structural.Chess");
        Game game = (Game)c.newInstance();
        game.play();

    }
}

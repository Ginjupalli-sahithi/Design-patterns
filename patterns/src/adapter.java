interface Bird{
    public void fly();
    public void makeSound();
}

class Sparrow implements Bird{
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void makeSound() {
        System.out.println("Chirp....");
    }
}

interface Duck{
    public void squeak();
}

class PlasticDuck implements Duck{
  
    public void squeak() {
        System.out.println("Squeakkk....");
    }
}

class BirdAdapter implements Duck{
    Bird bird;
    public BirdAdapter(){

    }

    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    
    public void squeak() {
        bird.makeSound();
    }
}

public class adapter{
    public static void main(String args[]){
        Sparrow sparrow = new Sparrow();
        Duck duck = new PlasticDuck();
        Duck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("Duck");
        duck.squeak();

        System.out.println("Bird Adapter");
        birdAdapter.squeak();
    }
}

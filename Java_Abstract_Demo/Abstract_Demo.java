abstract class Animal{
    
    private String name = " ";
    private char sex = ' ';
    private double weight = 0;
    private boolean hungry = false;
   
    Animal(String name, char sex, double weight){
        this.name = name;
        this.sex = sex;
        this.weight = weight;
    }   
    abstract protected void move();

    abstract protected void eat();

    protected void setHungry(){
        this.hungry = true;
    }
    protected void clearHungry(){
        this.hungry = false;
    }
    protected boolean checkHungry() {
        return hungry;
    }
    protected void printStats() {
        System.out.println("\n" + name + "'s stats are: sex - " + sex + ", weight - " 
        + weight + ", hungry = " + checkHungry());
    }
}

class Tiger extends Animal{

    Tiger (String name, char sex, double weight){
        super(name, sex, weight);
    }

    @Override
    protected void move(){
        System.out.println("\nThe tiger stalks the jungle.");
    }

    @Override
    protected void eat(){
        if(checkHungry() == true){
            System.out.println("\nThe tiger mauls its prey.");
            clearHungry();
        }
        else{
            System.out.println("\nThe tiger is not hungry. Set the Tiger to hungry to eat.");
        }
    }  
}

public class Abstract_Demo{
    public static void main(String[] args) {
        Tiger tony = new Tiger("Tony", 'm', 500);
        tony.setHungry();
        tony.eat();
        tony.move();
        tony.printStats();
    }
}
package zoo;

public class Main {

    static void moveAnimals(Animal animal){
        animal.move();
    }

    public static void main(String[] args) {

        Animal cat = new Cat("Lion", 15, "M", 100.00);//@Cat@df,lerf,el3

        Animal bird = new Bird("Pigeon", 15, "F", 5);

        Fish fish = new Fish("Solmon", 3, "m", 3);

        Animal tiger = new Tiger("Bengal", 10, "F", 80);


        Flyable bird2 = new Bird("Pigeon", 15, "F", 5);

        //Flyable flyable = new Flyable();

        bird2.fly();



//        cat.move();
//        bird.move();
          cat.eat();

          //bird.fly();

        Animal [] animals = {cat, tiger, fish, bird};//polymorphic array

        moveAnimals(cat);
        moveAnimals(fish);


    }


}
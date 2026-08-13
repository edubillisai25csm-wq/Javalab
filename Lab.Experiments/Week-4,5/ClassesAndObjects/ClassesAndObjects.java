class FarmAnimal
{
    String name;
    String place;
    String food;
    String sound;

    void display()
    {
        System.out.println("Animal: " + name);
        System.out.println("Stays in: " + place);
        System.out.println("Eats: " + food);
        System.out.println("Sound: " + sound);
        System.out.println();
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        
        FarmAnimal cow = new FarmAnimal();
        cow.name = "Cow";
        cow.place = "Cowshed";
        cow.food = "Grass";
        cow.sound = "Moo";

        FarmAnimal pig = new FarmAnimal();
        pig.name = "Pig";
        pig.place = "Pigsty";
        pig.food = "Grains";
        pig.sound = "Oink";

        FarmAnimal horse = new FarmAnimal();
        horse.name = "Horse";
        horse.place = "Stable";
        horse.food = "Grass";
        horse.sound = "Neigh";

        cow.display();
        pig.display();
        horse.display();
    }
}

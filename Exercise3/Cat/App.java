public class App {
    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("His eyes are are both beatiful " + myPet.eyeColor +".");
        System.out.println("My cat's weight is " + myPet.weight + " and stands " + myPet.height +" tall.");     
        System.out.println("This pet is very much " + myPet.characteristic +" to me.");

    }
}

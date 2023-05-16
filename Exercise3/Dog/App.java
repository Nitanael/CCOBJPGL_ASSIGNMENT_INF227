public class App {
    public static void main(String[] args) throws Exception {

      
        Chusky myPet = new Chusky();

        myPet.bark();
        System.out.println("His eyes are both beautiful " + myPet.eyeColor +".");
        System.out.println("My dog is as big as " + myPet.weight + " and stands " + myPet.height +" tall.");
        System.out.println("My dog is a really " + myPet.characteristic +" pet.");

    }
}

public class App {

    public static void main(String[] args) {

        Mars mars = new Mars();
        Saturn saturn = new Saturn();
        Mercury mercury = new Mercury();
        Pluto pluto = new Pluto();
        Jupiter jupiter = new Jupiter();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        pluto.accept(astronaut);
        jupiter.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        pluto.accept(rover);
        jupiter.accept(rover);
        
        
    }
}

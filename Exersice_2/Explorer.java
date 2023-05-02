
public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Pluto pluto);

    void visit(Jupiter jupiter);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
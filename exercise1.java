public class App {

    static boolean iwillReview = true;
    static boolean iwillNotFail = true;

    public static void main(String[] args) throws Exception {

        App myReview = new App();

        // precondition
        assert iwillReview == false : "Naglaro kasi ako magdamag";

        myReview.exam();

        // postcondition
        assert iwillNotFail == true : "Di ako nakapag review dahil naglaro ako magdamag";

    }

    void exam() {

        iwillNotFail = false;

    }

}
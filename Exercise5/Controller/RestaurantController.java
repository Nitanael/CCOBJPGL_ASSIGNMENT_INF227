package Controller;

import javax.swing.text.html.ImageView;

import Model.Gerrys;
import Model.Maxs;
import Model.ReyesBarbecue;
import Model.Savorys;
import Model.Shakeys;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Gerrys gerry = new Gerrys();
    Maxs max = new Maxs();
    ReyesBarbecue reyesbbq = new ReyesBarbecue();
    Savorys savory = new Savorys();
    Shakeys shakey = new Shakeys();
    

    public void initialize() {

        gerry.setColor("Gray");
        gerry.setTaste("salty");

        max.setColor("Red");
        max.setTaste("Oily ");

        reyesbbq.setColor("Yellow");
        reyesbbq.setTaste("Sweet");

        savory.setColor("White");
        savory.setTaste("Meaty");

        shakey.setColor("Blue");
        shakey.setTaste("Cheesy");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Gerrys grill is " + gerry.getColor() + " and the foods there are " + gerry.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Maxs is " + max.getColor() + " and the foods there are " + max.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("ReyesBarbecue is " + reyesbbq.getColor() + " and the foods there are " + reyesbbq.getTaste());
        }
        
        if (sourceButton == btn4) {
            alert.setContentText("Savory is " + savory.getColor() + " and the foods there are " + savory.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Shakeys is " + shakey.getColor() + " and the foods there are " + shakey.getTaste());
        }
        alert.showAndWait();

    }
}

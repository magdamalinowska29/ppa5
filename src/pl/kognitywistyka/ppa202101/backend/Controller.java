package pl.kognitywistyka.ppa202101.backend;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML TextArea textArea;

    @FXML public void about(ActionEvent event){
        textArea.textProperty().set("You clicked on about");
    }

}

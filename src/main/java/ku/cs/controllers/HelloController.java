package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.services.FXRouter;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView sampleImageView;

    @FXML
    public void initialize() {
        welcomeText.setText("Hello World!");
        //Image image = new Image(String.valueOf(getClass().getResource("./image/ERDiagram.png")).toString());
        Image image = new Image(getClass().getResourceAsStream("/images/ERDiagram.png"));
        sampleImageView.setImage(image);
    }

    @FXML
    protected void onHelloButtonClick() {
        try {
            FXRouter.goTo("student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
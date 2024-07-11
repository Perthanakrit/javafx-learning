package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.models.Student;

public class StudentController {
    @FXML
    private Label nameLabel;

    @FXML
    public void initialize() {
        Student student = new Student("6610402060", "Per Tra");
        showStudent(student);
    }

    private void showStudent(Student student) {
        // Set text in Label
        nameLabel.setText(student.getName());
    }

}

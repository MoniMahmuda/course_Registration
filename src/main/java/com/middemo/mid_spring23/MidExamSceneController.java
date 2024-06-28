package com.middemo.mid_spring23;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class MidExamSceneController
{
    @javafx.fxml.FXML
    private TextField studentIdTextfield;
    @javafx.fxml.FXML
    private TextField scholarshipTextfield;
    @javafx.fxml.FXML
    private ComboBox<Integer> sectionComboBox;
    @javafx.fxml.FXML
    private Label creditLabel;
    @javafx.fxml.FXML
    private ComboBox<String> courseComboBox;
    @javafx.fxml.FXML
    private TextArea registrationTextArea;
    @javafx.fxml.FXML
    private CheckBox hasScholarshipCheckBox;

    @javafx.fxml.FXML
    public void initialize() {
        //Course
        courseComboBox.getItems().addAll("csc101","csc101L","csc201","Mat301","cse104","cse104L",
                "ENG105","Acn102","csc301","csc301L");
        //Combo Box
        sectionComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

    }
    //Handel
    Student tempStud ;
    ArrayList<RegisterCourse> registerCourseList = new ArrayList<>();

    @javafx.fxml.FXML
    public void proceedToRegisterAndShowRegInfoButtonOnClick(ActionEvent actionEvent) {
        String finalOutput = tempStud.toString()+ "\n"
                              + " Register Course :" + "\n";

        for (RegisterCourse c: registerCourseList){
            finalOutput = finalOutput + c.toString() + "\n";
        }

    }

    @javafx.fxml.FXML
    public void addARegisteredCourseButtonOnClick(ActionEvent actionEvent) {
        if (registerCourseList.isEmpty()){
            //new student object
            int scholarshipAmount = 0;
            if(hasScholarshipCheckBox.isSelected()){
                if (scholarshipTextfield.getText().equals("0")){
                    return;

                }
                scholarshipAmount = Integer.parseInt(scholarshipTextfield .getText());
            }
            tempStud= new Student(hasScholarshipCheckBox.isSelected(),
                                  Integer.parseInt(studentIdTextfield.getText()),
                                   scholarshipAmount);

        }
        //course obj creation
        RegisterCourse newCourse= new RegisterCourse(Integer.parseInt(creditLabel.getText()),
                                                       courseComboBox.getValue(),
                                                         sectionComboBox.getValue());

        registerCourseList.add(newCourse);

    }

    @javafx.fxml.FXML
    public void showCourseCredit(ActionEvent actionEvent) {
        if (courseComboBox.getValue().endsWith("L"))
            creditLabel.setText("1");
        else
            creditLabel.setText("3");

    }
}
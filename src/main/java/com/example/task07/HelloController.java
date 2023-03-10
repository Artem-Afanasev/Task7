package com.example.task07;

import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.security.Provider;
import java.util.ResourceBundle;

public class HelloController implements Initializable {



    public TextField timeCount;
    public HBox forTime;
    public HBox forDownload;



    @FXML
    private Label welcomeText;
    Signal signal = new Signal();
    LoadingShape Lshape = new LoadingShape();
    TimeServer timeServer = new TimeServer();

    @FXML
    protected void onHelloButtonClick() {
        //box.getChildren().add(signal);
        //signal.update();
    }
    public void onHelloButtonClickStart(ActionEvent actionEvent) {
        timeServer.attach(signal);
        timeServer.attach(Lshape);
    }

    public void onHelloButtonClickStop(ActionEvent actionEvent) {
        timeServer.detach(signal);
        timeServer.detach(Lshape);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        forTime.getChildren().add(signal.txt);
        forDownload.getChildren().add(Lshape.sqr);
        forDownload.getChildren().add(Lshape.txt);

    }

    public void startTime(ActionEvent actionEvent) {
        timeServer.attach(signal);
    }

    public void stopTime(ActionEvent actionEvent) {
        timeServer.detach(signal);
    }

    public void startDown(ActionEvent actionEvent) {
        timeServer.attach(Lshape);
    }

    public void stopDown(ActionEvent actionEvent) {
        timeServer.detach(Lshape);
    }


}
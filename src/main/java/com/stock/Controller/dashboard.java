package com.stock.Controller;

import animatefx.animation.Pulse;
import animatefx.animation.SlideOutUp;
import com.jfoenix.controls.JFXButton;
import com.stock.global.plugin.ViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ResourceBundle;

public class dashboard implements Initializable {
    @FXML
    TitledPane tilted;
    @FXML
    StackPane clik;
    @FXML
    ScrollPane dshleft;
    @FXML
    AnchorPane home;
    @FXML
    JFXButton bhome;
    @FXML
    JFXButton products;
    @FXML
    JFXButton cart;
    @FXML
    JFXButton stock;
    @FXML
    JFXButton clients;
    @FXML public ScrollPane ab;

    @FXML
    ScrollPane body;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Rectangle2D sc = Screen.getPrimary().getBounds();

            //body.setContent(FXMLLoader.load(getClass().getResource("/app/views/home.fxml")));
           // dshleft.setContent(FXMLLoader.load(getClass().getResource("/app/views/dshleft.fxml")));
            try {
                ViewManager.getInstance().put(
                        "navigator",
                        FXMLLoader.load(getClass().getResource("/app/views/products.fxml"))
                );
                ViewManager.getInstance().put(
                        "home",
                        FXMLLoader.load(getClass().getResource("/app/views/home.fxml"))
                );

                body.setContent( ViewManager.getInstance().get("home"));
                dshleft.setContent( ViewManager.getInstance().get("navigator"));
                //  dsh.getChildren().add(FXMLLoader.load(getClass().getResource("/app/views/dashboard.fxml")));
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    @FXML
    private void setHome(ActionEvent event){
        try {
            body.setContent(FXMLLoader.load(getClass().getResource("/app/views/home.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void setToproduct(){
        try {

            body.setContent(FXMLLoader.load(getClass().getResource("/app/views/products.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

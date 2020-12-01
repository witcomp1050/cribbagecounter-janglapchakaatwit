package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;

import static com.sun.glass.ui.Cursor.setVisible;

public class Main extends Application {






    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));





        primaryStage.setTitle("Cribbage Counter");
        primaryStage.setScene(new Scene(root, 1000, 560));
        primaryStage.setResizable(false);







        primaryStage.show();




    }


    public static void main(String[] args) {
        launch(args);
    }
}
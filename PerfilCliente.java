package projeto7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.FileInputStream;

public class PerfilCliente extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("PCRepair");
        primaryStage.setScene(new Scene(root, 700, 507));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}


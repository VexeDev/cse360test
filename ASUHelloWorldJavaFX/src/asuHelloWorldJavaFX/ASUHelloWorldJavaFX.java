package asuHelloWorldJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class ASUHelloWorldJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {
    	System.out.println("Maddox Hello World!");
    	System.out.println("It started!");
        primaryStage.setTitle("Maddox Hello World Spring 2024");
        Button btn = new Button();
        btn.setText("Display: 'Maddox says: Hello World! This is push number 3.'");
        btn.setOnAction(new EventHandler<>() {
            public void handle(ActionEvent event) {
                System.out.println("Maddox: Hello World! This is push number 3.");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
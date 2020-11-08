package talleraop1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/**
 *
 * @author TeamOne
 */
public class TallerAop1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox root = new HBox();
        root.setAlignment(Pos.CENTER);
        Button btnRed = new Button();
        btnRed.setText("Red Card");
        Button btnBlue = new Button();
        btnBlue.setText("Blue Card");
        Button btnGreen = new Button();
        btnGreen.setText("Green Card");

        btnRed.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	root.setStyle("-fx-background-color:RED;");
            	System.out.println("RED...");
            }
        });
        btnBlue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	root.setStyle("-fx-background-color:BLUE;");
            	System.out.println("BLUE...");
            }
        });
        btnGreen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	root.setStyle("-fx-background-color:GREEN;");
            	System.out.println("GREEN...");
            }
        });
        
        
        root.getChildren().add(btnRed);
        root.getChildren().add(btnBlue);
        root.getChildren().add(btnGreen);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

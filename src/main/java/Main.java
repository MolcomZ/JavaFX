import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){
        System.out.println("HPOasd");
        launch();
    }

    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane=new AnchorPane();
        Scene scene=new Scene(anchorPane,500,500);
        Button button=new Button("HOLA");
        anchorPane.getChildren().add(button);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

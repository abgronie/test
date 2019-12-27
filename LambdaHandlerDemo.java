import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.*;

public class LambdaHandlerDemo extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        Button btSave = new Button("Save");
        Button btPrint = new Button("Print");
        hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);

        btNew.setOnAction((ActionEvent e) -> {
                String message = "Process New File";
                System.out.println(message);
                JOptionPane.showMessageDialog(null, message);
        });

        btOpen.setOnAction((e) -> {
                System.out.println("Process Open");
        });

        btSave.setOnAction(e -> {
                System.out.println("Process Save");
        });

        btPrint.setOnAction( e -> System.out.println("Process Print"));

        Scene scene = new Scene(hBox, 300, 50);
        primaryStage.setTitle("LambdaHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
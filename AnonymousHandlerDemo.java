import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        Button btNew = new Button("New");
        Button btOpen = new Button("Open");
        Button btSave = new Button("Save");
        Button btPrint = new Button("Print");
        hBox.getChildren().addAll(btNew, btOpen, btSave, btPrint);

        btNew.setOnAction(new EventHandler<ActionEvent>(){
            @Override // Overrides the handle method in the EventHandler<ActionEvent> interface
            public void handle(ActionEvent e){
                System.out.println("Process New")
            }
        });

        btOpen.setOnAction(new EventHandler<ActionEvent>(){
            @Override // Overrides the handle method in the EventHandler<ActionEvent> interface
            public void handle(ActionEvent e){
                System.out.println("Process Open")
            }
        });

        btSave.setOnAction(new EventHandler<ActionEvent>(){
            @Override // Overrides the handle method in the EventHandler<ActionEvent> interface
            public void handle(ActionEvent e){
                System.out.println("Process Save")
            }
        });

        btPrint.setOnAction(new EventHandler<ActionEvent>(){
            @Override // Overrides the handle method in the EventHandler<ActionEvent> interface
            public void handle(ActionEvent e){
                System.out.println("Process Print")
            }
        });

        Scene scene = new Scene(hBox, 300, 50);
        primaryStage.setTitle("Anonymous Handler");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
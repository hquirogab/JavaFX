/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hquiroga
 */
public class EjemploGUI extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        FileInputStream imageInput = new FileInputStream("open.png");
        Image image = new Image(imageInput);
        Button btOpen = new Button("Abrir", new ImageView(image));
        
        /*imageInput = new FileInputStream("save.png");
        image = new Image(imageInput);
        Button btSave = new Button("Guardar", new ImageView(image));
        Button btSaveAs = new Button("Guardar como...", new ImageView(image));*/
        
        
        imageInput = new FileInputStream("close.png");
        image = new Image(imageInput);
        Button btClose = new Button("Cerrar", new ImageView(image));
        
        TableView table = new TableView();
        TableColumn id = new TableColumn("ID");
        TableColumn name = new TableColumn("Name");
        TableColumn lastName = new TableColumn("Last Name");
        table.getColumns().addAll(id, name, lastName);
        
        //HBox hbox = new HBox(btOpen, btSave, btSaveAs, btClose);
        
        imageInput = new FileInputStream("save.png");
        image = new Image(imageInput);
        
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(50);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(30);
        gridPane.getColumnConstraints().addAll(col1, col2);
        
        Label addressLbl = new Label("Enter address:");
        gridPane.add(addressLbl, 0, 0, 4, 1);
        GridPane.setHalignment(addressLbl, HPos.CENTER);
        
        Label direccion = new Label("Direccion");
        gridPane.add(direccion, 0, 1, 1, 1);
        GridPane.setHalignment(direccion, HPos.RIGHT);
        TextField txtDireccion = new TextField();
        gridPane.add(txtDireccion, 1, 1, 4, 1);
        Label direccion2 = new Label("Direccion");
        TextField txtDireccion2 = new TextField();
        gridPane.add(txtDireccion2, 0, 2, 1, 2);
        gridPane.add(direccion2, 1, 2, 1, 2);
        
        
        VBox vbox = new VBox(gridPane);
        
        Scene scene = new Scene(vbox);
        
        
        primaryStage.setTitle("Ejemplo Interfaz");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}

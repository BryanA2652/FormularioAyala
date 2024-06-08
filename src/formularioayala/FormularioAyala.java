/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package formularioayala;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ROCIO
 */
public class FormularioAyala extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Label bton = new Label ("Button: ");
        Button btn = new Button ("Button");
        
        Label checbx = new Label ("Checkbox: ");
        CheckBox caja = new CheckBox ("Checkbox");
        
        Label hiperlinked = new Label("Hiperlink: ");
        Hyperlink link = new Hyperlink("Hyperlink");
       
        Label TB = new Label("ToggleButton: ");
        ToggleButton bt = new ToggleButton("ToggleButton");
        
        Label RB = new Label("RadioButton: ");
        RadioButton radio = new RadioButton("RadioButton");
        
        Label labell = new Label("Label: ");
        System.out.println("Label");
        
        Label TF = new Label("TextField: ");
        TextField texto = new TextField();
        
        Label PF = new Label("PasswordField: ");
        PasswordField contrasena = new PasswordField();
        
        Label TA = new Label("TextArea: ");
        TextArea area = new TextArea();
        
        Label PI = new Label("ProgressIndicator: ");
        ProgressIndicator indicador = new ProgressIndicator();
        
        Label PB = new Label("ProgressBar: ");
        ProgressBar bar = new ProgressBar();
        
        Label Sir = new Label("Slider: ");
        Slider Barra = new Slider();
        
        
        VBox root = new VBox ();
        HBox horizontal = new HBox ();
        
        root.getChildren().addAll(bton, btn, checbx, caja, hiperlinked, link, TB, bt, RB, radio, labell,
                TF, texto, PF, contrasena, TA, area, PI, indicador, PB, bar, Sir, Barra, horizontal);
        
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Formulario - Bryan Ayala");
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

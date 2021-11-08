package ecommerce.converter;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

public class Main extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        //Scene scene = new Scene(new Label("Foo"));
        //Scene scene = new Scene(new GridPane(), 500, 500);

        // Controls
        final TextField directory_rawfile = new TextField();

        final TextField directory_newfile = new TextField();

        Label lbl_rawfile = new Label("Rohdaten:");
        lbl_rawfile.setTextAlignment(TextAlignment.LEFT);
        Label lbl_platform = new Label("Plattform:");
        lbl_platform.setTextAlignment(TextAlignment.LEFT);
        Label lbl_newfile = new Label("Fertige Datei:");
        lbl_newfile.setTextAlignment(TextAlignment.LEFT);

        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Amazon",
                        "Carrefour",
                        "Conrad",
                        "eBay"
                );
        final ComboBox platforms_box = new ComboBox(options);




        // Create and setup GridPane

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Button btn = new Button();
        btn.setText("Starte Konvertierung!");

        // Add to GridPane

        grid.add(lbl_rawfile, 0, 0, 1, 1);
        grid.add(directory_rawfile, 1, 0, 1, 1);

        grid.add(lbl_platform, 0, 1, 1, 1);
        grid.add(platforms_box, 1, 1, 1, 1);

        grid.add(lbl_newfile, 0, 2, 1, 1);
        grid.add(directory_newfile, 1, 2, 1, 1);

        grid.add(btn, 1, 3, 1, 1);

        // ****** Scene setup ********
        Scene scene = new Scene(grid, 500, 500);

        primaryStage.setTitle("E-Commerce converter");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Start programm
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (platforms_box.getSelectionModel().getSelectedItem() != null) {

                    ConvertMain.start(platforms_box.getSelectionModel().getSelectedItem().toString());


                } else {

                    System.out.println("Plattform muss ausgewählt werden!");
                }

                //System.out.println(platforms_box.getSelectionModel().getSelectedItem());
                //System.out.println("Konvertierung startet!");

            }
        });



    }
}

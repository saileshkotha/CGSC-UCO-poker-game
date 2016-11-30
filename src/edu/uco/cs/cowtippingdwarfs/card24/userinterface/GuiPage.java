package edu.uco.cs.cowtippingdwarfs.card24.userinterface;

/*
  Created by sailesh on 11/22/2016
 */
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GuiPage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Card24");
        primaryStage.getIcons().add(new Image("file:src/edu/uco/cs/cowtippingdwarfs/card24/userinterface/resources/1.png"));


        VBox root = new VBox();


        Text sceneTitle = new Text("Super Poker Game");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        HBox hb1 = new HBox(sceneTitle);
        hb1.setAlignment(Pos.CENTER);
        hb1.setPadding(new Insets(20));
        root.getChildren().add(hb1);

        Text scenehint = new Text("Select the numbers");
        scenehint.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        HBox hb2 = new HBox(scenehint);
        hb2.setAlignment(Pos.CENTER);
        hb2.setPadding(new Insets(20));
        root.getChildren().add(hb2);

        ObservableList<Integer> options =
                FXCollections.observableArrayList(
                        1,2,3,4,5,6,7,8,9,10,11,12,13
                );
        final ComboBox<Integer> comboBox1 = new ComboBox<>(options);

        comboBox1.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue ov, Integer t, Integer t1) {
                System.out.println(t1);
            }
        });

        final ComboBox<Integer> comboBox2 = new ComboBox<>(options);

        final ComboBox<Integer> comboBox3 = new ComboBox<>(options);

        final ComboBox<Integer> comboBox4 = new ComboBox<>(options);

        HBox hb3 = new HBox(50);
        hb3.getChildren().addAll(comboBox1, comboBox2, comboBox3, comboBox4);
        hb3.setPadding(new Insets(20));
        hb3.setAlignment(Pos.CENTER);
        root.getChildren().add(hb3);

        Button btn = new Button("Submit");
        HBox hb4 = new HBox(btn);
        hb4.setPadding(new Insets(20));
        hb4.setAlignment(Pos.CENTER);
        root.getChildren().add(hb4);


        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println(comboBox1.getValue());
                solutionsPage(primaryStage);
            }
        });
        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void solutionsPage(Stage stage){
        Scene secondScene = stage.getScene();
        GridPane grid1 = new GridPane();
        grid1.setAlignment(Pos.CENTER);
        grid1.setHgap(10);
        grid1.setVgap(10);
        grid1.setPadding(new Insets(25, 25, 25, 25));
        secondScene = new Scene(grid1, 700, 450);
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid1.add(scenetitle, 0, 0, 2, 1);
        stage.setScene(secondScene);
    }
}
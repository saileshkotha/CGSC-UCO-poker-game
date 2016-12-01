package edu.uco.cs.cowtippingdwarfs.card24.userinterface;

/*
  Created by sailesh on 11/22/2016
 */
import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.ArithmeticMachine;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.StringProperty;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.util.ArrayList;
import java.util.Collections;

public class GuiPage extends Application {
    private static ArithmeticMachineSimulator arithmeticMachineSimulator;  //Remove when merged
    private static ArithmeticMachine arithmeticMachine;
    private static Card[][] cards;
    private static UserInterface userInterface;

    public void setUserInterface(UserInterface userInterface) {
        GuiPage.userInterface = userInterface;
        System.out.println("User interfaces is set"+userInterface);
    }
    //Remove when merged
    public  void setArithmeticMachineSimulator(ArithmeticMachineSimulator arithmeticMachineSimulator) {
        this.arithmeticMachineSimulator = arithmeticMachineSimulator;
    }

    /*public static void main(String[] args) {
        launch(args);
    }*/

    public ComboBox<Card> defineComboBox(ArrayList<Integer> suits, int comboBoxRank, ImageView imageView){

        Card[] allClubs = cards[suits.get(comboBoxRank)];
        ObservableList<Card> options =
                FXCollections.observableArrayList(
                        allClubs
                );
        final ComboBox<Card> comboBox = new ComboBox<>(options);
        comboBox.valueProperty().addListener(new ChangeListener<Card>() {
            @Override
            public void changed(ObservableValue ov, Card t, Card t1) {
                System.out.println(t1.getImage());
                final Image image1 = new Image(t1.getImage());

                imageView.setImage(image1);

            }
        });

        return comboBox;
    }

    public ImageView defineImageView(){
        ImageView imageView = new ImageView();
        final Image image = new Image("file:src/edu/uco/cs/cowtippingdwarfs/card24/userinterface/resources/0.png");
        imageView.setImage(image);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    @Override
    public void start(Stage primaryStage) {
        System.setProperty("glass.accessible.force", "false");   // Workaround for ComboBox stuck on windows 10. http://stackoverflow.com/questions/31786980/javafx-windows-10-combobox-error
        primaryStage.setTitle("Card24");
        primaryStage.getIcons().add(new Image("file:src/edu/uco/cs/cowtippingdwarfs/card24/userinterface/resources/0.png"));


        VBox root = new VBox();

        ImageView img_1 = defineImageView();
        ImageView img_2 = defineImageView();
        ImageView img_3 = defineImageView();
        ImageView img_4 = defineImageView();

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

        ArrayList<Integer> suits = new ArrayList<Integer>() {{
            add(0);
            add(1);
            add(2);
            add(3);
        }};
        Collections.shuffle(suits);


        Card[] allClubs = cards[suits.get(0)];
        ObservableList<Card> options =
                FXCollections.observableArrayList(
                        allClubs
                );


        final ComboBox<Card> comboBox1 = defineComboBox(suits, 0, img_1);
        final ComboBox<Card> comboBox2 = defineComboBox(suits, 1, img_2);
        final ComboBox<Card> comboBox3 = defineComboBox(suits, 2, img_3);
        final ComboBox<Card> comboBox4 = defineComboBox(suits, 3, img_4);

        //Comboboxes view
        HBox hb3 = new HBox(50);
        hb3.getChildren().addAll(comboBox1, comboBox2, comboBox3, comboBox4);
        hb3.setPadding(new Insets(20));
        hb3.setAlignment(Pos.CENTER);
        root.getChildren().add(hb3);

        //Images
        HBox hb4 = new HBox(50);
        hb4.getChildren().addAll(img_1, img_2, img_3, img_4);
        hb4.setPadding(new Insets(20));
        hb4.setAlignment(Pos.CENTER);
        root.getChildren().add(hb4);

        //Submit button
        Button btn = new Button("Submit");
        HBox hb5 = new HBox(btn);
        hb5.setPadding(new Insets(20));
        hb5.setAlignment(Pos.CENTER);
        root.getChildren().add(hb5);


        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Card[] selected = new Card[4];
                selected[0] = comboBox1.getValue();
                selected[1] = comboBox2.getValue();
                selected[2] = comboBox3.getValue();
                selected[3] = comboBox4.getValue();
                //arithmeticMachine.solve(selected);
                System.out.println(arithmeticMachineSimulator);
                arithmeticMachineSimulator.solve(selected, userInterface);

                System.out.print("Selected cards sent to solver");

                solutionsPage(primaryStage);
            }
        });
        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void solutionsPage(Stage stage){
        Scene secondScene;
        VBox root = new VBox();
        Text sceneTitle = new Text("Finding solutions.....");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        HBox hb1 = new HBox(sceneTitle);
        hb1.setAlignment(Pos.CENTER);
        hb1.setPadding(new Insets(20));
        root.getChildren().add(hb1);


        final SolutionView solutionView = new SolutionView(userInterface);
        root.getChildren().add(solutionView);


        Button btn = new Button("View all solutions");
        HBox hb5 = new HBox(btn);
        hb5.setPadding(new Insets(20));
        hb5.setAlignment(Pos.CENTER);
        root.getChildren().add(hb5);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                allSolutionsPage(stage);
            }
        });

        secondScene = new Scene(root, 700, 450);
        stage.setScene(secondScene);
    }

    private class SolutionView extends StackPane {

        private final Label solutionLabel = new Label();

        public SolutionView(UserInterface userInterface) {
            solutionLabel.textProperty().bind(
                    Bindings.format(
                            "Solution Found: %s",
                            userInterface.changeSolution()
                    )
            );
            solutionLabel.setMinWidth(150);
            solutionLabel.setAlignment(Pos.CENTER);

            getChildren().setAll(solutionLabel);
        }
    }

    public void allSolutionsPage(Stage stage){
        Scene thirdScene;
        VBox root = new VBox();
        Text sceneTitle = new Text("All solutions... (Updates as solutions are found)");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        HBox hb1 = new HBox(sceneTitle);
        hb1.setAlignment(Pos.CENTER);
        hb1.setPadding(new Insets(20));
        root.getChildren().add(hb1);


        final AllSolutionView allSolutionView = new AllSolutionView(userInterface);
        root.getChildren().add(allSolutionView);

        thirdScene = new Scene(root, 700, 450);
        stage.setScene(thirdScene);
    }

    private class AllSolutionView extends StackPane {

        private final Label solutionLabel = new Label();

        public AllSolutionView(UserInterface userInterface) {
            solutionLabel.textProperty().bind(
                    Bindings.format(
                            "Solutions Found: \n%s",
                            userInterface.changeAllSolution()
                    )
            );
            solutionLabel.setMinWidth(150);
            solutionLabel.setAlignment(Pos.CENTER);

            getChildren().setAll(solutionLabel);
        }
    }

    public void setArithmeticMachine(ArithmeticMachine arithmeticMachine) {
        this.arithmeticMachine = arithmeticMachine;
    }

    public void setCards(Card[][] cards) {
        System.out.println("Set method called for cards in guipage");
        this.cards = cards;
    }


}
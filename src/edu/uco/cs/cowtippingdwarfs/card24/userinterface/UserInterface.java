package edu.uco.cs.cowtippingdwarfs.card24.userinterface;

import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.ArithmeticMachine;
import javafx.application.Application;

import java.util.ArrayList;

/**
 * Created by saile on 11/27/2016.
 */

public class UserInterface {
    public static ArrayList<String> solutions = new ArrayList<String>();
    GuiPage guiPage = new GuiPage();
    UserInterface(ArithmeticMachineSimulator arithmeticMachineSimulator){
        Card[][] cards = new Card[4][13];
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 13;j++){
                cards[i][j] = new Card(j+1,i);    //Defining 52 cards here.
            }
        }

        startGui(arithmeticMachineSimulator, cards);
    }

    private void startGui(ArithmeticMachineSimulator arithmeticMachineSimulator, Card[][] cards){

        guiPage.setArithmeticMachineSimulator(arithmeticMachineSimulator);
        guiPage.setCards(cards);
        guiPage.setUserInterface(this);
        Application.launch(GuiPage.class, (java.lang.String[]) null);
    }

    public void addSolution(String solution, String time){
        solutions.add(solution);
    }

}

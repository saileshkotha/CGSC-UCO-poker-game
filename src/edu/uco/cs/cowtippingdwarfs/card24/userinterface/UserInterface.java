package edu.uco.cs.cowtippingdwarfs.card24.userinterface;

import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.ArithmeticMachine;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;

import java.util.ArrayList;

/**
 * Created by saile on 11/27/2016.
 */

public class UserInterface {
    public static ArrayList<String> solutions = new ArrayList<String>();
    private final ReadOnlyStringWrapper solutionWrapper = new ReadOnlyStringWrapper("");
    private final ReadOnlyStringWrapper allSolutionsWrapper = new ReadOnlyStringWrapper("");

    GuiPage guiPage = new GuiPage();
    UserInterface(ArithmeticMachine arithmeticMachine){
        Card[][] cards = new Card[4][13];
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 13;j++){
                cards[i][j] = new Card(j+1,i);    //Defining 52 cards here.
            }
        }
        startGui(arithmeticMachine, cards);
    }

    private void startGui(ArithmeticMachine arithmeticMachine, Card[][] cards){

        guiPage.setArithmeticMachine(arithmeticMachine);
        guiPage.setCards(cards);
        guiPage.setUserInterface(this);
        Application.launch(GuiPage.class, (java.lang.String[]) null);
    }

    public void addSolution(String solution, String time){
        solutions.add(solution);
        if(solutions.size()==1){
            solutionWrapper.set(solution);
        }else if(solutions.size()>1){
            String solutionsString = "";

            for (String s : solutions)
            {
                solutionsString += s + "\n";
            }
            allSolutionsWrapper.set(solutionsString);
        }

    }
    public ReadOnlyStringProperty changeSolution(){
        return solutionWrapper.getReadOnlyProperty();
    }
    public ReadOnlyStringProperty changeAllSolution(){
        return allSolutionsWrapper.getReadOnlyProperty();
    }
}
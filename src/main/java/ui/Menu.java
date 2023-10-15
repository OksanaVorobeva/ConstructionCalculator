package ui;

import ui.commands.*;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<Commands> commands;
    private View view;

    public Menu(View view){
        commands= new ArrayList<>();
        commands.add(new ElectricCalculation(view));
        commands.add(new TitelCalculation(view));
        commands.add(new TotalCost(view));
        commands.add(new WaterSupplyCalculation(view));
    }

    public void execute(int number){
        commands.get(number-1).execute();
    }

    public String printMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

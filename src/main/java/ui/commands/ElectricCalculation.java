package ui.commands;


import ui.View;
import ui.commands.Commands;

public class ElectricCalculation implements Commands {

    private View view;

    public ElectricCalculation(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.electricCalculation();

    }

    @Override
    public String description() {
        return "Расчитать сумму ";
    }
}

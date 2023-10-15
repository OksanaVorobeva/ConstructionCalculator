package ui.commands;

import ui.View;

public class TitelCalculation implements Commands{
    private View view;

    public TitelCalculation(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.tileCalculation();
    }

    @Override
    public String description() {
        return "Расчитать ";
    }
}

package ui.commands;

import ui.View;

public class WaterSupplyCalculation implements  Commands{

    private View view;

    public WaterSupplyCalculation(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.waterSupplyCalculation();
    }

    @Override
    public String description() {
        return "Расчитать ";
    }
}

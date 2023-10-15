package ui.commands;

import ui.View;

public class TotalCost implements Commands{

    private View view;

    public TotalCost(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.totalCost();
    }

    @Override
    public String description() {
        return null;
    }
}

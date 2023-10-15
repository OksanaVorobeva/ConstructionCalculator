package ui;

import presenter.Presenter;

public interface View {
    public void start();
    public void setPresenter(Presenter presenter);

    public void waterSupplyCalculation();

    public void electricCalculation();
    public  void tileCalculation();

    public void totalCost();
}

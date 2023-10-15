package presenter;

import servis.Servis;
import ui.View;

public class Presenter {

    private View view;
    private Servis servis;

    public Presenter(View view, Servis servis) {
        this.view = view;
        this.servis = servis;
        view.setPresenter(this);
    }

    public void calculateWaterSupply(int diameter, int length){
        servis.calculateWaterSupply();
    }

    public void calculateElectricalWiring(){

    }

    public  void calculateTiles(int roomArea, int numberOfTiles){
        servis.calculateTiles();
    }

    public  void calculateTotalSum(){
        servis.calculateTotalSum();
    }


}

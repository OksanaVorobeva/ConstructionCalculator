package ui;

import presenter.Presenter;

import java.util.Scanner;

public class Console implements View {

    private Scanner scanner;
    private Presenter presenter;
    private boolean work=true;
    private Menu menu;

    public  Console(){
        scanner = new Scanner(System.in);
        menu = new Menu(this);
    }

    @Override
    public void start() {
        while (work){
            System.out.println(menu.printMenu());
            int number= Integer.parseInt(scanner.nextLine());
            menu.execute(number);
        }
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter=presenter;
    }

    @Override
    public void waterSupplyCalculation() {
        System.out.println("Введите наружный диаметр ");
        int diameter= scanner.nextInt();
        System.out.println("Введите длину ");
        int length= scanner.nextInt();
        presenter.calculateWaterSupply(diameter,length);
    }

    @Override
    public void electricCalculation() {
        System.out.println("Введите площадь помешения ");
        int roomArea= scanner.nextInt();
        System.out.println("Введите количество плиток ");
        int numberOfTiles=scanner.nextInt();
        presenter.calculateTiles(roomArea,numberOfTiles);
    }

    @Override
    public void tileCalculation() {

    }

    @Override
    public void totalCost() {
        presenter.calculateTotalSum();
    }
}

package ProgettoAutofficina;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Officina garage = new Officina();

        garage.addCars(new Car("12ABC34", "Bugatti Veyron"));  
        garage.addCars(new Car("56DEF78", "Lamborghini Aventador"));      

        garage.displayAllCars();
    }

    //------------------------------------------------------------------------------------------

    //classe AUTO
    static class Car {
        public String licensePlate, model;

        public Car (String licensePlate, String model){
            this.licensePlate=licensePlate;
            this.model=model;
        }
        //metodo per mostrare le info dell'auto
        public void displayCarInfo() {
            System.out.println("License plate: " + licensePlate + "\n Model: " + model);
        }
    }

    //------------------------------------------------------------------------------------------

    //classe OFFICINA
    static class Officina {
        public ArrayList<Car> carList;

            public Officina(){
                carList = new ArrayList<>();
            }
            //metodo per aggiungere auto
            public void addCars(Car car){
                carList.add(car);
            }

            //metodo per mostrare tutte le auto nella lista
            public void displayAllCars(){
                for (Car car : carList) {
                    car.displayCarInfo();
                }
            }
        }

}

class Veichle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Honk hooooooonk!");
    }
}

class Car extends Veichle{
    private String modelName="Fiat";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
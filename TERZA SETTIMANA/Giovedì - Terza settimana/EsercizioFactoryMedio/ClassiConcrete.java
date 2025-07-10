package EsercizioFactoryMedio;

 class Cerchio implements IShape {
    @Override
    public void disegna() {
        System.out.println("Disegno un cerchio");
    }
}

 class Quadrato implements IShape {
    @Override
    public void disegna() {
        System.out.println("Disegno un quadrato");
    }
}
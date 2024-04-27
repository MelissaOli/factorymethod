public class Client {

    public static void main(String[] args) {
        CarCreator creator1 = new FiatConcreteCreator();
        creator1.buildCar();

        CarCreator creator2 = new VolksConcreteCreator();
        creator2.buildCar();
    }
}
//Esta classe é o programa principal. Ela cria objetos CriadorCarro (Fiat e Volks neste caso) e usa o método buildCar() deles para criar e potencialmente personalizar diferentes tipos de carro.

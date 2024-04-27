public class VolksConcreteCreator extends CarCreator {

    @Override
    protected Car factoryMethod() {
        return new ConcreteProductGol();
    }
}

//Essas classes estendem CriadorCarro. Elas sobrescrevem o factoryMethod() para retornar objetos de carro específicos (Palio para Fiat e Gol para Volks).
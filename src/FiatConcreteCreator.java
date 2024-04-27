public class FiatConcreteCreator extends CarCreator {

    @Override
    protected Car factoryMethod() {

        return new ConcreteProductPalio();
    }
}
//Essas classes herdam de Carro e representam modelos específicos de carro (Gol e Palio). Elas definem seus próprios valores de modelo, fábrica e categoria no construtor e podem potencialmente ter métodos específicos do modelo.

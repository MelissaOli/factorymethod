public abstract class CarCreator {
    public void buildCar() {
        Car carro = factoryMethod();
    }
    protected abstract Car factoryMethod();
}
//Esta classe define o padrão para a criação de objetos carro. Ela possui um método abstrato factoryMethod() que as subclasses implementam para especificar a criação concreta do carro.
public class ConcreteProductGol extends Car {

    public ConcreteProductGol() {
        this.setModel("Gol");
        this.setFactory("Volks");
        this.setCatagory("Hatch");
        this.showInformation();
    }
}
//Essas classes herdam de Carro e representam modelos específicos de carro (Gol e Palio). Elas definem seus próprios valores de modelo, fábrica e categoria no construtor e podem potencialmente ter métodos específicos do modelo.
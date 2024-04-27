    //Car: Essa classe funciona como um modelo para diferentes tipos de carro. Ela armazena informações como modelo, fábrica e categoria, e fornece métodos para acessá-las e modificá-las.
    public class Car {

        private String model;
        private String factory;
        private String category;
    
        public void showInformation() {
            System.out.println("Model:" + this.getModel() +
                               "\nPactory:" + this.getFactory() +
                               "\nIn Category: " + this.getCategory());
        }
    
        public String getModel() {
            return model;
        }
    
        public void setModel(String model) {
            this.model = model;
        }
    
        public String getFactory() {
            return factory;
        }
    
        public void setFactory(String factory) {
            this.factory = factory;
        }
    
        public String getCategory() {
            return category;
        }
    
        public void setCatagory(String category) {
            this.category = category;
        }
    }
    
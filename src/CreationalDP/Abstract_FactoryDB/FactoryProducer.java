package CreationalDP.Abstract_FactoryDB;

public class FactoryProducer {


    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SEKİL")) {
            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("RENK")) {
            return new ColorFactory();
        }
        return null;
    }


}

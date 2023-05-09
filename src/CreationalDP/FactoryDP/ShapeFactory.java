package CreationalDP.FactoryDP;
/*
Factory Design Pattern : Domain bilgisi olmaksizin kullaniciya istedigi class'i vermeyi saglar!
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){

        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("DAIRE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("DIKDORTGEN")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("KARE")) {
            return new Square();
        }
        return null;

    }

}

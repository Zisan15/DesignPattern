package StructuralDP.ProxyDP;

public class PorxyClass implements ImageGenerator{

    private RealClass realClass;
    private String fullPath;

    public PorxyClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {

        if (realClass==null){
            realClass= new RealClass(fullPath);
            realClass.showImage();
        }

    }
}

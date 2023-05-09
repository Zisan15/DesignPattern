package StructuralDP.FacadeDP;

import java.util.concurrent.TimeoutException;

public class SHAEnc {

    public void encrypt(String text, String key, boolean type){
        if(type) {
            System.out.println("<SHA> " + text + key + " </SHA>");
        } else System.out.println("<SHA> " + key + text + " </SHA>");
    }
}

package StructuralDP.FacadeDP;

public class EncFacade {

    private AESEnc aesEnc = new AESEnc();
    private MD5Enc mdsEnc = new MD5Enc();
    private SHAEnc shaEnc = new SHAEnc();

    public void encrypt(String text, EncTypte encTypte) {
        switch (encTypte) {
            case AES:
                aesEnc.encrypt(text);
                break;
            case MD5:
                mdsEnc.encrypt(text, "KEY");
                break;
            case SHA:
                shaEnc.encrypt(text, "KEY", true);
            default:
                throw new IllegalArgumentException(encTypte.toString());
        }
    }

    public enum EncTypte {
        SHA,
        MD5,
        AES
    }
}

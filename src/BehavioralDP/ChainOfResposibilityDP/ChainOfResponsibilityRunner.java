package BehavioralDP.ChainOfResposibilityDP;

public class ChainOfResponsibilityRunner {

    void chainOfDesponsibilityDemo() {


        Approver genelMudur = new GenelMudur();
        Approver mudur = new Mudur(genelMudur);
        Approver memur = new Memur(mudur);

        System.out.println("Kredi verme limitleri : ");
        System.out.println("Memur icin maksimum : <100");
        System.out.println("Müdür icin maksimum : <500");
        System.out.println("Genel Müdür icin limit yok");

        //işlemler hep memur sınıfı üzerinden yapılacak
        System.out.println("****************************");
        System.out.println("Müsterinin memurdan talep ettiği kredi miktarı : 50");
        memur.approveLoan(50);

        System.out.println("Müsterinin memurdan talep ettiği kredi miktarı : 450");
        memur.approveLoan(450);


        System.out.println("Müsterinin memurdan talep ettiği kredi miktarı : 1050");
        memur.approveLoan(1050);

    }


    public static void main(String[] args) {

        ChainOfResponsibilityRunner cor = new ChainOfResponsibilityRunner();
        cor.chainOfDesponsibilityDemo();


    }
}
package BehavioralDP.ChainOfResposibilityDP;

public class Mudur extends Approver {

    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 500) {
            System.out.println("Müdür onayladı");
            System.out.println("**************");
            return true;
        } else if (chief != null) {
            System.out.println("Miktar müdürün onaylaması dışında, Sefe yönlendiriliyor");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
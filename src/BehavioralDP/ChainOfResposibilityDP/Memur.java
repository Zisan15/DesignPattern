package BehavioralDP.ChainOfResposibilityDP;

public class Memur extends Approver {


    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {//150
        if (amount < 100) {

            System.out.println("Memur onaylaldı");
            System.out.println("*********************");
            return true;

        } else if (chief != null) {

            System.out.println("Miktar memurun onaylama sınırı dışında, Şefe yönlendiriliyor ");
            return chief.approveLoan(amount);
        }
        return false;
    }
}

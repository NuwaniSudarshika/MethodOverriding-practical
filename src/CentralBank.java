public class CentralBank {
    int getInterestRate(){
        return 0;
    }
}
class Boc extends CentralBank{
    int getInterestRate(){
        return 8;
    }
}
class PeopleBank extends CentralBank{
    int getInterestRate(){
        return 10;
    }
}
class CommercialBank extends CentralBank{
    int getInterestRate(){
        return 12;
    }
}
class TestOverriding{
    public static void main(String[] args) {
        Boc b = new Boc();
        PeopleBank p = new PeopleBank();
        CommercialBank c = new CommercialBank();
        System.out.println("Interest Rate:-" + b.getInterestRate() +"%");
        System.out.println("Interest Rate:-" + p.getInterestRate() +"%");
        System.out.println("Interest Rate:-" + c.getInterestRate() + "%");
    }

}

public class Main {


    public static void main(String[] args) {

        Samochod s=new Samochod("maluch");
        s.jazda(50);
        s.stop();
        s.drift();

        Pojazd p=new Samochod("sucsinc");
        p.stop();

        Pojazd p2=new Rower("mybike");
        p2.stop();

    }

}

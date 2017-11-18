public class Samochod implements Pojazd {
    String nazwa; //atrybut

    public Samochod(String nazwa) { //konstruktor
        this.nazwa = nazwa;
    }

    @Override
    public void jazda(int predkosc){
        System.out.println("samochod jazda");
    }

    @Override
    public void stop(){
        System.out.println("samochod stop");
    }

    public void drift(){
        System.out.println("samochod drift");
    }

}

public class Rower implements Pojazd {
    String nazwa;

    public Rower(String nazwa){ //konstruktor
        this.nazwa=nazwa;
    }

    @Override
    public void jazda(int predkosc) {
        System.out.println("rower jazda");

    }

    @Override
    public void stop() {
        System.out.println("rowwerstop");
    }
}


package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus paviaani = new Paviaani();
        opettaja.aterioi();
        oppilas.aterioi();
        paviaani.aterioi();
    }
}

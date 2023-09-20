import phone.Iphone;

public class TesteIphone {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.tocar(iphone.selecionarMusica("Wall of Shame - Course of Nature"));

        iphone.atender();
        iphone.correioVoz();

        

    }
}

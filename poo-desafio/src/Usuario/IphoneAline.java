package Usuario;

import Multifuncional.Iphone;

public class IphoneAline {
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        
        celular.ligar("12345");

        celular.adicionarNovaAba();

        celular.selecionarMusica("Golden Hour");
    }
}

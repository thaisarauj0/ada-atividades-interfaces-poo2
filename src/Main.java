import Interface_Animais.Cachorro;
import Interface_Animais.Gato;
import Interface_Formas_Geometricas.Circulo;
import Interface_Formas_Geometricas.Desenho;
import Interface_Formas_Geometricas.Forma;
import Interface_Formas_Geometricas.Quadrado;
import Interface_Notificacoes.Email;
import Interface_Notificacoes.SMS;
import Interface_Pagamentos.Cartao;
import Interface_Pagamentos.Dinheiro;
import Interface_Pagamentos.Pagamento;
import Interface_Pagamentos.Pix;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Teste Animais
//        Cachorro cachorro = new Cachorro();
//        Gato gato = new Gato();
//
//        cachorro.emitirSom();
//        gato.emitirSom();

        //Teste Formas
//        Circulo circulo = new Circulo(4);
//        Quadrado quadrado = new Quadrado(4);
//        List<Forma> formas = new ArrayList<Forma>();
//        formas.add(circulo);
//        formas.add(quadrado);
//        Desenho desenho = new Desenho(formas);
//        System.out.println(quadrado.calcularArea());
//        System.out.println(circulo.calcularArea());
//        System.out.println(desenho.calcularAreaTotal());
//      Teste Pagamentos
//        Cartao cartao = new Cartao();
//        Dinheiro dinheiro = new Dinheiro();
//        Pix pix = new Pix();
//        System.out.println(cartao.pagar(100.0));
//        System.out.println(dinheiro.pagar(20.0));
//        System.out.println(pix.pagar(10.0));

//      Teste Notificacoes

        Email email = new Email();
        SMS sms = new SMS();

        System.out.println(sms.enviarMensagem("SMS"));
        System.out.println(email.enviarMensagem("Email"));




    }
}
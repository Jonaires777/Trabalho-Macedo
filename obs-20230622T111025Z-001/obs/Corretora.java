public class Corretora extends Observer {
    Acao acao;

    Corretora (Acao acao) {
       this.acao = acao;
       acao.attach(this);
    }

    void update () {
       if (acao.getValor() < 10) this.comprar();
       if (acao.getValor() > 100) this.vender();
    }

    void comprar() {
      System.out.println("Compre mais");
    }

    void vender() {
      System.out.println("Vende agora");
    }
}


class Main {
   

    public static void main (String args[]) {
        
        Acao a1 = new Acao(); // Sujeito
        Acao a2 = new Acao();
        
        Corretora c = new Corretora(a1); // Observador
        Corretora c1 = new Corretora(a1); // Observador
        Corretora c2 = new Corretora(a1); // Observador

        a1.setValor(50);
        a1.setValor(200);
        a1.setValor(1);       
        
    }
}

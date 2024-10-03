public class Program {
    public static void main(String[] args) {
        Produto produto1 = new Produto(20.0,3.0,4.0,10);
        produto1.precoFinal("ISS");
        Produto produto2 = new Produto(30.0,4.0,4.0,5);
        produto2.precoFinal("ICMS");
        Produto produto3 = new Produto(40.0,5.0,4.0,20);
        produto3.precoFinal("IPI");
        Produto produto4 = new Produto(40.0,5.0,4.0,20);
        produto4.precoFinal("");
    }
}

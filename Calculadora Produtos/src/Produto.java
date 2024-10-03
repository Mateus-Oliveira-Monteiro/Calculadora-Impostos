import java.util.Objects;

public class Produto {
    public double preco;
    public double frete;
    public double seguro;
    public int margemLucro; //porcentagem

    public Produto(double preco, double frete, double seguro, int margemLucro) {
        this.preco = preco;
        this.frete = frete;
        this.seguro = seguro;
        this.margemLucro = margemLucro;
    }

    public Produto(){};

    public void precoFinal(String imposto){
        if(Objects.equals(imposto, "IPI")){
            double impostos = (this.preco + this.frete + this.seguro) * 0.015;
            double precoTotal = (this.preco + impostos + ((this.margemLucro/100) * this.preco));
            System.out.println("Valor Total com IPI: " + precoTotal);
        }

        if(Objects.equals(imposto, "ICMS")){
            double impostos = (this.preco * 0.12);
            double precoTotal = (this.preco + impostos + ((this.margemLucro/100) * this.preco));
            System.out.println("Valor Total com ICMS: " + precoTotal);
        }

        if(Objects.equals(imposto, "ISS")){
            double impostos = (this.preco * 0.20);
            double precoTotal = (this.preco + impostos + ((this.margemLucro/100) * this.preco));
            System.out.println("Valor Total com ISS: " + precoTotal);
        }
        if(Objects.equals(imposto, "")){
            System.out.println("Selecione um Imposto!");
        }
        if(Objects.equals(imposto, " ")){
            System.out.println("Selecione um Imposto!");
        }


    }
}

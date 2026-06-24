public class ternario {
    public static void main(String[] args){
        double valor = 33.4;
        double desconto = (valor < 20.0) ? valor * 0.1 : valor * 0.05;

        System.out.println(desconto);
    }

}

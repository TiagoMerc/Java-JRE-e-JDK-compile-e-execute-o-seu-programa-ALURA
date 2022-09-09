public class TesteIR {
    public static void main(String[] args) {

        double salario = 3300.0;
       // double IR;
        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua alíquota de IR é de 7.5%");
            System.out.println("Deduzir R$142,00");
        } else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("A sua alíquota de IR é de 15%");
            System.out.println("Deduzir R$350,00");
        } else if(salario >= 3751.01 && salario >= 4664.0) {
            System.out.println("A sua alíquota de IR é de 22.5%");
            System.out.println("Deduzir R$ 636,00");

        }
    }
}

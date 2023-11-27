public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Double salario;
        Double horas;
        Double total;

        System.out.println("Informe o valor que você ganha a hora");
        salario = sc.nextDouble();

        System.out.println("Informe o valor de horas trabalhada no mes");
        horas = sc.nextDouble();

        total = salario * horas;

        System.out.println("O seu salario esse mês é de: " + total);

        sc.close();
       
    }
}

import java.util.Scanner;

public class App {
    
    // Início do Programa
    public static void main(String[] args) throws Exception {

        // Declaração de Variaveis
        double latas;
        double area;
        double custo;
        double galao;
        double custo_galao;
        double latas_galao;
        double custo_latas_galao;

        // Solicitação de Dados
        System.out.println("Informe a área em metros quadrados a ser pintada: " );
        Scanner teclado = new Scanner (System.in);
        area = teclado.nextDouble();
        teclado.close();

        // Calcular Latas Galões e Custo
        latas = Math.ceil (area / 108);
        custo = latas * 80;
        galao = Math.ceil (area / 21.6);
        custo_galao = galao * 25;
        latas_galao = Math.ceil (area / 129.6);
        custo_latas_galao = latas_galao * 105;
        
        // Informar quantas latas de 18 litros vai precisar e valor total
        System.out.println ("Você precisará de " + latas + " latas de 18 litros");
        System.out.println ("O Valor total é R$"+ custo);

        //Informar quantas latas de 3.6 litros vai precisar e valor total
        System.out.println ("Você precisará de " + galao + " galões de 3.6 litros");
        System.out.println ("O valor total é R$"+ custo_galao);

        //Informar quantos litros de tinta vai precisar misturando latas de 18 litros e galoes de 3.6 litros
        System.out.println ("Você precisará de " + latas_galao + " litros de tinta");
        System.out.println ("O valor total é R$"+ custo_latas_galao);




    }
}

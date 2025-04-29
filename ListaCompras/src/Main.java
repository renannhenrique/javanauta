import javax.swing.*;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Difinindo uma lista de Compras
        TreeMap<String, Double> listaDeCompras = new TreeMap<>();

        int contador = 0;
        int totalItensDaLista = 2;
        double valorTotalCompra = 0;

        while (contador < totalItensDaLista) {

            //Inserindo itens na minha lista de compras
            String produto = JOptionPane.showInputDialog("Digite o Produto");
            double valorDoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto Ex: 00.0"));

            //Adicionando na lista
            listaDeCompras.put(produto, valorDoProduto);

            contador++;
        }


        //Listando os produtos da lista
        System.out.println("Lista de Compras:");
        for (Map.Entry<String, Double> compras : listaDeCompras.entrySet()) {

            String nomeDoProduto = compras.getKey();
            double valorProduto = compras.getValue();

            valorTotalCompra += valorProduto;

            System.out.println("- " + nomeDoProduto + " : " + valorProduto);


        }

        System.out.println("------------------------------------------");
        System.out.println("SubTotal R$ " + String.format("%.2f", valorTotalCompra));
    }

}
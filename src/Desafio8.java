public class Desafio8 {

    public static void main(String[] args) {

        Integer quantidadeItensComprados;
        Double valorTotalCompra;

        quantidadeItensComprados = 25;
        valorTotalCompra = 100.00;

        System.out.println("\nQuantidade de itens comprados: " + quantidadeItensComprados);
        System.out.println("Valor total da compra: " + valorTotalCompra);
        System.out.println("Valor total com desconto: " + aplicarDesconto(quantidadeItensComprados, valorTotalCompra));

        quantidadeItensComprados = 15;

        System.out.println("\nQuantidade de itens comprados: " + quantidadeItensComprados);
        System.out.println("Valor total da compra: " + valorTotalCompra);
        System.out.println("Valor total com desconto: " + aplicarDesconto(quantidadeItensComprados, valorTotalCompra));

        quantidadeItensComprados = 13;

        System.out.println("\nQuantidade de itens comprados: " + quantidadeItensComprados);
        System.out.println("Valor total da compra: " + valorTotalCompra);
        System.out.println("Valor total com desconto: " + aplicarDesconto(quantidadeItensComprados, valorTotalCompra));

        quantidadeItensComprados = 10;

        System.out.println("\nQuantidade de itens comprados: " + quantidadeItensComprados);
        System.out.println("Valor total da compra: " + valorTotalCompra);
        System.out.println("Valor total com desconto: " + aplicarDesconto(quantidadeItensComprados, valorTotalCompra));

        quantidadeItensComprados = 7;

        System.out.println("\nQuantidade de itens comprados: " + quantidadeItensComprados);
        System.out.println("Valor total da compra: " + valorTotalCompra);
        System.out.println("Valor total com desconto: " + aplicarDesconto(quantidadeItensComprados, valorTotalCompra));

        quantidadeItensComprados = 5;

        System.out.println("\nQuantidade de itens comprados: " + quantidadeItensComprados);
        System.out.println("Valor total da compra: " + valorTotalCompra);
        System.out.println("Valor total com desconto: " + aplicarDesconto(quantidadeItensComprados, valorTotalCompra));

        quantidadeItensComprados = 3;

        System.out.println("\nQuantidade de itens comprados: " + quantidadeItensComprados);
        System.out.println("Valor total da compra: " + valorTotalCompra);
        System.out.println("Valor total com desconto: " + aplicarDesconto(quantidadeItensComprados, valorTotalCompra));

    }

    public static Double aplicarDesconto(Integer quantidadeItens, Double valorTotal) {

        Double valorTotalComDesconto = 0.0;

        if (quantidadeItens >= 15)
            valorTotalComDesconto = valorTotal * 0.90;
        else if (quantidadeItens >= 10)
            valorTotalComDesconto = valorTotal * 0.92;
        else if (quantidadeItens >= 5)
            valorTotalComDesconto = valorTotal * 0.95;
        else
            valorTotalComDesconto = valorTotal;

        return valorTotalComDesconto;

    }

}

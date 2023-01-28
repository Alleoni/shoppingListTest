package listacompras;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Marcus");
        Cliente c2 = new Cliente("Robson");
        Cliente c3 = new Cliente("Guilherme");

        List<Compras> compras = new ArrayList<>();

        Compras comp1 = new Compras(100, c1);
        Compras comp2 = new Compras(150, c1);
        Compras comp3 = new Compras(150, c1);
        Compras comp4 = new Compras(200, c2);
        Compras comp5 = new Compras(300, c3);
        Compras comp6 = new Compras(350, c3);

        compras.add(comp1);
        compras.add(comp2);
        compras.add(comp3);
        compras.add(comp4);
        compras.add(comp5);
        compras.add(comp6);

        int somaMarcus = 0;
        int somaRobson = 0;
        int somaGuilherme = 0;

        int qtdComprasM = 0;
        int qtdComprasR = 0;
        int qtdComprasG = 0;

        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getCliente() == c1) {
                somaMarcus += compras.get(i).getValor();
            }
        }

        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getCliente() == c2) {
                somaRobson += compras.get(i).getValor();
            }
        }
        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getCliente() == c3) {
                somaGuilherme += compras.get(i).getValor();
            }
        }

        System.out.println("O valor de compras de " + c1 + " foi de R$:" + somaMarcus);
        System.out.println("O valor de compras de " + c2 + " foi de R$:" + somaRobson);
        System.out.println("O valor de compras de " + c3 + " foi de R$:" + somaGuilherme);
        System.out.println();

        if (somaMarcus > somaRobson && somaMarcus > somaGuilherme) {
            System.out.println("O cliente que mais comprou em valores foi o " + c1);
        } else if (somaGuilherme > somaRobson && somaGuilherme > somaMarcus) {
            System.out.println("O cliente que mais comprou em valores foi o " + c3);
        } else {
            System.out.println("O cliente que mais comprou em valores foi o " + c2);
        }
        System.out.println();

        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getCliente() == c1) {
                qtdComprasM++;
            }

        }

        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getCliente() == c2) {
                qtdComprasR++;
            }

        }
        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getCliente() == c3) {
                qtdComprasG++;
            }

        }

        System.out.println("Quantidade de Compras de " + c1 + " foi de: " + qtdComprasM);
        System.out.println("Quantidade de Compras de " + c2 + " foi de: " + qtdComprasR);
        System.out.println("Quantidade de Compras de " + c3 + " foi de: " + qtdComprasG);
        System.out.println();

        if (qtdComprasM > qtdComprasR && qtdComprasM > qtdComprasG) {
            System.out.println("O cliente que teve a maior número de compras foi o " + c1);
        } else if (qtdComprasG > qtdComprasR && qtdComprasG > qtdComprasM) {
            System.out.println("O cliente que teve a maior número de compras foi o " + c3);
        } else {
            System.out.println("O cliente que teve a maior número de compras foi o " + c2);
        }

    }

}

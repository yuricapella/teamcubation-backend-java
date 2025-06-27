package poo.exercicios01_a_04;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Item> items = new ArrayList<>();

    public void adicionarItem(Item item) {
        items.add(item);
    }

    public void listarItems() {
        for(Item item : items){
            System.out.println("=================");
            System.out.printf("%s\n\n",item.getTipo());
            item.exibirDetalhes();
        }
    }

    public Item buscarItemPorTitulo(String titulo) {
        Item itemPorTitulo = null;
        for(Item item : items){
            if(item.getTitulo().equals(titulo)){
                itemPorTitulo = item;
            }
        }
        return itemPorTitulo;
    }
}

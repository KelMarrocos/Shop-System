package sistemaLoja.Test;

import sistemaLoja.Dominio.address;
import sistemaLoja.Dominio.client;
import sistemaLoja.Dominio.product;

public class system {
    public static void main(String[] args) {

        client client = new client();
        client.setName("Monkey D. Luffy");
        client.setAge(22);
        client.setId("ID12345ABC");

        address adrress = new address();
        adrress.setStreet("Ajazz 08 ");
        adrress.setPostalCode("12345-678");

        product product01 = new product("Keybord", 78.0);

        product product02 = new product("Mouse", 55.0);

        product product03 = new product("Soundbar", 155.0);

        product[] productsFull = {product01, product02, product03};

        System.out.println("----------");
        client.imprime();
        System.out.println("----------");
        adrress.imprime();
        System.out.println("----------");
        System.out.println("Products:");
        for (product p : productsFull) {
            System.out.println(p.getName() + " - $" + p.getValue());
        }
    }
}

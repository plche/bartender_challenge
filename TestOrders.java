/**
 * TestOrders
 */
public class TestOrders {

    public static void main(String[] args) {

        // Simulaciones de la aplicación
        // Elementos del menú
        Item item1 = new Item("moka", 3200.00);
        Item item2 = new Item("latte", 3600.00);
        Item item3 = new Item("café de goteo", 1200.00);
        Item item4 = new Item("capuchino", 3400.00);

        // Crea 2 pedidos para invitados no especificados (sin especificar un nombre);
        Order order1 = new Order();
        Order order2 = new Order();
        
        // Crea 3 pedidos usando el constructor sobrecargado para darle a cada uno un nombre para el pedido.
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");
        
        // Agrega al menos 2 artículos a cada uno de los pedidos usando el método addItem.
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item2);

        // Prueba los resultados y el método display llamando al método display en todos tus pedidos.
        System.out.println("\n----- Prueba resultados pedido1 -----");
        order1.display();
        System.out.println("\n----- Prueba resultados pedido2 -----");
        order2.display();
        System.out.println("\n----- Prueba resultados pedido3 -----");
        order3.display();
        System.out.println("\n----- Prueba resultados pedido4 -----");
        order4.display();
        System.out.println("\n----- Prueba resultados pedido5 -----");
        order5.display();
        
        // Prueba la funcionalidad de getStatusMessage configurando algunos pedidos para que estén listos e imprimiendo los mensajes para cada pedido.
        System.out.println("\n----- Prueba getStatusMessage pedido1 -----");
        order4.setReady(false);
        System.out.println(order4.getStatusMessage());
        System.out.println("\n----- Prueba getStatusMessage pedido2 -----");
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());
    }
}
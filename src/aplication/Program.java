package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrderStatus;

public class Program {

	

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
      Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner (System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
      
      
      
      System.out.println("Digite seu nome");
      String name = sc.next();
      System.out.println("Digite seu email");
      String email = sc.next();
      System.out.println("Digite a data do nascimento do pedido:");
      Date birthDate = sdf.parse(sc.next());
      Client client = new Client(name,email,birthDate);
      
      System.out.println();
      System.out.println("Insira os dados do pedido");
      System.out.println("Digite o status do seu pedido  PENDIGN_PAYMENT, PROCESSING,SHIPPED,DELIVERED");
      OrderStatus status = OrderStatus.valueOf(sc.next());
      Order order = new Order(new Date(), status, client);
      
      System.out.println("Quantos itens há neste pedido");
      Integer n = sc.nextInt();
      for(int i = 1;i<=n;i++) {
      System.out.println("Insira os dados do pedido #" + i);
      System.out.println();
      System.out.println("Nome do Produto");
      String productName = sc.next();
      System.out.println("Preço do produto");
      double productprice = sc.nextDouble();
      Product product = new Product (productName,productprice);
      
      System.out.println("Digite a quantidade");
      Integer quantity = sc.nextInt();
      
      OrderItem orderitem = new OrderItem(quantity,productprice,product);
      
      order.additems(orderitem);
      }
      System.out.println();
      System.out.println("RESUMO DO PEDIDO:");
      System.out.println(order);
      
      
      sc.close();

      
	}

}

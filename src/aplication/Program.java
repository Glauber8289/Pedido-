package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrderStatus;

public class Program {

	private static final String i = null;

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner (System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println("Digite seu nome");
      
      
      String name = sc.next();
      System.out.println("Digite seu email");
      String email = sc.next();
      System.out.println("Digite a data do nascimento do pedido");
      Date birthDate = sdf.parse(sc.next());
      Client client = new Client(name,email,birthDate);
      
      System.out.println();
      System.out.println("Insira os dados do pedido");
      System.out.println("Digite o status do seu pedido  PENDIGN_PAYMENT, PROCESSING,SHIPPED,DELIVERED");
      OrderStatus status = OrderStatus.valueOf(sc.next());
      Order order = new Order(birthDate, status, client, null);
      
      System.out.println("Quantos itens há neste pedido ");
      Integer n = sc.nextInt();
      for(int i = 1;i<=n;i++)
      System.out.println("Insira os dados do pedido #" + i);
      System.out.println("Nome do Produto");
      String productName = sc.next();
      System.out.println("Preço do produto");
      double productprice = sc.nextDouble();
      Product product = new Product (productName,productprice);
      
      System.out.println(" Digite a quantidade ");
      Integer quantity = sc.nextInt();
      
      OrderItem pedidos = new OrderItem(quantity,productprice,product);
      
      order.addPedido(pedidos);
      
      //instanciando objeto Pedido 
	  //Order pedido = new Order (name,email,moment,OrderStatus.valueOf(status)); 
      //pedido.addPedido(pedido);
     
      // System.out.println("Quantos itens há neste pedido ");
      // int n = sc.nextInt();
      // List<String> = new ArrayList<>();
      // for(int i=1;i<=n;i++);
     
      //System.out.println("Insira os dados do pedido #" + i);
      //  System.out.println("Nome do Produto");
      //  String productname = sc.next();
      // System.out.println("Preço do produto");
      //Double price = sc.nextDouble();
      //System.out.println("Digite a quantidade");
      //int quantidade = sc.nextInt();
      
	}

}

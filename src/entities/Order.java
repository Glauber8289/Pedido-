package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entities.Client;
import entities.Enum.OrderStatus;
import aplication.Program;

public class Order {
	 private Date moment;
	 private OrderStatus status ;
	 private Client client;
	public static final 	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ");
	 private List<OrderItem> items = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getitems() {
		return items;
	} 
		
	 public void additems (OrderItem item) {
		 items.add(item);
	 }
	 public void removeitems (OrderItem item) {
		items.remove(item);
	 }
		 
		public double total() {
	  	double sum=0.0;
	  	for(OrderItem item : items) {
	  		sum+=item.subTotal();
	  	}
	  	return sum;	
	}

		@Override
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Data da postagem do pedido: ");
			sb.append(sdf.format(moment) + "\n");
			sb.append("Status do pedido: ");
			sb.append(status + "\n");
			sb.append("Dados do cliente: ");
			sb.append(client + "\n");
			sb.append("Items incluidos no pedido:\n");
			for (OrderItem item : items) {
				sb.append(item + "\n");
			}
			sb.append("Preço total a pagar: $");
			sb.append(String.format("%.2f", total()));
			return sb.toString();
		}
		
}




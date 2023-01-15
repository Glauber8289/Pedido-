package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Enum.OrderStatus;
import aplication.Program;

public class Order {
	 private Date moment;
	 private OrderStatus status ;
	 private Client client;
	
	 private List<OrderItem> pedidos = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client, List<OrderItem> pedidos) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.pedidos = pedidos;
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

	public List<OrderItem> getpedidos() {
		return pedidos;
	}

	public void setItems(List<OrderItem>pedidos) {
		this.pedidos = pedidos;
	} 
		
	 public void addPedido (OrderItem order) {
		 pedidos.add(order);
	 }
	 public void removePedido (OrderItem order) {
		pedidos.remove(order); 
	 }
		 
		public double total() {
	  	double sum=0.0;
	  	for(OrderItem pedidos : pedidos) {
	  		sum+=pedidos.subTotal();
	  	}
	  	return sum;	
	
	}
}




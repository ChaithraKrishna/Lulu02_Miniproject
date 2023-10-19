package com.minipro2.Lulu_MS1_SportsProduct.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="sportsproduct")
public class SportsProduct {
	
	
	
		       @Id
		      int id ;
		      int cost;
		      String name ;
		      String description;
			public int getId() {
				return id;
			}
			public void setId(long id2) {
				this.id = (int) id2;
			}
			public int getCost() {
				return cost;
			}
			public void setCost(int cost) {
				this.cost = cost;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public SportsProduct(int id, int cost, String name, String description) {
				super();
				this.id = id;
				this.cost = cost;
				this.name = name;
				this.description = description;
			}
			public SportsProduct() {
				super();
				// TODO Auto-generated constructor stub
			}
		      
		      
}
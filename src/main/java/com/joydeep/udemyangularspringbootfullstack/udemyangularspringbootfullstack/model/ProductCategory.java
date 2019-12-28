package com.joydeep.udemyangularspringbootfullstack.udemyangularspringbootfullstack.model;

import java.math.BigInteger;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_CATEGORY")
public class ProductCategory 
      {
	      @Id
	      @GeneratedValue(strategy = GenerationType.IDENTITY)
	      @Column(name="ID")
          private Long id;
	      @Column(name="CATEGORY_NAME")
	      private String categoryName;
	      @OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	      private Set<Product> products;
	      
	      public ProductCategory() {}

		public ProductCategory(Long id, String categoryName, Set<Product> products) {
			super();
			this.id = id;
			this.categoryName = categoryName;
			this.products = products;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public Set<Product> getProducts() {
			return products;
		}

		public void setProducts(Set<Product> products) {
			this.products = products;
		}

		@Override
		public String toString() {
			return "ProductCategory [id=" + id + ", categoryName=" + categoryName + ", products=" + products + "]";
		}
		
	      
          
      }

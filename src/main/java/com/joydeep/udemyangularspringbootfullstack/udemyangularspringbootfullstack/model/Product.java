package com.joydeep.udemyangularspringbootfullstack.udemyangularspringbootfullstack.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "SKU")
	private String sku;
	@Column(name = "NAME")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "UNIT_PRICE")
	private BigDecimal unitPrice;
	@Column(name = "IMAGE_URL")
	private String imageUrl;
	@Column(name = "ACTIVE")
	private boolean active;
	@Column(name = "UNITS_IN_STOCK")
	private int unitsInStock;
	@Column(name = "DATE_CREATED")
	@CreationTimestamp
	private Date dateCreated;
	@Column(name = "LAST_UPDATED")
	@UpdateTimestamp
	private Date lastUpdated;
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID",nullable=false)
	private ProductCategory category;
	public Product() {}
	public Product(Long id, String sku, String name, String description, BigDecimal unitPrice, String imageUrl,
			boolean active, int unitsInStock, Date dateCreated, Date lastUpdated) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
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
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", unitPrice="
				+ unitPrice + ", imageUrl=" + imageUrl + ", active=" + active + ", unitsInStock=" + unitsInStock
				+ ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + "]";
	}
	
}

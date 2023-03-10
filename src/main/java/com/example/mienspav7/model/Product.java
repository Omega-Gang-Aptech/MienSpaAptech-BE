package com.example.mienspav7.model;
// Generated Feb 17, 2023, 1:38:16 PM by Hibernate Tools 3.6.2.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Product generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "product", catalog = "mienspa3")
public class Product implements java.io.Serializable {

	private String proId;
	private Category category;
	private String proName;
	private int proPrice;
	private String featureImgPath;
	private String proContent;
	private String proBrand;
	private Boolean proTurnOn;
	private Date createdAt;
	private Date updatedAt;
	private Boolean isDelete;
	private Set<OrdersProDetail> ordersprodetails = new HashSet<OrdersProDetail>(0);

	public Product() {
	}

	public Product(String proId, Category category, String proName, int proPrice, String proContent, String proBrand) {
		this.proId = proId;
		this.category = category;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proContent = proContent;
		this.proBrand = proBrand;
	}

	public Product(String proId, Category category, String proName, int proPrice, String featureImgPath,
			String proContent, String proBrand, Boolean proTurnOn, Date createdAt, Date updatedAt, Boolean isDelete,
			Set<OrdersProDetail> ordersprodetails) {
		this.proId = proId;
		this.category = category;
		this.proName = proName;
		this.proPrice = proPrice;
		this.featureImgPath = featureImgPath;
		this.proContent = proContent;
		this.proBrand = proBrand;
		this.proTurnOn = proTurnOn;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.isDelete = isDelete;
		this.ordersprodetails = ordersprodetails;
	}

	@Id

	@Column(name = "pro_id", unique = true, nullable = false, length = 128)
	public String getProId() {
		return this.proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Column(name = "pro_name", nullable = false)
	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	@Column(name = "pro_price", nullable = false)
	public int getProPrice() {
		return this.proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	@Column(name = "feature_img_path")
	public String getFeatureImgPath() {
		return this.featureImgPath;
	}

	public void setFeatureImgPath(String featureImgPath) {
		this.featureImgPath = featureImgPath;
	}

	@Column(name = "pro_content", nullable = false)
	public String getProContent() {
		return this.proContent;
	}

	public void setProContent(String proContent) {
		this.proContent = proContent;
	}

	@Column(name = "pro_brand", nullable = false)
	public String getProBrand() {
		return this.proBrand;
	}

	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}

	@Column(name = "pro_turn_on")
	public Boolean getProTurnOn() {
		return this.proTurnOn;
	}

	public void setProTurnOn(Boolean proTurnOn) {
		this.proTurnOn = proTurnOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "isDelete")
	public Boolean getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<OrdersProDetail> getOrdersprodetails() {
		return this.ordersprodetails;
	}

	public void setOrdersprodetails(Set<OrdersProDetail> ordersprodetails) {
		this.ordersprodetails = ordersprodetails;
	}

}

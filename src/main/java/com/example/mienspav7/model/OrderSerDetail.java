package com.example.mienspav7.model;
// Generated Feb 17, 2023, 1:38:16 PM by Hibernate Tools 3.6.2.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orderserdetail generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "orderserdetail", catalog = "mienspa3")
public class OrderSerDetail implements java.io.Serializable {

	private Integer ordSerId;
	private Serce serce;
	private OrdersSer ordersser;

	public OrderSerDetail() {
	}

	public OrderSerDetail(Serce serce, OrdersSer ordersser) {
		this.serce = serce;
		this.ordersser = ordersser;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ordSer_Id", unique = true, nullable = false)
	public Integer getOrdSerId() {
		return this.ordSerId;
	}

	public void setOrdSerId(Integer ordSerId) {
		this.ordSerId = ordSerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ordSer_ServiceId", nullable = false)
	public Serce getSerce() {
		return this.serce;
	}

	public void setSerce(Serce serce) {
		this.serce = serce;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ordSer_OrderId", nullable = false)
	public OrdersSer getOrdersser() {
		return this.ordersser;
	}

	public void setOrdersser(OrdersSer ordersser) {
		this.ordersser = ordersser;
	}

}

package com.example.mienspav7.model;
// Generated Feb 17, 2023, 1:38:16 PM by Hibernate Tools 3.6.2.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Shopinfo generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "shopinfo", catalog = "mienspa3")
public class ShopInfo implements java.io.Serializable {

	private String shiId;
	private String shiName;
	private String shiAddress;
	private String shiPhoneNo;
	private String shiBossName;
	private String shiLogoImage;
	private String shiNote;
	private Date createdAt;
	private Date updatedAt;
	private Boolean isDelete;

	public ShopInfo() {
	}

	public ShopInfo(String shiId, String shiName, String shiAddress, String shiPhoneNo, String shiBossName,
			String shiLogoImage) {
		this.shiId = shiId;
		this.shiName = shiName;
		this.shiAddress = shiAddress;
		this.shiPhoneNo = shiPhoneNo;
		this.shiBossName = shiBossName;
		this.shiLogoImage = shiLogoImage;
	}

	public ShopInfo(String shiId, String shiName, String shiAddress, String shiPhoneNo, String shiBossName,
			String shiLogoImage, String shiNote, Date createdAt, Date updatedAt, Boolean isDelete) {
		this.shiId = shiId;
		this.shiName = shiName;
		this.shiAddress = shiAddress;
		this.shiPhoneNo = shiPhoneNo;
		this.shiBossName = shiBossName;
		this.shiLogoImage = shiLogoImage;
		this.shiNote = shiNote;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.isDelete = isDelete;
	}

	@Id

	@Column(name = "shi_Id", unique = true, nullable = false, length = 128)
	public String getShiId() {
		return this.shiId;
	}

	public void setShiId(String shiId) {
		this.shiId = shiId;
	}

	@Column(name = "shi_Name", nullable = false, length = 65535)
	public String getShiName() {
		return this.shiName;
	}

	public void setShiName(String shiName) {
		this.shiName = shiName;
	}

	@Column(name = "shi_Address", nullable = false, length = 250)
	public String getShiAddress() {
		return this.shiAddress;
	}

	public void setShiAddress(String shiAddress) {
		this.shiAddress = shiAddress;
	}

	@Column(name = "shi_PhoneNo", nullable = false, length = 15)
	public String getShiPhoneNo() {
		return this.shiPhoneNo;
	}

	public void setShiPhoneNo(String shiPhoneNo) {
		this.shiPhoneNo = shiPhoneNo;
	}

	@Column(name = "shi_BossName", nullable = false, length = 65535)
	public String getShiBossName() {
		return this.shiBossName;
	}

	public void setShiBossName(String shiBossName) {
		this.shiBossName = shiBossName;
	}

	@Column(name = "shi_LogoImage", nullable = false, length = 250)
	public String getShiLogoImage() {
		return this.shiLogoImage;
	}

	public void setShiLogoImage(String shiLogoImage) {
		this.shiLogoImage = shiLogoImage;
	}

	@Column(name = "shi_Note", length = 65535)
	public String getShiNote() {
		return this.shiNote;
	}

	public void setShiNote(String shiNote) {
		this.shiNote = shiNote;
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

}

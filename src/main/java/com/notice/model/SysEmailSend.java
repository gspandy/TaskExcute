package com.notice.model;

import java.math.BigDecimal;
import java.util.Date;

public class SysEmailSend {

	private String SH_SEND_MAIL;
	private String COMMENT1;
	
	public String getSH_SEND_MAIL() {
		return SH_SEND_MAIL;
	}

	public void setSH_SEND_MAIL(String sH_SEND_MAIL) {
		SH_SEND_MAIL = sH_SEND_MAIL;
	}

	public String getCOMMENT1() {
		return COMMENT1;
	}

	public void setCOMMENT1(String cOMMENT1) {
		COMMENT1 = cOMMENT1;
	}

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.EMAIL_ID
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private BigDecimal EMAIL_ID;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.BIZ_ID
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private BigDecimal BIZ_ID;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.MODULE_CODE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String MODULE_CODE;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.TYPE_CODE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String TYPE_CODE;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.TITLE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String TITLE;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.RECIPIENTS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String RECIPIENTS;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.CARBON_COPYS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String CARBON_COPYS;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.BLIND_CARBON_COPYS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String BLIND_CARBON_COPYS;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.ATTACH_FILE_NAME
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String ATTACH_FILE_NAME;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.CREATED_BY
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String CREATED_BY;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.CREATION_DATE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private Date CREATION_DATE;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.LAST_UPDATE_DATE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private Date LAST_UPDATE_DATE;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.LAST_UPDATED_BY
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String LAST_UPDATED_BY;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.TRY_TIME
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private BigDecimal TRY_TIME;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.TIMESTAMP
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private BigDecimal TIMESTAMP;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_EMAIL_SEND.CONTENT
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	private String CONTENT;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.EMAIL_ID
	 * @return  the value of SYS_EMAIL_SEND.EMAIL_ID
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public BigDecimal getEMAIL_ID() {
		return EMAIL_ID;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.EMAIL_ID
	 * @param EMAIL_ID  the value for SYS_EMAIL_SEND.EMAIL_ID
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setEMAIL_ID(BigDecimal EMAIL_ID) {
		this.EMAIL_ID = EMAIL_ID;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.BIZ_ID
	 * @return  the value of SYS_EMAIL_SEND.BIZ_ID
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public BigDecimal getBIZ_ID() {
		return BIZ_ID;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.BIZ_ID
	 * @param BIZ_ID  the value for SYS_EMAIL_SEND.BIZ_ID
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setBIZ_ID(BigDecimal BIZ_ID) {
		this.BIZ_ID = BIZ_ID;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.MODULE_CODE
	 * @return  the value of SYS_EMAIL_SEND.MODULE_CODE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getMODULE_CODE() {
		return MODULE_CODE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.MODULE_CODE
	 * @param MODULE_CODE  the value for SYS_EMAIL_SEND.MODULE_CODE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setMODULE_CODE(String MODULE_CODE) {
		this.MODULE_CODE = MODULE_CODE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.TYPE_CODE
	 * @return  the value of SYS_EMAIL_SEND.TYPE_CODE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getTYPE_CODE() {
		return TYPE_CODE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.TYPE_CODE
	 * @param TYPE_CODE  the value for SYS_EMAIL_SEND.TYPE_CODE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setTYPE_CODE(String TYPE_CODE) {
		this.TYPE_CODE = TYPE_CODE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.TITLE
	 * @return  the value of SYS_EMAIL_SEND.TITLE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getTITLE() {
		return TITLE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.TITLE
	 * @param TITLE  the value for SYS_EMAIL_SEND.TITLE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.RECIPIENTS
	 * @return  the value of SYS_EMAIL_SEND.RECIPIENTS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getRECIPIENTS() {
		return RECIPIENTS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.RECIPIENTS
	 * @param RECIPIENTS  the value for SYS_EMAIL_SEND.RECIPIENTS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setRECIPIENTS(String RECIPIENTS) {
		this.RECIPIENTS = RECIPIENTS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.CARBON_COPYS
	 * @return  the value of SYS_EMAIL_SEND.CARBON_COPYS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getCARBON_COPYS() {
		return CARBON_COPYS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.CARBON_COPYS
	 * @param CARBON_COPYS  the value for SYS_EMAIL_SEND.CARBON_COPYS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setCARBON_COPYS(String CARBON_COPYS) {
		this.CARBON_COPYS = CARBON_COPYS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.BLIND_CARBON_COPYS
	 * @return  the value of SYS_EMAIL_SEND.BLIND_CARBON_COPYS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getBLIND_CARBON_COPYS() {
		return BLIND_CARBON_COPYS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.BLIND_CARBON_COPYS
	 * @param BLIND_CARBON_COPYS  the value for SYS_EMAIL_SEND.BLIND_CARBON_COPYS
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setBLIND_CARBON_COPYS(String BLIND_CARBON_COPYS) {
		this.BLIND_CARBON_COPYS = BLIND_CARBON_COPYS;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.ATTACH_FILE_NAME
	 * @return  the value of SYS_EMAIL_SEND.ATTACH_FILE_NAME
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getATTACH_FILE_NAME() {
		return ATTACH_FILE_NAME;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.ATTACH_FILE_NAME
	 * @param ATTACH_FILE_NAME  the value for SYS_EMAIL_SEND.ATTACH_FILE_NAME
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setATTACH_FILE_NAME(String ATTACH_FILE_NAME) {
		this.ATTACH_FILE_NAME = ATTACH_FILE_NAME;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.CREATED_BY
	 * @return  the value of SYS_EMAIL_SEND.CREATED_BY
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getCREATED_BY() {
		return CREATED_BY;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.CREATED_BY
	 * @param CREATED_BY  the value for SYS_EMAIL_SEND.CREATED_BY
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setCREATED_BY(String CREATED_BY) {
		this.CREATED_BY = CREATED_BY;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.CREATION_DATE
	 * @return  the value of SYS_EMAIL_SEND.CREATION_DATE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public Date getCREATION_DATE() {
		return CREATION_DATE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.CREATION_DATE
	 * @param CREATION_DATE  the value for SYS_EMAIL_SEND.CREATION_DATE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setCREATION_DATE(Date CREATION_DATE) {
		this.CREATION_DATE = CREATION_DATE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.LAST_UPDATE_DATE
	 * @return  the value of SYS_EMAIL_SEND.LAST_UPDATE_DATE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public Date getLAST_UPDATE_DATE() {
		return LAST_UPDATE_DATE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.LAST_UPDATE_DATE
	 * @param LAST_UPDATE_DATE  the value for SYS_EMAIL_SEND.LAST_UPDATE_DATE
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setLAST_UPDATE_DATE(Date LAST_UPDATE_DATE) {
		this.LAST_UPDATE_DATE = LAST_UPDATE_DATE;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.LAST_UPDATED_BY
	 * @return  the value of SYS_EMAIL_SEND.LAST_UPDATED_BY
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getLAST_UPDATED_BY() {
		return LAST_UPDATED_BY;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.LAST_UPDATED_BY
	 * @param LAST_UPDATED_BY  the value for SYS_EMAIL_SEND.LAST_UPDATED_BY
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setLAST_UPDATED_BY(String LAST_UPDATED_BY) {
		this.LAST_UPDATED_BY = LAST_UPDATED_BY;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.TRY_TIME
	 * @return  the value of SYS_EMAIL_SEND.TRY_TIME
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public BigDecimal getTRY_TIME() {
		return TRY_TIME;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.TRY_TIME
	 * @param TRY_TIME  the value for SYS_EMAIL_SEND.TRY_TIME
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setTRY_TIME(BigDecimal TRY_TIME) {
		this.TRY_TIME = TRY_TIME;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.TIMESTAMP
	 * @return  the value of SYS_EMAIL_SEND.TIMESTAMP
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public BigDecimal getTIMESTAMP() {
		return TIMESTAMP;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.TIMESTAMP
	 * @param TIMESTAMP  the value for SYS_EMAIL_SEND.TIMESTAMP
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setTIMESTAMP(BigDecimal TIMESTAMP) {
		this.TIMESTAMP = TIMESTAMP;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_EMAIL_SEND.CONTENT
	 * @return  the value of SYS_EMAIL_SEND.CONTENT
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public String getCONTENT() {
		return CONTENT;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_EMAIL_SEND.CONTENT
	 * @param CONTENT  the value for SYS_EMAIL_SEND.CONTENT
	 * @abatorgenerated  Fri May 24 18:29:54 CST 2013
	 */
	public void setCONTENT(String CONTENT) {
		this.CONTENT = CONTENT;
	}
}
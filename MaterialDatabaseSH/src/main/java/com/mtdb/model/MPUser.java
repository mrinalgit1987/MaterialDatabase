/**
 * 
 */
package com.mtdb.model;


/**
 * @author bk6787
 *
 */
public class MPUser 
{
	private String tnumber;
	private String firstName;
	private String lastName;
	private String securityLevel;
	private String emailAddress;
	private String status;    
	private String comments; 
	private String telephoneNumber;
	private String standardsOffice;
	private String location;
	private String WireKeySessionId;
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the securityLevel
	 */
	public String getSecurityLevel() {
		return securityLevel;
	}
	/**
	 * @param securityLevel the securityLevel to set
	 */
	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}
	/**
	 * @return the standardsOffice
	 */
	public String getStandardsOffice() {
		return standardsOffice;
	}
	/**
	 * @param standardsOffice the standardsOffice to set
	 */
	public void setStandardsOffice(String standardsOffice) {
		this.standardsOffice = standardsOffice;
	}
	/**
	 * @return the telephoneNumber
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	/**
	 * @param telephoneNumber the telephoneNumber to set
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	/**
	 * @return the wireKeySessionId
	 */
	public String getWireKeySessionId() {
		return WireKeySessionId;
	}
	/**
	 * @param wireKeySessionId the wireKeySessionId to set
	 */
	public void setWireKeySessionId(String wireKeySessionId) {
		WireKeySessionId = wireKeySessionId;
	}
	/**
	 * @return the tnumber
	 */
	public String getTnumber() {
		return tnumber;
	}
	/**
	 * @param tnumber the tnumber to set
	 */
	public void setTnumber(String tnumber) {
		this.tnumber = tnumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments()
	{
		return comments;
	}
	public void setComments(String comments)
	{
		this.comments = comments;
	}
}

/* 
 * $Id: ContractEmployee.java mminella $
 * $Revision:  $
 * $Author: mminella $
 * $Date:  $
 * Copyright (c) 2010 Trustwave Holdings, Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information
 * of Trustwave Holdings, Inc.  Use of this software is governed by
 * the terms and conditions of the license statement and limited
 * warranty furnished with the software.
 *
 * IN PARTICULAR, YOU WILL INDEMNIFY AND HOLD TRUSTWAVE HOLDINGS INC.,
 * ITS RELATED COMPANIES AND ITS SUPPLIERS, HARMLESS FROM AND AGAINST
 * ANY CLAIMS OR LIABILITIES ARISING OUT OF OR RESULTING FROM THE USE,
 * MODIFICATION, OR DISTRIBUTION OF PROGRAMS OR FILES CREATED FROM,
 * BASED ON, AND/OR DERIVED FROM THIS SOURCE CODE FILE.
 */
package edu.depaul.hibernate.domain;

/**
 * @author mminella
 *
 */
public class ContractEmployee extends Employee {
	
	private String company;
	private double dailyRate;
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the dailyRate
	 */
	public double getDailyRate() {
		return dailyRate;
	}
	/**
	 * @param dailyRate the dailyRate to set
	 */
	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}
	
	

}

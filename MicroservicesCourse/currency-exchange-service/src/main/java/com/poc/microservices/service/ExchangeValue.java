package com.poc.microservices.service;

import java.math.BigDecimal;

public class ExchangeValue {
	
	BigDecimal exchangeValue;
	String from;
	String to;
	int port;

	public ExchangeValue(BigDecimal exchangeValue,String from, String to,int port) {
		super();
		this.exchangeValue = exchangeValue;
		this.from=from;
		this.to=to;
		this.port=port;
		
		System.out.println("From value:"+" "+from);
		System.out.println("To value:"+" "+to);
		
		if (from.equals("EUR") && to.equals("INR")) {
			setExchangeValue(BigDecimal.valueOf(65));
			
		}
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public BigDecimal getExchangeValue() {
		return exchangeValue;
	}

	public void setExchangeValue(BigDecimal exchangeValue) {
		this.exchangeValue = exchangeValue;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}

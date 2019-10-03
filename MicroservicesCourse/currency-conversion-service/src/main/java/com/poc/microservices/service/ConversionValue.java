package com.poc.microservices.service;

import java.math.BigDecimal;

public class ConversionValue {
	BigDecimal quantity;
	String from;
	String to;
	BigDecimal conversionMultiple;
	BigDecimal convertedValue;
	
	public ConversionValue() {

	}

	public ConversionValue(BigDecimal quantity, String from, String to,	BigDecimal conversionMultiple,
	BigDecimal convertedValue) {
		super();
		this.quantity = quantity;
		this.from = from;
		this.to = to;
		this.conversionMultiple=conversionMultiple;
		this.convertedValue=convertedValue;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
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

package org.demo.hexexcel;

public class HexDecimalDTO {

	String hexNumber1;
	String number1;
	String hexNumber2;
	String number2;
	
	public HexDecimalDTO(String hexNumber1, String number1, String hexNumber2, String number2) {
		super();
		this.hexNumber1 = hexNumber1;
		this.number1 = number1;
		this.hexNumber2 = hexNumber2;
		this.number2 = number2;
	}
	
	public String getHexNumber1() {
		return hexNumber1;
	}
	public void setHexNumber1(String hexNumber1) {
		this.hexNumber1 = hexNumber1;
	}
	public String getNumber1() {
		return number1;
	}
	public void setNumber1(String number1) {
		this.number1 = number1;
	}
	public String getHexNumber2() {
		return hexNumber2;
	}
	public void setHexNumber2(String hexNumber2) {
		this.hexNumber2 = hexNumber2;
	}
	public String getNumber2() {
		return number2;
	}
	public void setNumber2(String number2) {
		this.number2 = number2;
	}

	
}

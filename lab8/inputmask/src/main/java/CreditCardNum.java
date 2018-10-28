/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {
	private IKeyEventHandler nextHandler;
	private String number = "";
	private String initial_Content= "";
	private int length;
	private IDecoratorDisplay iDecoratorDisplay = new DecoratorCardNum();

	public CreditCardNum(int length) {
		this.length = length;
		setInitialContent(this.length);
	}

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (number.length() == 0) {
			return iDecoratorDisplay.display(initial_Content);
		} else {
			return iDecoratorDisplay.display(number);
		}
	}

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ) {
			if (ch.equals("X") || ch.equals("Delete")) {
				number = number.substring(0, number.length()-1);
			} else {
				number += ch ;
			}
		}
		else if (nextHandler != null)
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

	private void setInitialContent(int length) {
		for (int i =0; i < length; i++) {
			this.initial_Content += "4";
		}
	}
}
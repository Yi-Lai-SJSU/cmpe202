/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String number = "";

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		String out = "[";
		if (number.equals("")) {
			return "[4444 4444 4444 4444]" + "  ";
		} else {
			int sections = (number.length() -1 ) / 4;
			for (int i = 0; i < sections + 1 ; i++) {
				if (number.length() > (i + 1) * 4) {
					out += number.substring(i * 4, (i + 1) * 4) + " ";
				} else {
					out += number.substring(i*4);
				}
			}
			out += "]" + "  ";
			return out;
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

}
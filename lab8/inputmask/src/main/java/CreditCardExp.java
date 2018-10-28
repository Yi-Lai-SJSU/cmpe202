/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{
	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private String initial_date = "MMYY";
	private IDecoratorDisplay iDecoratorDisplay = new DecoratorCardExp();

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
    	if (date.length() == 0) {
    		return iDecoratorDisplay.display(initial_date);
		} else {
    		if(date.length() == 4) {
    			if(!isInvalid()) {
    				date =  "----";
				}
			}
			return iDecoratorDisplay.display(date);
		}
	}	

	public void key(String ch, int cnt) {
		if (cnt >= 17 && cnt <= 20) {
			if (ch.equals("X") || ch.equals("Delete")) {
				date = date.substring(0, date.length() - 1);
			} else {
				date += ch;
			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	public boolean isInvalid() {
    	try{
    		int month = Integer.parseInt(date.substring(0,2));
			if ( month <= 12 ) {
				return true;
			} else {
				return false;
			}
		} catch (NumberFormatException err) {
    		return false;
		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
}
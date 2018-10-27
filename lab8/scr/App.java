/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if(ch.equals("X") || ch.equals("Delete")) {
            if (count > 0) {
                screen.key(ch, count);
                count--;
            }
        } else {
            if (count < 23) {
                try {
                    int ch_Num = Integer.parseInt(ch);
                    if (ch_Num >= 0 && ch_Num <= 9) {
                        count++;
                        screen.key(ch, count);
                    } else {
                        System.out.println("Invalid input. Please input 0-9");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.Please input 0-9");
                }
            }
        }
    }
}


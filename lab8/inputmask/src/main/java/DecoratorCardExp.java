public class DecoratorCardExp implements IDecoratorDisplay {

    public String display(String content) {
        int section = (content.length()-1)/2;
        switch (section) {
            case 0: return "[" + content + "]" + "  " ;
            default: return "[" + content.substring(0, 2) + "/" + content.substring(2) + "]" + "  " ;
        }
    }

}

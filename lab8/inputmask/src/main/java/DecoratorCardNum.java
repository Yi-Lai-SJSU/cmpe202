public class DecoratorCardNum implements  IDecoratorDisplay {

    public String display(String content) {
        String out = "[";

        int sections = (content.length() - 1) / 4;

        for (int i = 0; i < sections + 1; i++) {
            if (content.length() > (i + 1) * 4) {
                out += content.substring(i * 4, (i + 1) * 4) + " ";
            } else {
                out += content.substring(i * 4);
            }
        }
        out += "]" + "  ";
        return out;
    }
}
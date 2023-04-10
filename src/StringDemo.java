public class StringDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome to Java");
        System.out.println(sb.append(" and Python"));
        System.out.println(sb.replace(11,15,"JavaScript"));
        System.out.println(sb.insert(11,"HTML, "));
    }
}

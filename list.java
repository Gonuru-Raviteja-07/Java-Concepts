import java.util.LinkedList;

class list{
    public static void main(String[] args) {
        LinkedList<String> line=new LinkedList<>();
        line.addFirst("My");
        line.add("name");
        line.add("is");
        line.add("RAVI");

        System.out.println(line);

        line.get(2);
        System.out.println(line.get(3));
    }
}
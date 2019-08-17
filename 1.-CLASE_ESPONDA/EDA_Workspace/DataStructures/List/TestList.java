package List;

public class TestList{
    public static void main(String[] args) {
        List<Integer> list1 = new List<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println("Lista inicial:");
        System.out.println("\t" + list1.toString());

        list1.invRvLink();

        System.out.println("Lista invertida de enlaces:");

        System.out.println("\t" + list1.toString());

        list1.invRvElement();

        System.out.println("Lista invertida por elementos:");

        System.out.println("\t" + list1.toString());

        System.out.println("Elemetos recursivo: " + list1.sizeRv());

        System.out.println("Borra [2] de la lista: " + list1.deleteElementRv(2));

        System.out.println("\t" + list1.toString());

    }
}
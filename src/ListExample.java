import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = getList(sc);

        int countQueries=sc.nextInt();
        List<Integer> proccessedList = processQueries(sc, countQueries, list);

        String str=proccessedList.toString();
        String listToString=proccessedList.toString()
                .substring(1,str.length()-1).
                replace(",","");

        System.out.println(listToString);
    }

    public static List<Integer> processQueries(Scanner sc, int queryCount, List<Integer> myList) {
        for (int i = 0; i < queryCount; i++) {
            switch (sc.next()) {
                case "Insert" -> {
                    int index = sc.nextInt();
                    int element = sc.nextInt();
                    myList.add(index, element);
                }
                case "Delete" -> {
                    int index = sc.nextInt();
                    myList.remove(index);
                }
                default -> throw new RuntimeException("There is no such queries");
            }
        }
        return myList;
    }

    public static List<Integer> getList(Scanner sc) {
        int size = sc.nextInt();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            myList.add(sc.nextInt());
        }
        return myList;
    }
}

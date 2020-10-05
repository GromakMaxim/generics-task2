import java.util.ArrayList;

public class Main {
    public static void main(String a[]) {
        // параметризируем класс типом String для ключа и значения
        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);

        /*ArrayList<Box<String, Integer>> list1 = new ArrayList<>();
            Созданный arraylist принимает пару String, Integer.
            Ошибка возникает при попытке добавить в такой arraylist экземпляр Box с неподходящими аргументами
        list1.add(sample1);//пытаемся добавить String, String -- ошибка
        list1.add(sample2);// пытаемся добавить Integer, Boolean -- ошибка
        */

        ArrayList<Box<String, String>> list1 = new ArrayList<>();//изменим аргументы на <Box<String, String>>
        list1.add(sample1);
        ArrayList<Box<Integer, Boolean>> list2 = new ArrayList<>();//изменим аргументы на <Box<Integer, Boolean>>
        list2.add(sample2);
    }
}
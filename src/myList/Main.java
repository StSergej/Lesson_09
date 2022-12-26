package myList;
/*  Создайте класс MyList. Реализуйте в простейшем приближении возможность использования его экземпляра
    аналогично экземпляру класса List. Минимально требуемый интерфейс взаимодействия с экземпляром,
    должен включать метод добавления элемента, индексатор для получения значения элемента по указанному индексу
    и свойство только для чтения для получения общего количества элементов.
 */

import java.util.ArrayList;
import java.util.List;

class MyList <T> {
    List<T> myList = new ArrayList<>();

    public void addMethod(T arg) {
        myList.add(arg);
    }
    public T indexMethod(int index){
        return  myList.get(index);
    }
    public int sizeMethod(){
        return myList.size();
    }
}

public class Main {
    public static void main(String[] args) {

        MyList<String> stringMyList = new MyList<>();

        stringMyList.myList.add("Игорь");
        stringMyList.myList.add("Роман");
        stringMyList.myList.add("Ирина");
        stringMyList.myList.add("Петр");
        System.out.println(stringMyList.myList);

        stringMyList.addMethod("Anna");
        System.out.println("Добавление элемента: ");
        System.out.println(stringMyList.myList);

        System.out.print("Элемент по указанному индексу: ");
        System.out.println(stringMyList.indexMethod(2));

        System.out.print("Общее количество элементов: ");
        System.out.println(stringMyList.sizeMethod());

        System.out.println("-----------------------");

        MyList<Integer> integerMyList = new MyList<>();

        integerMyList.myList.add(5);
        integerMyList.myList.add(-8);
        integerMyList.myList.add(33);
        integerMyList.myList.add(79);
        System.out.println(integerMyList.myList);

        integerMyList.addMethod(-56);
        System.out.println("Добавление элемента: ");
        System.out.println(integerMyList.myList);

        System.out.print("Элемент по указанному индексу: ");
        System.out.println(integerMyList.myList.get(3));

        System.out.print("Общее количество элементов: ");
        System.out.println(integerMyList.sizeMethod());

    }
}

package myDictionary;
/*  Создайте класс MyDictionary. Реализуйте в простейшем приближении возможность использования его экземпляра.
    Минимально требуемый интерфейс взаимодействия с экземпляром, должен включать метод добавления пар элементов,
    индексатор для получения значения элемента по указанному индексу и свойство только для чтения для получения
    общего количества пар элементов.
 */

import java.util.LinkedHashMap;
import java.util.Map;

class MyDictionary<K, V>{

    Map<K,V> dictionary = new LinkedHashMap<>();

    public void addMethod(K key, V val){
        dictionary.put(key, val);
    }
    public V getMethod(K key){
        return dictionary.get(key);
    }
    public int sizeMethod(){
        return dictionary.size();
    }
}

public class Main {
    public static void main(String[] args) {

        MyDictionary<Integer, String> parameters = new MyDictionary<>();
        parameters.dictionary.put(1991, "Лена");
        parameters.dictionary.put(1987, "Борис");
        parameters.dictionary.put(1971, "Катя");
        parameters.dictionary.put(1994, "Олег");
        System.out.println(parameters.dictionary);

        parameters.addMethod(1997, "Виктор");
        System.out.println("Добавление элемента: ");
        System.out.println(parameters.dictionary);

        System.out.print("Элемент по указанному ключу: ");
        System.out.println(parameters.getMethod(1971));

        System.out.print("Общее количество элементов: ");
        System.out.println(parameters.sizeMethod());

    }
}

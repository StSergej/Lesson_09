package myClass;
/*  Создайте класс MyClass, содержащий статический фабричный метод - T factoryMethod(),
    который будет порождать экземпляры типа, указанного в качестве параметра типа
    (указателя места заполнения типом – Т).
 */

public class MyClass {

    static <T> void factoryMethod(T arg){
        System.out.println(arg);
    }

    public static void main(String[] args) {

        String var1 = "Hello Java";
        Integer var2 = 54321;
        Double var3 = 123.456;

        MyClass.factoryMethod(var1);
        MyClass.factoryMethod(var2);
        MyClass.factoryMethod(var3);

    }
}
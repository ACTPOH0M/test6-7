package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        //типы данных
        String str = "Hello";
        int num = 10;
        int symma = 0;
        System.out.println(num +" "+str);

        //массивы и условия
        if (num!=10)
            System.out.println("Num неравен 10");
        else
        {
            for (int i=0;i<num;i++)
                symma+=i*num;

            System.out.println(symma);
        }

        int[] mass= new int[10];
        for (int i =0;i<mass.length;i++)
            mass[i]=i;
        //вложенные классы
        FirstClass firstClass = new FirstClass("Sasha",20);
        firstClass.displayInfo();

        //исключение
        try {
            System.out.println(mass[100]);
        }catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }

        //обобщение
        Point<Double> pt = new Point<>();
        Point<Integer> pd = new Point<>();
        pt.x=2.1;
        pt.y=2.1;
        System.out.println(pt.x + " "+pt.y);
        pd.y=1;
        pd.x=2;
        System.out.println(pd.x +" "+pd.y);

        //перечисление enum
        Days days = Days.Monday;
        System.out.println(days);
        Days day = Days.Friday;
        System.out.println(day);

        //обертка
        Integer x = new Integer(123);
        System.out.println(x.getClass());

        //optional class защита от null point
        Optional<String> option = get();
        if (Optional.empty().isPresent()) // isPresent если не empty выводит
            System.out.println(option.get());

    }
    static Optional<String> get()
    {
        if (false)
            return Optional.of("Hi");
        return Optional.empty();
    }
}

enum Days
{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday ,
    Saturday,
    Sunday;
}
class Point<T>
{
    public T x,y;
}
class FirstClass
{
    String name;
    int age;

    //construct
    FirstClass(String name, int age) {
        this.name=name;
        this.age =age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
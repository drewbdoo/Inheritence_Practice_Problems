import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ///ABC Problems
//        //ABC Part 1
//        A a = new A();
//        B b = new B();
//        C c = new C();
//
//        a.a();
//        b.b();
//        c.c();

//        //ABC Part 2
//        C c = new C();
//
//        c.a();
//        c.b();
//        c.c();
//
//
////        Person problem
////        Person part 1
//        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//        System.out.println(ada);
//        System.out.println(esko);

//        //Person part 2
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        System.out.println("Study credits " + ollie.credits());
//        ollie.study();
//        System.out.println("Study credits "+ ollie.credits());

//        //Person part 3
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        ollie.study();
//        System.out.println(ollie);

//        //Person part 4
//        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//        System.out.println(ada);
//        System.out.println(esko);
//
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//
//        int i = 0;
//        while (i < 25) {
//            ollie.study();
//            i = i + 1;
//        }
//        System.out.println(ollie);

//        //Person part 5
//        ArrayList<Person> persons = new ArrayList<Person>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//
//        printPersons(persons);

//        //Warehouse part 1
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName());
//        System.out.println(juice);

//        //Warehouse part 2
//        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
//        juice.addToWarehouse(1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);

//        //Warehouse part 5
//        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3
//        System.out.println(juice.history()); // [1000.0]

//        //Warehouse part 6
//        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
//        juice.takeFromWarehouse(11.3);
//        System.out.println(juice.getName()); // Juice
//        juice.addToWarehouse(1.0);
//        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3
//        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
//

        //Warehouse part 7
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();


























    }

    private static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}

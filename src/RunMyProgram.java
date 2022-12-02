public class RunMyProgram {
    public static void main(String[] args) {
        Avatar joker = new Avatar();
        joker.print();

        Avatar batman = new Avatar();
        batman.power = "fly";
        batman.role = "hero";
        batman.weakness = "his parents";
        batman.print();

        Avatar flash = new Avatar();
        flash.power = "speed";
        flash.role = "hero";
        flash.weakness = "ice";
        flash.print();

        Avatar starfire = new Avatar(330, 200, 15, 20, 170, 300, "startbolt blast", "hero", "too many power");

        starfire.print();

        Avatar Spiderman = new Avatar (300, 150, 10, 20, 150, 250, "spider web shooting", "hero", "Ethyl chloride");

        Spiderman.print();


//        Sport s = new Sport(100, 2,"volley ball");
//
//        s.print();
//
//        Sport w = new Sport(50, 33, "gre");
//        w.print();
//
//        System.out.println("hello world");
//        City beijing = new City();
//        beijing.name= "beijing";
//        beijing.pop = 21500000;
//        beijing.aveTemp = 65;
//        beijing.continent = "Asia";
//        beijing.print();
//
//        City Wonderland = new City();
//        Wonderland.name = "Wonderland";
//        Wonderland.pop = 617386977;
//        Wonderland.aveTemp = 617;
//        Wonderland.continent = "Starworld";
//        Wonderland.print();
//
//        City Chicago = new City();
//        Chicago.print();
//        Chicago.name = "Chicago";
//        Chicago.pop = 10;
//        Chicago.aveTemp = 4;
//        Chicago.continent = "Europe";
//        Chicago.print();
//
//        Sport Basketball = new Sport();
//        Basketball.name = "Basketball";
//        Basketball.pos = 5;
//        Basketball.season = "winter";
//        Basketball.avefans = 100000;
//        Basketball.print();
//
//
//        Student Tyrone = new Student();
//        Tyrone.age=17;
//        Tyrone.name = "Tyrone";
//        Tyrone.grade =10;
//        Tyrone.isBorder = false;
//        Tyrone.print();
//          Tyrone.sport = "pingpong";
//
//        Tyrone.isBorder = true;
//        Tyrone.name = "TyTy";
//        Tyrone.print();


//        Student Tyreek = new Student();
//        Tyreek.print();
//        Tyreek.age=19;
//        Tyreek.name = "Tyrone";
//        Tyreek.grade =12;
//        Tyreek.isBorder = true;
//        Tyreek.print();
//        System.out.println(Tyrone.age);
//        System.out.println(Tyrone.name);
//        System.out.println(Tyrone.grade);
//        System.out.println(Tyrone.isBorder);
//    Student Kate = new Student();
//    Kate.name ="Kate";
//    Kate.age = 25;
//    Kate.grade = 1;
//    Kate.isBorder = true;
//    Kate.print();

    }
}

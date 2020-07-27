package jrush_task_04;

/*
03.Как зовут кота?
*/

    public class Cat_03 {
        private String name = "безымянный кот";

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Cat_03 cat = new Cat_03();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }

/*
04.Учет котов
*/
//    public class Cat_03 {
//        private static int catsCount = 0;
//
//        public static void addNewCat() {
//
//            Cat_03.catsCount = Cat_03.catsCount + 1;
//        }
//
//        public static void main(String[] args) {
//            Cat_03.addNewCat();
//            System.out.println(Cat_03.catsCount);
//        }
//    }

/*
05.Задаем количество котов
*/

//public class Cat_03 {
//    private static int catsCount = 0;
//
//    public static void setCatsCount(int catsCount) {
//        Cat_03.catsCount = catsCount;
//
//    }
//
//    public static void main(String[] args) {
//        Cat_03.setCatsCount(5);
//        System.out.println(Cat_03.catsCount);
//    }
//}

/*
06.Программа учета имен
*/

//public class Cat_03 {
//    private String fullName;
//
//    public void setName(String firstName, String lastName) {
//        String fullName = firstName + " " + lastName;
//        this.fullName = fullName;
//    }
//
//    public static void main(String[] args) {
//        Cat_03 cat = new Cat_03();
//        cat.setName("Dana", "Budaeva");
//        System.out.println(cat.fullName);
//    }
//}

/*
07.Кошки во Вселенной
*/

//public class Cat_03 {
//    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Cat.count = Cat.count + 1;
//        Cat cat2 = new Cat();
//        Cat.count = Cat.count + 1;
//        System.out.println("The cat count is " + Cat.count);
//    }
//
//    public static class Cat {
//        public static int count = 0;
//    }
//}
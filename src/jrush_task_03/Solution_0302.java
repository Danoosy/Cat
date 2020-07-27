package jrush_task_03;

/*
Задача на проценты
*/

public class Solution_0302 {

        public static double addTenPercent(int i) {
            double Plus;
            Plus = i + (i * 0.1);
            return Plus;
        }

        public static void main(String[] args) {
            System.out.println(addTenPercent(9));
        }
}

package jrush_task_03;
    /*
Обмен валют
*/

public class Solution_0301 {

        public static void main(String[] args) {
            System.out.println(convertEurToUsd(50, 0.88));
            System.out.println(convertEurToUsd(100, 0.88));
        }

        public static double convertEurToUsd(int eur, double exchangeRate) {
            double dollarUSA = eur * exchangeRate;
            return dollarUSA;

        }
    }

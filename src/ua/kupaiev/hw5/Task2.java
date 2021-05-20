package src.ua.kupaiev.hw5;

public class Task2 {
    public static void main(String[] args) {
        int[] numbersArray = new int[4];
        int s = -1;
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = s--;
            System.out.print(numbersArray[i]);
            System.out.print(" ");
        }
        System.out.println("Данный массив отсортировон по убыванию: " + Number1(numbersArray));
    }
        private static boolean Number1 ( int[] number){
            for (int i = 1; i < number.length; i++) {
                if (number[i-1] <= number[i]) {
                    return false;
            }
            }
            return true;
        }
    }
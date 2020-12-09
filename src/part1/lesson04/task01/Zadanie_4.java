package part1.lesson04.task01;

public class Zadanie_4 {
    public static void main(String[] args) {
    int n = 4; //Число членов последовательности
    int a1 = 1;// первый член прогресси
    int d = 2; //ввести разность
    int an;
    int sum;

    an=a1+(n-1)*d;

    System.out.println(an+ "-" +"N-ый член арифметической прогресси");

    sum=(a1+an)*n/2;
    System.out.print(sum+"-"+"Сумма первых n членов арифметической прогрессии");



    }
}

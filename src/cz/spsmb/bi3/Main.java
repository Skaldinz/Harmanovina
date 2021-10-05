package cz.spsmb.bi3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Dobrý den, vítejte u nás ve večerce u Diamantového kliku. Dnes pro tebé mám krásná zvířatka");
        Scanner sc = new Scanner(System.in);
        String [] klauniada ={"Lev","Tygr","Slon","Sova","Leopard","Velbloud","Zajda"};
        int [] numForAnimals = new int[klauniada.length];
        int toPay =0;
        for (int i = 0; i < numForAnimals.length; i++) {
            System.out.println(i + 1 + " : " + klauniada[i]);
        }
        System.out.println("Vyberte si domů své zvíře");
        String tookHome = sc.nextLine();
        int[] intArray = new int[tookHome.length()];
        for (int j = 0; j < tookHome.length() ; j++) {
            intArray[j] = Character.getNumericValue(tookHome.charAt(j));
        }
        int[] harman;
        harman = intArray;
        for (int k = 0; k < harman.length ; k++) {
            int ab = harman[k];
            switch (ab) {
                case 1:
                    toPay += 20000;
                    numForAnimals[0]++;
                case 2:
                    toPay += 15000;
                    numForAnimals[1]++;
                    break;
                case 3:
                    toPay += 50000;
                    numForAnimals[2]++;
                    break;
                case 4:
                    toPay = 7500;
                    numForAnimals[3]++;
                    break;
                case 5:
                    toPay += 75000;
                    numForAnimals[4]++;
                    break;
                case 6:
                    toPay += 60000;
                    numForAnimals[5]++;
                    break;
                case 7:
                    toPay += 125;
                    numForAnimals[6]++;
                    break;
                default:
                    System.out.println("Vybral sis špatně ty troubo, koukej to napravit a naval prachy");
            }

        }
        for (int i = 0; i < klauniada.length; i++) {
            System.out.println(numForAnimals[i] + "x " + " " + klauniada[i]);
        }
        System.out.println("Total "+ "= " +toPay);
    }
}


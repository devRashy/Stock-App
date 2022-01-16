import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the buying price");
        double buyPrice = scanner.nextDouble();
        System.out.println("Enter the selling price");
        double sellingPrice = scanner.nextDouble();
        Stock abcCompany = new Stock();
        abcCompany.buy(buyPrice,2000);
        abcCompany.sell(sellingPrice, 1000);
        System.out.println(abcCompany.getShares());
        System.out.println(abcCompany.getPrice());
        System.out.println(abcCompany.getAveragePrice());

        }

    }



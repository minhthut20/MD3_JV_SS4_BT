package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c ;
        do {
            System.out.print("Nhập vào giá trị của a : ");
            a= input.nextDouble();
            if(a==0){
                System.out.println("Vui lòng nhập a khác 0 ");
            }
        }
        while (a==0);
        System.out.print("Nhập vào giá trị của b : ");
        b = input.nextDouble();
        System.out.print("Nhập vào giá trị của c : ");
        c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();

        if (delta<0){
            System.out.print("Phương trình không có nghiệm nào ");
        } else if (delta==0) {
            System.out.print("Phương trình có nghiệm kép là : " + root1);
        } else {
            System.out.print("Phương trình có hai nghiệm là : " + root1 + " và " + root2);
        }
    }
}

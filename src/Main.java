import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (!scanner.next().equalsIgnoreCase("e")){
            getFigure().show();
        }
    }

    private static Figure getFigure(){
        int num=(int)(Math.random()*100)-50;

        if(num>0)return new SimpleFigure(num);
        else return new SuperFigure(num);
    }
}

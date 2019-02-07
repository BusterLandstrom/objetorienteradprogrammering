import javax.swing.*;

public class testCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(0,0,3);
        Circle c2 = new Circle( 0, 0,3);
        System.out.println("Arean på circel 1 är " + c1.circumference() + "\nArean på circel 2 är " + c2.circumference());
        double resizeD = Double.parseDouble(JOptionPane.showInputDialog(null,"Resize circle 1","",JOptionPane.PLAIN_MESSAGE));
        c1.resize(resizeD);
        System.out.println("Arean på circel 1 är " + c1.circumference() + "\nArean på circel 2 är " + c2.circumference());
        if (c1.equals(c2)){
            System.out.println("lika");
        } else{
            System.out.println("olika");
        }

        System.out.println(c1.toString());

        if(c1.compareTo(c2) > 0){
            System.out.println(c1);
        }
    }
}

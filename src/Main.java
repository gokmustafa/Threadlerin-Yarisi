import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();

        ArrayList<Integer>listNumber1 = new ArrayList<>();
        ArrayList<Integer>listNumber2 = new ArrayList<>();
        ArrayList<Integer>listNumber3 = new ArrayList<>();
        ArrayList<Integer>listNumber4 = new ArrayList<>();

        for (int i=1; i<=100; i++){
            listNumber.add(i);
        }
        listNumber1.addAll(listNumber.subList(0,25));
        listNumber2.addAll(listNumber.subList(25,50));
        listNumber3.addAll(listNumber.subList(50,75));
        listNumber4.addAll(listNumber.subList(75,100));

        OddNumber o1 = new OddNumber(listNumber1);
        Thread t1 = new Thread(o1);
        t1.start();

        EvenNumber e1 = new EvenNumber(listNumber1);
        Thread t2 = new Thread(e1);
        t2.start();
    }
}

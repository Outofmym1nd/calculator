import java.io.*;
import java.util.HashMap;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader calc = new BufferedReader(new InputStreamReader(System.in));
        String cl = calc.readLine();   //переменная, в которой хранится содержимое строки

        HashMap<Integer, String> rome = new HashMap<>();
        rome.put(1,"I");
        rome.put(2,"II");
        rome.put(3,"III");
        rome.put(4,"IV");
        rome.put(5,"V");
        rome.put(6,"VI");
        rome.put(7,"VII");
        rome.put(8,"VIII");
        rome.put(9,"IX");
        rome.put(10,"X");

        int c = 0;

        Rimsk rimsk = Rimsk.V;    //значение, которое мы получим с консоли

        //сложение
        if (cl.contains("+")) {
            String[] numbers = cl.split("\\+");  //делим строку по символу +

            if (rome.containsValue(numbers[0])&rome.containsValue(numbers[1])){  //если символы римские
                System.out.println("Перевод в римские цифры");

                String smb = (numbers[0]);
                //rimsk.name();
                System.out.println(rimsk.getArab());  //возвращаем символ
            }

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            c = a + b;
        } else

            //вычитание
            if (cl.contains("-")) {
                String[] numbers = cl.split("-");
                if (rome.containsValue(numbers[0])&rome.containsValue(numbers[1])){
                    System.out.println("Перевод в римские цифры");
                }
                int a = Integer.parseInt(numbers[0]);
                int b = Integer.parseInt(numbers[1]);
                c = a - b;
            } else

                //умножение
                if (cl.contains("*")) {
                    String[] numbers = cl.split("\\*");
                    if (rome.containsValue(numbers[0])&rome.containsValue(numbers[1])){
                        System.out.println("Перевод в римские цифры");
                    }
                    int a = Integer.parseInt(numbers[0]);
                    int b = Integer.parseInt(numbers[1]);
                    c = a * b;
                } else

                    //деление
                    if (cl.contains("/")) {
                        String[] numbers = cl.split("/");
                        if (rome.containsValue(numbers[0])&rome.containsValue(numbers[1])){
                            System.out.println("Перевод в римские цифры");
                        }
                        int a = Integer.parseInt(numbers[0]);
                        int b = Integer.parseInt(numbers[1]);
                        c = a / b;
                    } else
                        System.out.println("Вы ввели какую-то несуразицу");

        System.out.println(c);

    }
}

import java.io.*;
import java.util.HashMap;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader calc = new BufferedReader(new InputStreamReader(System.in));
        String cl = calc.readLine();   //переменная, в которой хранится содержимое строки

        HashMap<String, Integer> rome = new HashMap<>();
        rome.put("I", 1);
        rome.put("II", 2);
        rome.put("III", 3);
        rome.put("IV", 4);
        rome.put("V", 5);
        rome.put("VI", 6);
        rome.put("VII", 7);
        rome.put("VIII", 8);
        rome.put("IX", 9);
        rome.put("X", 10);

        int c = 0;

        //Rimsk rimsk = Rimsk.V;    //значение, которое мы получим с консоли

        //сложение
        if (cl.contains("+")) {
            String[] numbers = cl.split("\\+");  //делим строку по символу +

            if (rome.containsKey(numbers[0])&rome.containsKey(numbers[1])){  //если символы римские
                c = rome.get(numbers[0])+rome.get(numbers[1]);  //вычисляем результат сложения, значения получаем по ключам
                // c1 = IntToStr(rome.containsValue(c));//здесь будет перевод арабских цифр обратно в римские
                System.out.println(c);  //выводим римскую
            }

            c = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        } else

            //вычитание
            if (cl.contains("-")) {
                String[] numbers = cl.split("-");  //делим строку по символу -
                if (rome.containsKey(numbers[0])&rome.containsKey(numbers[1])){  //если символы римские
                    c = rome.get(numbers[0])-rome.get(numbers[1]);  //вычисляем результат сложения, значения получаем по ключам
                    //здесь будет перевод арабских цифр обратно в римские
                    System.out.println(c);  //выводим римскую
                }

                int a = Integer.parseInt(numbers[0]);
                int b = Integer.parseInt(numbers[1]);
                c = a - b;
            } else

                //умножение
                if (cl.contains("*")) {
                    String[] numbers = cl.split("\\*");  //делим строку по символу *
                    if (rome.containsKey(numbers[0])&rome.containsKey(numbers[1])){  //если символы римские
                        c = rome.get(numbers[0])*rome.get(numbers[1]);  //вычисляем результат умножения, значения получаем по ключам
                        //здесь будет перевод арабских цифр обратно в римские
                        System.out.println(c);  //выводим римскую
                    }
                    int a = Integer.parseInt(numbers[0]);
                    int b = Integer.parseInt(numbers[1]);
                    c = a * b;
                } else

                    //деление
                    if (cl.contains("/")) {
                        String[] numbers = cl.split("/");  //делим строку по символу /
                        if (rome.containsKey(numbers[0])&rome.containsKey(numbers[1])){  //если символы римские
                            c = rome.get(numbers[0])/rome.get(numbers[1]);  //вычисляем результат деления, значения получаем по ключам
                            //здесь будет перевод арабских цифр обратно в римские
                            System.out.println(c);  //выводим римскую
                        }

                        int a = Integer.parseInt(numbers[0]);
                        int b = Integer.parseInt(numbers[1]);
                        c = a / b;
                    } else
                        System.out.println("Вы ввели какую-то несуразицу");

        System.out.println(c);

    }
}

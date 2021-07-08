import java.awt.*;
import java.io.*;
import java.util.HashMap;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 2 целых числа в диапазоне от 1-10 или I-X, и знак арифметического действия между ними: ");
        BufferedReader calc = new BufferedReader(new InputStreamReader(System.in));
        String cl = calc.readLine();   //переменная, в которой хранится содержимое строки
        if ((cl.contains(".")) || (cl.contains(","))) {  //проверка на целочисленность
            System.err.println("Неверный формат числа, повторите ввод");
        } else {
            cl = cl.replaceAll("\\s", "");  //удаляем пробелы, если пользователь решил вводить с ними

            Validate validate1 = new Validate();
            Validate validate2 = new Validate();
            String n = "Вы ввели неподходящее число, вычисление невозможно";
            //сложение
            if (cl.contains("+")) {
                String[] numbers = cl.split("\\+");  //делим строку по символу +
                validate1.enter = numbers[0];  //получаем входные значения для проверки римские или арабские
                validate2.enter = numbers[1];
                if (validate1.checkRomeSymbol(validate1.enter)) {  //если первая строка содержит римскую цифру
                    if (validate2.checkRomeSymbol(validate2.enter)) {  //если вторая строка содержит римскую цифру
                        //System.out.println(arab.get((rome.get(validate1.enter) + rome.get(validate2.enter))));  //складываем полученные из hashmap значения римских цифр, возвращаем по арабской цифре римскую
                        System.out.println(validate1.getArabMapSymbol(validate1.getRomeMapSymbol(validate1.enter) + validate2.getRomeMapSymbol(validate2.enter)));
                    } else {
                        System.err.println(n);
                    }
                } else if (validate1.checkArabSymbol(validate1.enter)) {   //если первая строка содержит арабскую цифру
                    if (validate2.checkArabSymbol(validate2.enter)) {  //если вторая строка содержит арабскую цифру
                        System.out.println(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                    }
                    //if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                    else {
                        System.err.println(n);
                    }
                }
            }

            //вычитание
            else if (cl.contains("-")) {
                String[] numbers = cl.split("-");  //делим строку по символу -
                validate1.enter = numbers[0];  //получаем входные значения для проверки римские или арабские
                validate2.enter = numbers[1];
                int c;
                if (validate1.checkRomeSymbol(validate1.enter)) {  //если первая строка содержит римскую цифру
                    if (validate2.checkRomeSymbol(validate2.enter)) {  //если вторая строка содержит римскую цифру
                        //c = rome.get(numbers[0]) - rome.get(numbers[1]);
                        c = validate1.getRomeMapSymbol(validate1.enter) - validate2.getRomeMapSymbol(validate2.enter);
                        if (c == 0) {
                            System.out.println("В Римской империи так считать не умели");
                        } else
                            //System.out.println(arab.get(c));  //выводим римскую
                            System.out.println(validate1.getArabMapSymbol(c));
                    } else {
                        System.err.println(n);
                    }
                } else if (validate1.checkArabSymbol(validate1.enter)) {   //если первая строка содержит арабскую цифру
                    if (validate2.checkArabSymbol(validate2.enter)) {  //если вторая строка содержит арабскую цифру
                        //if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                        System.out.println(Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат}
                    } else //{
                        System.err.println(n);
                } //else {
            }

            //умножение
            else if (cl.contains("*")) {
                String[] numbers = cl.split("\\*");  //делим строку по символу *
                validate1.enter = numbers[0];  //получаем входные значения для проверки римские или арабские
                validate2.enter = numbers[1];
                if (validate1.checkRomeSymbol(validate1.enter)) {  //если первая строка содержит римскую цифру
                    if (validate2.checkRomeSymbol(validate2.enter)) {  //если вторая строка содержит римскую цифру
                        //System.out.println(arab.get((rome.get(numbers[0]) * rome.get(numbers[1]))));  //получаем из hashmap значения римских цифр, возвращаем по арабской цифре римскую
                        System.out.println(validate1.getArabMapSymbol(validate1.getRomeMapSymbol(validate1.enter) * validate2.getRomeMapSymbol(validate2.enter)));
                    } else {
                        System.err.println(n);
                    }
                } else if (validate1.checkArabSymbol(validate1.enter)) {   //если первая строка содержит арабскую цифру
                    if (validate2.checkArabSymbol(validate2.enter)) {  //если вторая строка содержит арабскую цифру
                        System.out.println(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                    }
                    //if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                    else {
                        System.err.println(n);
                    }
                }
            }

            //деление
            else if (cl.contains("/")) {
                String[] numbers = cl.split("/");  //делим строку по символу /
                validate1.enter = numbers[0];  //получаем входные значения для проверки римские или арабские
                validate2.enter = numbers[1];
                if (validate1.checkRomeSymbol(validate1.enter)) {  //если первая строка содержит римскую цифру
                    if (validate2.checkRomeSymbol(validate2.enter)) {  //если вторая строка содержит римскую цифру
                        //System.out.println(arab.get((rome.get(numbers[0]) / rome.get(numbers[1]))));  //получаем из hashmap значения римских цифр, возвращаем по арабской цифре римскую
                        System.out.println(validate1.getArabMapSymbol(validate1.getRomeMapSymbol(validate1.enter) / validate2.getRomeMapSymbol(validate2.enter)));
                    } else {
                        System.err.println(n);
                    }
                } else if (validate1.checkArabSymbol(validate1.enter)) {   //если первая строка содержит арабскую цифру
                    if (validate2.checkArabSymbol(validate2.enter)) {  //если вторая строка содержит арабскую цифру
                        System.out.println(Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                    }
                    //if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                    else {
                        System.err.println(n);
                    }
                }
            } else {
                System.err.println("Вы ввели какую-то несуразицу");
            }
        }
    }
}

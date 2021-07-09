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

            Validate validate = new Validate();
            String n = "Вы ввели неподходящее число, вычисление невозможно";
            String s = "Вы ввели слишком много цифр";

            //сложение
            if (cl.contains("+")) {
                String[] numbers = cl.split("\\+");  //делим строку по символу +
                String a = numbers[0];  //получаем входные значения для проверки римские или арабские
                String b = numbers[1];
                if (validate.checkTwoParameters(numbers)) {
                    if (validate.checkRomeSymbol(a)) {  //если первая строка содержит римскую цифру
                        if (validate.checkRomeSymbol(b)) {  //если вторая строка содержит римскую цифру
                            //System.out.println(arab.get((rome.get(validate1.enter) + rome.get(validate2.enter))));  //складываем полученные из hashmap значения римских цифр, возвращаем по арабской цифре римскую
                            System.out.println(validate.getArabMapSymbol(validate.getRomeMapSymbol(a) + validate.getRomeMapSymbol(b)));
                        } else {
                            System.err.println(n);
                        }
                    } else if (validate.checkArabSymbol(a)) {   //если первая строка содержит арабскую цифру
                        if (validate.checkArabSymbol(b)) {  //если вторая строка содержит арабскую цифру
                            System.out.println(Integer.parseInt(a) + Integer.parseInt(b));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                        }
                        //if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                        else {
                            System.err.println(n);
                        }
                    }
                } else {
                    System.out.println(s);
                }
            }

            //вычитание
            else if (cl.contains("-")) {
                String[] numbers = cl.split("-");  //делим строку по символу -
                String a = numbers[0];  //получаем входные значения для проверки римские или арабские
                String b = numbers[1];
                int c;
                if (validate.checkTwoParameters(numbers)) {
                    if (validate.checkRomeSymbol(a)) {  //если первая строка содержит римскую цифру
                        if (validate.checkRomeSymbol(b)) {  //если вторая строка содержит римскую цифру
                            //c = rome.get(numbers[0]) - rome.get(numbers[1]);
                            c = validate.getRomeMapSymbol(a) - validate.getRomeMapSymbol(b);
                            if (c == 0) {
                                System.out.println("В Римской империи так считать не умели");
                            } else
                                //System.out.println(arab.get(c));  //выводим римскую
                                System.out.println(validate.getArabMapSymbol(c));
                        } else {
                            System.err.println(n);
                        }
                    } else if (validate.checkArabSymbol(a)) {   //если первая строка содержит арабскую цифру
                        if (validate.checkArabSymbol(b)) {  //если вторая строка содержит арабскую цифру
                            //if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                            System.out.println(Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат}
                        } else //{
                            System.err.println(n);
                    }
                } else {
                    System.out.println(s);
                }
            }

            //умножение
            else if (cl.contains("*")) {
                String[] numbers = cl.split("\\*");  //делим строку по символу *
                String a = numbers[0];  //получаем входные значения для проверки римские или арабские
                String b = numbers[1];
                if (validate.checkTwoParameters(numbers)) {
                    if (validate.checkRomeSymbol(a)) {  //если первая строка содержит римскую цифру
                        if (validate.checkRomeSymbol(b)) {  //если вторая строка содержит римскую цифру
                            //System.out.println(arab.get((rome.get(numbers[0]) * rome.get(numbers[1]))));  //получаем из hashmap значения римских цифр, возвращаем по арабской цифре римскую
                            System.out.println(validate.getArabMapSymbol(validate.getRomeMapSymbol(a) * validate.getRomeMapSymbol(b)));
                        } else {
                            System.err.println(n);
                        }
                    } else if (validate.checkArabSymbol(a)) {   //если первая строка содержит арабскую цифру
                        if (validate.checkArabSymbol(b)) {  //если вторая строка содержит арабскую цифру
                            System.out.println(Integer.parseInt(a) * Integer.parseInt(b));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                        }
                        //if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                        else {
                            System.err.println(n);
                        }
                    }
                } else {
                    System.out.println(s);
                }
            }
            //деление
            else if (cl.contains("/")) {
                String[] numbers = cl.split("/");  //делим строку по символу /
                String a = numbers[0];  //получаем входные значения для проверки римские или арабские
                String b = numbers[1];
                if (validate.checkTwoParameters(numbers)) {
                    if (validate.checkGauges(a) && validate.checkGauges(b)) {
                        if (validate.checkRomeSymbol(a)) {  //если первая строка содержит римскую цифру
                            if (validate.checkRomeSymbol(b)) {  //если вторая строка содержит римскую цифру
                                //System.out.println(arab.get((rome.get(numbers[0]) / rome.get(numbers[1]))));  //получаем из hashmap значения римских цифр, возвращаем по арабской цифре римскую
                                System.out.println(validate.getArabMapSymbol(validate.getRomeMapSymbol(a) / validate.getRomeMapSymbol(b)));
                            } else {
                                System.err.println(n);
                            }
                        } else if (validate.checkArabSymbol(a)) {   //если первая строка содержит арабскую цифру
                            if (validate.checkArabSymbol(b)) {  //если вторая строка содержит арабскую цифру
                                System.out.println(Integer.parseInt(a) / Integer.parseInt(b));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                            }
                            //if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                            else {
                                System.err.println(n);
                            }

                        }
                    } else System.out.println("Вводите числа из диапазона 1-10");
                } else {
                    System.out.println(s);
                }
            } else {
                System.err.println("Вы ввели какую-то несуразицу");
            }
        }
    }
}

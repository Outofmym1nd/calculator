
import java.io.*;
import java.util.HashMap;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 2 целых числа в диапазоне от 1-10 или I-X, и знак арифметического действия между ними: ");
        BufferedReader calc = new BufferedReader(new InputStreamReader(System.in));
        String cl = calc.readLine();   //переменная, в которой хранится содержимое строки
        if ((cl.contains(".")) | (cl.contains(","))) {  //проверка на целочисленность
            System.err.println("Неверный формат числа, повторите ввод");
        } else {
            cl = cl.replaceAll("\\s", "");  //удаляем пробелы, если пользователь решил вводить с ними

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

            HashMap<Integer, String> arab = new HashMap<>();
            arab.put(1, "I");
            arab.put(2, "II");
            arab.put(3, "III");
            arab.put(4, "IV");
            arab.put(5, "V");
            arab.put(6, "VI");
            arab.put(7, "VII");
            arab.put(8, "VIII");
            arab.put(9, "IX");
            arab.put(10, "X");
            arab.put(11, "XI");
            arab.put(12, "XII");
            arab.put(13, "XIII");
            arab.put(14, "XIV");
            arab.put(15, "XV");
            arab.put(16, "XVI");
            arab.put(17, "XVII");
            arab.put(18, "XVIII");
            arab.put(19, "XIX");
            arab.put(20, "XX");
            arab.put(21, "XXI");
            arab.put(24, "XXIV");
            arab.put(25, "XXV");
            arab.put(27, "XXVII");
            arab.put(28, "XXVIII");
            arab.put(30, "XXX");
            arab.put(32, "XXXII");
            arab.put(35, "XXXV");
            arab.put(36, "XXXVI");
            arab.put(40, "XXXX");
            arab.put(42, "XXXXII");
            arab.put(45, "XXXXV");
            arab.put(48, "XXXXVIII");
            arab.put(49, "XXXXIX");
            arab.put(50, "L");
            arab.put(54, "LIV");
            arab.put(56, "LVI");
            arab.put(60, "LX");
            arab.put(63, "LXIII");
            arab.put(64, "LXIV");
            arab.put(70, "LXX");
            arab.put(72, "LXXII");
            arab.put(80, "LXXX");
            arab.put(81, "LXXXI");
            arab.put(90, "LXXXX");
            arab.put(100, "C");

            int c;
            //Check check = new Check();
            //if (check.checkTwoParameters()){

            // }
            //сложение
            if (cl.contains("+")) {
                String[] numbers = cl.split("\\+");  //делим строку по символу +

                //int a = Integer.parseInt(numbers[0]);
                //int b= Integer.parseInt(numbers[1]);

                //если цифры римские
                if (rome.containsKey(numbers[0]) & rome.containsKey(numbers[1])) {
                    c = rome.get(numbers[0]) + rome.get(numbers[1]);  //вычисляем результат сложения, значения получаем по ключам
                    System.out.println(arab.get(c));  //выводим римскую

                    //если цифры арабские
                } else if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                    System.out.println(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                } else System.err.println("Вы ввели неподходящее число, вычисление невозможно");
            } else

                //вычитание
                if (cl.contains("-")) {
                    String[] numbers = cl.split("-");  //делим строку по символу -
                    if (rome.containsKey(numbers[0]) & rome.containsKey(numbers[1])) {  //если символы римские
                        c = rome.get(numbers[0]) - rome.get(numbers[1]);  //вычисляем результат сложения, значения получаем по ключам
                        System.out.println(arab.get(c));  //выводим римскую
                    } else if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                        System.out.println(Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                    } else System.err.println("Вы ввели неподходящее число, вычисление невозможно");
                } else

                    //умножение
                    if (cl.contains("*")) {
                        String[] numbers = cl.split("\\*");  //делим строку по символу *
                        if (rome.containsKey(numbers[0]) & rome.containsKey(numbers[1])) {  //если символы римские
                            c = rome.get(numbers[0]) * rome.get(numbers[1]);  //вычисляем результат умножения, значения получаем по ключам
                            System.out.println(arab.get(c));  //выводим римскую
                        } else if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                            System.out.println(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                        } else System.err.println("Вы ввели неподходящее число, вычисление невозможно");
                    } else

                        //деление
                        if (cl.contains("/")) {
                            String[] numbers = cl.split("/");  //делим строку по символу /
                            if (rome.containsKey(numbers[0]) & rome.containsKey(numbers[1])) {  //если символы римские
                                c = rome.get(numbers[0]) / rome.get(numbers[1]);  //вычисляем результат деления, значения получаем по ключам
                                System.out.println(arab.get(c));  //выводим римскую
                            } else if (((Integer.parseInt(numbers[0]) > 0) & (Integer.parseInt(numbers[0]) <= 10)) & ((Integer.parseInt(numbers[1]) > 0) & (Integer.parseInt(numbers[1])) <= 10)) {  //проверяем по диапазону 1-10
                                System.out.println(Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]));  //переводим отрезки строки до и после знака в числа, вычисляем результат
                            } else System.err.println("Вы ввели неподходящее число, вычисление невозможно");
                        } else
                            System.err.println("Вы ввели какую-то несуразицу");

        }
    }
}

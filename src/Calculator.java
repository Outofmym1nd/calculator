import java.io.*;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader calc = new BufferedReader(new InputStreamReader(System.in));
        String cl = calc.readLine();   //переменная, в которой хранится содержимое строки
        //String znak = " ";
        String plus = "+";
        String minus = "-";
        String umn = "*";
        String del = "/";
        int c = 0;

        //сложение
        if (cl.indexOf(plus) != -1) {
            int indexZ = cl.indexOf(plus);  //выясняем, каким по счету стоит знак
            int indexB = indexZ + 1;  //рассчитываем индекс для считывания второго числа из строки
            int a = Integer.parseInt(cl.substring(0, indexZ));  //присваиваем переменной значение первого числа из переведенной строки
            int b = Integer.parseInt(cl.substring(indexB));  //присваиваем переменной значение второго числа из переведенной строки
            c = a + b;
        } else

            //вычитание
            if (cl.indexOf(minus) != -1) {
                int indexZ = cl.indexOf(minus);  //выясняем, каким по счету стоит знак
                int indexB = indexZ + 1;
                int a = Integer.parseInt(cl.substring(0, indexZ));  //присваиваем переменной значение первого числа из переведенной строки
                int b = Integer.parseInt(cl.substring(indexB));  //присваиваем переменной значение второго числа из переведенной строки
                c = a - b;
            } else

                //умножение
                if (cl.indexOf(umn) != -1) {
                    int indexZ = cl.indexOf(umn);  //выясняем, каким по счету стоит знак
                    int indexB = indexZ + 1;
                    int a = Integer.parseInt(cl.substring(0, indexZ));  //присваиваем переменной значение первого числа из переведенной строки
                    int b = Integer.parseInt(cl.substring(indexB));  //присваиваем переменной значение второго числа из переведенной строки
                    c = a * b;
                } else

                    //деление
                    if (cl.indexOf(del) != -1) {
                        int indexZ = cl.indexOf(del);  //выясняем, каким по счету стоит знак
                        int indexB = indexZ + 1;
                        int a = Integer.parseInt(cl.substring(0, indexZ));  //присваиваем переменной значение первого числа из переведенной строки
                        int b = Integer.parseInt(cl.substring(indexB));  //присваиваем переменной значение второго числа из переведенной строки
                        c = a / b;
                    } else
                        System.out.println("Вы ввели какую-то несуразицу");

        System.out.println(c);
    }

}

public class Validate {
    String enter;

    void showString() {
        System.out.println("Вы ввели число: " + enter);
    }

    boolean checkRomeSymbol(String enter) {
        String[] rime = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int i = 0;
        try {
            do {
                for (i = 0; i <= rime.length; i++) {
                    if (rime[i].equals(enter)) {  //если в процессе проверки появляется совпадение с массивом римских цифр
                        return true;
                    }
                }
            } while (!rime[i].equals(enter));   //пока в исходной строке не найдено совпадение с массивом римских цифр
        } catch (Exception e) {
            //System.err.println("Ошибочный ввод данных");
        }
        return false;
    }

    boolean checkArabSymbol(String enter) {
        String[] ar = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int i = 0;
        try {
            do {
                for (i = 0; i <= ar.length; i++) {
                    if (ar[i].equals(enter)) {  //если в процессе проверки появляется совпадение с массивом римских цифр
                        return true;
                    }
                }
            } while (!ar[i].equals(enter));   //пока в исходной строке не найдено совпадение с массивом римских цифр
        } catch (Exception e) {
            //System.err.println("Ошибочный ввод данных");
        }
        return false;
    }
}
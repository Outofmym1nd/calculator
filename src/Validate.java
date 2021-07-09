import java.util.HashMap;

public class Validate {
    //String enter;

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

    public boolean checkTwoParameters(String[] elements) {
        return elements != null && elements.length == 2;
    }

    int getRomeMapSymbol(String enter) {
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

        int j = rome.get(enter);
        return j;
    }

    String getArabMapSymbol(int ent) {
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

        String a = arab.get(ent);
        return a;
    }

    boolean checkGauges(String enter) {  //Датчики - диапазон неотрицательных чисел
        int p = Integer.parseInt(enter);
        if (p > 0 && p < 11) {
            return true;
        } else {
            return false;
        }
    }
}
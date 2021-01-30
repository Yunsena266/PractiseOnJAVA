package TasksOnJava;

public class TaskOnCharacterMethods {


        public static void main(String[] args) {
            String string = """
                Думаю, это будет новой фичей.
                Только не говорите никому, что она возникла случайно.
                """;

            System.out.println("Количество цифр в строке : " + countDigits(string));
            System.out.println("Количество букв в строке : " + countLetters(string));
            System.out.println("Количество пробелов в строке : " + countSpaces(string));
        }

        public static int countDigits(String string) {
            int count = 0;
            char [] Letters = string.toCharArray();
            for (int i = 0;i< Letters.length;i++) {
                if (Character.isDigit(Letters[i])) {
                    count ++;
                }

            }
            return count;
        }

        public static int countLetters(String string) {
            int count = 0;
            char [] Letters = string.toCharArray();
            for (int i = 0;i< Letters.length;i++) {
                if (Character.isLetter(Letters[i])) {
                    count ++;
                }

            }return count;
        }

        public static int countSpaces(String string) {
            int count = 0;
            char [] Letters = string.toCharArray();
            for (int i = 0;i< Letters.length;i++) {
                if (Character.isWhitespace(Letters[i])) {
                    count ++;
                }

            }return count;
        }
    }



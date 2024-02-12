package lesson6.generate_exception2;

public class Example2 {
    public static void main(String[] args) {
/*        String text = "Создать класс с четырьмя методами checkString().";
        String[] words = text.split("\\s");
        System.out.println(words.length);*/
    }
    /*
     * Создать класс с четырьмя методами checkString().
     * Метод 1 принимает в параметры строку и выбрасывает исключение, если количество символов в
     * этой строке нечетное.
     * Метод 2 принимает в параметры строку и выбрасывает исключение, если в этой строке есть
     * буквосочентани "exception".
     * Метод 3 принимает в параметры строку и выбрасывает исключение, если эта строка состоит из количества слов меньше 3.
     * Метод 4 внутри себя вызывает предыдущие три метода.
     *
     * Все исключения создать отдельными собственными классами.
     * */

    public class OddLengthException extends Exception {
        public OddLengthException(String message) {super(message);}
    }

    public class ContainsWordException extends Exception {
        public  ContainsWordException(String message) {super(message);}
    }

    public class CountOfWordException extends Exception {
        public CountOfWordException(String message) {super(message);}
    }
    private void checkString1(String text) throws OddLengthException {
        if(text.length() % 2 != 0){
            throw new OddLengthException("The count of chars from this text is odd");
        }
    }

    private void checkString2(String text) throws ContainsWordException {
        if(text.contains("exception")){
            throw new ContainsWordException("This text contains word \"Exception\"!!!");
        }
    }

    private void checkString3(String text) throws CountOfWordException {
        if(text.split("\\s").length < 3){
            throw new CountOfWordException("The count of word is less than 3!!!");
        }
    }

    public void checkString4(String text) throws OddLengthException, CountOfWordException, ContainsWordException {
        checkString1(text);
        checkString2(text);
        checkString3(text);
    }
}

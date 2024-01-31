package lesson3.bearex;

public class Bear {
    /*
Создать класс Bear. В нем поля имя, возраст и пол. Поля приватные.
Создать конструктор для задания имени и пола. Для Возраста задать
геттеры и сеттеры.
Создать метод voice, который выводит в консоль сообщение "RRRRRRRR!!!!"

Создать метод makeBabyBear, который в свои параметры требует объект
класса Bear, строку и boolean.
Если пол у медведей совпадает, то тогда возвращается новый медведь с пустым именем.
(поле пол можете оставить любым). Если пол разный, то возвращается новы медведь
с именем и полом, которые он получает из аргументов переданных в параметры метода.

Переопределить метод toString() который в случае если у медведя поле имени равно
null, возвращает строку типа: "Я не мог быть рожден", в противном случае он
возвращает информацию о медведе.
*/
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Bear(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public void voice() {
        System.out.println("RRRRRRRRRRRRR!!!!!");
    }

    public void getInfo() {
        System.out.println(name + " " + age + " " + isMale);
    }

    @Override
    public String toString() {
        if (name.equals(null)) {
            return "\"Я не мог быть рожден\"";
        } else {
            String male;
            if (isMale == true) {
                male = "boy";
            } else {
                male = "girl";
            }
            return "name='" + name + '\'' + ", age=" + age + ", isMale= " + male;
        }

    }

    public Bear makeBabyBear(Bear bear2, String possibleName, boolean isMale) {
        if (this.isMale == bear2.isMale) {
            return new Bear(null, isMale);
        } else {
            Bear newBear = new Bear(possibleName, isMale);
            newBear.setAge(1);
            return newBear;
        }
    }

    private boolean isMale;
}

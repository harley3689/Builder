import javax.xml.crypto.KeySelectorException;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person mom = personBuilder
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setSurname(mom.getSurname())
                .setAge(3)
                .setAddress(mom.getAddress())
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        mom.happyBirthday();

        try {
            new PersonBuilder()
                    .setName("Вася")
                    .setSurname("Пупкин")
                    .setAge(-100)
                    .build();
        } catch (java.lang.IllegalArgumentException e) {
            e.printStackTrace();
        }

        son.happyBirthday();
        son.setAddress("Мельбурн");

        System.out.println(mom+"\n"+son);
    }
}



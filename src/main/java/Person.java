import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        if (age == 0) {
            try {
                throw new IllegalArgumentException("age don't = 0!");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        return age;
    }

    public String getAddress() {
        if (address == null) {
            throw new NullPointerException("address=null!");
        }
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private boolean hasAge() {
        if (age <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private boolean hasAddress() {
        if (address != null) {
            return true;
        } else {
            return false;
        }
    }

    public void happyBirthday() {
        if (hasAge()) {
            try {
                throw new IllegalArgumentException("age don't = 0!");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getSurname(), person.getSurname()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "'name='" + name + '\'' +
                ", 'surname='" + surname + '\'' +
                ", 'age'=" + age + '\'' +
                ", 'address'=" + address +
                '}';
    }
}

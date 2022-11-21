public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException("age don't = 0!");
        }else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String address) {
        if (address == null) {
            throw new IllegalStateException("address=null!");
        }else {
            this.address = address;
            return this;
        }
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("name or surname missing!");
        }else {
            return new Person(name, surname, age, address);
        }
    }
}

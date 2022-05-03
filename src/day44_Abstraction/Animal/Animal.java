package day44_Abstraction.Animal;

public abstract class Animal {
    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath; // FINAL: UNCHANGEBLE STATIC: ONE COPY.

    static {
        canBreath=true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
       setName(name);
        this.breed = breed;
        if(!(gender=='M'||gender=='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
        setAge(age);
       setSize(size);
        this.color = color;
    }
    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public final void drink(){ //cannot be static, because it contains instance variable
        System.out.println(getName()+" is drinking water");
    }

    public abstract void eat(); //CANNOT BE FINAL, BECAUSE FINALS CANNOT BE OVERRIDEN


    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

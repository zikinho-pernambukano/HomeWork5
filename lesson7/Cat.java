package lesson7;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if (length > 150) {
            System.out.println(name + " не добежит");
        } else {
            System.out.println(name + "  красавчик " + length + " метров пробежал ");
        }
    }

    @Override
    public void swim(int length) {

        if (length > 0) {
            System.out.println(name + " тонет");
        } else {
            System.out.println(name + " проплыл " + length + " метров");
        }
    }
}









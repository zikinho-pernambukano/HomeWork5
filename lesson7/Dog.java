package lesson7;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if(length>500) {
            System.out.println(name + " не добежит");
        }else{
            System.out.println(name + "  красавчик " + length + " метров пробежал ");
        }
    }

    @Override
    public void swim(int length) {

        if ( length>10){
            System.out.println(name+" тонет");
        }else {
            System.out.println(name + " проплыл " + length + " метров");
        }

    }
}

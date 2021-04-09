package lesson7;

public abstract class Animal {
    private static int count = 0;
    protected String name;


    public Animal(String name) {
        this.name = name;
        count++;
    }



    public void swim(int length){
        System.out.println( name + " проплыл " + length );

    }
    public void run(int length){
        System.out.println( name + " пробежал " + length );

    }

    public static void countinfo(){
        System.out.println("Сгенерировано животных: "+count);
    }

}

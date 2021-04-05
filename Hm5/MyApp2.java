package Hm5;

import java.lang.reflect.Array;

public class MyApp2 {


    public static void main(String[] args) {
        Person person = new Person("Зия Гасанов", "Директор", "zik-gasanov",79, 400000, 30);
        person.info();
        Person personArray[]= new Person[5];

        personArray[0] = new Person("Виктор Иванов", "рабочий" , "vic-iv", 88, 30000, 41);
        personArray[1] = new Person("Зубарев Михаил", "тренер", "zub - mix", 99, 45000, 30 );
        personArray[2] = new Person("Батыр Сулейманов", " старший тренер", "bat-sul", 10, 60000, 34);
        personArray[3] = new Person("Шамиль Алиасхабович", " стриптизер", "sam-al", 11, 50000, 29);
        personArray[4] = new Person("Рогожа Максим", " ,бармен", "rog-max", 12, 35000, 21);

      for (int i = 0 ; i<personArray.length; i++){

          if(personArray[i].age>40){
              personArray[i].info();

          }

      }



    }











}

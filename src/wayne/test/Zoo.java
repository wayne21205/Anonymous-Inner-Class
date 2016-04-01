package wayne.test;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Animal {
  abstract Animal speak();
}
 

class Cat extends Animal {
  public Animal speak() {
     System.out.println("A");
     return this;
  }
}
 
class Dog extends Animal {
  public Animal speak() {
     System.out.println("B");
     return this;
  }
}



public class Zoo {
  public static void main(String[] args) {
	
    Animal dog = new Dog().speak(); //new子hook為父, 父call會call子 //B
    Animal cat = new Cat().speak(); //new子hook為父, 父call會call子 //A
    
    String i = "wayne";
    /*
     * Anonymous inner class(AIC)
     * 
     * This overriding method is just for temporarily using, so we don't need to create a class to implement it.
     * So, Just use Anonymous inner class 
     */
    Animal bird = new Animal() { //Override Abstract class中的method
        Animal speak() {
            System.out.println("C");
             return this;
        }
    }.speak(); //C
    
    
    // Ex 2
    //目前時間
    Date date = new Date();
    //設定日期格式
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //進行轉換
    String dateString = sdf.format(date);
    System.out.println(dateString);
    
  }
}

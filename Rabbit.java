public class Rabbit{
//attibuter
private String name = "";
private String yell = "";

private int x;
private int y; 

//constucktor uden parametre
public Rabbit(){
   
   name = "Rabbit";
   x = 0;   
   y = 0;
   yell = yell;
}
// construktor med parametre
public Rabbit(String name, int x, int y, String yell){

   this.name = name;
   this.x = x;
   this.y = y;
   this.yell = yell;

}

// set metoder
public void setRabbit(String name, int x, int y, String yell){
   name = name;
   x = x;
   y = y;
   yell = yell;

}
//metode til at udskrive rabbit

public void RabbitInfo(){
   System.out.println("name\t" + name);
   System.out.println("x\t" + x);
   System.out.println("y\t" + y );
   System.out.println("yell\t" + yell);
}

}
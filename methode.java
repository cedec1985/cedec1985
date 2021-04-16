/* methode */
class MyClass {
    public static void sayHello(){
        System.out.println("hello world");  
        System.out.println("beep !");} 
    public static void main(String[] args){
    sayHello();}}
class Vehicle {
        int maxSpeed;
        int wheels;
        String color;
        double fuelCapacity;
    public void horn(){
        System.out.println("beep !");} 
    public static void main(String[] args){
    Vehicle v1 =new Vehicle();
    Vehicle v2 =new Vehicle();
    v1.color="red";
    v2.horn(); }} 
class Mysclass{
    static void saytoHello(String name){
        System.out.println("hello" +name);}
    public static void main(String[] args){        
    saytoHello("David");
    saytoHello("Cindy");}}
class Programme{
    public static void main(String [] args){ 
        int age=25;
        if(age>0)     {
            if(age>16){
                 System.out.println("welcome");
            }
                else {
                    System.out.println("too young");
            }
        }else {
            System.out.println("error");
        }    
    }  
}
class Progman {
    public static void main(String[] args){
        int x=1;
        while(x>0){
            System.out.println(x);
            if(x==4){
                break;
            }
            x++;
        }
    }
}
class Prog {
    public static void main(String[] args){
        for (int y=10;y<=40;y=y+10){
            if(y==30){
                continue;
            }
            System.out.println(y);
        }
    }
}
        
    

    

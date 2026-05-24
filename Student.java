import java.util.ArrayList;
import java.util.Scanner;
class Student{
    int id;
    String name;
    double marks;
    //constructor
Student(int id,String name,double marks){
    this.id=id;
    this.name=name;
    this.marks=marks;
}
//Getters
public int getid(){
    return id;
}
public String getname(){
    return name;
    
}
public double getmarks(){
    return marks;
}
// display method
    public void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
        System.out.println("----------------------");
        
    }
}

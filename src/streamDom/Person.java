package streamDom;

public class Person {
    // state
    private  String name;
    private  int age;
    private  String gender;
    private  String address;

    // constructor
    public Person(){}
    public Person(String name, int age,String gender , String address){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender= gender;
    }
    // Create getter and setter

    public String getName(){
        return name;

    }
    public void setName (String name){
        this.name= name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String  getGender(){
        return gender;

    }
    public void setGender(String gender){
        this.gender= gender;
    }
    public String getAddress (){
        return address;
    }
    public void setAddress (String address){
        this.address = address;
    }

    // output information
    public void outputInfo(){
        System.out.println("Name is: "+ name);
        System.out.println("age is: "+ age);
        System.out.println("address is: "+ address);
        System.out.println("gender is: "+ gender);
    }



}

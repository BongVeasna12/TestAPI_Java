package streamDom;

import streamDom.Person;

public class worker extends Person {
    // State
    private  int workId;
    private  float hour;
    private  String position;

   public worker(){
    }
    public worker(String name , int age , String address , String gender ,int workId , float hour  , String position){
       super();
       this.workId = workId;
       this.hour =hour;
       this.position=position;

    }

    public int getWorkId() {
        return workId;
    }

    public void setWorkId(int workId) {
        this.workId = workId;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    // create outputInfo
    public void outputInfo(){
       super.outputInfo();
        System.out.println("streamDom.worker "+ workId);
        System.out.println("hour"+ hour);
        System.out.println("Position"+ position);
    }
}

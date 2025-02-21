class Service {
    String host = " nirmal";
    String port = "jaipur";

    void repo(){
        System.out.println(" hello word! ");
    }
}
public class A1{
    int add =9;
    int cours = 29;
    public static void main(String args[]){
       
        System.out.println(new Service().host + new Service().port);
        new Service().repo();
    }
}

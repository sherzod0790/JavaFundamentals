package uz.bepro.encapsulation;

public class EncapsulationFinal {

    //public EncapsulationFinal(){}
    public EncapsulationFinal(String account, String api_url){
        this.account = account;
        API_URL = api_url;
    }


    private static int nextId = 1;
    private  int id;

    private final String account; // final togridan togri constructorga tasir qiladi
    private final String API_URL;



    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static int getNextId(){
        return nextId;
    }
}

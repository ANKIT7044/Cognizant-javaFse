package org.example;

public class MyService {
    private ExternalApi api;
    public MyService(ExternalApi api){
        this.api=api;
    }
    public int addTwoNum(){
        return api.add(5,10);
    }
}

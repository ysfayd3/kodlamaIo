package main.core.loging;

public class FileLogger implements Logger{


    @Override
    public void log(String data) {
        System.out.println("Dosya loglandı :"+ data);

    }
}

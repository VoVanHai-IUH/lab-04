package vn.edu.iuh.fit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class LabWeek04Application {

    public static void main(String[] args) {
        SpringApplication.run(LabWeek04Application.class, args);
    }


    void x(){
        UUID x= UUID.randomUUID();
    }
}

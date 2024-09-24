package org.example;

import java.io.IOException;
import java.util.Scanner;

public class CmdDate {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime(); //Coller o contorno de execución que permite acceder á info, tendo en conta que é un Singleton
        String[] command = {"cmd", "/C" , "data", "/T"};
        Process process = runtime.exec(command);
        Scanner scannerIS = new Scanner(process.getInputStream());
        while(scannerIS.hasNextLine()){
            System.out.println(scannerIS.nextLine());
        }
        scannerIS.close();
        int exitStatus = process.waitFor();
        System.out.println("Exit status process date " + exitStatus);
        if(exitStatus != 0){
            Scanner scannerError = new Scanner(process.getErrorStream());
            while(scannerError.hasNextLine()){
                System.out.println(scannerError.nextLine());
            }
            scannerError.close();
        }
    }
}
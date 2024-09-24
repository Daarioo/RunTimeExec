package org.example;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CmdDate2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime(); //Coller o contorno de execución que permite acceder á info, tendo en conta que é un Singleton
        String[] command = {"cmd", "/C" , "date"};
        Process process = runtime.exec(command);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
        writer.write("27-10-24");
        writer.close();

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
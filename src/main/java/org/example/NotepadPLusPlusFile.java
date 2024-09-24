package org.example;

import java.io.IOException;

public class NotepadPLusPlusFile {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime(); //Coller o contorno de execución que permite acceder á info, tendo en conta que é un Singleton
        String[] command = {"C:/Program Files/Notepad++/notepad++.exe", "./src/main/resources/info.txt"};
        Process process = runtime.exec(command);

        //Dende terminal:
        //date /T
    }
}
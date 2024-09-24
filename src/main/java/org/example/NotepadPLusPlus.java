package org.example;

import java.io.IOException;

public class NotepadPLusPlus {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime(); //Coller o contorno de execución que permite acceder á info, tendo en conta que é un Singleton
        String[] command = {"C:/Program Files/Notepad++/notepad++.exe"};
        Process process = runtime.exec(command);
    }
}
package org.example.structural.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        List<String> permission = List.of("rw", "r" , "w");
        File myDirectory1 = new Directory(permission, "Family");
        File myDirectory2 = new Directory(permission, "sons");


        File myFile1 = new LeafNodeFile(permission, "Joel");
        File myFile2 = new LeafNodeFile(permission, "Hansel");
        File myFile3 = new LeafNodeFile(permission, "Raphael");
        File myFile4 = new LeafNodeFile(permission, "Dad");
        File myFile5 = new LeafNodeFile(permission, "Mom");


        myDirectory1.addFile(myDirectory2);
        myDirectory2.addFile(myFile1);
        myDirectory2.addFile(myFile2);
        myDirectory2.addFile(myFile3);

        myDirectory1.addFile(myFile4);
        myDirectory1.addFile(myFile5);

        traverse(myDirectory1);

    }

    private static void traverse(File file){
        if(file == null) return;

        try{
            System.out.println(file.getName());
            for(File myFile : file.getFiles()){
                traverse(myFile);
            }
            return;
        }
        catch(Exception e){
            return;
        }
    }
}

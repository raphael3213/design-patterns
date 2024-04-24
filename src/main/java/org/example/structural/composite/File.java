package org.example.structural.composite;

import java.util.List;

public interface File {

    List<String> getPermissions();
    void setPermissions(List<String> permissions);
    List<File> getFiles() throws IllegalAccessException;
    String getName();
    void addFile(File file) throws IllegalAccessException;
    void removeFile(File file) throws IllegalAccessException;
    void setName(String name);


}

package org.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File{


    private List<String> permissions = new ArrayList<>();
    private String name = "";
    private final List<File> files = new ArrayList<>();

    Directory(List<String> permissions, String name){
        this.permissions = permissions;
        this.name = name;
    }
    @Override
    public List<String> getPermissions() {
        return permissions;
    }

    @Override
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @Override
    public List<File> getFiles() throws IllegalAccessException {
        return files;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addFile(File file) throws IllegalAccessException {
        this.files.add(file);
    }

    @Override
    public void removeFile(File file) throws IllegalAccessException {
        throw new IllegalAccessException("This is a leaf file");

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

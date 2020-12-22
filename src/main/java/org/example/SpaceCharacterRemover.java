package org.example;

public class SpaceCharacterRemover {

    public String remove(String userString){
        return userString.replaceAll("\\s+","");
    }
}

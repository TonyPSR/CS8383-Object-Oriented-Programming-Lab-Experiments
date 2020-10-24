package exp7;

import java.util.ArrayList;

public class ArrayListOperation {
    ArrayList<String> myStringList;

    public ArrayListOperation(int num){
        myStringList = new ArrayList<>(num);
    }
    
    public ArrayListOperation(){
        myStringList = new ArrayList<>();
    }

    public void append(String temp){
        myStringList.add(temp);
    }

    public void addAtIndex(String temp, int index){
        myStringList.set(index, temp);
    }

    public void search(String temp){
        for(int i=0; i< myStringList.size(); i++){
            String current = myStringList.get(i);
            if(current.equals(temp)){
                System.out.println(temp + " is found at index " + i);
            }
        }
    }

    public void startWithLetter(char character){
        for(int i=0; i<myStringList.size(); i++){
            String t = myStringList.get(i);
            if(t.charAt(0) == character){
                System.out.println(t);
            }
        }
    }

    public void printArrayList(){
        System.out.println();
        for(int i =0; i<myStringList.size(); i++){
            System.out.println(myStringList.get(i));
        }
        System.out.println();
    }
}

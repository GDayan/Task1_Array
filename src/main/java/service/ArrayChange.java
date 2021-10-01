package service;

import entity.CustomArray;

public class ArrayChange {
    public ArrayChange(){
    }

    public void ArrayChange(CustomArray array, int number, int place){
        int[] temp=array.getArray();
        temp[place] = number;
        array.setArray(temp);
    }
}

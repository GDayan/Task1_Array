package service;

import entity.CustomArray;

public class ArrayFind {
    public ArrayFind(){
    }

    public int ArrayMin(CustomArray array){
        int[] temp=array.getArray();
        int min=temp[0];
        for (int i=1; i<temp.length;i++)
        {
            if(temp[i]<min){
                min=temp[i];
            }
        }
        return min;
    }

    public int ArrayMax(CustomArray array){
        int[] temp=array.getArray();
        int max=temp[0];
        for (int i=1; i<temp.length;i++)
        {
            if(temp[i]>max){
                max=temp[i];
            }
        }
        return max;
    }
}

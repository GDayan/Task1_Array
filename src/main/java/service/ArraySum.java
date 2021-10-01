package service;

import entity.CustomArray;

public class ArraySum {
    public ArraySum(){
    }

    public int ArraySum(CustomArray array){
        int[] temp=array.getArray();
        int sum=0;
        for (int i=0; i<temp.length;i++)
        {
            sum+=temp[i];
        }
        return sum;
    }
}

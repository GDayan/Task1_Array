package service;

import entity.CustomArray;

public class ArrayPositiveNegative {
    public ArrayPositiveNegative(){
    }

    public int ArrayMin(CustomArray array){
        int[] temp=array.getArray();
        int countpos=0;
        for (int i=0; i<temp.length;i++)
        {
            if(0<temp[i]){
                countpos++;
            }
        }
        return countpos;
    }

    public int ArrayMax(CustomArray array){
        int[] temp=array.getArray();
        int countneg=0;
        for (int i=0; i<temp.length;i++)
        {
            if(temp[i]<0){
                countneg++;
            }
        }
        return countneg;
    }
}

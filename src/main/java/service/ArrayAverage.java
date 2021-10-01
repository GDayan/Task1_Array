package service;

import entity.CustomArray;

public class ArrayAverage {
    public ArrayAverage(){
    }

    public double Arrayaverage(CustomArray array){
        {
            int[] temp=array.getArray();
            double average=0;
            for (int i=0; i<temp.length;i++)
            {
                average+=temp[i];
            }
            return average/temp.length;
        }
    }
}

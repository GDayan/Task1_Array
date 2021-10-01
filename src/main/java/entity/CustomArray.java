package entity;

public class CustomArray {
    private int[] array;

    public CustomArray() {}

    public CustomArray (int[] array){
        this.array=array;
    }
    public int[] getArray(){
        return array.clone();
    }
    public void setArray(int[] array){
        this.array = array;
    }
    public int getSize(){
        return array.length;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int a:array){
            sb.append(a).append(" ");
        }
        return sb.toString();
    }
}

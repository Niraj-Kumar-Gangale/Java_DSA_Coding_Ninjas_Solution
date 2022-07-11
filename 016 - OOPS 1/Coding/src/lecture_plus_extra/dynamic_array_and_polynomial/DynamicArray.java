package lecture_plus_extra.dynamic_array_and_polynomial;

public class DynamicArray {

    // properties
    private int data[];
    private int nextIndex;

    // 1] constructor
    public DynamicArray(){
        data = new int[5];
        nextIndex = 0;
    }

    // 2] add function
    public void add (int element){
        if (nextIndex==data.length){
            restructure();
        }
        data[nextIndex]= element;
        nextIndex++;
    }

    // restructure
    private void restructure(){
        int[] temp = new int[2* data.length];
        for (int i = 0 ; i < data.length ; i ++){
            temp[i]= data[i];
        }
        data = temp;
    }


    // print function to print the dynamic array
    public void print(){
        for (int i = 0 ; i< nextIndex ; i++){
            System.out.println(data[i]);
        }
    }

    // to print the size of the current we have to return
    // the nextIndex value
    public int size(){
        return nextIndex;
    }

    // now we have to set and get for a particular index
    public void set(int position, int element){
        if (position > nextIndex){
            return;
        }
        if (position < nextIndex){
            data[position]=element;
        }else{
            add(element);
        }

    }

    // now we will make a function that return value at particular position
    public int get(int position){
        if (position >= nextIndex){
            return -1;
        }else{
            return data[position];
        }
    }


    // now we are going to make a function to remove the last value
    public int removeLast(){
        if (nextIndex==0){
            return -1;
            // we will return array when we learn how to do so
        }
        int temp = get(nextIndex-1);
        set(nextIndex-1,0);
        nextIndex--;
        return temp;
    }

    // function to check if the array is empty or not
    public boolean isEmpty(){
        return nextIndex == 0;
    }
}

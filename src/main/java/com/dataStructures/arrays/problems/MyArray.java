package com.dataStructures.arrays.problems;

public class MyArray {
    private int capacity;

    private int currentLength;
    private String[] array;

    public MyArray(){
        this.capacity =1;
        this.array = new String[1];
        this.currentLength=0;
    }

    public String get(int index){
        if (index > -1 && index < currentLength)
            return this.array[index];
        else return "Index Out Of Bound";
    }

    public void push(String item){

        // if currentLength becomes equal to capacity we need to increase the capacity to add more elements.

        if (currentLength == capacity) {

            // create a new Array with double capacity
            String[] tempArray = new String[2 * capacity];

            // copy elements of old array to new array.
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }

            // set the newly created array as our real array.
            array = tempArray;

            // update the value of capacity
            capacity *= 2;
        }
        // insert the new element at the end
        array[currentLength] = item;

        // update value of currentLength by 1
        currentLength++;

    }
    // replace(index,value) replaces value at given index with the newly entered value.
    public void replace(int index, String value) {
        if (index > -1 && index < currentLength) {
            array[index] = value;
        } else
            System.err.println("Index out of bounds");
    }

    // remove last element
    public void pop() {
        if (currentLength > 0) {
            currentLength--;
        }
    }

    // delete element at the given index
    public void delete(int index) {
        if (index > -1 && index < currentLength) {
            if (index == currentLength - 1) {
                pop();
            } else {
                for (int i = index; i < currentLength; i++) {
                    array[i] = array[i + 1];
                }
                currentLength--;
            }
        } else {
            System.err.println("Index out of bounds");
        }
    }

    // get array
    public String[] getArray() {
        String[] tempArr = new String[currentLength];
        for (int i = 0; i < currentLength; i++) {
            tempArr[i] = array[i];
        }
        return tempArr;
    }

    // returns the length of array{Number of elements stored in the array}
    public int length() {
        return currentLength;
    }





}



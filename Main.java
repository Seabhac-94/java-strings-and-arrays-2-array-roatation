class Main {
    public static void main(String[] args) {
        // Rotate an array of n elements to the left by k steps
        // Input [1, 2, 3, 4, 5, 6, 7]
        // Expected output [4, 5, 6, 7, 1, 2, 3]

        RotateArray rotateArray = new RotateArray();
        int array[] = {1,2,3,4,5,6,7};

        rotateArray.leftRotate(array, 3, 7);
        rotateArray.printArray(array, 7);
    }
}


class RotateArray {
    void leftRotate(int array[], int rotateBy, int size) {
        for (int index = 0; index < rotateBy; index++) {
            leftRotateByOne(array, size);
        }
    }

    void leftRotateByOne(int array[], int size) {
        int index;
        int tempArray;
        tempArray = array[0];
        for (index = 0; index < size - 1; index++) {
            array[index] = array[index + 1];
        }
        array[index] = tempArray;
    }

    void printArray(int array[], int size) {
        for (int index = 0; index < size; index++) {
            System.out.println(array[index]);
        }
    }
}
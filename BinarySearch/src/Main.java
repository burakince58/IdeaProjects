public class Main {
    public static int steps = 0;
    public static int find(int[] array, int element, int startIndex, int endIndex) {
        steps++;
        int middle = (startIndex + endIndex) / 2;
        if (array[middle] == element) {
            return middle; // found
        }
        else if (startIndex == endIndex) {
            return -1; // not found
        }
        else if (element > array[middle]) {
            return find(array, element, middle + 1, endIndex);
        } else if (startIndex < middle) {
            return find(array, element, startIndex, middle - 1);
        } else {
            return -1; // not found
        }
    }

    public static int findIterative(int[] array, int element) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (true) {
            steps++;
            int middle = (endIndex + startIndex) / 2;
            if (element == array[middle]) {
                return middle;
            } else if (startIndex == endIndex) {
                return -1; // not found
            } else if (element > array[middle]) {
                startIndex = middle + 1;
            } else if (startIndex < middle) {
                endIndex = middle - 1;
            } else {
                return -1; // not found
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4,5,6,7,8,9,10,23,45,58,66,78,90,123};
        int search = InputReader.readInt("Search in Array: ");
        int resultIndex = find(array,search,0,array.length-1);
        //int resultIndex = findIterative(array,search);
        if (resultIndex>=0){
            System.out.println("Found the number "+array[resultIndex]+" in "+steps+" steps.");
        }
        else{
            System.out.println("Not found");
            System.out.println("Steps: "+steps);
        }
    }
}
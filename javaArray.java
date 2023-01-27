public class javaArray {
    public static void main(String[] args) {
        String names[] = {"Jyoti", "Bestie", "Kumari"};
        int sizeOfArray = names.length;   // use length for finding size of array

        System.out.println(sizeOfArray);

        // Loop on arrays
        for(String i : names)
          System.out.println(i);


    // multidimensional Arrays
    int [][] num = {{1,2,3}, {4,5,6}};
    System.out.println(num[1][2]);


    }
}

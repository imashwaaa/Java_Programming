public class Arrays {
    public static void main(String[] args) {
        int[] marks = {85,80,99,93,59};

        System.out.println(marks[1]);
        System.out.println(marks.length);

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;

        System.out.println(arr[2]);

        for(int i = 0; i<marks.length ; i++){
            System.out.println(marks[i]);
        }

    }
    
}

public class SelectionSort {
    //increase sorting
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[i]>list[j]){
                    double temp = list[i];
                    list[i]=list[j];
                    list[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("the list before sorting");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+"\t");
        }
        System.out.println();
        System.out.println("start sorting");
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+"\t");
        }

    }
}

 class MyTestArrayList {
    public static void main(String[] args) {

        myArrayListTest();

    }

    private static final int N = 1000000;

    public static void myArrayListTest() {

        System.out.println("-------------------------------------- MyArrayList test");

        MyArrayList<Integer> myArrayList = new MyArrayList<>();


        for (int i = 0; i < N; i++) {

            myArrayList.add(i);
        }
        System.out.println("myArrayList.size() = " + myArrayList.size());


        for (int i = 0; i < 10; i++) {
            System.out.println("myArrayList.remove(i) = " + myArrayList.get(i));
            myArrayList.remove(i);
        }


        System.out.println("myArrayList.size() before clear() = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("myArrayList.size() after clear() = " + myArrayList.size());

        // MyArrayList test
        myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        System.out.println("MyArrayList: " + myArrayList);
        System.out.println("Size: " + myArrayList.size());
        System.out.println("Element at index 1: " + myArrayList.get(1));
        myArrayList.remove(1);
        System.out.println("MyArrayList after removing element at index 1: " + myArrayList);
        myArrayList.clear();
        System.out.println("MyArrayList after clear: " + myArrayList);

    }

}

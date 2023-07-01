public class Lecture15{
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    static void add_one(int z){
        z=z+1;
    }
    static void add_one(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            arr1[i]++;
        }
    }
    public static void main(String[] args) {
        int size=4;
        int arr[]=new int[size];// array declaration syntax

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        
        print(arr);
        for(int i=0;i<size;i++){
            arr[i]=i+1;
        }
        print(arr);
        int arr2[]={13,53,22};
        print(arr2);

        //to increase the size of the array we need to create a duplicate array and copy all of the elements from the existing array
       

	int copyArr[]=new int[2*size];
        for(int i=0;i<size;i++){
            copyArr[i]=arr[i];//copying the elements of the arr in copy_arr
        }
        copyArr[5]=69;
        copyArr[6]=70;
        print(copyArr);

        //pass by value
        int z=20;
        add_one(20);
        System.out.println(z); // will print 10


        int arr1[]={1,2,3,4,5};
        add_one(arr1);// will increase all of the elements why one in the original array
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
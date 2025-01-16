package day_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_list {
    public static void main(String[] args) {
        //Integer []arr={1,3,5,7,8,9};
        // List<Integer> a=Arrays.asList(arr);
        //a.add(10);
        // List<Integer> list=List.of(4,5,7,8,9,23,65,7,68,89,7);
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        List<Integer> mylist=new ArrayList<>();

        mylist.add(5);
        mylist.add(10);
        mylist.add(10);
        mylist.add(15);
        mylist.add(15);
        mylist.add(15);
        mylist.add(20);
        mylist.add(20);
        mylist.add(25);
        mylist.add(25);
        System.out.println(mylist);

        tekrarsizList(mylist);


    }

    private static void tekrarsizList(List<Integer> mylist) {
        List<Integer>newList=new ArrayList<>();
        for(int w:mylist){
            if (!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);

    }
}
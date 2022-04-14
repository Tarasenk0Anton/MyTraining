package LinkLesson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class testList_Iter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        //forCircle(list);

        //forCircleItr(list);

        /*
        IntStream.range(0,list.size()) // Создаем поток от 0 до size
                .filter(x->x%2!=0)     // отбор
                .forEach(x->list.remove(x)); // удаление по новым индексам

        System.out.println(list);
        */
        List<Integer> collect = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void forCircle(List<Integer> l){
        int k = l.size();
        for (int i = 0; i < k; i++) {
            if (i%2 != 0){
                l.remove(i);
            }
        }

        System.out.println(l);
    }

    public static void forCircleItr(List<Integer> l){
        /*
        for (int i = 0; i < l.size(); i++) {
            if (i%2 != 0){
                l.remove(i);
            }
        }
        */

        Iterator<Integer> iter = l.iterator();
        int i = 0;

        while (iter.hasNext()){
            if (i%2 != 0){
                iter.remove();
            }
           i++;
            iter.next();
        }

        System.out.println(l);
    }




}

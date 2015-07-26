package net.mindview.util;

/**
 * Created by wwh on 15-5-7.
 */
public class Range {
    public static int[] range(int n){
        int[] result = new int[n];
        for(int i = 0; i < n; ++i){
            result[i] = i;
        }
        return result;
    }

    public static int[] range(int begin, int end){
        int sz = end-begin;
        int[] result = new int[sz];
        for(int i = 0; i < sz; ++i){
            result[i] = begin + i;
        }
        return result;
    }

    public static int[] range(int begin, int end, int step){
        int sz = (end-begin)/step;
        int[] result = new int[sz];
        for(int i = 0; i < sz; ++i){
            result[i] = begin + i*step;
        }
        return result;
    }
}





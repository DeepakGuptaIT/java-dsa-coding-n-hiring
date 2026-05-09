package com.firealgo.dsandalgo.algo.amazonCodingPractise;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

public class FlattenArray {
	
	private static List<Object> flatten(Object object) {
        List<Object> l = new ArrayList<Object>();
        if (object.getClass().isArray()) {
            for (int i = 0; i < Array.getLength(object); i++) {
                l.addAll(flatten(Array.get(object, i)));
            }
        } else if (object instanceof List) {
            for (Object element : (List<?>) object) {
                l.addAll(flatten(element));
            }
        } else {
            l.add(object);
        }
        return l;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

package com.firealgo.javabasicconcept.generics;


record Emp(int id, String name){}
public class ConvertClassType {
    public static void main(String[] args) {
        String out = convert(new Emp(1, "deepak"));
        System.out.println(out);
    }
    private static <S,T> T convert(S source) {
        if (source instanceof Emp) {
            return (T)((Emp) source).name();
        }
        return null;

    }
}

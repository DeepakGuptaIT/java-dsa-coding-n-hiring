package com.firealgo.javabasicconcept.generics;

import com.firealgo.javabasicconcept.enums.OrderState;
import com.firealgo.javabasicconcept.enums.OrderStatus;

public class ConvertEnumType {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PROCESSING;

        OrderState state = convert(
                status,
                OrderState.class
        );

        System.out.println(state);
    }

    // No Generics
//    private static OrderState convertNoGenerics(OrderStatus status, Class<OrderState> orderStateClass) {
//
//    }

    private static <S extends Enum<S>, T extends Enum<T>> T convert(S source, Class<T> targetEnumClass) {
        if(source == null) {
            return null;
        }
        return Enum.valueOf(targetEnumClass, source.name());
    }
}

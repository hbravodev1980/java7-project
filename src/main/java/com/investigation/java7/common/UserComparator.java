package com.investigation.java7.common;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User object1, User object2) {
        return object1.getAge().compareTo(object2.getAge());
    }
}
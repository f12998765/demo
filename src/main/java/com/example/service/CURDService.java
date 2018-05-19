package com.example.service;

public interface CURDService<T> {
    boolean add(T t);
    T get(long id);
    boolean up(T t);
    boolean del(long id);
}

package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void hasCityTest() {
        list = MockCityList();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.hasCity(), true);
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        int listSize = list.getCount();
        list.deleteCity();
        assertEquals(list.getCount(), listSize - 1);
    }
    @Test
    public void countCityTest() {
        list = MockCityList();
        assertEquals(list.getCount(), 0);
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), 1);
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), 2);
    }

}

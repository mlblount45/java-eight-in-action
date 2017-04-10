package com.marquisblount.collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Test;

import com.marquisblount.collector.models.Dish;
import com.marquisblount.collector.models.Dish.Type;

/**
 * Created by mlblount on 4/10/17.
 */
public class SubgroupCollectorTest {

  @Test
  public void when() {
    Dish d1 = new Dish();
    d1.setName("d1");
    d1.setType(Type.DIET);
    d1.setCalories(200);

    Dish d11 = new Dish();
    d11.setType(Type.DIET);
    d11.setName("d11");
    d11.setCalories(300);

    Dish d2 = new Dish();
    d2.setType(Type.FAT);
    d2.setName("d2");
    d2.setCalories(400);

    Dish d22 = new Dish();
    d22.setType(Type.FAT);
    d22.setCalories(500);
    d22.setName("d22");

    Dish d3 = new Dish();
    d3.setType(Type.NORMAL);
    d3.setCalories(600);
    d3.setName("d3");

    List<Dish> dishes = Arrays.asList(d1, d11, d2, d22, d3);

    SubgroupCollector sc = new SubgroupCollector();

    Map<Type, Optional<Dish>> topCaloricDishes = sc.topCaloricDishesByType(dishes);

    System.out.println(topCaloricDishes);

  }
}
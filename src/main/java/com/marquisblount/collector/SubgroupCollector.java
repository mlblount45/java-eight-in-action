package com.marquisblount.collector;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.marquisblount.collector.models.Dish;
import com.marquisblount.collector.models.Dish.Type;

/**
 * Created by mlblount on 4/10/17.
 */
public class SubgroupCollector {


  public Map<Type, Optional<Dish>> topCaloricDishesByType(List<Dish> dishes) {
    return dishes.stream()
        .collect(groupingBy(Dish::getType, maxBy(Comparator.comparingInt(Dish::getCalories))));
  }
}

// CHECKSTYLE:OFF
/**
 * Copyright 2013 BigML
 * Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package com.bigml.histogram;

public class SumResult<T extends Target<T>> {
  public SumResult(double count, T targetSum) {
    _count = count;
    _targetSum = targetSum;
  }
  
  public double getCount() {
    return _count;
  }
  
  public T getTargetSum() {
    return _targetSum;
  }
  
  private final double _count;
  private final T _targetSum;
}

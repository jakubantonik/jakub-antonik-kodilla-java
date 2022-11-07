package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;
    
    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }


    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String,Double> temperature : temperatures.getTemperatures().entrySet()){
            //adding 1 celsius degree to current value
            //as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }
    public double calculateAverage(){
        Collection<Double> values = temperatures.getTemperatures().values();
        List<Double> numbers = new ArrayList<>(values);
        double result = 0;
        for (Double number : numbers){
            result += number;
        }
        return result/numbers.size();
    }

    public double calculateMedian(){
        Collection<Double> values = temperatures.getTemperatures().values();
        List<Double> numbers = new ArrayList<>(values);
        Collections.sort(numbers);
        if (numbers.size()%2==0){
            double firstValue = numbers.get(numbers.size()/2);
            double secondValue = numbers.get(numbers.size()/2-1);
            double median = (firstValue+secondValue)/2;
            return median;
        } else {
            double median = numbers.get(numbers.size()/2);
            return median;
        }


    }

}

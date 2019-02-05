/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obsorver1;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;    
    private float pressure;
    
    public WeatherData(){
        observers = new ArrayList();
    }
    
    public void registerObserver(Observer o){
        observers.add(o);        
    }
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >=0) {
            observers.remove(i);
        }
    }
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    
    
}
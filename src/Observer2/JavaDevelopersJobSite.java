/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;
//реализация того за кем наблюдаем

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author user
 */
public class JavaDevelopersJobSite implements Observed {
    
    List<String> vacancies = new ArrayList<>();
    
    List<Observer> subscribers = new ArrayList<>();
    
    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifayObservers();        
    
  
    }
  public void removeVacancy(String vacancy) {
      this.vacancies.remove(vacancy);
      notifayObservers();
    }
  public void addObserver(Observer observer) {
      this.subscribers.add(observer);
  }
  public void removeObserver(Observer observer) {
      this.subscribers.remove(observer);
  }
  public void notifayObservers() {
      for (Observer observer: subscribers) {
          observer.handleEvent(this.vacancies);
      }
    
}
}

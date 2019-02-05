/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

/**
 *
 * @author user
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDevelopersJobSite jobSite = new JavaDevelopersJobSite();
        
        Observer firstSubObserver = new Subscriber("Jelena Petrova");
        Observer secondSObserver = new Subscriber("Tim Hex");
        Observer thirSubObserver = new Subscriber("Aaron gimp");
        
        jobSite.addObserver(thirSubObserver);
        jobSite.addObserver(secondSObserver);
        jobSite.addObserver(thirSubObserver);
        
        jobSite.addVacancy("Java developer in Tall");
        jobSite.addVacancy("Java developer in Berlin");
        jobSite.addVacancy("Java developer in Riga");
        
        //удалить 1 вакансию
        jobSite.removeVacancy("Java developer in Tall");
    
}
}

package com.designpattern.observerpattern;

import java.util.ArrayList;

public class CricketData implements Subject {

    int runs;
    int wickets;
    float overs;
    ArrayList<Observer> observerList;

    public CricketData()
    {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        for(Observer ob : observerList)
        {
            ob.update(runs, wickets, overs);
        }
    }

    //get latest runs from stadium
    private int getLatestRuns()
    {
        //return 90 for simplicity
        return 90;
    }

    //get latest wickets from stadium
    private int getLatestWickets()
    {
        //return 2 for simplicity
        return 2;
    }

    //get latest overs from stadium
    private float getOvers()
    {
        //return 0.2 for simplicity
        return (float)0.2;
    }

    //This method is used to update displays when data changes
    public void dataChanged()
    {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getOvers();

        notifyObservers();
    }
}

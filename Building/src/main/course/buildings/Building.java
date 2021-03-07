/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.course.buildings;

/**
 *
 * @author Citlalli
 */
public class Building {
    private Double pies;
    private String stories;

    public Building(Double pies, String stories) {
        this.pies = pies;
        this.stories = stories;
    }

    public Double getPies() {
        return pies;
    }

    public void setPies(Double pies) {
        this.pies = pies;
    }

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }
    @Override
    public String toString(){
        return this.pies+" "+this.stories;
    }
}

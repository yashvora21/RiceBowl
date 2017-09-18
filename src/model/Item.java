/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author YASH
 */
public class Item {
    public String name;
    public String type;
    public double cost;
    public int index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Item(String name, String type, double cost, int index) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.index = index;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", type=" + type + ", cost=" + cost + ", index=" + index + '}';
    }

       
}
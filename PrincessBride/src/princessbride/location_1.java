/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride;
import java.io.Serializable;
/**
 *
 * @author lisawalker
 */
public class Location implements Serializable{
    // class instance variables
         private String name;
          private double row;
          private double column;
          private double visited;
          private double description;
          private double addItem;
          
          

    public double getAddItem() {
        return addItem;
    }

    public void setAddItem(double addItem) {
        this.addItem = addItem;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
        this.visited = visited;
    }

    public double getDescription() {
        return description;
    }

    public void setDescription(double description) {
        this.description = description;
    }

           
                            
            
}

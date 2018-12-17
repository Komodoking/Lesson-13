/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajdy5510
 */
public class Task {
    String name,description;
    public Task(String n,String d){
        name=n;
        description=d;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public boolean validate(){
        if(name==null||description==null||name.equals("")||description.equals("")){
            return false;
            
        }
        else 
            return true;
    }
    public String toString(){
        return "Name: "+name+"\nDescription"+description+"\n=========\n";
    }
}

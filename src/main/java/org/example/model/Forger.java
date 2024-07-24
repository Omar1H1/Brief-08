package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Forger extends Character{
    public List wepeansList;

    public Forger() {
        super();
        this.wepeansList = new ArrayList();
    }



    public Integer getWepeansNumber () {
        return wepeansList.size();
    }
}

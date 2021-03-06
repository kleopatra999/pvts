/*
 * SEString.java
 *
 * Created on June 22, 2006, 1:58 PM
 *
  Pilo's Visualization Tools for Scheme (PVTS). A Basic Visual Scheme Interpreter. 
    Copyright (C) 2007  David A. Pilo Mansion

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.

Contact information:
David Pilo
davidpilo@gmail.com
 */

/**
 *
 * @author david pilo
 */
import java.awt.*;
import java.awt.event.*;

class SEString extends Atom {
    String st;
    
    SEString(String s) {
        st = "\"" + s + "\"";
        x = 0;
        y = 0;
    }
    
    void print() {
        PVTSFrame.put(st);
    }
    
    public String getPrintable() {
        return st;
    }
    
    public String display() {
        return st.substring(1,st.length()-1);
    }
    
    public SEString copy() {
        //  TextIO.put("done SEInt copy");
        return new SEString(this.st);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    
    
    public String stringValue() {
        return st;
    }
    
    
    public void draw(Graphics g) {
        g.drawString(st,x,y);
    }
    
}

/*
 * RecursiveCircleStdDraw.java
 * 
 * Copyright 2020 Tina Chen <ChenTina@10-72-120-211.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class RecursiveCircleStdDraw {
       
     public static void main(String[] args) {
         drawCircle(0.5,0.5,0.4);    
    }
    
    public static void drawCircle(double x, double y, double size) {
        if (size > 0.005){
            // StdDraw uses the radius of the circle as the last argument
            StdDraw.circle(x,y,size);
            StdDraw.setPenColor(StdDraw.RED);
            drawCircle(x - size/2, y, size/2);
            StdDraw.setPenColor(StdDraw.BLUE);
            drawCircle(x + size/2, y, size/2);
            //pause for 100 ms before doing any further drawing
            StdDraw.show(100);
       }
    }

}

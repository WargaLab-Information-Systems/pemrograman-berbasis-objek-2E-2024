/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polygonhierarchy;

/**
 *
 * @author AbasZ
 */
public class PolygonHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        polygon Polygon = new polygon();
        System.out.println("Side length of polygon is " + Polygon.getLength());
        System.out.println("Number of side is " + Polygon.getNumberOfSides());
        System.out.println("The area of polygon is " +Polygon.getArea());
    }
    
}

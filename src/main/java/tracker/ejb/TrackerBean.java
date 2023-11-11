// TrackerBean.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package tracker.ejb;
import jakarta.ejb.Stateful;
/**
 *
 * @author usser
 */
@Stateful
public class TrackerBean implements TrackerBeanLocal {
    private double total = 0;
    private int count = 0;
    
    @Override
    public double add(double value) {
        total += value;
        count += 1;
        return total;
    }
    @Override
    public double average() {
        return total / count;
    }
    @Override
    public int getCount() {
        return count;
    }
    @Override
    public double getTotal() {
        return total;
    }
    
}
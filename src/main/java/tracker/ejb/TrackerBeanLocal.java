package tracker.ejb;

import jakarta.ejb.Local;

@Local
public interface TrackerBeanLocal {
    public double add(double value);
    public double average();
    public int getCount();
    public double getTotal();

}


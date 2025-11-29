package clockSim;

/**
 * Mid level class which represents set of digital clocks.
 * @author Luis Martinez
 * @version 0.1.0.0 (MARKETING.BREAKING.FEATURE.PATCH) - 
 * Create class
 */
public abstract class DigitalClock extends Clock {

    /**
     * Constructor with a default initial time.
     * @param drift How much this clock drifts away from real time per tick / virtual second.
     */
    protected DigitalClock(double drift){
        super(drift);
    }
}

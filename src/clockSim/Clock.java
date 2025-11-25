/**
 * 
 */
package clockSim;

/**
 * Base class for all Clocks. Contains:
 * Integer clockTime,
 * double driftPerSecond,
 * virtual (empty) methods reset, tick, displayTime.
 */
abstract class Clock {
    /**
     * Current time stored in a clock, stored as an integer which emulates Unix time behaviour.
     */
    protected int clockTime;

    /**
     * How much this clock drifts away from "true" time every second.
     */
    private double driftPerSecond;

    /**
     * Returns clockTime to 0.
     */
    protected abstract void reset();
}

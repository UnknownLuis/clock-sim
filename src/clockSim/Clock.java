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

}

package com.consciousness.thinking.decide;

/**
 * This class represents a decision that needs to be made.
 *
 * @author <a href="mailto:shawn.catoe@gmail.com">b3ll4t0r</a>
 */
public abstract class Decision {

    /** This is the type of strategy which will be used to interpret the {@link Score}s that are returned. */
    private Strategy.Type strategyType;
    //TODO: provide Strategy implementations?

    /**
     * Returns the {@link Strategy.Type} value for strategy.
     *
     * @return The value of strategyType.
     */
    protected Strategy.Type getStrategyType() {
        return strategyType;
    }

    /**
     * Sets the {@link Strategy.Type} value for strategy.
     *
     * @param strategyType The new value.
     */
    protected void setStrategyType(final Strategy.Type strategyType) {
        this.strategyType = strategyType;
    }
}

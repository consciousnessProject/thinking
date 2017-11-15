package com.consciousness.thinking.decide;

import java.util.HashMap;
import java.util.Map;


/**
 * This class represents a decision that needs to be made.
 *
 * @author <a href="mailto:shawn.catoe@gmail.com">b3ll4t0r</a>
 */
public abstract class Decision {

    public enum ModelType {
        DECIDER,
        SHADOW;
    }

    /** This is the type of strategy which will be used to interpret the {@link Score}s that are returned. */
    private Strategy.Type strategyType;
    //TODO: provide Strategy implementations?

    /** This is a Map of {@link Model}s that we will execute as a part of this decision. */
    private Map<ModelType, Model> models = new HashMap<ModelType, Model>();

    /** This is how this object gives data to the {@link Model}s. */
    private DataProvider dataProvider;

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

    /**
     * This method enqueues a {@link Model} to be used in the {@link Strategy.Type}.
     * @param model The model to be executed.
     */
    protected void addDecidingModel(final Model model) {
        models.put(ModelType.DECIDER, model);
    }

    /**
     * This method enqueues a {@link Model} to be executed outside of the scope of the {@link Strategy.Type}.
     * @param model The model to be executed.
     */
    protected void addShadowModel(final Model model) {
        models.put(ModelType.SHADOW, model);
    }

    /**
     * Returns the {@link DataProvider} value for dataProvider.
     *
     * @return The value of dataProvider.
     */
    protected DataProvider getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the {@link DataProvider} value for dataProvider.
     *
     * @param dataProvider
     *         The new value.
     */
    protected void setDataProvider(final DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }
}

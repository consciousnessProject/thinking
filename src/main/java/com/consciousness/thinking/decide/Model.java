package com.consciousness.thinking.decide;

/**
 * This class provides a {@link Score} which is used by the {@link Strategy} to divine a {@link Decision}.
 *
 * @author <a href="mailto:shawn.catoe@gmail.com">b3ll4t0r</a>
 */
public interface Model {

    /**
     * This is a convience method.  The idea is the {@link DataProvider} contains, or computes, or obtains the data
     * needed.
     * @param dataProvider Provides data from the {@link Decision} and is able to compute and obtain new data.
     * @return The {@link Score} in percentage or whole values.
     */
    public Score compute(DataProvider dataProvider);
}

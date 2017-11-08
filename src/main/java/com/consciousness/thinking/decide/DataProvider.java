package com.consciousness.thinking.decide;

/**
 * This class takes in the full {@link DataSet} and gets the right data for the {@link Model}.
 *
 * @author <a href="mailto:shawn.catoe@gmail.com">b3ll4t0r</a>
 */
public interface DataProvider {

    /**
     * Return the {@link DataSet} that was provided by the {@link Decision}.
     * @return what was provided by the {@link Decision}.
     */
    DataSet getProvidedData();

    /**
     * A method for allowing the {@link Decision} to provide data.
     * @param dataSet The {@link DataSet} provided by the {@link Decision}.
     */
    void setProvidedData(final DataSet dataSet);

    /**
     * Return the {@link DataSet} which was provided plus the computed or obtained data.
     * @return The provided data including computed or obtained data.
     */
    DataSet getRequiredData();
}

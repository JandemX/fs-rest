package edu.hm.cs.fs.common.constant;

/**
 * Studies at the University of applied Science Munich.
 *
 * @author Fabio
 */
public enum Study {
    /**
     * Geothelematik und Navigation Bachelor
     */
    GO,
    /**
     * Wirtschaftsinformatik Bachelor
     */
    IB,
    /**
     * Scientific Computing Bachelor
     */
    IC,
    /**
     * Informatik Bachelor
     */
    IF,
    /**
     * Informatik Master
     */
    IG,
    /**
     * Wirtschaftsinformatik Master
     */
    IN,
    /**
     * Stochastic Engineering in Business and Finance Master
     */
    IS;

    /**
     * @return the study.
     */
    public static Study of(final String studyKey) {
        for (final Study study : values()) {
            if (study.toString().equalsIgnoreCase(studyKey)) {
                return study;
            }
        }
        return null;
    }
}

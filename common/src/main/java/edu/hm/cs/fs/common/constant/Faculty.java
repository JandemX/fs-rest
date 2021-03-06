package edu.hm.cs.fs.common.constant;

/**
 * @author Fabio
 */
public enum Faculty {
    /**
     * Architektur
     */
    _01("01"),
    /**
     * Bauingenieurwesen
     */
    _02("02"),
    /**
     * Maschinenbau, Fahrzeugtechnik, Flugzeugtechnik
     */
    _03("03"),
    /**
     * Elektrotechnik und Informationstechnik
     */
    _04("04"),
    /**
     * Versorgungs- und Gebäudetechnik, Verfahrenstechnik Papier und Verpackung, Druck- und
     * Medientechnik
     */
    _05("05"),
    /**
     * Angewandte Naturwissenschaften und Mechatronik
     */
    _06("06"),
    /**
     * Informatik und Mathematik
     */
    _07("07"),
    /**
     * Geoinformatik
     */
    _08("08"),
    /**
     * Wirtschaftsingenieurwesen
     */
    _09("09"),
    /**
     * Betriebswirtschaft
     */
    _10("10"),
    /**
     * Angewandte Sozialwissenschaften
     */
    _11("11"),
    /**
     * Design
     */
    _12("12"),
    /**
     * Studium Generale und Interdisziplinäre Studien
     */
    _13("13"),
    /**
     * Tourismus
     */
    _14("14");

    private final String mKey;

    Faculty(final String key) {
        mKey = key;
    }

    /**
     * @param key
     * @return
     */
    public static Faculty of(final String key) {
        for (final Faculty faculty : values()) {
            if (faculty.getKey().equalsIgnoreCase(key)) {
                return faculty;
            }
        }
        return null;
    }

    /**
     * @return the key.
     */
    private String getKey() {
        return mKey;
    }
}

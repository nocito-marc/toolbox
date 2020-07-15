package com.toolbox.utils.properties;

public class InternationalizationProperties extends AbstractProperties{

    private static final String FILENAME = "internationalization.properties";

    InternationalizationProperties() {
    }

    private static class Holder {
        private static final InternationalizationProperties instance = new InternationalizationProperties();
    }

    public static InternationalizationProperties getInstance() {
        return InternationalizationProperties.Holder.instance;
    }

    @Override
    protected String getFilename() {
        return FILENAME;
    }
}

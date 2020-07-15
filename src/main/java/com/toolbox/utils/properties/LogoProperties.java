package com.toolbox.utils.properties;

public class LogoProperties extends AbstractProperties{

    private static final String FILENAME = "logo.properties";

    LogoProperties() {
    }

    private static class Holder {
        private static final LogoProperties instance = new LogoProperties();
    }

    public static LogoProperties getInstance() {
        return LogoProperties.Holder.instance;
    }

    @Override
    protected String getFilename() {
        return FILENAME;
    }
}

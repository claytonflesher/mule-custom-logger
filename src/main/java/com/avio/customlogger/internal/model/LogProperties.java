package com.avio.customlogger.internal.model;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public class LogProperties {


    @Parameter
    @Optional
    @DisplayName("Message")
    @Summary("Message to be logged")
    private String message;
    @Parameter
    @DisplayName("Level")
    @Optional(defaultValue = "INFO")
    private LoggerLevelProperty.LogLevel level;

    public tracePointProperty.tracePoint getTracePoint() {
        return tracePoint;
    }

    public void setTracePoint(tracePointProperty.tracePoint tracePoint) {
        this.tracePoint = tracePoint;
    }

    @Parameter
    @DisplayName("Trace Point")
    @Optional(defaultValue = "START")
    private tracePointProperty.tracePoint tracePoint;
    @Parameter
    @Optional(defaultValue = "#['com.avio.' ++ p('app.name')]")
    @DisplayName("Category")
    private String category;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoggerLevelProperty.LogLevel getLog_level() {
        return level;
    }

    public void setLog_level(LoggerLevelProperty.LogLevel log_level) {
        this.level = level;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
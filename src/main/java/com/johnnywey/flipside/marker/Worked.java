package com.johnnywey.flipside.marker;

import com.johnnywey.flipside.failable.Fail;

import java.io.Serializable;

/**
 * Signal an operation went as expected.
 */
public class Worked implements DidItWork, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public Fail getReason() {
        return Fail.SUCCESS;
    }

    @Override
    public String getDetail() {
        return Fail.SUCCESS.name();
    }

    @Override
    public Boolean isSuccess() {
        return true;
    }

    @Override
    public void ifItWorked(final MarkerConsumer consumer) {
        consumer.onItWorked();
    }

    @Override
    public boolean asBoolean() {
        return true;
    }

    @Override
    public String toString() {
        return getReason() + " - " + getDetail();
    }
}

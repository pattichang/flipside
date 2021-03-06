package com.johnnywey.flipside.marker;

import com.johnnywey.flipside.failable.Fail;

import java.io.Serializable;

/**
 * Signal that an operation did not work. Contains the {@link com.johnnywey.flipside.failable.Failed} instance
 * for interrogation.
 */
public class DidNotWork implements DidItWork, Serializable {
    private static final long serialVersionUID = 1L;

    private final Fail failure;
    private final String reason;

    public DidNotWork(Fail failure, String reason) {
        this.failure = failure;
        this.reason = reason;
    }

    @Override
    public Fail getReason() {
        return failure;
    }

    @Override
    public String getDetail() {
        return reason;
    }

    @Override
    public Boolean isSuccess() {
        return false;
    }

    @Override
    public void ifItWorked(final MarkerConsumer consumer) {
        // Do nothing
    }

    @Override
    public boolean asBoolean() {
        return false;
    }

    @Override
    public String toString() {
        return getReason() + " - " + getDetail();
    }
}

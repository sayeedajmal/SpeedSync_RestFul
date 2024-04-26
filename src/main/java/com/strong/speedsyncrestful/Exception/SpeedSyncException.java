package com.strong.speedsyncrestful.Exception;


public class SpeedSyncException extends Exception {

    public SpeedSyncException() {
        super();
    }

    public SpeedSyncException(String Message) {
        super(Message);
    }

    public SpeedSyncException(String Message, Throwable throwable) {
        super(Message, throwable);
    }

    public SpeedSyncException(Throwable throwable) {
        super(throwable);
    }

}
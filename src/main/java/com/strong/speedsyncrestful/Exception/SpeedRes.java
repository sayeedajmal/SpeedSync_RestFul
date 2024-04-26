package com.strong.speedsyncrestful.Exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SpeedRes {
    private String Message;
    private Integer Status;
    private long TimeStamp;
}
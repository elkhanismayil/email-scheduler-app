package com.example.emailscheduler.payload;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class EmailResponse {

    @NonNull
    private boolean success;
    private String jobId;
    private String jobGroup;
    @NonNull
    private String message;
}

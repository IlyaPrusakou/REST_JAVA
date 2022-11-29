package com.ilya.ilya_artifact.restservice;

public class Greeting {
    private final long Id;
    private final String Content;

    public Greeting(long Id, String Content) {
    this.Id = Id;
    this.Content = Content;
    }


    public String getContent() {
        return Content;
    }

    public long getId() {
        return Id;
    }
}

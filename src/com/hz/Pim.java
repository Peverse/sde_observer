package com.hz;

public class Pim extends Student{

    public Pim() {
        super("Pim");
    }

    @Override
    public String getOpinion() {

        String msg = "I guess I'll listen to your lecture about %s.";

        return msg;
    }
}

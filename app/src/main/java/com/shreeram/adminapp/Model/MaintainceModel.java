package com.shreeram.adminapp.Model;

public class MaintainceModel {
    String societyName;
    String mantaines;
    String meter;

    public MaintainceModel(String societyName, String mantaines, String meter) {
        this.societyName = societyName;
        this.mantaines = mantaines;
        this.meter = meter;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getMantaines() {
        return mantaines;
    }

    public void setMantaines(String mantaines) {
        this.mantaines = mantaines;
    }

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }
}

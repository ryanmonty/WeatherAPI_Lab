package co.grandcircus.weatherapilab.model;

import java.util.ArrayList;
import java.util.List;

public class time {

    private List<String> startPeriodName = new ArrayList<String>();
    private List<String> tempLabel = new ArrayList<String>();

    public List<String> getStartPeriodName() {
        return startPeriodName;
    }

    public void setStartPeriodName(List<String> startPeriodName) {
        this.startPeriodName = startPeriodName;
    }

    public List<String> getTempLabel() {
        return tempLabel;
    }

    public void setTempLabel(List<String> tempLabel) {
        this.tempLabel = tempLabel;
    }
}

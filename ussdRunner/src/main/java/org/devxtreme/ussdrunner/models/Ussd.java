package org.devxtreme.ussdrunner.models;

import android.text.TextUtils;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * @author TCHECHE ROMEO
 * @version 1.0
 * @created 20-mai-2020 23:49:38
 */
public class Ussd  implements Serializable {

    private String id;
    private String title;
    private String format;
    private Boolean stepByStepExecution;
    private String effectiveExecutionRegex = "";
    private List<UssdMark> ussdMarks = new ArrayList<>();

    public Ussd() {
    }

    public String buildId() {
        if (TextUtils.isEmpty(id)) {
            id = UUID.randomUUID().toString();
        }
        return id;
    }

    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getStepByStepExecution() {
        return stepByStepExecution;
    }

    public void setStepByStepExecution(Boolean stepByStepExecution) {
        this.stepByStepExecution = stepByStepExecution;
    }

    public String getEffectiveExecutionRegex() {
        return effectiveExecutionRegex;
    }

    public void setEffectiveExecutionRegex(String effectiveExecutionRegex) {
        this.effectiveExecutionRegex = effectiveExecutionRegex;
    }

    public List<UssdMark> getUssdMarks() {
        return ussdMarks;
    }

    public void setUssdMarks(List<UssdMark> ussdMarks) {
        this.ussdMarks = ussdMarks;
    }

    public Ussd clone() {
        Ussd ussd = new Ussd();
        ussd.id = this.id;
        ussd.title = this.title;
        ussd.format = this.format;
        ussd.stepByStepExecution = this.stepByStepExecution;
        ussd.effectiveExecutionRegex = this.effectiveExecutionRegex;
        ussd.ussdMarks = this.ussdMarks;
        return ussd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ussd ussd = (Ussd) o;
        return id.equals(ussd.id);
    }

    @Override
    public int hashCode() {
        return 122;
    }

    @Override
    public String toString() {
        return "Ussd{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", stepByStepExecution=" + stepByStepExecution +
                ", effectiveExecutionRegex='" + effectiveExecutionRegex + '\'' +
                ", ussdMarks=" + ussdMarks +
                '}';
    }
}

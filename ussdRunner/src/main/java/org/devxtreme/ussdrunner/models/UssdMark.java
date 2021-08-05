package org.devxtreme.ussdrunner.models;

import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import org.devxtreme.ussdrunner.consts.MarkType;

import java.io.Serializable;
import java.util.UUID;


/**
 * @author TCHECHE ROMEO
 * @version 1.0
 * @created 20-mai-2020 23:49:38
 */
public class UssdMark  implements Serializable {

    private String id;
    @StringRes
    private int designation;
    private String value = "";
    private Integer position = 0;
    private MarkType type = MarkType.UNDEFINED;


    public UssdMark() {
    }

    public UssdMark(@StringRes int designation, String value, Integer position, MarkType type) {
        this.designation = designation;
        this.value = value;
        this.position = position;
        this.type = type;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MarkType getType() {
        return type;
    }

    public void setType(MarkType type) {
        this.type = type;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(@StringRes int designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UssdMark ussdMark = (UssdMark) o;
        return id.equals(ussdMark.id);
    }

    @Override
    public int hashCode() {
        return 122;
    }

    @Override
    public String toString() {
        return "UssdMark{" +
                "id='" + id + '\'' +
                ", designation='" + designation + '\'' +
                ", position='" + position + '\'' +
                ", value='" + value + '\'' +
                ", type=" + type +
                '}';
    }
}

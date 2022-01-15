/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class Tt640pk0GetMakeupUnitResponsePoutMakeup implements Serializable {


    @ColumnAlias("LCNCOD")
    private String lcncod;

    public String getLcncod() {
        return this.lcncod;
    }

    public void setLcncod(String lcncod) {
        this.lcncod = lcncod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tt640pk0GetMakeupUnitResponsePoutMakeup)) return false;
        final Tt640pk0GetMakeupUnitResponsePoutMakeup tt640pk0getMakeupUnitResponsePoutMakeup = (Tt640pk0GetMakeupUnitResponsePoutMakeup) o;
        return Objects.equals(getLcncod(), tt640pk0getMakeupUnitResponsePoutMakeup.getLcncod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLcncod());
    }
}
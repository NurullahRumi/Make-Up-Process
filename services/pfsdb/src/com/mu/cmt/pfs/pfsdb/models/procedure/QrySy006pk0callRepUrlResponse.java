/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class QrySy006pk0callRepUrlResponse implements Serializable {


    @ColumnAlias("pOutUrl")
    private String poutUrl;

    public String getPoutUrl() {
        return this.poutUrl;
    }

    public void setPoutUrl(String poutUrl) {
        this.poutUrl = poutUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QrySy006pk0callRepUrlResponse)) return false;
        final QrySy006pk0callRepUrlResponse qrySy006pk0callRepUrlResponse = (QrySy006pk0callRepUrlResponse) o;
        return Objects.equals(getPoutUrl(), qrySy006pk0callRepUrlResponse.getPoutUrl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoutUrl());
    }
}
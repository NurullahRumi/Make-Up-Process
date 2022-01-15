/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcMk103pk0ordqryGetOrdcommentResponsePoutCommentsList implements Serializable {


    @ColumnAlias("REQUESTNO")
    private String requestno;

    @ColumnAlias("COMMENTS")
    private String comments;

    @ColumnAlias("INPUTDATE")
    private LocalDateTime inputdate;

    public String getRequestno() {
        return this.requestno;
    }

    public void setRequestno(String requestno) {
        this.requestno = requestno;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDateTime getInputdate() {
        return this.inputdate;
    }

    public void setInputdate(LocalDateTime inputdate) {
        this.inputdate = inputdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcMk103pk0ordqryGetOrdcommentResponsePoutCommentsList)) return false;
        final ProcMk103pk0ordqryGetOrdcommentResponsePoutCommentsList procMk103pk0ordqryGetOrdcommentResponsePoutCommentsList = (ProcMk103pk0ordqryGetOrdcommentResponsePoutCommentsList) o;
        return Objects.equals(getRequestno(), procMk103pk0ordqryGetOrdcommentResponsePoutCommentsList.getRequestno()) &&
                Objects.equals(getComments(), procMk103pk0ordqryGetOrdcommentResponsePoutCommentsList.getComments()) &&
                Objects.equals(getInputdate(), procMk103pk0ordqryGetOrdcommentResponsePoutCommentsList.getInputdate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRequestno(),
                getComments(),
                getInputdate());
    }
}
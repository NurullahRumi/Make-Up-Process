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

public class ProcMk1100pk0GetGmtColourDetailsResponsePoutGmtclrList implements Serializable {


    @ColumnAlias("ORDNUM")
    private String ordnum;

    @ColumnAlias("CLRSEQ")
    private Byte clrseq;

    @ColumnAlias("W_CLRABB")
    private String wclrabb;

    @ColumnAlias("GMTSEQ")
    private String gmtseq;

    @ColumnAlias("W_GMTDES")
    private String wgmtdes;

    @ColumnAlias("W_CLICOD")
    private String wclicod;

    @ColumnAlias("W_SSHPDAT")
    private LocalDateTime wsshpdat;

    @ColumnAlias("W_MRCID")
    private String wmrcid;

    @ColumnAlias("W_MRCNAME")
    private String wmrcname;

    public String getOrdnum() {
        return this.ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }

    public Byte getClrseq() {
        return this.clrseq;
    }

    public void setClrseq(Byte clrseq) {
        this.clrseq = clrseq;
    }

    public String getWclrabb() {
        return this.wclrabb;
    }

    public void setWclrabb(String wclrabb) {
        this.wclrabb = wclrabb;
    }

    public String getGmtseq() {
        return this.gmtseq;
    }

    public void setGmtseq(String gmtseq) {
        this.gmtseq = gmtseq;
    }

    public String getWgmtdes() {
        return this.wgmtdes;
    }

    public void setWgmtdes(String wgmtdes) {
        this.wgmtdes = wgmtdes;
    }

    public String getWclicod() {
        return this.wclicod;
    }

    public void setWclicod(String wclicod) {
        this.wclicod = wclicod;
    }

    public LocalDateTime getWsshpdat() {
        return this.wsshpdat;
    }

    public void setWsshpdat(LocalDateTime wsshpdat) {
        this.wsshpdat = wsshpdat;
    }

    public String getWmrcid() {
        return this.wmrcid;
    }

    public void setWmrcid(String wmrcid) {
        this.wmrcid = wmrcid;
    }

    public String getWmrcname() {
        return this.wmrcname;
    }

    public void setWmrcname(String wmrcname) {
        this.wmrcname = wmrcname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcMk1100pk0GetGmtColourDetailsResponsePoutGmtclrList)) return false;
        final ProcMk1100pk0GetGmtColourDetailsResponsePoutGmtclrList procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList = (ProcMk1100pk0GetGmtColourDetailsResponsePoutGmtclrList) o;
        return Objects.equals(getOrdnum(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getOrdnum()) &&
                Objects.equals(getClrseq(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getClrseq()) &&
                Objects.equals(getWclrabb(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getWclrabb()) &&
                Objects.equals(getGmtseq(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getGmtseq()) &&
                Objects.equals(getWgmtdes(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getWgmtdes()) &&
                Objects.equals(getWclicod(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getWclicod()) &&
                Objects.equals(getWsshpdat(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getWsshpdat()) &&
                Objects.equals(getWmrcid(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getWmrcid()) &&
                Objects.equals(getWmrcname(), procMk1100pk0getGmtColourDetailsResponsePoutGmtclrList.getWmrcname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrdnum(),
                getClrseq(),
                getWclrabb(),
                getGmtseq(),
                getWgmtdes(),
                getWclicod(),
                getWsshpdat(),
                getWmrcid(),
                getWmrcname());
    }
}
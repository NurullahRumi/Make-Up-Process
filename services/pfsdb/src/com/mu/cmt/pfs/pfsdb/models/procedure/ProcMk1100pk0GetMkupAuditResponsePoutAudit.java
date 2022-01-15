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

public class ProcMk1100pk0GetMkupAuditResponsePoutAudit implements Serializable {


    @ColumnAlias("LCNCOD")
    private String lcncod;

    @ColumnAlias("PRGID")
    private String prgid;

    @ColumnAlias("AUDTYP")
    private String audtyp;

    @ColumnAlias("OPDATE")
    private LocalDateTime opdate;

    @ColumnAlias("DYEJOB")
    private String dyejob;

    @ColumnAlias("PRUNSZE")
    private Byte prunsze;

    @ColumnAlias("ORDNUM")
    private String ordnum;

    @ColumnAlias("AUDID")
    private String audid;

    @ColumnAlias("AUDDATE")
    private LocalDateTime auddate;

    @ColumnAlias("AUDFLD")
    private String audfld;

    @ColumnAlias("REMARKS")
    private String remarks;

    @ColumnAlias("LINTYP")
    private String lintyp;

    @ColumnAlias("GMTSEQ")
    private String gmtseq;

    @ColumnAlias("SZESEQ")
    private Byte szeseq;

    @ColumnAlias("CLRSEQG")
    private Byte clrseqg;

    @ColumnAlias("EMPCODE")
    private String empcode;

    @ColumnAlias("OPCODE")
    private String opcode;

    @ColumnAlias("STATION")
    private String station;

    @ColumnAlias("EMKLINE")
    private String emkline;

    @ColumnAlias("MKLINE")
    private String mkline;

    @ColumnAlias("OLDQTY")
    private Double oldqty;

    @ColumnAlias("NEWQTY")
    private Double newqty;

    @ColumnAlias("SYSTYP")
    private String systyp;

    @ColumnAlias("W_GMTDES")
    private String wgmtdes;

    @ColumnAlias("W_SZEDES")
    private String wszedes;

    @ColumnAlias("W_CLRDES")
    private String wclrdes;

    @ColumnAlias("W_NAME")
    private String wname;

    @ColumnAlias("W_DOPDESC")
    private String wdopdesc;

    @ColumnAlias("W_FORMDESC")
    private String wformdesc;

    public String getLcncod() {
        return this.lcncod;
    }

    public void setLcncod(String lcncod) {
        this.lcncod = lcncod;
    }

    public String getPrgid() {
        return this.prgid;
    }

    public void setPrgid(String prgid) {
        this.prgid = prgid;
    }

    public String getAudtyp() {
        return this.audtyp;
    }

    public void setAudtyp(String audtyp) {
        this.audtyp = audtyp;
    }

    public LocalDateTime getOpdate() {
        return this.opdate;
    }

    public void setOpdate(LocalDateTime opdate) {
        this.opdate = opdate;
    }

    public String getDyejob() {
        return this.dyejob;
    }

    public void setDyejob(String dyejob) {
        this.dyejob = dyejob;
    }

    public Byte getPrunsze() {
        return this.prunsze;
    }

    public void setPrunsze(Byte prunsze) {
        this.prunsze = prunsze;
    }

    public String getOrdnum() {
        return this.ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }

    public String getAudid() {
        return this.audid;
    }

    public void setAudid(String audid) {
        this.audid = audid;
    }

    public LocalDateTime getAuddate() {
        return this.auddate;
    }

    public void setAuddate(LocalDateTime auddate) {
        this.auddate = auddate;
    }

    public String getAudfld() {
        return this.audfld;
    }

    public void setAudfld(String audfld) {
        this.audfld = audfld;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLintyp() {
        return this.lintyp;
    }

    public void setLintyp(String lintyp) {
        this.lintyp = lintyp;
    }

    public String getGmtseq() {
        return this.gmtseq;
    }

    public void setGmtseq(String gmtseq) {
        this.gmtseq = gmtseq;
    }

    public Byte getSzeseq() {
        return this.szeseq;
    }

    public void setSzeseq(Byte szeseq) {
        this.szeseq = szeseq;
    }

    public Byte getClrseqg() {
        return this.clrseqg;
    }

    public void setClrseqg(Byte clrseqg) {
        this.clrseqg = clrseqg;
    }

    public String getEmpcode() {
        return this.empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getOpcode() {
        return this.opcode;
    }

    public void setOpcode(String opcode) {
        this.opcode = opcode;
    }

    public String getStation() {
        return this.station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getEmkline() {
        return this.emkline;
    }

    public void setEmkline(String emkline) {
        this.emkline = emkline;
    }

    public String getMkline() {
        return this.mkline;
    }

    public void setMkline(String mkline) {
        this.mkline = mkline;
    }

    public Double getOldqty() {
        return this.oldqty;
    }

    public void setOldqty(Double oldqty) {
        this.oldqty = oldqty;
    }

    public Double getNewqty() {
        return this.newqty;
    }

    public void setNewqty(Double newqty) {
        this.newqty = newqty;
    }

    public String getSystyp() {
        return this.systyp;
    }

    public void setSystyp(String systyp) {
        this.systyp = systyp;
    }

    public String getWgmtdes() {
        return this.wgmtdes;
    }

    public void setWgmtdes(String wgmtdes) {
        this.wgmtdes = wgmtdes;
    }

    public String getWszedes() {
        return this.wszedes;
    }

    public void setWszedes(String wszedes) {
        this.wszedes = wszedes;
    }

    public String getWclrdes() {
        return this.wclrdes;
    }

    public void setWclrdes(String wclrdes) {
        this.wclrdes = wclrdes;
    }

    public String getWname() {
        return this.wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWdopdesc() {
        return this.wdopdesc;
    }

    public void setWdopdesc(String wdopdesc) {
        this.wdopdesc = wdopdesc;
    }

    public String getWformdesc() {
        return this.wformdesc;
    }

    public void setWformdesc(String wformdesc) {
        this.wformdesc = wformdesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcMk1100pk0GetMkupAuditResponsePoutAudit)) return false;
        final ProcMk1100pk0GetMkupAuditResponsePoutAudit procMk1100pk0getMkupAuditResponsePoutAudit = (ProcMk1100pk0GetMkupAuditResponsePoutAudit) o;
        return Objects.equals(getLcncod(), procMk1100pk0getMkupAuditResponsePoutAudit.getLcncod()) &&
                Objects.equals(getPrgid(), procMk1100pk0getMkupAuditResponsePoutAudit.getPrgid()) &&
                Objects.equals(getAudtyp(), procMk1100pk0getMkupAuditResponsePoutAudit.getAudtyp()) &&
                Objects.equals(getOpdate(), procMk1100pk0getMkupAuditResponsePoutAudit.getOpdate()) &&
                Objects.equals(getDyejob(), procMk1100pk0getMkupAuditResponsePoutAudit.getDyejob()) &&
                Objects.equals(getPrunsze(), procMk1100pk0getMkupAuditResponsePoutAudit.getPrunsze()) &&
                Objects.equals(getOrdnum(), procMk1100pk0getMkupAuditResponsePoutAudit.getOrdnum()) &&
                Objects.equals(getAudid(), procMk1100pk0getMkupAuditResponsePoutAudit.getAudid()) &&
                Objects.equals(getAuddate(), procMk1100pk0getMkupAuditResponsePoutAudit.getAuddate()) &&
                Objects.equals(getAudfld(), procMk1100pk0getMkupAuditResponsePoutAudit.getAudfld()) &&
                Objects.equals(getRemarks(), procMk1100pk0getMkupAuditResponsePoutAudit.getRemarks()) &&
                Objects.equals(getLintyp(), procMk1100pk0getMkupAuditResponsePoutAudit.getLintyp()) &&
                Objects.equals(getGmtseq(), procMk1100pk0getMkupAuditResponsePoutAudit.getGmtseq()) &&
                Objects.equals(getSzeseq(), procMk1100pk0getMkupAuditResponsePoutAudit.getSzeseq()) &&
                Objects.equals(getClrseqg(), procMk1100pk0getMkupAuditResponsePoutAudit.getClrseqg()) &&
                Objects.equals(getEmpcode(), procMk1100pk0getMkupAuditResponsePoutAudit.getEmpcode()) &&
                Objects.equals(getOpcode(), procMk1100pk0getMkupAuditResponsePoutAudit.getOpcode()) &&
                Objects.equals(getStation(), procMk1100pk0getMkupAuditResponsePoutAudit.getStation()) &&
                Objects.equals(getEmkline(), procMk1100pk0getMkupAuditResponsePoutAudit.getEmkline()) &&
                Objects.equals(getMkline(), procMk1100pk0getMkupAuditResponsePoutAudit.getMkline()) &&
                Objects.equals(getOldqty(), procMk1100pk0getMkupAuditResponsePoutAudit.getOldqty()) &&
                Objects.equals(getNewqty(), procMk1100pk0getMkupAuditResponsePoutAudit.getNewqty()) &&
                Objects.equals(getSystyp(), procMk1100pk0getMkupAuditResponsePoutAudit.getSystyp()) &&
                Objects.equals(getWgmtdes(), procMk1100pk0getMkupAuditResponsePoutAudit.getWgmtdes()) &&
                Objects.equals(getWszedes(), procMk1100pk0getMkupAuditResponsePoutAudit.getWszedes()) &&
                Objects.equals(getWclrdes(), procMk1100pk0getMkupAuditResponsePoutAudit.getWclrdes()) &&
                Objects.equals(getWname(), procMk1100pk0getMkupAuditResponsePoutAudit.getWname()) &&
                Objects.equals(getWdopdesc(), procMk1100pk0getMkupAuditResponsePoutAudit.getWdopdesc()) &&
                Objects.equals(getWformdesc(), procMk1100pk0getMkupAuditResponsePoutAudit.getWformdesc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLcncod(),
                getPrgid(),
                getAudtyp(),
                getOpdate(),
                getDyejob(),
                getPrunsze(),
                getOrdnum(),
                getAudid(),
                getAuddate(),
                getAudfld(),
                getRemarks(),
                getLintyp(),
                getGmtseq(),
                getSzeseq(),
                getClrseqg(),
                getEmpcode(),
                getOpcode(),
                getStation(),
                getEmkline(),
                getMkline(),
                getOldqty(),
                getNewqty(),
                getSystyp(),
                getWgmtdes(),
                getWszedes(),
                getWclrdes(),
                getWname(),
                getWdopdesc(),
                getWformdesc());
    }
}
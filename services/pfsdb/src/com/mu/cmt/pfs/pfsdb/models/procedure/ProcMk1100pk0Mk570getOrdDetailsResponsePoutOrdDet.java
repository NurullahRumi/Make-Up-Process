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

public class ProcMk1100pk0Mk570getOrdDetailsResponsePoutOrdDet implements Serializable {


    @ColumnAlias("ORDNUM")
    private String ordnum;

    @ColumnAlias("CLICOD")
    private String clicod;

    @ColumnAlias("MAKLCN")
    private String maklcn;

    @ColumnAlias("ORDSTS")
    private String ordsts;

    @ColumnAlias("SSN")
    private String ssn;

    @ColumnAlias("SSHPDAT")
    private LocalDateTime sshpdat;

    @ColumnAlias("SHPMOD")
    private String shpmod;

    @ColumnAlias("QTYORD")
    private Integer qtyord;

    @ColumnAlias("PCKUNT")
    private Byte pckunt;

    @ColumnAlias("DSHEETNO")
    private String dsheetno;

    @ColumnAlias("RELPTIME")
    private LocalDateTime relptime;

    @ColumnAlias("CROQDATE")
    private LocalDateTime croqdate;

    @ColumnAlias("RELMAK")
    private String relmak;

    @ColumnAlias("RELMEA")
    private String relmea;

    @ColumnAlias("RELPRN")
    private String relprn;

    @ColumnAlias("RELEMB")
    private String relemb;

    @ColumnAlias("RELPAC")
    private String relpac;

    @ColumnAlias("RELPRE")
    private String relpre;

    @ColumnAlias("MERCHUSRNAME")
    private String merchusrname;

    @ColumnAlias("W_ORDERSTAKE_DESC")
    private String worderstakeDesc;

    @ColumnAlias("W_FOLLOWUP_STS_DESC")
    private String wfollowupStsDesc;

    @ColumnAlias("STYDES")
    private String stydes;

    @ColumnAlias("W_LAST_TPDATE")
    private LocalDateTime wlastTpdate;

    @ColumnAlias("W_ORDNUMUSSGDESC")
    private String wordnumussgdesc;

    @ColumnAlias("QTYORDDESC")
    private String qtyorddesc;

    public String getOrdnum() {
        return this.ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }

    public String getClicod() {
        return this.clicod;
    }

    public void setClicod(String clicod) {
        this.clicod = clicod;
    }

    public String getMaklcn() {
        return this.maklcn;
    }

    public void setMaklcn(String maklcn) {
        this.maklcn = maklcn;
    }

    public String getOrdsts() {
        return this.ordsts;
    }

    public void setOrdsts(String ordsts) {
        this.ordsts = ordsts;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public LocalDateTime getSshpdat() {
        return this.sshpdat;
    }

    public void setSshpdat(LocalDateTime sshpdat) {
        this.sshpdat = sshpdat;
    }

    public String getShpmod() {
        return this.shpmod;
    }

    public void setShpmod(String shpmod) {
        this.shpmod = shpmod;
    }

    public Integer getQtyord() {
        return this.qtyord;
    }

    public void setQtyord(Integer qtyord) {
        this.qtyord = qtyord;
    }

    public Byte getPckunt() {
        return this.pckunt;
    }

    public void setPckunt(Byte pckunt) {
        this.pckunt = pckunt;
    }

    public String getDsheetno() {
        return this.dsheetno;
    }

    public void setDsheetno(String dsheetno) {
        this.dsheetno = dsheetno;
    }

    public LocalDateTime getRelptime() {
        return this.relptime;
    }

    public void setRelptime(LocalDateTime relptime) {
        this.relptime = relptime;
    }

    public LocalDateTime getCroqdate() {
        return this.croqdate;
    }

    public void setCroqdate(LocalDateTime croqdate) {
        this.croqdate = croqdate;
    }

    public String getRelmak() {
        return this.relmak;
    }

    public void setRelmak(String relmak) {
        this.relmak = relmak;
    }

    public String getRelmea() {
        return this.relmea;
    }

    public void setRelmea(String relmea) {
        this.relmea = relmea;
    }

    public String getRelprn() {
        return this.relprn;
    }

    public void setRelprn(String relprn) {
        this.relprn = relprn;
    }

    public String getRelemb() {
        return this.relemb;
    }

    public void setRelemb(String relemb) {
        this.relemb = relemb;
    }

    public String getRelpac() {
        return this.relpac;
    }

    public void setRelpac(String relpac) {
        this.relpac = relpac;
    }

    public String getRelpre() {
        return this.relpre;
    }

    public void setRelpre(String relpre) {
        this.relpre = relpre;
    }

    public String getMerchusrname() {
        return this.merchusrname;
    }

    public void setMerchusrname(String merchusrname) {
        this.merchusrname = merchusrname;
    }

    public String getWorderstakeDesc() {
        return this.worderstakeDesc;
    }

    public void setWorderstakeDesc(String worderstakeDesc) {
        this.worderstakeDesc = worderstakeDesc;
    }

    public String getWfollowupStsDesc() {
        return this.wfollowupStsDesc;
    }

    public void setWfollowupStsDesc(String wfollowupStsDesc) {
        this.wfollowupStsDesc = wfollowupStsDesc;
    }

    public String getStydes() {
        return this.stydes;
    }

    public void setStydes(String stydes) {
        this.stydes = stydes;
    }

    public LocalDateTime getWlastTpdate() {
        return this.wlastTpdate;
    }

    public void setWlastTpdate(LocalDateTime wlastTpdate) {
        this.wlastTpdate = wlastTpdate;
    }

    public String getWordnumussgdesc() {
        return this.wordnumussgdesc;
    }

    public void setWordnumussgdesc(String wordnumussgdesc) {
        this.wordnumussgdesc = wordnumussgdesc;
    }

    public String getQtyorddesc() {
        return this.qtyorddesc;
    }

    public void setQtyorddesc(String qtyorddesc) {
        this.qtyorddesc = qtyorddesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcMk1100pk0Mk570getOrdDetailsResponsePoutOrdDet)) return false;
        final ProcMk1100pk0Mk570getOrdDetailsResponsePoutOrdDet procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet = (ProcMk1100pk0Mk570getOrdDetailsResponsePoutOrdDet) o;
        return Objects.equals(getOrdnum(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getOrdnum()) &&
                Objects.equals(getClicod(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getClicod()) &&
                Objects.equals(getMaklcn(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getMaklcn()) &&
                Objects.equals(getOrdsts(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getOrdsts()) &&
                Objects.equals(getSsn(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getSsn()) &&
                Objects.equals(getSshpdat(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getSshpdat()) &&
                Objects.equals(getShpmod(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getShpmod()) &&
                Objects.equals(getQtyord(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getQtyord()) &&
                Objects.equals(getPckunt(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getPckunt()) &&
                Objects.equals(getDsheetno(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getDsheetno()) &&
                Objects.equals(getRelptime(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getRelptime()) &&
                Objects.equals(getCroqdate(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getCroqdate()) &&
                Objects.equals(getRelmak(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getRelmak()) &&
                Objects.equals(getRelmea(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getRelmea()) &&
                Objects.equals(getRelprn(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getRelprn()) &&
                Objects.equals(getRelemb(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getRelemb()) &&
                Objects.equals(getRelpac(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getRelpac()) &&
                Objects.equals(getRelpre(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getRelpre()) &&
                Objects.equals(getMerchusrname(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getMerchusrname()) &&
                Objects.equals(getWorderstakeDesc(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getWorderstakeDesc()) &&
                Objects.equals(getWfollowupStsDesc(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getWfollowupStsDesc()) &&
                Objects.equals(getStydes(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getStydes()) &&
                Objects.equals(getWlastTpdate(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getWlastTpdate()) &&
                Objects.equals(getWordnumussgdesc(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getWordnumussgdesc()) &&
                Objects.equals(getQtyorddesc(), procMk1100pk0mk570getOrdDetailsResponsePoutOrdDet.getQtyorddesc());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrdnum(),
                getClicod(),
                getMaklcn(),
                getOrdsts(),
                getSsn(),
                getSshpdat(),
                getShpmod(),
                getQtyord(),
                getPckunt(),
                getDsheetno(),
                getRelptime(),
                getCroqdate(),
                getRelmak(),
                getRelmea(),
                getRelprn(),
                getRelemb(),
                getRelpac(),
                getRelpre(),
                getMerchusrname(),
                getWorderstakeDesc(),
                getWfollowupStsDesc(),
                getStydes(),
                getWlastTpdate(),
                getWordnumussgdesc(),
                getQtyorddesc());
    }
}
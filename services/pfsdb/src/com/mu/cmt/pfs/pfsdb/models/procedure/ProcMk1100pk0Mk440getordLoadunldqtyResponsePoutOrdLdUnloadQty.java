/*Copyright (c) 2016-2017 cmt.mu All Rights Reserved.
 This software is the confidential and proprietary information of cmt.mu You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with cmt.mu*/
package com.mu.cmt.pfs.pfsdb.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcMk1100pk0Mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty implements Serializable {


    @ColumnAlias("ORDNUM")
    private String ordnum;

    @ColumnAlias("GMTSEQ")
    private String gmtseq;

    @ColumnAlias("CLRSEQ")
    private Byte clrseq;

    @ColumnAlias("SZESEQ")
    private Byte szeseq;

    @ColumnAlias("W_SZEDES")
    private String wszedes;

    @ColumnAlias("QTYORD")
    private Integer qtyord;

    @ColumnAlias("MAKLCN")
    private String maklcn;

    @ColumnAlias("L_GOOD")
    private BigDecimal lgood;

    @ColumnAlias("L_BLUE")
    private BigDecimal lblue;

    @ColumnAlias("L_RED")
    private BigDecimal lred;

    @ColumnAlias("U_GOOD")
    private BigDecimal ugood;

    @ColumnAlias("U_BLUE")
    private BigDecimal ublue;

    @ColumnAlias("U_RED")
    private BigDecimal ured;

    @ColumnAlias("D_GOOD")
    private BigInteger dgood;

    @ColumnAlias("D_BLUE")
    private BigInteger dblue;

    @ColumnAlias("D_RED")
    private BigInteger dred;

    @ColumnAlias("TOTAL_LGOOD")
    private BigInteger totalLgood;

    @ColumnAlias("TOTAL_LBLUE")
    private BigInteger totalLblue;

    @ColumnAlias("TOTAL_LRED")
    private BigInteger totalLred;

    @ColumnAlias("TOTAL_UGOOD")
    private BigInteger totalUgood;

    @ColumnAlias("TOTAL_UBLUE")
    private BigInteger totalUblue;

    @ColumnAlias("TOTAL_URED")
    private BigInteger totalUred;

    public String getOrdnum() {
        return this.ordnum;
    }

    public void setOrdnum(String ordnum) {
        this.ordnum = ordnum;
    }

    public String getGmtseq() {
        return this.gmtseq;
    }

    public void setGmtseq(String gmtseq) {
        this.gmtseq = gmtseq;
    }

    public Byte getClrseq() {
        return this.clrseq;
    }

    public void setClrseq(Byte clrseq) {
        this.clrseq = clrseq;
    }

    public Byte getSzeseq() {
        return this.szeseq;
    }

    public void setSzeseq(Byte szeseq) {
        this.szeseq = szeseq;
    }

    public String getWszedes() {
        return this.wszedes;
    }

    public void setWszedes(String wszedes) {
        this.wszedes = wszedes;
    }

    public Integer getQtyord() {
        return this.qtyord;
    }

    public void setQtyord(Integer qtyord) {
        this.qtyord = qtyord;
    }

    public String getMaklcn() {
        return this.maklcn;
    }

    public void setMaklcn(String maklcn) {
        this.maklcn = maklcn;
    }

    public BigDecimal getLgood() {
        return this.lgood;
    }

    public void setLgood(BigDecimal lgood) {
        this.lgood = lgood;
    }

    public BigDecimal getLblue() {
        return this.lblue;
    }

    public void setLblue(BigDecimal lblue) {
        this.lblue = lblue;
    }

    public BigDecimal getLred() {
        return this.lred;
    }

    public void setLred(BigDecimal lred) {
        this.lred = lred;
    }

    public BigDecimal getUgood() {
        return this.ugood;
    }

    public void setUgood(BigDecimal ugood) {
        this.ugood = ugood;
    }

    public BigDecimal getUblue() {
        return this.ublue;
    }

    public void setUblue(BigDecimal ublue) {
        this.ublue = ublue;
    }

    public BigDecimal getUred() {
        return this.ured;
    }

    public void setUred(BigDecimal ured) {
        this.ured = ured;
    }

    public BigInteger getDgood() {
        return this.dgood;
    }

    public void setDgood(BigInteger dgood) {
        this.dgood = dgood;
    }

    public BigInteger getDblue() {
        return this.dblue;
    }

    public void setDblue(BigInteger dblue) {
        this.dblue = dblue;
    }

    public BigInteger getDred() {
        return this.dred;
    }

    public void setDred(BigInteger dred) {
        this.dred = dred;
    }

    public BigInteger getTotalLgood() {
        return this.totalLgood;
    }

    public void setTotalLgood(BigInteger totalLgood) {
        this.totalLgood = totalLgood;
    }

    public BigInteger getTotalLblue() {
        return this.totalLblue;
    }

    public void setTotalLblue(BigInteger totalLblue) {
        this.totalLblue = totalLblue;
    }

    public BigInteger getTotalLred() {
        return this.totalLred;
    }

    public void setTotalLred(BigInteger totalLred) {
        this.totalLred = totalLred;
    }

    public BigInteger getTotalUgood() {
        return this.totalUgood;
    }

    public void setTotalUgood(BigInteger totalUgood) {
        this.totalUgood = totalUgood;
    }

    public BigInteger getTotalUblue() {
        return this.totalUblue;
    }

    public void setTotalUblue(BigInteger totalUblue) {
        this.totalUblue = totalUblue;
    }

    public BigInteger getTotalUred() {
        return this.totalUred;
    }

    public void setTotalUred(BigInteger totalUred) {
        this.totalUred = totalUred;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcMk1100pk0Mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty)) return false;
        final ProcMk1100pk0Mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty = (ProcMk1100pk0Mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty) o;
        return Objects.equals(getOrdnum(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getOrdnum()) &&
                Objects.equals(getGmtseq(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getGmtseq()) &&
                Objects.equals(getClrseq(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getClrseq()) &&
                Objects.equals(getSzeseq(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getSzeseq()) &&
                Objects.equals(getWszedes(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getWszedes()) &&
                Objects.equals(getQtyord(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getQtyord()) &&
                Objects.equals(getMaklcn(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getMaklcn()) &&
                Objects.equals(getLgood(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getLgood()) &&
                Objects.equals(getLblue(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getLblue()) &&
                Objects.equals(getLred(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getLred()) &&
                Objects.equals(getUgood(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getUgood()) &&
                Objects.equals(getUblue(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getUblue()) &&
                Objects.equals(getUred(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getUred()) &&
                Objects.equals(getDgood(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getDgood()) &&
                Objects.equals(getDblue(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getDblue()) &&
                Objects.equals(getDred(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getDred()) &&
                Objects.equals(getTotalLgood(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getTotalLgood()) &&
                Objects.equals(getTotalLblue(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getTotalLblue()) &&
                Objects.equals(getTotalLred(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getTotalLred()) &&
                Objects.equals(getTotalUgood(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getTotalUgood()) &&
                Objects.equals(getTotalUblue(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getTotalUblue()) &&
                Objects.equals(getTotalUred(), procMk1100pk0mk440getordLoadunldqtyResponsePoutOrdLdUnloadQty.getTotalUred());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrdnum(),
                getGmtseq(),
                getClrseq(),
                getSzeseq(),
                getWszedes(),
                getQtyord(),
                getMaklcn(),
                getLgood(),
                getLblue(),
                getLred(),
                getUgood(),
                getUblue(),
                getUred(),
                getDgood(),
                getDblue(),
                getDred(),
                getTotalLgood(),
                getTotalLblue(),
                getTotalLred(),
                getTotalUgood(),
                getTotalUblue(),
                getTotalUred());
    }
}
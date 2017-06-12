package com.tongxuweb.domain.create;

import com.tongxuweb.domain.generate.PConfig;

import java.io.Serializable;
import java.util.List;

/**
 * Created by red
 */
public class PConfigAll implements Serializable {
    // 0.3
    double yunyinYongjin = 0;
    //0.06
    double yunyinFuwufei = 0;
    double yunyinKoudian = 0;
    double yunyinYouhuiquan = 0;
    double yunyinTeshu = 0;
    //8
    double wuliuKuaidi = 0;
    double wuliuChangku = 0;
    //0.2
    double wuliuBaozhuang = 0;
    //0.3
    double wuliuYunfeixian = 0;


    public double getYunyinYongjin() {
        return yunyinYongjin;
    }

    public void setYunyinYongjin(double yunyinYongjin) {
        this.yunyinYongjin = yunyinYongjin;
    }

    public double getYunyinFuwufei() {
        return yunyinFuwufei;
    }

    public void setYunyinFuwufei(double yunyinFuwufei) {
        this.yunyinFuwufei = yunyinFuwufei;
    }

    public double getYunyinKoudian() {
        return yunyinKoudian;
    }

    public void setYunyinKoudian(double yunyinKoudian) {
        this.yunyinKoudian = yunyinKoudian;
    }

    public double getYunyinYouhuiquan() {
        return yunyinYouhuiquan;
    }

    public void setYunyinYouhuiquan(double yunyinYouhuiquan) {
        this.yunyinYouhuiquan = yunyinYouhuiquan;
    }

    public double getYunyinTeshu() {
        return yunyinTeshu;
    }

    public void setYunyinTeshu(double yunyinTeshu) {
        this.yunyinTeshu = yunyinTeshu;
    }

    public double getWuliuKuaidi() {
        return wuliuKuaidi;
    }

    public void setWuliuKuaidi(double wuliuKuaidi) {
        this.wuliuKuaidi = wuliuKuaidi;
    }

    public double getWuliuChangku() {
        return wuliuChangku;
    }

    public void setWuliuChangku(double wuliuChangku) {
        this.wuliuChangku = wuliuChangku;
    }

    public double getWuliuBaozhuang() {
        return wuliuBaozhuang;
    }

    public void setWuliuBaozhuang(double wuliuBaozhuang) {
        this.wuliuBaozhuang = wuliuBaozhuang;
    }

    public double getWuliuYunfeixian() {
        return wuliuYunfeixian;
    }

    public void setWuliuYunfeixian(double wuliuYunfeixian) {
        this.wuliuYunfeixian = wuliuYunfeixian;
    }

    public void initFrom(List<PConfig> li) {
        for (PConfig pConfig : li) {
            if ("yunyinYongjin".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setYunyinYongjin(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            } else if ("yunyinFuwufei".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setYunyinFuwufei(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            } else if ("yunyinKoudian".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setYunyinKoudian(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            } else if ("yunyinYouhuiquan".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setYunyinYouhuiquan(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            } else if ("yunyinTeshu".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setYunyinTeshu(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            } else if ("wuliuKuaidi".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setWuliuKuaidi(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            } else if ("wuliuChangku".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setWuliuChangku(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            } else if ("wuliuBaozhuang".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setWuliuBaozhuang(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            } else if ("wuliuYunfeixian".equalsIgnoreCase(pConfig.getKeyEn())) {
                try {
                    setWuliuYunfeixian(Double.valueOf(pConfig.getKeyValue()));
                } catch (Exception e) {
                }
            }
        }
    }
}

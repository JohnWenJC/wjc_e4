package com.wjc.po;

import lombok.Data;

@Data
public class Specilinfo {
    private int spilinfoid;
    private String depinfoid;
    private String spilinfocode;
    private String spilinfoname;
    private String spilinfoaim;
    private String spilinfoprodire;

    public Specilinfo() {
    }

    public Specilinfo(int spilinfoid, String depinfoid, String spilinfocode, String spilinfoname, String spilinfoaim, String spilinfoprodire) {
        this.spilinfoid = spilinfoid;
        this.depinfoid = depinfoid;
        this.spilinfocode = spilinfocode;
        this.spilinfoname = spilinfoname;
        this.spilinfoaim = spilinfoaim;
        this.spilinfoprodire = spilinfoprodire;
    }

    public Specilinfo(String depinfoid, String spilinfocode, String spilinfoname, String spilinfoaim, String spilinfoprodire) {
        this.depinfoid = depinfoid;
        this.spilinfocode = spilinfocode;
        this.spilinfoname = spilinfoname;
        this.spilinfoaim = spilinfoaim;
        this.spilinfoprodire = spilinfoprodire;
    }
}

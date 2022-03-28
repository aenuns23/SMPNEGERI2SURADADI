package com.example.smpnegeri2suradadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Buku8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku8);
    }

    public void mtk8smt1(View view) {
        goToUrl("https://drive.google.com/file/d/1U3NTQWTF2NBVtuk_hakHouzUJV4Af7FA/view?usp=sharing");
    }

    public void mtk8smt2(View view) {
        goToUrl("https://drive.google.com/file/d/1U6Vgwdb_Xiglv3Pxn6OsWaTuiXUi4ffl/view?usp=sharing");
    }

    public void ipa8smt1(View view) {
        goToUrl("https://drive.google.com/file/d/1TxMrzAmD_VAgo50tpFW3roYoZK6iUf_6/view?usp=sharing");
    }

    public void ipa8smt2(View view) {
        goToUrl("https://drive.google.com/file/d/1U-MMg75uBOYIOmRc77Bepxr9riIrwXz1/view?usp=sharing");
    }

    public void prakarya8smt1(View view) {
        goToUrl("https://drive.google.com/file/d/1VdwP4T_i729bJRqSwLW_zCsFtmey6KD4/view?usp=sharing");
    }

    public void prakarya8smt2(View view) {
        goToUrl("https://drive.google.com/file/d/1Vlq9oo8qaQkNzACCgUNcmKfJRxm-oWrA/view?usp=sharing");
    }

    public void bind8(View view) {
        goToUrl("https://drive.google.com/file/d/1TslxrtBmz_m4VCa7IlewKWjbQj2GTcSz/view?usp=sharing");
    }

    public void bing8(View view) {
        goToUrl("https://drive.google.com/file/d/1TtzAclXmXX-wEJXgk3_HVWtcuWVDXrqq/view?usp=sharing");
    }

    public void pai8(View view) {
        goToUrl("https://drive.google.com/file/d/1VtvtHEMD9N0t_rg40CaB_wnC1ZyBBPl3/view?usp=sharing");
    }

    public void ppkn8(View view) {
        goToUrl("https://drive.google.com/file/d/1WiuFjy6XwtWfPUKcWdNAn-WEGPW0dC7R/view?usp=sharing");
    }

    public void pjok8(View view) {
        goToUrl("https://drive.google.com/file/d/1UI6h7y3c1ISx1wg32siJARstFtEoYSLr/view?usp=sharing");
    }

    public void sbk8(View view) {
        goToUrl("https://drive.google.com/file/d/1VsHDDRYLcBAWj0DyhPazXy-urnHiK6kW/view?usp=sharing");
    }

    public void ips8(View view) {
        goToUrl("https://drive.google.com/file/d/1VdtC2d8igkOYX1IAC8dteOyvWJyZoxtL/view?usp=sharing");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
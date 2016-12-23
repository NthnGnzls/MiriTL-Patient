package com.escoglobal.miritlpatient;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by nathaniel.gonzales on 14/12/2016.
 */
public class Font {
    public static final Font  HELVETICA_NEUE_BOLD    = new Font("HelveticaNeuBold.otf");
    public static final Font  HELVETICA_NEUE_BLACKCOND = new Font("HelveticaNeueBlackCond.ttf");
    public static final Font  HELVETICA_NEUE_LIGHT = new Font("HelveticaNeueLight.ttf");
    public static final Font  HELVETICA_NEUE_MEDIUM = new Font("HelveticaNeueMedium.ttf");
    public static final Font  HELVETICA_NEUE_THIN = new Font("HelveticaNeueThin.ttf");
    public static final Font  HELVETICA_NEUE = new Font("HelveticaNeue.ttf");
    public static final Font  HELVETICA_NEUE_BD = new Font("HelveticaNeueBD.ttf");
    public static final Font  HELVETICA_NEUE_HV = new Font("HelveticaNeueHv.ttf");
    public static final Font  HELVETICA_NEUE_IT = new Font("HelveticaNeueIt.ttf");
    public static final Font  HELVETICA_NEUE_LT = new Font("HelveticaNeueLt.ttf");
    public static final Font  HELVETICA_NEUE_MED = new Font("HelveticaNeueMed.ttf");
    private final String      assetName;
    private volatile Typeface typeface;

    private Font(String assetName) {
        this.assetName = assetName;
    }

    public void apply(Context context, TextView textView) {
        if (typeface == null) {
            synchronized (this) {
                if (typeface == null) {
                    typeface = Typeface.createFromAsset(context.getAssets(), assetName);
                }
            }
        }
        textView.setTypeface(typeface);
    }
}
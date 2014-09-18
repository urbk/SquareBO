package com.urbik.framework.main;

import com.metaio.sdk.ARViewActivity;
import com.urbik.framework.main.Model.Model;

/**
 * Created by Antoine on 17/09/2014.
 */
public abstract class TrackingAbstract extends ARViewActivity {
    protected enum currentTrackingType {
        CAD,
        GPS,
        Picture
    }

    protected boolean isTracking;

    protected boolean loadModel(Model m) {
        metaioSDK.createGeometry(m.getPathOfModel());
        return true;
    }

    protected boolean unloadModel(Model m) {
        return true;
    }
}

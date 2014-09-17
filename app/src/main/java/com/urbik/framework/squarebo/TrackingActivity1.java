package com.urbik.framework.squarebo;

import com.metaio.sdk.jni.IGeometry;
import com.metaio.sdk.jni.IMetaioSDKCallback;

/**
 * Created by Antoine on 17/09/2014.
 */
public class TrackingActivity1 extends TrackingAbstract {
    @Override
    protected int getGUILayout() {
        return 0;
    }

    @Override
    protected IMetaioSDKCallback getMetaioSDKCallbackHandler() {
        return null;
    }

    @Override
    protected void loadContents() {

    }

    @Override
    protected void onGeometryTouched(IGeometry geometry) {

    }
}

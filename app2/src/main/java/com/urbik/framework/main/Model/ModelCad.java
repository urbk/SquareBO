package com.urbik.framework.main.Model;

import com.metaio.tools.io.AssetsManager;

/**
 * Created by Antoine on 17/09/2014.
 */
public class ModelCad extends ModelMarker {
    public static int VISUAL_HELP_MODEL = 1;
    public static int DISPLAY_MODEL = 2;
    public static int OCCLUSION_MODEL = 3;
    public static int INITIAL_POSE=1;
    public static  int TRACKING_POSE=2;
    private int displayUse;

    public ModelCad(Enum<?> name,String path,String cosName, boolean isAnimate, String target, int displayUse) {
        this.name=name;
        assetPathOfConfiguration = AssetsManager.getAbsolutePath() + "/CAD/" + this.name;
        this.cosName = cosName;
        this.isAnimate = isAnimate;
        this.target = target;
        this.displayUse = displayUse;
        this.pathOfModel=path;
    }
}

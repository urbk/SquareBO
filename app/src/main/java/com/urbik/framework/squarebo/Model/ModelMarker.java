package com.urbik.framework.squarebo.Model;

import com.metaio.tools.io.AssetsManager;

/**
 * Created by Antoine on 17/09/2014.
 */
public class ModelMarker extends Model {
    protected String assetPathOfConfiguration;
    protected String cosName;
    protected boolean isAnimate;
    protected String target;
    public ModelMarker(Enum<?> name,String path,String cosName,boolean isAnimate,String target){
        this.name=name;
        this.assetPathOfConfiguration= AssetsManager.getAbsolutePath()+"/Picture/"+this.name.toString();
        this.cosName=cosName;
        this.isAnimate=isAnimate;
        this.target=target;
        this.pathOfModel=path;
    }
    public ModelMarker(){

    }
}

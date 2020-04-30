package com.myapplicationdev.android.tw_listview;

public class Module {
    public String module;
    public int moduleImage;

    public Module(String module, int moduleImage){
        this.module = module;
        this.moduleImage = moduleImage;
    }

    public String getModule() {
        return module;
    }

    public int getModuleImage() {
        return moduleImage;
    }
}

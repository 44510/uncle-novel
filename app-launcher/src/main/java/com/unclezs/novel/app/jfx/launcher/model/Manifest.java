package com.unclezs.novel.app.jfx.launcher.model;

import lombok.Data;

import java.util.List;

/**
 * @author blog.unclezs.com
 * @date 2021/03/21 11:35
 */
@Data
public class Manifest {
    /**
     * 是否为增量更新
     */
    private boolean incremental = true;
    /**
     * 服务器地址
     */
    private String serverUri = "file:/G:/coder/self-coder/uncle-novel-jfx/app/build/Uncle/libx/";
    /**
     * 更新日志链接
     */
    private String changeLogUri;
    /**
     * 更新内容
     */
    private List<String> changeLog;
    /**
     * 依赖
     */
    private List<Library> libs;
    /**
     * 启动类
     */
    private String launcherClass;

    public static void main(String[] args) {

    }
}
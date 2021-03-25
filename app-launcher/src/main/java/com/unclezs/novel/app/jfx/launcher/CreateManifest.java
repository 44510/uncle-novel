package com.unclezs.novel.app.jfx.launcher;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unclezs.novel.app.jfx.launcher.enums.Os;
import com.unclezs.novel.app.jfx.launcher.model.Library;
import com.unclezs.novel.app.jfx.launcher.model.Manifest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * @author blog.unclezs.com
 * @date 2021/03/25 23:12
 */
public class CreateManifest {

  public static void main(String[] args) throws IOException {
    File[] files = new File(".", "app/build/app").listFiles(pathname -> true);
    Manifest manifest = new Manifest();
    ArrayList<Library> libs = new ArrayList<>();
    manifest.setLibs(libs);
    manifest.setLibDir("./");
    manifest.setLauncherClass("com.unclezs.novel.app.jfx.app.ui.app.App");
    manifest.setServerUri(new File(".", "app/build/app").getAbsolutePath());
    if (files != null) {
      for (File file : files) {
        Library lib = new Library();
        lib.setOs(Os.WIN);
        lib.setPath(file.getName());
        lib.setSize(file.length() + "");
        libs.add(lib);
        System.out.println(lib);
      }
    }
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json = gson.toJson(manifest);
    Files.writeString(Path.of("app-out.json"), json);
    System.out.println(json);
  }
}

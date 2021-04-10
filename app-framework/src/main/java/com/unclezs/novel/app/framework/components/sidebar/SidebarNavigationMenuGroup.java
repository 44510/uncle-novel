package com.unclezs.novel.app.framework.components.sidebar;

import com.unclezs.novel.app.framework.util.ViewUtils;
import javafx.beans.DefaultProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import lombok.Getter;
import lombok.Setter;

/**
 * 侧边导航栏 分组
 *
 * @author blog.unclezs.com
 * @since 2021/02/27 11:25
 */
@Getter
@Setter
@DefaultProperty("menus")
public class SidebarNavigationMenuGroup {

  public static final String GROUP_LABEL_CLASS = "sidebar-nav-menu-group-label";
  private String name;
  private ObservableList<SidebarNavigationMenu> menus = FXCollections.observableArrayList();
  private Label groupLabel;

  /**
   * 设置分组名称
   *
   * @param name 名称
   */
  public void setName(String name) {
    this.name = name;
    if (groupLabel == null) {
      groupLabel = ViewUtils.addClass(new Label(name), GROUP_LABEL_CLASS);
    }
    this.groupLabel.setText(name);
  }
}
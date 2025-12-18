
package com.kotcrab.vis.ui.test.manual;

import com.badlogic.gdx.utils.Align;
import com.kotcrab.vis.ui.util.TableUtils;
import com.kotcrab.vis.ui.widget.BusyBar;
import com.kotcrab.vis.ui.widget.VisLabel;
import com.kotcrab.vis.ui.widget.VisWindow;

public class TestBusyBar extends VisWindow {
    public TestBusyBar() {
        super("busybar");

        TableUtils.setSpacingDefaults(this);
        columnDefaults(0).left();

        addCloseButton();
        addVisWidgets();

        setResizable(true);
        setSize(320, 170);
        centerWindow();
    }

    private void addVisWidgets() {
        BusyBar busyBar = new BusyBar();
        add(busyBar).top().space(0).growX().row();
        add(new VisLabel("Working...", Align.center)).grow().center();
    }
}

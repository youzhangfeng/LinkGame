package com.ycp.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author hzyouzhangfeng.
 * @date 2018/3/11.
 */
public class MainPanel extends JPanel {

    private JButton start = new JButton("开始游戏");
    private JButton close = new JButton("关闭游戏");

    public MainPanel() {
        start.setSize(200, 200);
        close.setSize(200, 200);
        this.add(start);
        this.add(close);
    }
}

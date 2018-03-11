package com.ycp.frame;

import com.ycp.utils.ShowHelper;
import com.ycp.view.MainPanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author hzyouzhangfeng.
 * @date 2018/3/11.
 */
public class MainFrame extends JFrame{

    public MainFrame() {
        MainPanel panel = new MainPanel();
        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setTitle("连连看");
        frame.setSize(750, 500);
        ShowHelper.showCenter(frame);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

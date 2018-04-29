package com.basilio;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class menu {
    private JButton editorButton;
    private JButton viewerButton;


    public menu() {
        editorButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("SE TOCOOO");
            }
        });
    }
}

package com.basilio;

import com.basilio.menus.MainMenu;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        JFrame frame = new JFrame("App");
        frame.setContentPane(new MainMenu().MainMenuPanel);
//        frame.setContentPane(new MainMenu().MainMenuPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}

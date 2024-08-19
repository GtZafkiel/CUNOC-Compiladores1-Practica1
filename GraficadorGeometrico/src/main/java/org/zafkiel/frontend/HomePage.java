package org.zafkiel.frontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    public JPanel panelHomePage;
    private JButton salirButton;
    private JTabbedPane tabbedPane1;

    public HomePage() {
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Salir del programa");
                System.exit(0);
            }
        });
    }
}

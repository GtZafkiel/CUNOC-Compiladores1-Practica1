package org.zafkiel.frontend;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HomePage extends JFrame {
    public JPanel panelHomePage;
    private JButton salirButton;
    private JTabbedPane tabbedPane1;
    private JButton botonAbrirArchivo;
    private JButton botonAnalizar;
    private JButton botonEjecutar;
    private JButton botonLimpiar;
    private JTextPane textPaneInicio;
    private JTextPane textPaneEstado;

    public HomePage() {
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Salir del programa");
                System.exit(0);
            }
        });
        botonAbrirArchivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                // Establecer filtro para mostrar solo archivos XML
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos TXT", "txt");
                fileChooser.setFileFilter(filter);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    if (selectedFile.getName().endsWith(".txt")) {
                        try {
                            StringBuilder content = new StringBuilder();
                            BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                            String line;
                            while ((line = reader.readLine()) != null) {
                                content.append(line).append("\n");
                            }
                            textPaneInicio.setText(content.toString());
                            reader.close();

                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, selecciona un archivo TXT.", "Error", JOptionPane.ERROR_MESSAGE);

                    }
                }
            }
        });
        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPaneInicio.setText("");
                textPaneEstado.setText("");
            }
        });
    }
}

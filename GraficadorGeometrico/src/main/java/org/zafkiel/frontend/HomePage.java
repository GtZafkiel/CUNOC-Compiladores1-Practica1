package org.zafkiel.frontend;

import org.zafkiel.backend.analizadores.Token;
import org.zafkiel.backend.analizadores.scanner;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;

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
    private JButton botonGuardarArchivo;
    private JButton botonNuevoArchivo;
    private JTextPane textPaneReporteLexico;
    private JTextPane textPaneReporteSintactico;
    private JTextPane textPaneReporteErrores;

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
        botonAnalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Se a analizado el texto correctamente.\n"+
                "Por favor revise el area de ANALIZADORES y REPORTES por favor.\n"+
                        ":D");
                try {
                    String fileName = textPaneInicio.getText();
                    BufferedReader buffer = new BufferedReader(new StringReader(fileName));
                    scanner customLexer = new scanner(buffer);
                    textPaneReporteLexico.setText("");
                    textPaneReporteErrores.setText("");
                    while(true) {

                        Token token = customLexer.yylex();

                        if (token == null)
                            break;
                    }
                    List<String> errores = scanner.getErrores();
                    if (!errores.isEmpty()) {
                        for (String error : errores) {
                            textPaneReporteErrores.setText(textPaneReporteErrores.getText()+error+"\n");
                        }
                    }
                    textPaneReporteLexico.setText("");
                    List<String> lexicos = scanner.getLexicos();
                    if (!lexicos.isEmpty()) {
                        for (String lexico : lexicos) {
                            textPaneReporteLexico.setText(textPaneReporteLexico.getText()+lexico+"\n");
                        }
                    }
                }
                catch (Exception ex) {
                }
            }
        });
    }
}

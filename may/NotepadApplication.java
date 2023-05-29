import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class NotepadApplication extends JFrame {
    private JTextArea textArea;
    private JCheckBoxMenuItem wordWrapMenuItem;
    private JRadioButtonMenuItem plainMenuItem;
    private JRadioButtonMenuItem boldMenuItem;
    private JRadioButtonMenuItem italicMenuItem;

    public NotepadApplication() {
        setTitle("Notepad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        createMenuBar();
        createToolBar();

        setVisible(true);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        // File menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem[] fileMenuItems = {
                new JMenuItem("Open"),
                new JMenuItem("Save"),
                new JMenuItem("Exit")
        };

        fileMenuItems[0].addActionListener(e -> {
            // Open file logic
        });
        fileMenuItems[1].addActionListener(e -> {
            // Save file logic
        });
        fileMenuItems[2].addActionListener(e -> System.exit(0));

        for (JMenuItem item : fileMenuItems) {
            fileMenu.add(item);
        }

        // Edit menu
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);

        JMenuItem[] editMenuItems = {
                new JMenuItem("Cut"),
                new JMenuItem("Copy"),
                new JMenuItem("Paste")
        };

        editMenuItems[0].addActionListener(e -> textArea.cut());
        editMenuItems[1].addActionListener(e -> textArea.copy());
        editMenuItems[2].addActionListener(e -> textArea.paste());

        for (JMenuItem item : editMenuItems) {
            editMenu.add(item);
        }

        // Format menu
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic(KeyEvent.VK_O);

        wordWrapMenuItem = new JCheckBoxMenuItem("Word Wrap");
        wordWrapMenuItem.addActionListener(e -> {
            textArea.setLineWrap(wordWrapMenuItem.isSelected());
            textArea.setWrapStyleWord(wordWrapMenuItem.isSelected());
        });

        plainMenuItem = new JRadioButtonMenuItem("Plain");
        boldMenuItem = new JRadioButtonMenuItem("Bold");
        italicMenuItem = new JRadioButtonMenuItem("Italic");

        ButtonGroup fontStyleGroup = new ButtonGroup();
        fontStyleGroup.add(plainMenuItem);
        fontStyleGroup.add(boldMenuItem);
        fontStyleGroup.add(italicMenuItem);

        JMenuItem[] formatMenuItems = {
                wordWrapMenuItem,
                plainMenuItem,
                boldMenuItem,
                italicMenuItem
        };

        plainMenuItem.addActionListener(e -> textArea.setFont(new Font("Plain", Font.PLAIN, 12)));
        boldMenuItem.addActionListener(e -> textArea.setFont(new Font("Bold", Font.BOLD, 12)));
        italicMenuItem.addActionListener(e -> textArea.setFont(new Font("Italic", Font.ITALIC, 12)));

        for (JMenuItem item : formatMenuItems) {
            formatMenu.add(item);
        }

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);

        setJMenuBar(menuBar);
    }

    private void createToolBar() {
        JToolBar toolBar = new JToolBar();

        JButton cutButton = new JButton(new ImageIcon("cut.png"));
        cutButton.addActionListener(e -> textArea.cut());
        toolBar.add(cutButton);

        JButton copyButton = new JButton(new ImageIcon("copy.png"));
        copyButton.addActionListener(e-> textArea.paste());
        toolBar.add(copyButton);

        add(toolBar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NotepadApplication());
    }
}

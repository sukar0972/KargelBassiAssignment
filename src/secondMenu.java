import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Thu May 16 13:24:19 EDT 2024
 */



/**
 * @author macsull
 */
public class secondMenu extends JPanel {
    public static JFrame frame;
    public static String name;
    public secondMenu(JFrame frame, String name) {
        this.frame = frame;
        this.name = name;
        initComponents();
        outputUsername.setText(name);
    }

    private void profileCreate(ActionEvent e) {
        // TODO add your code here
    }

    private void back(ActionEvent e) {
        // TODO add your code here
    }

    private void startQuiz(ActionEvent e) {
        // TODO add your code here
    }

    private void login(ActionEvent e) {
        // TODO add your code here
    }

    private void studyNote(ActionEvent e) {
        // TODO add your code here
    }

    private void profile(ActionEvent e) {
        // TODO add your code here
    }

    private void exit(ActionEvent e) {
        // TODO add your code here
    }

    private void logout(ActionEvent e) {
        // TODO add your code here
        frame.setContentPane(new welcomePage());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label2 = new JLabel();
        outputUsername = new JLabel();
        panel1 = new JPanel();
        buttonNotes = new JButton();
        buttonQuiz = new JButton();
        buttonLogout = new JButton();
        textPane1 = new JTextPane();

        //======== this ========
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label2 ----
        label2.setText("Helpy Helper Portal");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() & ~Font.BOLD, label2.getFont().getSize() + 4f));
        add(label2, "cell 0 0");

        //---- outputUsername ----
        outputUsername.setText("Username:");
        outputUsername.setFont(outputUsername.getFont().deriveFont(outputUsername.getFont().getStyle() & ~Font.BOLD, outputUsername.getFont().getSize() + 4f));
        add(outputUsername, "cell 0 0");

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x6666ff));
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- buttonNotes ----
            buttonNotes.setText("View Study Notes");
            buttonNotes.addActionListener(e -> login(e));
            panel1.add(buttonNotes, "cell 0 3 1 2");

            //---- buttonQuiz ----
            buttonQuiz.setText("Start Quiz");
            buttonQuiz.addActionListener(e -> profile(e));
            panel1.add(buttonQuiz, "cell 0 6");

            //---- buttonLogout ----
            buttonLogout.setText("Logout");
            buttonLogout.addActionListener(e -> {
			profile(e);
			exit(e);
			logout(e);
		});
            panel1.add(buttonLogout, "cell 0 8");

            //---- textPane1 ----
            textPane1.setText("                                                                            ");
            textPane1.setSelectedTextColor(new Color(0x6666ff));
            textPane1.setBackground(new Color(0x6666ff));
            textPane1.setEditable(false);
            panel1.add(textPane1, "cell 0 9");
        }
        add(panel1, "cell 0 1,alignx left,growx 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label2;
    private JLabel outputUsername;
    private JPanel panel1;
    private JButton buttonNotes;
    private JButton buttonQuiz;
    private JButton buttonLogout;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

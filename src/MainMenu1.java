import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed May 15 20:59:39 EDT 2024
 */



/**
 * @author macsull
 */
public class MainMenu1 extends JPanel {
    public MainMenu1() {
        initComponents();
    }

    private void login(ActionEvent e) {
        // TODO add your code here
    }

    private void studyNote(ActionEvent e) {
        // TODO add your code here
    }

    private void startQuiz(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        labelTitle = new JLabel();
        panel1 = new JPanel();
        textFieldUsername = new JTextField();
        buttonLogout = new JButton();
        buttonStudyNote = new JButton();
        buttonStartQuiz = new JButton();
        buttonStatistics = new JButton();

        //======== this ========
        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- labelTitle ----
        labelTitle.setText("Helpy Helper Portal");
        labelTitle.setFont(labelTitle.getFont().deriveFont(Font.BOLD, labelTitle.getFont().getSize() + 2f));
        add(labelTitle, "cell 0 0");

        //======== panel1 ========
        {
            panel1.setBackground(new Color(0x6666ff));
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
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
                "[]" +
                "[]" +
                "[]"));

            //---- textFieldUsername ----
            textFieldUsername.setEditable(false);
            panel1.add(textFieldUsername, "cell 0 1 10 1");

            //---- buttonLogout ----
            buttonLogout.setText("Logout");
            panel1.add(buttonLogout, "cell 26 1 10 1");

            //---- buttonStudyNote ----
            buttonStudyNote.setText("Study Note");
            buttonStudyNote.addActionListener(e -> {
			login(e);
			studyNote(e);
			studyNote(e);
		});
            panel1.add(buttonStudyNote, "cell 0 3 36 2");

            //---- buttonStartQuiz ----
            buttonStartQuiz.setText("Start the Quiz");
            buttonStartQuiz.addActionListener(e -> startQuiz(e));
            panel1.add(buttonStartQuiz, "cell 0 6 36 1");

            //---- buttonStatistics ----
            buttonStatistics.setText("View Statistics");
            buttonStatistics.addActionListener(e -> login(e));
            panel1.add(buttonStatistics, "cell 0 10 36 1");
        }
        add(panel1, "cell 0 1 27 2");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel labelTitle;
    private JPanel panel1;
    private JTextField textFieldUsername;
    private JButton buttonLogout;
    private JButton buttonStudyNote;
    private JButton buttonStartQuiz;
    private JButton buttonStatistics;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed May 15 13:42:00 EDT 2024
 */



/**
 * @author Tabas9897
 */
public class StudyNote extends JPanel {
    public StudyNote() {
	initComponents();
    }

    private void login(ActionEvent e) {
	// TODO add your code here
    }

    private void initComponents() {
	// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
    labelTitle = new JLabel();
    panel1 = new JPanel();
    scrollPane1 = new JScrollPane();
    textAreaStudyNote = new JTextArea();

    //======== this ========
    setLayout(new MigLayout(
        "hidemode 3",
        // columns
        "[fill]" +
        "[fill]",
        // rows
        "[]" +
        "[]" +
        "[]"));

    //---- labelTitle ----
    labelTitle.setText("Study Note");
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
            "[]" +
            "[]" +
            "[]"));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textAreaStudyNote);
        }
        panel1.add(scrollPane1, "cell 0 0 38 13");
    }
    add(panel1, "cell 0 1");
	// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel labelTitle;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTextArea textAreaStudyNote;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

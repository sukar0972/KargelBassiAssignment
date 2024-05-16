import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed May 15 13:49:21 EDT 2024
 */



/**
 * @author Tabas9897
 */
public class Quiz extends JPanel {
    public Quiz() {
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
	// Generated using JFormDesigner Evaluation license - Sullaimon Karge
	label1 = new JLabel();
	panel1 = new JPanel();
	label2 = new JLabel();
	textFieldUsername = new JTextField();

	//======== this ========
	setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
	0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
	. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
	red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
	beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
	setLayout(new MigLayout(
	    "hidemode 3",
	    // columns
	    "[fill]" +
	    "[fill]",
	    // rows
	    "[]" +
	    "[]" +
	    "[]"));

	//---- label1 ----
	label1.setText("Quiz");
	label1.setFont(label1.getFont().deriveFont(Font.BOLD, label1.getFont().getSize() + 2f));
	add(label1, "cell 0 0");

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
		"[]"));

	    //---- label2 ----
	    label2.setText("Question");
	    label2.setFont(label2.getFont().deriveFont(Font.BOLD, label2.getFont().getSize() + 2f));
	    panel1.add(label2, "cell 0 0");

	    //---- textFieldUsername ----
	    textFieldUsername.setEditable(false);
	    panel1.add(textFieldUsername, "cell 1 0");
	}
	add(panel1, "cell 0 1");
	// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Sullaimon Karge
    private JLabel label1;
    private JPanel panel1;
    private JLabel label2;
    private JTextField textFieldUsername;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

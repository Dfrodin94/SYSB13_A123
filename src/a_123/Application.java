package a_123;

import java.awt.*;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class Application {
	private JPanel mainMeny;
	private JPanel panel_A1;
	private JPanel panel_A2;
	private JPanel panel_A3;
	private JPanel panelCourse;
	private JPanel panelStudent;

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 449, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		mainMeny = new JPanel();
		frame.getContentPane().add(mainMeny, "name_1560341012860");
		mainMeny.setLayout(null);
		mainMeny.setVisible(true);
		
		JButton btnA1 = new JButton("A1");
		btnA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainMeny.setVisible(false);
				panel_A1.setVisible(true);
			}
		});
		btnA1.setBounds(146, 11, 144, 78);
		mainMeny.add(btnA1);
		
		JButton btnA2 = new JButton("A2");
		btnA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMeny.setVisible(false);
				panel_A2.setVisible(true);
			}
		});
		btnA2.setBounds(146, 110, 144, 78);
		mainMeny.add(btnA2);
		
		JButton btnA3 = new JButton("A3");
		btnA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMeny.setVisible(false);
				panel_A3.setVisible(true);
			}
		});
		btnA3.setBounds(146, 217, 144, 78);
		mainMeny.add(btnA3);
		
		panel_A1 = new JPanel();
		frame.getContentPane().add(panel_A1, "name_1562357507500");
		panel_A1.setLayout(null);
		
		JButton btnA1MainMeny = new JButton("Main Meny");
		btnA1MainMeny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMeny.setVisible(true);
				panel_A1.setVisible(false);
			}
		});
		btnA1MainMeny.setBounds(314, 11, 109, 48);
		panel_A1.add(btnA1MainMeny);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_A1.setVisible(false);
				panelStudent.setVisible(true);
			}
		});
		btnStudent.setBounds(60, 156, 133, 54);
		panel_A1.add(btnStudent);
		
		JButton btnCourse = new JButton("Course");
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_A1.setVisible(false);
				panelCourse.setVisible(true);
			}
		});
		btnCourse.setBounds(240, 156, 134, 54);
		panel_A1.add(btnCourse);
		
		JTextArea textArea_A1 = new JTextArea();
		textArea_A1.setText("**info\r\n**infox2\r\n**info\r\n**hahhalol,javaetc\r\n\r\nJDBC JDBC HAHAHAAH");
		textArea_A1.setName("fgfgf");
		textArea_A1.setBackground(SystemColor.control);
		textArea_A1.setBounds(60, 242, 312, 127);
		panel_A1.add(textArea_A1);
		panel_A1.setVisible(false);
		
		panel_A2 = new JPanel();
		frame.getContentPane().add(panel_A2, "name_1564993194344");
		panel_A2.setLayout(null);
		
		JButton btnA2MainMeny = new JButton("Main Meny");
		btnA2MainMeny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMeny.setVisible(true);
				panel_A2.setVisible(false);
			}
		});
		btnA2MainMeny.setBounds(10, 11, 139, 23);
		panel_A2.add(btnA2MainMeny);
		
		panel_A3 = new JPanel();
		frame.getContentPane().add(panel_A3, "name_1567288573764");
		panel_A3.setLayout(null);
		
		JButton btnA3MainMeny = new JButton("Main Meny");
		btnA3MainMeny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainMeny.setVisible(false);
				panel_A3.setVisible(false);
			}
		});
		btnA3MainMeny.setBounds(10, 11, 137, 23);
		panel_A3.add(btnA3MainMeny);
		
		panelCourse = new JPanel();
		frame.getContentPane().add(panelCourse, "name_4993868386697");
		
		JButton btnBackCourse = new JButton("\u2190");
		btnBackCourse.setBounds(336, 11, 53, 23);
		btnBackCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCourse.setVisible(false);
				panel_A1.setVisible(true);
			}
		});
		panelCourse.setLayout(null);
		panelCourse.add(btnBackCourse);
		
		JLabel lblCourseid_1 = new JLabel("courseID");
		lblCourseid_1.setBounds(10, 15, 46, 14);
		panelCourse.add(lblCourseid_1);
		
		JLabel lblCinfo = new JLabel("cInfo");
		lblCinfo.setBounds(10, 39, 46, 14);
		panelCourse.add(lblCinfo);
		
		JLabel lblCredits = new JLabel("credits");
		lblCredits.setBounds(10, 64, 46, 14);
		panelCourse.add(lblCredits);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 12, 86, 20);
		panelCourse.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(66, 36, 86, 20);
		panelCourse.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(66, 61, 86, 20);
		panelCourse.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnRegisterCourse = new JButton("Register Course");
		btnRegisterCourse.setBounds(172, 11, 89, 23);
		panelCourse.add(btnRegisterCourse);
		
		JButton button = new JButton("");
		button.setBounds(162, 55, 53, -2);
		panelCourse.add(button);
		
		JButton btnFindCourse = new JButton("Find Course");
		btnFindCourse.setBounds(172, 39, 89, 23);
		panelCourse.add(btnFindCourse);
		
		JButton btnRemoveCourse = new JButton("Remove Course");
		btnRemoveCourse.setBounds(172, 64, 89, 23);
		panelCourse.add(btnRemoveCourse);
		
		JLabel lblGrade = new JLabel("grade");
		lblGrade.setBounds(10, 90, 46, 14);
		panelCourse.add(lblGrade);
		
		textField_6 = new JTextField();
		textField_6.setBounds(66, 87, 86, 20);
		panelCourse.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCompletedCourseRegister = new JButton("Completed course register");
		btnCompletedCourseRegister.setBounds(172, 98, 89, 23);
		panelCourse.add(btnCompletedCourseRegister);
		
		JButton btnCourseResult = new JButton("Course Result");
		btnCourseResult.setBounds(279, 98, 89, 23);
		panelCourse.add(btnCourseResult);
		
		JButton btnCourseCompleted = new JButton("Course completed");
		btnCourseCompleted.setBounds(172, 132, 89, 23);
		panelCourse.add(btnCourseCompleted);
		
		JButton btnCourseFailed = new JButton("Course failed");
		btnCourseFailed.setBounds(172, 166, 89, 23);
		panelCourse.add(btnCourseFailed);
		
		JButton btnShowA = new JButton("show A");
		btnShowA.setBounds(172, 200, 89, 23);
		panelCourse.add(btnShowA);
		
		panelStudent = new JPanel();
		frame.getContentPane().add(panelStudent, "name_5409642975220");
		panelStudent.setLayout(null);
		
		JButton btnBackStudent = new JButton("\u2190");
		btnBackStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelStudent.setVisible(false);
				panel_A1.setVisible(true);
			}
		});
		btnBackStudent.setBounds(369, 11, 54, 23);
		panelStudent.add(btnBackStudent);
		
		JLabel lblStudentid = new JLabel("StudentID");
		lblStudentid.setBounds(127, 37, 72, 19);
		panelStudent.add(lblStudentid);
		
		JLabel lblSname = new JLabel("SName");
		lblSname.setBounds(137, 70, 46, 14);
		panelStudent.add(lblSname);
		
		textField = new JTextField();
		textField.setBounds(222, 36, 86, 20);
		panelStudent.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 67, 86, 20);
		panelStudent.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCourseid = new JLabel("courseID");
		lblCourseid.setBounds(127, 98, 62, 20);
		panelStudent.add(lblCourseid);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 98, 86, 20);
		panelStudent.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnRegister = new JButton("register student");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setBounds(76, 131, 123, 30);
		panelStudent.add(btnRegister);
		
		JButton btnFindStudent = new JButton("find student");
		btnFindStudent.setBounds(76, 173, 123, 27);
		panelStudent.add(btnFindStudent);
		
		JButton btnRemoveStudent = new JButton("remove student");
		btnRemoveStudent.setBounds(76, 212, 123, 30);
		panelStudent.add(btnRemoveStudent);
		
		JButton btnCourseRegistration = new JButton("course registration");
		btnCourseRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCourseRegistration.setBounds(237, 131, 123, 30);
		panelStudent.add(btnCourseRegistration);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(76, 272, 284, 91);
		panelStudent.add(textArea_1);
		
		JButton btnRemoveStudies = new JButton("remove studies");
		btnRemoveStudies.setBounds(237, 212, 123, 30);
		panelStudent.add(btnRemoveStudies);
		
		JButton btnShowResultCourse = new JButton("show result course");
		btnShowResultCourse.setBounds(237, 171, 123, 30);
		panelStudent.add(btnShowResultCourse);
	}

}

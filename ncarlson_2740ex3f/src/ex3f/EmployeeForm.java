package ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JTextField empIDTextField;
	private JTextField empNameTextField;
	private JComboBox deptComboBox;
	private JTextField positionTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeForm() {
		setTitle("Ex3f: Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpid = new JLabel("EmpID:");
		lblEmpid.setBounds(10, 160, 46, 14);
		contentPane.add(lblEmpid);
		
		JLabel lblEmpname = new JLabel("EmpName:");
		lblEmpname.setBounds(10, 196, 67, 14);
		contentPane.add(lblEmpname);
		
		JLabel lblDept = new JLabel("Dept:");
		lblDept.setBounds(10, 231, 46, 14);
		contentPane.add(lblDept);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 267, 46, 14);
		contentPane.add(lblPosition);
		
		empIDTextField = new JTextField();
		empIDTextField.setText("101");
		lblEmpid.setLabelFor(empIDTextField);
		empIDTextField.setBounds(94, 157, 67, 20);
		contentPane.add(empIDTextField);
		empIDTextField.setColumns(10);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("Nils Carlson");
		empNameTextField.setBounds(94, 193, 159, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		positionTextField = new JTextField();
		positionTextField.setText("Dragon Trainer");
		positionTextField.setBounds(94, 264, 159, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		JButton btnNoArg = new JButton("No Arg");
		btnNoArg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnNoArg_actionPerformed(arg0);
			}
		});
		btnNoArg.setBounds(10, 313, 89, 23);
		contentPane.add(btnNoArg);
		
		JButton btn2Arg = new JButton("2Arg");
		btn2Arg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btn2Arg_actionPerformed(e);
			}
		});
		btn2Arg.setBounds(125, 313, 89, 23);
		contentPane.add(btn2Arg);
		
		JButton btn4Arg = new JButton("4 Arg");
		btn4Arg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btn4Arg_actionPerformed(e);
			}
		});
		btn4Arg.setBounds(249, 313, 89, 23);
		contentPane.add(btn4Arg);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance"}));
		deptComboBox.setBounds(94, 228, 159, 20);
		contentPane.add(deptComboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 136);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		//employeeList = new JList();
		employeeList = new JList(employeeListModel);
		employeeList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		scrollPane.setViewportView(employeeList);
	}
	protected void do_btnNoArg_actionPerformed(ActionEvent arg0) {
		//Call constructor
		Employee emp = new Employee();
		//AddEmp to employeeLismodel
		employeeListModel.addElement(emp);
	}
	
	protected void do_btn2Arg_actionPerformed(ActionEvent e) {
		//Get empId from empIDTextField, convert to int
		int id = Integer.parseInt(empIDTextField.getText());
		//Call constructor
		Employee emp = new Employee(id, empNameTextField.getText());
		//Add emp to empListModel
		employeeListModel.addElement(emp);
	
	}
	
	protected void do_btn4Arg_actionPerformed(ActionEvent e) {
		//get emp ID from empIDTextField, comver to int
		int id = Integer.parseInt(empIDTextField.getText());
		//get selected string from deptComboBox
	    String dept = (String) deptComboBox.getSelectedItem();
		//Call constructor
	    Employee emp = new Employee(id, empNameTextField.getText(), dept, positionTextField.getText());
		//Add emp to employeeListModel
	    employeeListModel.addElement(emp);
	}
}

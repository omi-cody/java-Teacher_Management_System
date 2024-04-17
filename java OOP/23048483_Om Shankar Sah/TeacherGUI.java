import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Write a description of class TeacherGUI here.
 *
 * @author (OM SHANKAR SAH)
 * @version (2024-04-06)
 */
public class TeacherGUI implements ActionListener, WindowListener {
    private JFrame teacherGui;
    private JPanel titlePanel, tutor_mainPanel, lec_mainPanel, gradePanel, setSalaryPanel, rmvtutorpanel, footerPanel;
    private JLabel tTutor, teacherId_L, teacherName_L, add_L, workingT_L, speci_L, workingH_L, empStat__L, acaQuali_L,
            performanceI_L, salary_L, Salary_teacher_ID_L, new_performI_L, new_Salary_L, rmvTeacherID_L, l_teacherId_L,
            l_teacherName_L, l_address_L, l_workingType_L, l_empStatus_L, l_gradedScore_L, department_L, yearOfExp_L,
            l2_teacherID_L, gradedScore_L, nyearOfExp_L;
    private JTextField teacherId_T, teacherName_T, address_T, workingT_T, speci_T, workingH_T, empStat_T, acaQuali_T,
            performanceI_T, salary_T, Salary_teacher_ID_T, new_performI_T, new_Salary_T, rmvTeacherId_T, l_teacherId_T,
            l_teacherName_T, l_address_T, l_workingType_T, l_empStatus_T, l_gradedScore_T, department_T, yearOfExp_T,
            l2_teacherID_T, l2_department_T, gradedScore_T, nyearOfExp_T;
    private JButton addTutor_Btn, setSalary_Btn, addlecturer_Btn, gradeAssign_Btn, rmvTutor_Btn, tutor_display_Btn,
            lecturer_display_Btn, clear_Btn;
    private JComboBox select;
    private JMenuBar about;
    private JMenu menu;
    private JMenuItem abtMe;
    private ArrayList<Teacher> teacher_database = new ArrayList<Teacher>();

    TeacherGUI() {
        // frame
        teacherGui = new JFrame("Teacher");
        teacherGui.setDefaultCloseOperation(teacherGui.EXIT_ON_CLOSE);
        teacherGui.setBounds(420, 110, 700, 580);
        ImageIcon icon = new ImageIcon("teacherLogo.png");
        teacherGui.setIconImage(icon.getImage());
        teacherGui.setResizable(false);
        teacherGui.setLayout(null);

        //menubar
        about=new JMenuBar();
        about.setBounds(0,0,700,20);
        //menu
        menu=new JMenu("About Me");
        //menu item
        abtMe=new JMenuItem("More");
        abtMe.addActionListener(this);
        menu.add(abtMe);
        about.add(menu);
        teacherGui.add(about);

        // Colors for GUI
        Color pColor1 = new Color(253, 247, 228); // color for panels
        Color color3 = new Color(222, 208, 182);
        Color color4 = new Color(187, 171, 140);

        // panel for Heading
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setBounds(0, 0, 700, 60);
        titlePanel.setBackground(pColor1);
        titlePanel.setVisible(true);
        teacherGui.add(titlePanel);

        // title in panel
        tTutor = new JLabel("TUTOR");
        tTutor.setFont(new Font("Times Roman", 1, 30));
        tTutor.setBounds(300, 12, 126, 44);
        titlePanel.add(tTutor);

        // selection between Tutor and lecturer
        String[] teacher = { "Tutor", "Lecturer" };
        select = new JComboBox<>(teacher);
        select.setBounds(550, 25, 120, 30);
        select.addActionListener(this);
        select.setBackground(color4);
        titlePanel.add(select);
        /*************************** Tutor Main panel ************************/
        // Font for Labels
        Font LabelFont = new Font("Times Roman", 1, 14);
        Font TextFont = new Font("Times Roman", 0, 13);
        tutor_mainPanel = new JPanel();
        tutor_mainPanel.setLayout(null);
        tutor_mainPanel.setBackground(pColor1);
        tutor_mainPanel.setBounds(0, 65, 700, 230);
        teacherGui.add(tutor_mainPanel);

        // TeacherId label
        teacherId_L = new JLabel("Teacher ID:");
        teacherId_L.setFont(LabelFont);
        teacherId_L.setBounds(10, 10, 90, 20);
        tutor_mainPanel.add(teacherId_L);

        // teacherId textfield
        teacherId_T = new JTextField();
        teacherId_T.setBounds(130, 10, 80, 25);
        teacherId_T.setFont(TextFont);
        tutor_mainPanel.add(teacherId_T);

        // teacher Name Label
        teacherName_L = new JLabel("Teacher Name:");
        teacherName_L.setFont(LabelFont);
        teacherName_L.setBounds(10, 45, 120, 20);
        tutor_mainPanel.add(teacherName_L);

        // teacher Name textfield
        teacherName_T = new JTextField();
        teacherName_T.setBounds(130, 45, 160, 25);
        teacherName_T.setFont(TextFont);
        tutor_mainPanel.add(teacherName_T);

        // address Label
        add_L = new JLabel("Address:");
        add_L.setFont(LabelFont);
        add_L.setBounds(350, 45, 80, 20);
        tutor_mainPanel.add(add_L);

        // address TextField
        address_T = new JTextField();
        address_T.setBounds(510, 45, 160, 25);
        address_T.setFont(TextFont);
        tutor_mainPanel.add(address_T);

        // working Type Label
        workingT_L = new JLabel("Working Type:");
        workingT_L.setFont(LabelFont);
        workingT_L.setBounds(10, 80, 120, 20);
        tutor_mainPanel.add(workingT_L);

        // working Type Textfield
        workingT_T = new JTextField();
        workingT_T.setBounds(130, 80, 160, 25);
        workingT_T.setFont(TextFont);
        tutor_mainPanel.add(workingT_T);

        // Specialization label
        speci_L = new JLabel("Specialization:");
        speci_L.setFont(LabelFont);
        speci_L.setBounds(350, 80, 120, 20);
        tutor_mainPanel.add(speci_L);

        // Specialization textfield
        speci_T = new JTextField();
        speci_T.setBounds(510, 80, 160, 25);
        speci_T.setFont(TextFont);
        tutor_mainPanel.add(speci_T);

        // Working Hour Label
        workingH_L = new JLabel("Working Hour:");
        workingH_L.setFont(LabelFont);
        workingH_L.setBounds(10, 115, 120, 20);
        tutor_mainPanel.add(workingH_L);

        // working Hour textfield
        workingH_T = new JTextField();
        workingH_T.setBounds(130, 115, 160, 25);
        workingH_T.setFont(TextFont);
        tutor_mainPanel.add(workingH_T);

        // Employment Status Label
        empStat__L = new JLabel("Employment Status:");
        empStat__L.setFont(LabelFont);
        empStat__L.setBounds(350, 115, 145, 20);
        tutor_mainPanel.add(empStat__L);

        // Employment Status textfield
        empStat_T = new JTextField();
        empStat_T.setBounds(510, 115, 160, 25);
        empStat_T.setFont(TextFont);
        tutor_mainPanel.add(empStat_T);

        // Academic Qualification label
        acaQuali_L = new JLabel("Academic Qua.:");
        acaQuali_L.setFont(LabelFont);
        acaQuali_L.setBounds(10, 150, 120, 20);
        tutor_mainPanel.add(acaQuali_L);

        // Academic Qualification TextField
        acaQuali_T = new JTextField();
        acaQuali_T.setBounds(130, 150, 160, 25);
        acaQuali_T.setFont(TextFont);
        tutor_mainPanel.add(acaQuali_T);

        // Performance Index Label
        performanceI_L = new JLabel("Performance Index:");
        performanceI_L.setFont(LabelFont);
        performanceI_L.setBounds(350, 150, 140, 20);
        tutor_mainPanel.add(performanceI_L);

        // Performance Index textfield
        performanceI_T = new JTextField();
        performanceI_T.setBounds(510, 150, 160, 25);
        performanceI_T.setFont(TextFont);
        tutor_mainPanel.add(performanceI_T);

        // salary Label
        salary_L = new JLabel("Salary:");
        salary_L.setFont(LabelFont);
        salary_L.setBounds(10, 185, 80, 20);
        tutor_mainPanel.add(salary_L);

        // salary textfield
        salary_T = new JTextField();
        salary_T.setBounds(130, 185, 160, 25);
        salary_T.setFont(TextFont);
        tutor_mainPanel.add(salary_T);

        // add Tutor Button
        addTutor_Btn = new JButton("ADD TUTOR");
        addTutor_Btn.setBounds(510, 185, 160, 30);
        addTutor_Btn.setFont(new Font("Times Roman", 1, 14));
        addTutor_Btn.setBackground(color3);
        addTutor_Btn.setFocusable(false);
        addTutor_Btn.addActionListener(this);
        tutor_mainPanel.add(addTutor_Btn);
        /******************** Set Salary Panel************ */
        setSalaryPanel = new JPanel();
        setSalaryPanel.setLayout(null);
        setSalaryPanel.setBounds(0, 300, 700, 90);
        setSalaryPanel.setBackground(pColor1);
        setSalaryPanel.setVisible(true);
        teacherGui.add(setSalaryPanel);

        // Set Salary TeacherID Label
        Salary_teacher_ID_L = new JLabel("Teacher ID:");
        Salary_teacher_ID_L.setFont(LabelFont);
        Salary_teacher_ID_L.setBounds(10, 10, 90, 20);
        setSalaryPanel.add(Salary_teacher_ID_L);

        // set Salary Teacher ID Textfield
        Salary_teacher_ID_T = new JTextField();
        Salary_teacher_ID_T.setBounds(130, 10, 80, 25);
        Salary_teacher_ID_T.setFont(TextFont);
        setSalaryPanel.add(Salary_teacher_ID_T);

        // New Performance Index Label
        new_performI_L = new JLabel("New Performance Index:");
        new_performI_L.setFont(LabelFont);
        new_performI_L.setBounds(320, 10, 180, 20);
        setSalaryPanel.add(new_performI_L);

        // New Performance Index textfield
        new_performI_T = new JTextField();
        new_performI_T.setBounds(510, 10, 160, 25);
        new_performI_T.setFont(TextFont);
        setSalaryPanel.add(new_performI_T);

        // New Salary Index Label
        new_Salary_L = new JLabel("New Salary:");
        new_Salary_L.setFont(LabelFont);
        new_Salary_L.setBounds(10, 45, 100, 20);
        setSalaryPanel.add(new_Salary_L);

        // New salary textfield
        new_Salary_T = new JTextField();
        new_Salary_T.setBounds(130, 45, 160, 25);
        new_Salary_T.setFont(TextFont);
        setSalaryPanel.add(new_Salary_T);

        // Add set salary Button
        setSalary_Btn = new JButton("SET SALARY");
        setSalary_Btn.setBounds(510, 45, 160, 30);
        setSalary_Btn.setFont(new Font("Times Roman", 1, 14));
        setSalary_Btn.setBackground(color3);
        setSalary_Btn.addActionListener(this);
        setSalaryPanel.add(setSalary_Btn);
        setSalary_Btn.setFocusable(false);

        /*********************** Remove Tutor Panel************************** */
        rmvtutorpanel = new JPanel();
        rmvtutorpanel.setLayout(null);
        rmvtutorpanel.setBackground(pColor1);
        rmvtutorpanel.setBounds(0, 395, 700, 60);
        rmvtutorpanel.setVisible(true);
        teacherGui.add(rmvtutorpanel);

        // Remove teacher Id Label
        rmvTeacherID_L = new JLabel("Teacher ID:");
        rmvTeacherID_L.setFont(LabelFont);
        rmvTeacherID_L.setBounds(10, 20, 90, 20);
        rmvtutorpanel.add(rmvTeacherID_L);

        // set Salary Teacher ID Textfield
        rmvTeacherId_T = new JTextField();
        rmvTeacherId_T.setBounds(130, 20, 120, 25);
        rmvTeacherId_T.setFont(TextFont);
        rmvtutorpanel.add(rmvTeacherId_T);

        // Remove Tutor Button
        rmvTutor_Btn = new JButton("REMOVE TUTOR");
        rmvTutor_Btn.setBounds(510, 20, 160, 30);
        rmvTutor_Btn.setFont(new Font("Times Roman", 1, 14));
        rmvTutor_Btn.addActionListener(this);
        rmvTutor_Btn.setBackground(color3);
        rmvtutorpanel.add(rmvTutor_Btn);
        rmvTutor_Btn.setFocusable(false);

        // Display and clear panel or Footer Panel
        footerPanel = new JPanel();
        footerPanel.setLayout(null);
        footerPanel.setBackground(pColor1);
        footerPanel.setBounds(0, 460, 700, 80);
        teacherGui.add(footerPanel);

        // Display button
        tutor_display_Btn = new JButton("DISPLAY");
        tutor_display_Btn.setBounds(100, 30, 160, 30);
        tutor_display_Btn.setFont(new Font("Times Roman", 1, 14));
        tutor_display_Btn.setVisible(true);
        tutor_display_Btn.setBackground(color3);
        tutor_display_Btn.addActionListener(this);
        footerPanel.add(tutor_display_Btn);
        tutor_display_Btn.setFocusable(false);

        // Clear BUtton
        clear_Btn = new JButton("CLEAR");
        clear_Btn.setBounds(430, 30, 160, 30);
        clear_Btn.setFont(new Font("Times Roman", 1, 14));
        clear_Btn.setBackground(color3);
        footerPanel.add(clear_Btn);
        clear_Btn.addActionListener(this);
        clear_Btn.setFocusable(false);

        /******************** Lecturer ****************** */
        // Lecturer main panel
        lec_mainPanel = new JPanel();
        lec_mainPanel.setLayout(null);
        lec_mainPanel.setBackground(pColor1);
        lec_mainPanel.setBounds(0, 65, 700, 230);
        lec_mainPanel.setVisible(false);
        teacherGui.add(lec_mainPanel);

        // Lecturer techer Id
        l_teacherId_L = new JLabel("Teacher ID:");
        l_teacherId_L.setFont(LabelFont);
        l_teacherId_L.setBounds(10, 10, 90, 20);
        lec_mainPanel.add(l_teacherId_L);

        // lecturer teacherID textField
        l_teacherId_T = new JTextField();
        l_teacherId_T.setBounds(130, 10, 80, 25);
        l_teacherId_T.setFont(TextFont);
        lec_mainPanel.add(l_teacherId_T);

        // lecturer Teacher Name Label
        l_teacherName_L = new JLabel("Teacher Name:");
        l_teacherName_L.setFont(LabelFont);
        l_teacherName_L.setBounds(10, 45, 120, 20);
        lec_mainPanel.add(l_teacherName_L);

        // lecturer teacher Name textfield
        l_teacherName_T = new JTextField();
        l_teacherName_T.setBounds(130, 45, 160, 25);
        l_teacherName_T.setFont(TextFont);
        lec_mainPanel.add(l_teacherName_T);

        // lecturer address Label
        l_address_L = new JLabel("Address:");
        l_address_L.setFont(LabelFont);
        l_address_L.setBounds(350, 45, 80, 20);
        lec_mainPanel.add(l_address_L);

        // lecturer address TextField
        l_address_T = new JTextField();
        l_address_T.setBounds(510, 45, 160, 25);
        l_address_T.setFont(TextFont);
        lec_mainPanel.add(l_address_T);

        // Lecturer working Type Label
        l_workingType_L = new JLabel("Working Type:");
        l_workingType_L.setFont(LabelFont);
        l_workingType_L.setBounds(10, 80, 120, 20);
        lec_mainPanel.add(l_workingType_L);

        // Lecturer working Type Textfield
        l_workingType_T = new JTextField();
        l_workingType_T.setBounds(130, 80, 160, 25);
        l_workingType_T.setFont(TextFont);
        lec_mainPanel.add(l_workingType_T);

        // Lecturer Employment Status Label
        l_empStatus_L = new JLabel("Employment Status:");
        l_empStatus_L.setFont(LabelFont);
        l_empStatus_L.setBounds(350, 80, 160, 20);
        lec_mainPanel.add(l_empStatus_L);

        // Lecturer Employment Status textfield
        l_empStatus_T = new JTextField();
        l_empStatus_T.setBounds(510, 80, 160, 25);
        l_empStatus_T.setFont(TextFont);
        lec_mainPanel.add(l_empStatus_T);

        // Lecturer GradedScore Label
        l_gradedScore_L = new JLabel("Graded Score:");
        l_gradedScore_L.setFont(LabelFont);
        l_gradedScore_L.setBounds(10, 115, 120, 20);
        lec_mainPanel.add(l_gradedScore_L);

        // Lecturer GradedScore textfield
        l_gradedScore_T = new JTextField();
        l_gradedScore_T.setBounds(130, 115, 160, 25);
        l_gradedScore_T.setFont(TextFont);
        lec_mainPanel.add(l_gradedScore_T);

        // Department Label
        department_L = new JLabel("Department:");
        department_L.setFont(LabelFont);
        department_L.setBounds(350, 115, 145, 20);
        lec_mainPanel.add(department_L);

        // Department textfield
        department_T = new JTextField();
        department_T.setBounds(510, 115, 160, 25);
        department_T.setFont(TextFont);
        lec_mainPanel.add(department_T);

        // Year of Experience label
        yearOfExp_L = new JLabel("Year Of Exp.:");
        yearOfExp_L.setFont(LabelFont);
        yearOfExp_L.setBounds(10, 150, 120, 20);
        lec_mainPanel.add(yearOfExp_L);

        // Year of Experience TextField
        yearOfExp_T = new JTextField();
        yearOfExp_T.setBounds(130, 150, 160, 25);
        yearOfExp_T.setFont(TextFont);
        lec_mainPanel.add(yearOfExp_T);

        // add Lecturer Button
        addlecturer_Btn = new JButton("ADD LECTURER");
        addlecturer_Btn.setBounds(510, 185, 160, 30);
        addlecturer_Btn.setFont(new Font("Times Roman", 1, 14));
        addlecturer_Btn.setBackground(color3);
        addlecturer_Btn.addActionListener(this);
        lec_mainPanel.add(addlecturer_Btn);
        addlecturer_Btn.setFocusable(false);

        /******************* Grade Assignment Panel ****************/
        gradePanel = new JPanel();
        gradePanel.setLayout(null);
        gradePanel.setBounds(0, 300, 700, 155);
        gradePanel.setBackground(pColor1);
        gradePanel.setVisible(false);
        teacherGui.add(gradePanel);

        // grade Asignment teacherId Label
        l2_teacherID_L = new JLabel("Teacher ID:");
        l2_teacherID_L.setFont(LabelFont);
        l2_teacherID_L.setBounds(10, 10, 90, 20);
        gradePanel.add(l2_teacherID_L);

        // Grade Assignment Teacher ID Textfield
        l2_teacherID_T = new JTextField();
        l2_teacherID_T.setBounds(130, 10, 80, 25);
        l2_teacherID_T.setFont(TextFont);
        gradePanel.add(l2_teacherID_T);

        // Department Label
        department_L = new JLabel("Department:");
        department_L.setFont(LabelFont);
        department_L.setBounds(350, 10, 180, 20);
        gradePanel.add(department_L);

        // Department textfield
        l2_department_T = new JTextField();
        l2_department_T.setBounds(510, 10, 160, 25);
        l2_department_T.setFont(TextFont);
        gradePanel.add(l2_department_T);

        // Graded Score of grade Assignment Label
        gradedScore_L = new JLabel("Graded Score:");
        gradedScore_L.setFont(LabelFont);
        gradedScore_L.setBounds(10, 45, 120, 20);
        gradePanel.add(gradedScore_L);

        // Graded Score of grade Assignment textfield
        gradedScore_T = new JTextField();
        gradedScore_T.setBounds(130, 45, 160, 25);
        gradedScore_T.setFont(TextFont);
        gradePanel.add(gradedScore_T);

        // Year of Experience Of Grade Score Label
        nyearOfExp_L = new JLabel("Year Of Experience:");
        nyearOfExp_L.setFont(LabelFont);
        nyearOfExp_L.setBounds(350, 45, 180, 20);
        gradePanel.add(nyearOfExp_L);

        // Year of Experience Of Grade Score textfield
        nyearOfExp_T = new JTextField();
        nyearOfExp_T.setBounds(510, 45, 160, 25);
        nyearOfExp_T.setFont(TextFont);
        gradePanel.add(nyearOfExp_T);

        // Grade Assignment Button
        gradeAssign_Btn = new JButton("GRADE ASSIGNMENT");
        gradeAssign_Btn.setBounds(470, 100, 200, 30);
        gradeAssign_Btn.setFont(new Font("Times Roman", 1, 14));
        gradeAssign_Btn.addActionListener(this);
        gradeAssign_Btn.setBackground(color3);
        gradePanel.add(gradeAssign_Btn);
        gradeAssign_Btn.setFocusable(false);

        // Display for Lecturer
        lecturer_display_Btn = new JButton("DISPLAY");
        lecturer_display_Btn.setBounds(100, 30, 160, 30);
        lecturer_display_Btn.setFont(new Font("Times Roman", 1, 14));
        lecturer_display_Btn.setVisible(false);
        lecturer_display_Btn.setBackground(color3);
        lecturer_display_Btn.addActionListener(this);
        footerPanel.add(lecturer_display_Btn);
        lecturer_display_Btn.setFocusable(false);

        // Frame Visibility
        teacherGui.setVisible(true);
        teacherGui.addWindowListener(this);

    }

    // method for clearing all the field
    public void clear() {
        teacherId_T.setText(null);
        teacherName_T.setText(null);
        address_T.setText(null);
        workingT_T.setText(null);
        speci_T.setText(null);
        workingH_T.setText(null);
        empStat_T.setText(null);
        acaQuali_T.setText(null);
        performanceI_T.setText(null);
        salary_T.setText(null);
        Salary_teacher_ID_T.setText(null);
        new_Salary_T.setText(null);
        new_performI_T.setText(null);
        rmvTeacherId_T.setText(null);
        l_teacherId_T.setText(null);
        l_teacherName_T.setText(null);
        l_address_T.setText(null);
        l_workingType_T.setText(null);
        l_empStatus_T.setText(null);
        l_workingType_T.setText(null);
        l_gradedScore_T.setText(null);
        department_T.setText(null);
        yearOfExp_T.setText(null);
        l2_teacherID_T.setText(null);
        l2_department_T.setText(null);
        gradedScore_T.setText(null);
        nyearOfExp_T.setText(null);
    }

    // method for clearing the fied after adding tutor
    public void clearTutor() {
        teacherId_T.setText(null);
        teacherName_T.setText(null);
        address_T.setText(null);
        workingT_T.setText(null);
        speci_T.setText(null);
        workingH_T.setText(null);
        empStat_T.setText(null);
        acaQuali_T.setText(null);
        performanceI_T.setText(null);
        salary_T.setText(null);

    }

    // method for clearing the field after adding Lecturer
    public void clearLecturer() {
        l_teacherId_T.setText(null);
        l_teacherName_T.setText(null);
        l_address_T.setText(null);
        l_workingType_T.setText(null);
        l_empStatus_T.setText(null);
        l_gradedScore_T.setText(null);
        department_T.setText(null);
        yearOfExp_T.setText(null);

    }

    // method for clearing field after setting salary
    public void clearSalary() {
        Salary_teacher_ID_T.setText(null);
        new_performI_T.setText(null);
        new_Salary_T.setText(null);
    }

    public void clearGradeAssign() {
        l2_teacherID_T.setText(null);
        l2_department_T.setText(null);
        gradedScore_T.setText(null);
        nyearOfExp_T.setText(null);
    }
    String display;
    @Override
    public void actionPerformed(ActionEvent s) {
        if (s.getSource()==abtMe) {
            JOptionPane.showMessageDialog(teacherGui,"Hello!\nMy Name is Om Shankar Sah.\nI have been studying Bsc in Computing at Islington College.\nThis software is made for managing the teachers of institutes.\nFor Info :\nEmail :omshankarsah4548@gmail.com\n                      THANK YOU!", "About Me", JOptionPane.INFORMATION_MESSAGE);
            
        }
        // Action Listener for selecting between Tutor and Lecturer
        else if (s.getSource() == select) {
            if (select.getSelectedItem() == "Lecturer") {
                tutor_mainPanel.setVisible(false);
                setSalaryPanel.setVisible(false);
                rmvtutorpanel.setVisible(false);
                tTutor.setBounds(280, 10, 200, 44);
                tTutor.setText("LECTURER");
                lec_mainPanel.setVisible(true);
                lecturer_display_Btn.setVisible(true);
                gradePanel.setVisible(true);
                tutor_display_Btn.setVisible(false);

            } else {
                tutor_mainPanel.setVisible(true);
                setSalaryPanel.setVisible(true);
                rmvtutorpanel.setVisible(true);
                tTutor.setText("TUTOR");
                tTutor.setBounds(300, 10, 126, 44);
                tutor_display_Btn.setVisible(true);
                gradePanel.setVisible(false);

            }

        }
        // ***************Action listener for adding tutor********************
        else if (s.getSource() == addTutor_Btn) {
            // checking if the fileds are empty

            if (teacherId_T.getText().isEmpty() || teacherName_T.getText().isEmpty() || address_T.getText().isEmpty()
                    || workingT_T.getText().isEmpty() || speci_T.getText().isEmpty() || workingH_T.getText().isEmpty()
                    || empStat_T.getText().isEmpty() || acaQuali_T.getText().isEmpty()
                    || performanceI_T.getText().isEmpty() || salary_L.getText().isEmpty()) {
                // Displays Error message if the text field is empty
                JOptionPane.showMessageDialog(teacherGui, "Please, Fill all the field.", "Alert",JOptionPane.ERROR_MESSAGE);

            } else {
                // Adding a try Catch block in order to prevent the data being entered in the
                // wrong format
                try {
                    // Getting the input values from the text fields of the Tutor Object
                    int t_id = Integer.parseInt(teacherId_T.getText());
                    int wh = Integer.parseInt(workingH_T.getText());
                    int pi = Integer.parseInt(performanceI_T.getText());
                    int sl = Integer.parseInt(salary_T.getText());
                    String t_name = teacherName_T.getText();
                    String add = address_T.getText();
                    String sp = speci_T.getText();
                    String wt = workingT_T.getText();
                    String es = empStat_T.getText();
                    String aq = acaQuali_T.getText();
                    // check for String validation
                    if (t_name.matches("[a-zA-Z\\s]*") && add.matches("[a-zA-Z\\s]*") && sp.matches("[a-zA-Z\\s]*")
                            && wt.matches("[a-zA-Z\\s]*") && es.matches("[a-zA-Z\\s]*") && aq.matches("[a-zA-Z\\s]*")) {
                        // Condition to Check weather tutor with the id exists or not
                        // the tutor_exits is set false
                        boolean tutor_exit = false;

                        // itration in teacher_database
                        for (Teacher te_Id : teacher_database) {
                            // if the retrived te_id from the arraylist is same the as the new t_id, then
                            // the tutor_exits will be true and the loop will end
                            if (te_Id.getTeacherId() == t_id && te_Id instanceof Tutor) {
                                tutor_exit = true;
                                break;
                            }
                        }
                        // display message if tutor exits
                        if (tutor_exit) {
                            JOptionPane.showMessageDialog(teacherGui, "Tutor with given ID already exits", "Info",
                                    JOptionPane.WARNING_MESSAGE);

                        } else {
                            // creating object for Tutor
                            Tutor tutors = new Tutor(t_id, t_name, add, wt, es, wh, sl, sp, aq, pi);
                            // adding the object in teacher_database
                            teacher_database.add(tutors);
                            // display after success adding of tutor
                            JOptionPane.showMessageDialog(teacherGui, "Tutor added successfully", "Tutor added",
                                    JOptionPane.INFORMATION_MESSAGE);
                            // calling the clearTutor to clear the field after successfully adding tutor
                            clearTutor();
                        }

                    } else {
                        // diaplay if the required string filed is invalid
                        JOptionPane.showMessageDialog(teacherGui, "StringFormatException \n Teacher Name,Address,Working Type , Employment Status and Academic Qualification field should only be in String Type", "Validation",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    // display error if textfield contain invalid textformat
                    JOptionPane.showMessageDialog(teacherGui, e, "Validation", JOptionPane.ERROR_MESSAGE);
                }
            }
            // Action listener for set Salary button
        } else if (s.getSource() == setSalary_Btn) {
            // checking whether there is empty filed or not
            if (Salary_teacher_ID_T.getText().isBlank() || new_performI_T.getText().isBlank() || new_Salary_T.getText().isBlank()) {
                // display error message if found empty
                JOptionPane.showMessageDialog(teacherGui, "Please, Fill all the fields", "Alert",JOptionPane.ERROR_MESSAGE);
            } else {
                // try and catch for validation check
                try {
                    // sotring the value of field in appropriate variable
                    int nt_id = Integer.parseInt(Salary_teacher_ID_T.getText());
                    int npI = Integer.parseInt(new_performI_T.getText());
                    int ns = Integer.parseInt(new_Salary_T.getText());
                    // to check if teacher id exits or not
                    boolean teachId_check = false;
                    // itration in teacher database
                    for (Teacher tutor : teacher_database) {
                        // check if the above object is instance of tutor or not
                        if (tutor instanceof Tutor) {
                            // downcasting
                            Tutor tut = (Tutor) tutor;
                            // check if the reterived object id from databse is same as given in fied or not
                            if (tut.getTeacherId() == nt_id) {
                                // if they asre equal then check is set true
                                teachId_check = true;
                            }
                            // if the teacherid is valid .
                            if (teachId_check) {
                                // aslo check if the working hour and performance index is valid or not
                                if (tut.getWorkingHour() > 20 && tut.getPerformIndex() > 5) {
                                    // calling setSalary method from tutor class
                                    tut.setSalary(ns, npI);
                                    // if valid
                                    JOptionPane.showMessageDialog(teacherGui,"Salary was set successfully \n The appraised salary is: "+ tut.getSalary()+"\n New Performance Index: "+tut.getPerformIndex(),"Salary", JOptionPane.INFORMATION_MESSAGE);
                                    // clearing the field after succesfully setting salary
                                    clearSalary();
                                    break;

                                } else {
                                    // if the working hour and performance index is invlaid
                                    JOptionPane.showMessageDialog(teacherGui,"The tutor isn't certified yet so Salary cannot be appraised","Salary ", JOptionPane.INFORMATION_MESSAGE);
                                    clearSalary();
                                    break;

                                }
                            }

                        }

                    }
                    // if the teacher id doesnot exits in database
                    if (!teachId_check) {
                        // display the error message
                        JOptionPane.showMessageDialog(teacherGui, "Enter the correct Teacher ID", "Invlaid ID", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception e) {
                    // exception handling for validation
                    JOptionPane.showConfirmDialog(teacherGui, e, "validation", JOptionPane.ERROR_MESSAGE);
                }
            }
            // Action Listener for remove tutor button
        } else if (s.getSource() == rmvTutor_Btn) {
            // check if the field are empty or not
            if (rmvTeacherId_T.getText().isBlank()) {
                JOptionPane.showMessageDialog(teacherGui, "Please, Fill all the fields", "Alert",JOptionPane.ERROR_MESSAGE);

            } else {
                try {
                    // assigning the value from field to varibale
                    int rmvTID = Integer.parseInt(rmvTeacherId_T.getText());
                    boolean id_check = false;
                    // iteration in teacher database
                    for (Teacher rmv : teacher_database) {
                        // check if the object is instance of tutot or not
                        if (rmv instanceof Tutor) {
                            // downcasting teacher class
                            Tutor rmvTut = (Tutor) rmv;
                            // check if teacher id exists or not
                            if (rmvTut.getTeacherId() == rmvTID) {
                                id_check = true;

                            }
                            // if teacher id exits
                            if (id_check) {
                                // check if the working hour is valid or not
                                if (rmvTut.getWorkingHour() < 20) {
                                    rmvTut.removeTutor();
                                    JOptionPane.showMessageDialog(teacherGui, "Tutor removed successfully", "Remove Tutor",JOptionPane.INFORMATION_MESSAGE);
                                    // setting the field empty after successfully removed
                                    rmvTeacherId_T.setText(null);
                                    // removing the data/oject from database
                                    teacher_database.remove(rmvTut);
                                    break;
                                } else {
                                    // if the working hour is valid
                                    JOptionPane.showMessageDialog(teacherGui, "The  tutor is qualified so cannot be removed", "Info",JOptionPane.INFORMATION_MESSAGE);
                                    break;

                                }

                            }

                        }

                    }
                    // if the teacher id doesnot conatain in database
                    if (!id_check) {
                        JOptionPane.showMessageDialog(teacherGui, "Enter the correct Teacher ID", "Invlaid ID",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(teacherGui, e, "validation", JOptionPane.ERROR_MESSAGE);
                }
            }

        }

        // Action Listener for clear button
        if (s.getSource() == clear_Btn)

        {
            try {
                // ask for conformation of clearing field
                int response = JOptionPane.showConfirmDialog(teacherGui, "Do you want ot clear?","Clear",JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    clear();

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(teacherGui, e, "Alert", JOptionPane.ERROR_MESSAGE);
            }

        }
        // display the detail of tutor
        else if (s.getSource() == tutor_display_Btn) {
            String display_tutor;
            for (Teacher dis : teacher_database) {
                if (dis instanceof Tutor) {
                    Tutor disp = (Tutor) dis;
                    display_tutor="\n************TUTOR*************\n"+"Teacher ID: "+disp.getTeacherId()+"\nTeacher Name: "+disp.getTeacherName()+"\nAddress: "+disp.getAddress()+"\nWorking Type: "+disp.getWorkingType()+"\nEmployment Status: "+disp.getEmpStatus()+"\nWorking Hour: "+disp.getWorkingHour()+"\nSalary: "+disp.getSalary()+"\nSpecialization: "+
                    disp.getSpeci()+"\nAcademic Qualification: "+disp.getAcaQual()+"\nPerformance Index: "+disp.getPerformIndex();
                    display=display+display_tutor;
                }
            }
            if (display==null) {
                JOptionPane.showMessageDialog(teacherGui, "Empty Tutor Database","Database",JOptionPane.ERROR_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(teacherGui, display,"Tutor Display",JOptionPane.INFORMATION_MESSAGE);
                display=null;

            }

        } // display the detail for Lecturer
        else if (s.getSource() == lecturer_display_Btn) {
            String display_detail;
            for (Teacher teacher : teacher_database) {
                if (teacher instanceof Lecturer) {
                    Lecturer disp = (Lecturer) teacher;
                    display_detail ="\n************LECTURER*************\n"+"Teacher ID: "+disp.getTeacherId()+"\nTeacher Name: "+disp.getTeacherName()+"\nAddress: "+disp.getAddress()+"\nWorking Type: "+disp.getWorkingType()+"\nGraded Score: "+disp.getGradedScore()+"\nDepartment: "+disp.getDepartment()+"\nYear Of Experience: "+disp.getYearOfExp();
                    display = display+display_detail;       
                }  
            }
            if (display==null) {
                JOptionPane.showMessageDialog(teacherGui, "Empty Lecturer Database","Database",JOptionPane.ERROR_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(teacherGui, display,"Lecturer Display",JOptionPane.INFORMATION_MESSAGE);
                display=null;

            }
            
        }
        /****************************************** * Lecturer Buttons action Listener******************************
         */
        // Action listener for adding Lecturer
        else if (s.getSource() == addlecturer_Btn) {
            // checking if the fileds are empty
            if (l_teacherId_T.getText().isEmpty() || l_teacherName_T.getText().isEmpty()
                    || l_address_T.getText().isEmpty()
                    || l_workingType_T.getText().isEmpty() || l_empStatus_T.getText().isEmpty()
                    || l_gradedScore_T.getText().isEmpty()
                    || department_T.getText().isEmpty() || yearOfExp_T.getText().isEmpty()) {
                // Displays Error message if the text field is empty
                JOptionPane.showMessageDialog(teacherGui, "Please, Fill all the fields", "Alert",JOptionPane.ERROR_MESSAGE);

            } else {
                // Adding a try Catch block in order to prevent the data being entered in the
                // wrong format
                try {
                    // Getting the input values from the text fields of the Lecturer Object
                    int l_t_id = Integer.parseInt(l_teacherId_T.getText());
                    int l_gs = Integer.parseInt(l_gradedScore_T.getText());
                    int yE = Integer.parseInt(yearOfExp_T.getText());
                    String t_name = l_teacherName_T.getText();
                    String add = l_address_T.getText();
                    String d = department_T.getText().toLowerCase();
                    String wt = l_workingType_T.getText();
                    String es = l_empStatus_T.getText();

                    // check for String validation
                    if (t_name.matches("[a-zA-Z\\s]*") && add.matches("[a-zA-Z\\s]*") && d.matches("[a-zA-Z\\s]*")
                            && wt.matches("[a-zA-Z\\s]*") && es.matches("[a-zA-Z\\s]*")) {
                        // Condition to Check weather lecturer with the id exists or not
                        // the lecturer_exits is set false
                        boolean lecturer_exit = false;

                        // itration in teacher_database
                        for (Teacher te_Id : teacher_database) {
                            // if the retrived te_id from the arraylist is same the as the new t_id, then
                            // the lecturer_exits will be true and the loop will end
                            if (te_Id.getTeacherId() == l_t_id && te_Id instanceof Lecturer) {
                                lecturer_exit = true;
                                break;

                            }

                        }
                        // display message if lecturer exits
                        if (lecturer_exit) {
                            JOptionPane.showMessageDialog(teacherGui, "Lecturer with given ID already exits", "CHECKED",JOptionPane.WARNING_MESSAGE);
                        } else {
                            // creating object for Lecturer
                            Lecturer lec = new Lecturer(l_t_id, t_name, add, wt, es, d, yE, l_gs);
                            // adding the object in teacher_database
                            teacher_database.add(lec);
                            // display after success adding of lecturer
                            JOptionPane.showMessageDialog(teacherGui, "Lecturer added successfully", "Lecturer Added", JOptionPane.INFORMATION_MESSAGE);
                            // calling the clearLecturer to clear the field after successfully adding
                            // Lecturer
                            clearLecturer();
                        }

                    } else {
                        // display if the required string filed is invalid
                        JOptionPane.showMessageDialog(teacherGui, "StringFormatException  \n Teacher Name,Address,Working Type , Employment Status and Department field should only be in String Type", "Validation", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {
                    // display error if textfield contain invalid textformat
                    JOptionPane.showMessageDialog(teacherGui, e, "Validation", JOptionPane.ERROR_MESSAGE);

                }

            }
            // Action listener for grade Assignment
        } else if (s.getSource() == gradeAssign_Btn) {
            // checking whether there is empty filed or not
            if (l2_teacherID_T.getText().isBlank() || l2_department_T.getText().isBlank()
                    || gradedScore_T.getText().isBlank() || nyearOfExp_T.getText().isBlank()) {
                // display error message if found empty
                JOptionPane.showMessageDialog(teacherGui, "Please, Fill all the fields", "Alert", JOptionPane.ERROR_MESSAGE);
            } else {
                // try and catch for validation check
                try {
                    // storingng the value of field in appropriate variable
                    int nt_id = Integer.parseInt(l2_teacherID_T.getText());
                    String nD = l2_department_T.getText().toLowerCase();
                    int gS = Integer.parseInt(gradedScore_T.getText());
                    int nYe = Integer.parseInt(nyearOfExp_T.getText());
                    if (nD.matches("[a-zA-Z\\s]*")) {
                        // to check if teacher id exits or not
                        boolean teachId_check = false;
                        // itration in teacher database
                        for (Teacher lec : teacher_database) {
                            // check if the above object is instance of tutor or not
                            if (lec instanceof Lecturer) {
                                // downcasting
                                Lecturer lect = (Lecturer) lec;
                                // check if the reterived object id from databse is same as given in fied or not
                                if (lect.getTeacherId() == nt_id) {
                                    // if they asre equal then check is set true
                                    teachId_check = true;

                                }
                                // if the teacherid is valid .
                                if (teachId_check) {
                                    lect.gradeAssignment(gS, nD, nYe);
                                    if (lect.getDepartment().equals(nD)) {
                                        JOptionPane.showMessageDialog(teacherGui, lect.gradeAssignment(gS, nD, nYe)+"\nThe GradedScore: "+lect.getGradedScore(),"Grade Assigned", JOptionPane.INFORMATION_MESSAGE);
                                        clearGradeAssign();
                                        break;

                                    } else {
                                        JOptionPane.showMessageDialog(teacherGui, "Invalid Department");
                                        break;
                                    }

                                }

                            }
                        }
                        // if the teacher id doesnot exits in database
                        if (!teachId_check) {
                            // display the error message
                            JOptionPane.showMessageDialog(teacherGui, "Enter the correct Teacher ID", "Invlaid ID",JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        // diaplay if the required string filed is invalid
                        JOptionPane.showMessageDialog(teacherGui, "StringFormatException\n Department field should only contain String.", "Validation",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    // exception handling for validation
                    JOptionPane.showConfirmDialog(teacherGui, e, "validation", JOptionPane.ERROR_MESSAGE);
                }
            }

        }

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int s = JOptionPane.showConfirmDialog(teacherGui, "Do you want to close window?", "?",
                JOptionPane.YES_NO_OPTION);
        if (s == JOptionPane.YES_OPTION) {
            teacherGui.dispose();
        } else if (s == JOptionPane.NO_OPTION) {
            teacherGui.setDefaultCloseOperation(JFrame.ABORT);
        } else if (s == JOptionPane.CLOSED_OPTION) {
            teacherGui.setDefaultCloseOperation(JFrame.ABORT);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(teacherGui,"Welcome To Teacher Management System \n Developer:---Om Shankar Sah---", "Greeting ",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
    // main method

    public static void main(String[] args) {
        new TeacherGUI();
    }

}

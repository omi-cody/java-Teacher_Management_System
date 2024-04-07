import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Write a description of class TeacherGUI here.
 *
 * @author (OM SHANKAR SAH)
 * @version (2024-04-06)
 */
public class TeacherGUI implements ActionListener {
    private JFrame teacherGui;
    private JPanel titlePanel, tutor_mainPanel,lec_mainPanel,gradePanel,setSalaryPanel, rmvtutorpanel, footerPanel;
    private JLabel tTutor, teacherId_L, teacherName_L, add_L, workingT_L, speci_L, workingH_L, empStat__L, acaQuali_L,
            performanceI_L, salary_L, Salary_teacher_ID_L, new_performI_L, new_Salary_L, rmvTeacherID_L,l_teacherId_L,l_teacherName_L,l_address_L,l_workingType_L,l_empStatus_L,gradedScore_L,department_L,yearOfExp_L,l2_teacherID_L,l2_department_L,nGradedScore_L,nyearOfExp_L;
    private JTextField teacherId_T, teacherName_T, address_T, workingT_T, speci_T, workingH_T, empStat_T, acaQuali_T,
            performanceI_T, salary_T, Salary_teacher_ID_T, new_performI_T, new_Salary_T, rmvTeacherId_T,l_teacherId_T,l_teacherName_T,l_address_T,l_workingType_T,l_empStatus_T,gradedScore_T,department_T,yearOfExp_T,l2_teacherID_T,l2_department_T,nGradedScore_T,nyearOfExp_T;
    private JButton addTutor_Btn, setSalary_Btn,addlecturer_Btn,gradeAssign_Btn, rmvTutor_Btn, tutor_display_Btn,lecturer_display_Btn, clear_Btn;
    private JComboBox select;

    TeacherGUI() {
        // frame
        teacherGui = new JFrame("Teacher");
        teacherGui.setDefaultCloseOperation(teacherGui.EXIT_ON_CLOSE);
        teacherGui.setBounds(420, 110, 700, 580);
        ImageIcon icon = new ImageIcon("teacherLogo.png");
        teacherGui.setIconImage(icon.getImage());
        teacherGui.setResizable(false);
        teacherGui.setLayout(null);

        // Colors for GUI
        Color pColor1 = new Color(253, 247, 228); // color for panels
        Color color2 = new Color(250, 238, 209);
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
        tTutor.setBounds(300, 5, 126, 44);
        titlePanel.add(tTutor);

        // selection between Tutor and lecturer
        String[] teacher = { "Tutor", "Lecturer" };
        select = new JComboBox<>(teacher);
        select.setBounds(550, 25, 120, 30);
        select.addActionListener(this);
        select.setBackground(color4);
        titlePanel.add(select);
        /***************************Tutor Main panel************************/
        // Font for Labels
        Font LabelFont = new Font("Times Roman", 1, 14);
        Font TextFont = new Font("Times Roman", 0, 13);
        tutor_mainPanel = new JPanel();
        tutor_mainPanel.setVisible(false);
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
        addTutor_Btn.setBounds(510, 185, 160, 25);
        addTutor_Btn.setFont(new Font("Times Roman", 1, 14));
        addTutor_Btn.setBackground(color3);
        tutor_mainPanel.add(addTutor_Btn);
        addTutor_Btn.setFocusable(false);
        /******************** Set Salary Panel************ */
        setSalaryPanel = new JPanel();
        setSalaryPanel.setLayout(null);
        setSalaryPanel.setBounds(0, 300, 700, 90);
        setSalaryPanel.setBackground(pColor1);
        setSalaryPanel.setVisible(false);
        teacherGui.add(setSalaryPanel);

        // Set Salary TeacherID Label
        Salary_teacher_ID_L = new JLabel("Teacher ID:");
        Salary_teacher_ID_L.setFont(LabelFont);
        Salary_teacher_ID_L.setBounds(10, 10, 90, 20);
        setSalaryPanel.add(Salary_teacher_ID_L);

        //set Salary Teacher ID Textfield
        Salary_teacher_ID_T=new JTextField();
        Salary_teacher_ID_T.setBounds(130, 10, 80, 25);
        Salary_teacher_ID_T.setFont(TextFont);
        setSalaryPanel.add(Salary_teacher_ID_T);Salary_teacher_ID_L = new JLabel("Teacher ID:");
        Salary_teacher_ID_L.setFont(LabelFont);
        Salary_teacher_ID_L.setBounds(10, 10, 90, 20);
        setSalaryPanel.add(Salary_teacher_ID_L);

        //set Salary Teacher ID Textfield
        Salary_teacher_ID_T=new JTextField();
        Salary_teacher_ID_T.setBounds(130, 10, 80, 25);
        Salary_teacher_ID_T.setFont(TextFont);
        setSalaryPanel.add(Salary_teacher_ID_T);

        //New Performance Index Label
        new_performI_L=new JLabel("New Performance Index:");
        new_performI_L.setFont(LabelFont);
        new_performI_L.setBounds(320, 10, 180, 20);
        setSalaryPanel.add(new_performI_L);
        //  New Performance Index textfield
        new_performI_T = new JTextField();
        new_performI_T.setBounds(510, 10, 160, 25);
        new_performI_T.setFont(TextFont);
        setSalaryPanel.add(new_performI_T);

        //New Salary Index Label 
        new_Salary_L = new JLabel("New Salary:");
        new_Salary_L.setFont(LabelFont);
        new_Salary_L.setBounds(10, 45, 100, 20);
        setSalaryPanel.add(new_Salary_L);
        // New salary textfield
        new_Salary_T = new JTextField();
        new_Salary_T.setBounds(130, 45, 160, 25);
        new_Salary_T.setFont(TextFont);
        setSalaryPanel.add(new_Salary_T);

        //Add set salary Button
        setSalary_Btn = new JButton("SET SALARY");
        setSalary_Btn.setBounds(510, 45, 160, 25);
        setSalary_Btn.setFont(new Font("Times Roman", 1, 14));
        setSalary_Btn.setBackground(color3);
        setSalaryPanel.add(setSalary_Btn);
        setSalary_Btn.setFocusable(false);


        /***********************Remove Tutor Panel************************** */
        rmvtutorpanel = new JPanel();
        rmvtutorpanel.setLayout(null);
        rmvtutorpanel.setBackground(pColor1);
        rmvtutorpanel.setBounds(0,395,700,60);
        rmvtutorpanel.setVisible(false);
        teacherGui.add(rmvtutorpanel);

        //Remove teacher Id Label
        rmvTeacherID_L = new JLabel("Teacher ID:");
        rmvTeacherID_L.setFont(LabelFont);
        rmvTeacherID_L.setBounds(10, 20, 90, 20);
        rmvtutorpanel.add(rmvTeacherID_L);

        //set Salary Teacher ID Textfield
        rmvTeacherId_T=new JTextField();
        rmvTeacherId_T.setBounds(130, 20, 120, 25);
        rmvTeacherId_T.setFont(TextFont);
        rmvtutorpanel.add(rmvTeacherId_T);

        //Remove Tutor Button
        rmvTutor_Btn = new JButton("REMOVE TUTOR");
        rmvTutor_Btn.setBounds(510, 20, 160, 25);
        rmvTutor_Btn.setFont(new Font("Times Roman", 1, 14));
        rmvTutor_Btn.setBackground(color3);
        rmvtutorpanel.add(rmvTutor_Btn);
        rmvTutor_Btn.setFocusable(false);

        //Display and clear panel or Footer Panel
        footerPanel=new JPanel();
        footerPanel.setLayout(null);
        footerPanel.setBackground(pColor1);
        footerPanel.setBounds(0,460,700,80);
        teacherGui.add(footerPanel);

        //Display button
        tutor_display_Btn=new JButton("DISPLAY");
        tutor_display_Btn.setBounds(100, 30, 160, 30);
        tutor_display_Btn.setFont(new Font("Times Roman", 1, 14));
        tutor_display_Btn.setVisible(false);
        tutor_display_Btn.setBackground(color3);
        footerPanel.add(tutor_display_Btn);
        tutor_display_Btn.setFocusable(false);

        //Clear BUtton
        clear_Btn=new JButton("CLEAR");
        clear_Btn.setBounds(430, 30, 160, 30);
        clear_Btn.setFont(new Font("Times Roman", 1, 14));
        clear_Btn.setBackground(color3);
        footerPanel.add(clear_Btn);
        clear_Btn.setFocusable(false);


        /********************Lecturer ****************** */
        //Lecturer main panel
        lec_mainPanel = new JPanel();
        lec_mainPanel.setLayout(null);
        lec_mainPanel.setBackground(pColor1);
        lec_mainPanel.setBounds(0, 65, 700, 230);
        teacherGui.add(lec_mainPanel);

        //Lecturer techer Id
        l_teacherId_L= new JLabel("Teacher ID:");
        l_teacherId_L.setFont(LabelFont);
        l_teacherId_L.setBounds(10, 10, 90, 20);
        lec_mainPanel.add(l_teacherId_L);

        //lecturer teacherID textField
        l_teacherId_T = new JTextField();
        l_teacherId_T.setBounds(130, 10, 80, 25);
        l_teacherId_T.setFont(TextFont);
        lec_mainPanel.add(l_teacherId_T);

        //lecturer Teacher Name Label
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

        //Lecturer working Type Label
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





        



        teacherGui.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent s) {
        if (s.getSource()==select) {
            if (select.getSelectedItem()=="Lecturer") {
                tutor_mainPanel.setVisible(false);
                setSalaryPanel.setVisible(false);
                rmvtutorpanel.setVisible(false);
                tTutor.setBounds(280, 5, 200, 44);
                tTutor.setText("LECTURER");
                teacherGui.setTitle("LECTURER");
                tutor_display_Btn.setVisible(false);
                
            }
            else{
                tutor_mainPanel.setVisible(true);
                setSalaryPanel.setVisible(true);
                rmvtutorpanel.setVisible(true);
                tTutor.setText("TUTOR");
                teacherGui.setTitle("TUTOR");
                tutor_display_Btn.setVisible(true);

            }
            
        }

    }

    public static void main(String[] args) {
        new TeacherGUI();
    }

    

}

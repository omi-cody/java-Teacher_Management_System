import java.awt.Color;
import java.awt.Font;

import javax.swing.*;


/**
 * Write a description of class TeacherGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeacherGUI
{
    private JFrame teacherGui;
    private JPanel titlePanel,TmainPanel,salaryPanel,rmvtutorpanel,footerPanel;
    private JLabel tTutor ,teacherId_L,teacherName_L,add_L,workingT_L,speci_L,workingH_L,empStat__L,acaQuali_L,performanceI_L,salary_L;
    private JTextField teacherId_T,teacherName_T,address_T,workingT_T,speci_T,workingH_T,empStat_T,acaQuali_T,performanceI_T,salary_T;
    private JButton addTutor_Btn,setSalary_Btn,remTutor_Btn,display_Btn,clear_Btn;
    private JComboBox select;
    TeacherGUI(){
        //frame
        teacherGui=new JFrame("Tutor");
        teacherGui.setDefaultCloseOperation(teacherGui.EXIT_ON_CLOSE);
        teacherGui.setSize(600, 600);
        ImageIcon icon =new ImageIcon("teacherLogo.png");
        teacherGui.setIconImage(icon.getImage());
        teacherGui.setResizable(false);
        teacherGui.setLayout(null);

        //panel for Heading
        Color panel =new Color(179, 200, 207); //color for panels
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setBounds(0,0,600,60);
        titlePanel.setBackground(panel);
        titlePanel.setVisible(true);
        teacherGui.add(titlePanel);
        //title in panel
        tTutor = new JLabel("Tutor");
        tTutor.setFont(new Font("Times Roman", 1,30));
        tTutor.setBounds(250,5,126,44);
        titlePanel.add(tTutor);
        //selection between Tutor and lecturer
        String[] teacher= {"Tutor","Lecturer"};
        select = new JComboBox<>(teacher);
        select.setBounds(450,25,120,30);
        titlePanel.add(select);
        //adding Tutor Main panel
        TmainPanel =new JPanel();
        TmainPanel.setLayout(null);
        TmainPanel.setBackground(panel);
        TmainPanel.setBounds(0,65,600,250);
        teacherGui.add(TmainPanel);
        //adding teacherId label and textfield in Tutor main panel
        //TeacherId label
        teacherId_L = new JLabel("Teacher ID:");
        teacherId_L.setBounds(10,10,70,20);
        TmainPanel.add(teacherId_L);
        //teacherId textfield
        teacherId_T =new JTextField();
        teacherId_T.setBounds(100,10,80,25);
        TmainPanel.add(teacherId_T);
        //teacher Name Label
        teacherName_L =new JLabel("Teacher Name:");
        teacherName_L.setBounds(10,40,100,20);
        TmainPanel.add(teacherName_L);
        //teacher Name textfield
        teacherName_T=new JTextField();
        teacherName_T.setBounds(100,40,150,25);
        TmainPanel.add(teacherName_T);
        //address Label
        add_L=new JLabel("Address:");
        add_L.setBounds(300,40,80,20);
        TmainPanel.add(add_L);
        //address TextField
        address_T = new JTextField();
        address_T.setBounds(420, 40, 150, 25);
        TmainPanel.add(address_T);
        //working Type Label
        workingT_L=new JLabel("Working Type:");
        workingT_L.setBounds(10,70,100,20);
        TmainPanel.add(workingT_L);
        //working Type Textfield
        workingT_T=new JTextField();
        workingT_T.setBounds(100,70,150,25);
        TmainPanel.add(workingT_T);
        //Specialization label
        speci_L=new JLabel("Specialization:");
        speci_L.setBounds(300,70,100,20);
        TmainPanel.add(speci_L);
        //Specialization textfield
        speci_T= new JTextField();
        speci_T.setBounds(420,70,150,25);
        TmainPanel.add(speci_T);
        //Working Hour Label
        workingH_L= new JLabel("Working Hour:");
        workingH_L.setBounds(10,100,100,20);
        TmainPanel.add(workingH_L);
        //working Hour textfield
        workingH_T=new JTextField();
        workingH_T.setBounds(100,100,150,25);
        TmainPanel.add(workingH_T);
        //Employment Status Label 
        empStat__L=new JLabel("Employment Status:");
        empStat__L.setBounds(300,100,120,20);
        TmainPanel.add(empStat__L);
        //Employment Status textfield
        empStat_T=new JTextField();
        empStat_T.setBounds(420,100,150,25);
        TmainPanel.add(empStat_T);
        //Academic Qualification label
        acaQuali_L=new JLabel("Academic Q. :");
        acaQuali_L.setBounds(10,130,80,20);
        TmainPanel.add(acaQuali_L);
        //Academic Qualification TextField
        acaQuali_T=new JTextField();
        acaQuali_T.setBounds(100,130,150,25);
        TmainPanel.add(acaQuali_T);



        
        
        
        

        teacherGui.setVisible(true);
        
    }
    public static void main(String[] args) {
        new TeacherGUI();
    }

}

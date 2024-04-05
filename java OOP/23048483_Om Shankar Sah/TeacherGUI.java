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
    private JTextField teacherId_T,teaecherName_T,address_T,workingT_T,speci_T,workingH_T,empStat_T,acaQuali_T,performanceI_T,salary_T;
    private JButton addTutor_Btn,setSalary_Btn,remTutor_Btn,display_Btn,clear_Btn;
    TeacherGUI(){
        teacherGui=new JFrame("Tutor");
        teacherGui.setDefaultCloseOperation(teacherGui.EXIT_ON_CLOSE);
        teacherGui.setSize(500, 530);
        

        teacherGui.setVisible(true);
        
    }
    public static void main(String[] args) {
        new TeacherGUI();
    }

}


package bank.mnanagement.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class Signup2 extends JFrame implements ActionListener{
    
  
    
    private JTextField nameTextField;
    private JTextField fatherNameTextField;
    private JTextField emailAddressTextField;
    private JTextField panTextField;
    private JTextField aadharNumberTextField;
    private JTextField stateTextField;
    private JTextField pinCodeTextField;
    
    private JButton next;
    private JRadioButton  seniorCitizenYes,seniorCitizenNo,existingAccountYes,existingAccountNo;
    private JComboBox religionComboBox,categoryComboBox,occupationComboBox,educationalComboBox,incomeComboBox;
    private String formNo;
    
    
    Signup2(String formNo){
        
        this.formNo=formNo;
        
        // This will make default layout disable.
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        
/* Religion */
        
        JLabel relegion = new JLabel("Religion:");
        relegion.setFont(new Font("Raleway",Font.BOLD,20 ));
        relegion.setBounds(100,140,200,30);
        add(relegion);
        
        String [] valReligion = new String[]{"Hindu","Muslim","Sikh","Christian","Other"};
        religionComboBox = new JComboBox(valReligion);
        religionComboBox.setBounds(300,140,400,30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);
        
/* Category */
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,20 ));
        category.setBounds(100,190,200,30);
        add(category);
     
      
        String [] valCategory = new String[]{"General","OBC","SC","ST","Other"};
        categoryComboBox =new JComboBox(valCategory);
        categoryComboBox.setBounds(300,190,400,30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);
        
        
/* Income */

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,20 ));
        income.setBounds(100,240,200,30);
        add(income);
        
        String [] valIncome = new String[]{"Null" , "< 1,50,000" , "<2,50,000" , "<5,00,000" , "Upto 10,00,000"};
        incomeComboBox =new JComboBox(valIncome);
        incomeComboBox.setBounds(300,240,400,30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);
        

/* Educational Qualification */        
        JLabel educational = new JLabel("Educational:");
        educational.setFont(new Font("Raleway",Font.BOLD,20 ));
        educational.setBounds(100,290,200,30);
        add(educational);
        
                
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20 ));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String [] valEducational = new String[]{"Non-Graduation" , "Graduate" , "Post-Graduation" , "Doctrate" , "Other"};
        educationalComboBox =new JComboBox(valEducational);
        educationalComboBox.setBounds(300,315,400,30);
        educationalComboBox.setBackground(Color.WHITE);
        add(educationalComboBox);
       

/* Occupation */  
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20 ));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String [] valoccupation = new String[]{"Salaried" , "Sel-Employed" , "Bussiness" , "Student" , "Retired", "Other"};
        occupationComboBox =new JComboBox(valoccupation);
        occupationComboBox.setBounds(300,390,400,30);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);
        

/*  Pan Number */    

        JLabel panNumber = new JLabel("PAN Number:");
        panNumber.setFont(new Font("Raleway",Font.BOLD,20 ));
        panNumber.setBounds(100,440,200,30);
        add(panNumber);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
   
/*  Aadhar Number */


        JLabel aadharNumber = new JLabel("Aadhar Number");
        aadharNumber.setFont(new Font("Raleway",Font.BOLD,20 ));
        aadharNumber.setBounds(100,490,200,30);
        add(aadharNumber);
        
        aadharNumberTextField = new JTextField();
        aadharNumberTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharNumberTextField.setBounds(300,490,400,30);
        add(aadharNumberTextField);
        
        
/*  Senior Citizen  */

        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway",Font.BOLD,20 ));
        seniorCitizen.setBounds(100,540,200,30);
        add(seniorCitizen);

        seniorCitizenYes  = new JRadioButton("Yes");
        seniorCitizenYes.setBounds(300,540,100,30);
        seniorCitizenYes.setBackground(Color.WHITE);
        add(seniorCitizenYes);
        
        seniorCitizenNo  = new JRadioButton("No");
        seniorCitizenNo.setBounds(450,540,100,30);
        seniorCitizenNo.setBackground(Color.WHITE);
        add(seniorCitizenNo);
        
        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(seniorCitizenYes);
        seniorCitizenGroup.add(seniorCitizenNo);
       
/*   Existing Account */        

        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway",Font.BOLD,20 ));
        existingAccount.setBounds(100,590,200,30);
        add(existingAccount);
        
        existingAccountYes  = new JRadioButton("Yes");
        existingAccountYes.setBounds(300,590,100,30);
        existingAccountYes.setBackground(Color.WHITE);
        add(existingAccountYes);
        
        existingAccountNo  = new JRadioButton("No");
        existingAccountNo.setBounds(450,590,100,30);
        existingAccountNo.setBackground(Color.WHITE);
        add(existingAccountNo);
        
        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(existingAccountYes);
        existingAccountGroup.add(existingAccountNo);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
    }
    
       @Override
    public void actionPerformed(ActionEvent actionEvent) {
        
        String religion = (String)religionComboBox.getSelectedItem(); 
        String category = (String)categoryComboBox.getSelectedItem();
        String income = (String)incomeComboBox.getSelectedItem();
        String educational = (String) educationalComboBox.getSelectedItem();
        String occupation = (String) occupationComboBox.getSelectedItem();
        
        
        String seniorCitizen =null;
        
        if (seniorCitizenYes.isSelected()){
            
            seniorCitizen = "Yes";
            
        }else if(seniorCitizenNo.isSelected()){
            
            seniorCitizen = "No";
            
        }
        
        String existingAccount = null;
        
        if(existingAccountYes.isSelected()){
            
            existingAccount = "Married";
            
        }else if(existingAccountNo.isSelected()){
            
            existingAccount = "Unmarried";
            
        }
        
        String pan = "" + panTextField.getText();
        String aadhar = aadharNumberTextField.getText();
        
        if(actionEvent.getSource()==next){
        
        try{

                DatabaseConnection conn = new DatabaseConnection();
                String query = "INSERT INTO signuptwo VALUES('" + formNo + "', '" + religion + "','" + category + "','" + income + "','" + educational + "','" + occupation + "','" + pan + "','" + aadhar + "','" + seniorCitizen + "','" + existingAccount + "')";
                
                conn.statement.executeUpdate(query);
                setVisible(false);
                new Signunp3(formNo).setVisible(true);
        }catch(Exception e){
            
            System.out.println(e);
            
        }
      
    }
        
    }
    
    public static void main(String [] args){
    
     new Signup2("");   
        
    }

 
}

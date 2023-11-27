
package bank.mnanagement.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signup1 extends JFrame implements ActionListener{
    
    private Random ran;
    private long random;
    
    private JTextField nameTextField;
    private JTextField fatherNameTextField;
    private JTextField emailAddressTextField;
    private JTextField addressTextField;
    private JTextField cityTextField;
    private JTextField stateTextField;
    private JTextField pinCodeTextField;
    
    private JButton next;
    private JRadioButton male, female,other, married,unmarried;
    private JDateChooser dateChooser;
    
    
    Signup1(){
        
        // This will make default layout disable.
        setLayout(null);
        
        // This will produce Random Application number of Four Digit.
        ran =new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(120,20,650,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20 ));
        name.setBounds(100,140,200,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway",Font.BOLD,20 ));
        fatherName.setBounds(100,190,200,30);
        add(fatherName);
        
        fatherNameTextField = new JTextField();
        fatherNameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fatherNameTextField.setBounds(300,190,400,30);
        add(fatherNameTextField);
        
        JLabel dateOfBirth = new JLabel("Date of Birth:");
        dateOfBirth.setFont(new Font("Raleway",Font.BOLD,20 ));
        dateOfBirth.setBounds(100,240,200,30);
        add(dateOfBirth);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20 ));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel emailAddress = new JLabel("Email Address:");
        emailAddress.setFont(new Font("Raleway",Font.BOLD,20 ));
        emailAddress.setBounds(100,340,200,30);
        add(emailAddress);
        
        emailAddressTextField = new JTextField();
        emailAddressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailAddressTextField.setBounds(300,340,400,30);
        add(emailAddressTextField);
        
        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20 ));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20 ));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20 ));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20 ));
        state.setBounds(100,540,200,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20 ));
        pinCode.setBounds(100,590,200,30);
        add(pinCode);
        
        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinCodeTextField.setBounds(300,590,400,30);
        add(pinCodeTextField);
        
        
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
        
        String formno = "" + random;
        String name = nameTextField.getText(); // Get Text from the NameTextField
        String fname = fatherNameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender =null;
        if (male.isSelected()){
            
            gender = "Male";
            
        }else if(female.isSelected()){
            
            gender = "Female";
            
        }
        
        String email =emailAddressTextField.getText();
        String maritalStatus = null;
        
        if(married.isSelected()){
            
            maritalStatus = "Married";
            
        }else if(unmarried.isSelected()){
            
            maritalStatus = "Unmarried";
            
        }else if(other.isSelected()){
            
            maritalStatus = "Other";            
        }
        
        String address = "" + addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pinCode = "" + pinCodeTextField.getText();
        
        if(actionEvent.getSource() == next){
        
        try{
            
           
                
                DatabaseConnection conn = new DatabaseConnection();
                String query = "INSERT INTO signup VALUES('" + formno + "', '" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + maritalStatus + "','" + address + "','" + city + "','" + pinCode + "','" + state + "')";
                
                conn.statement.executeUpdate(query);
                
                setVisible(false);
                new Signup2(formno).setVisible(true);
            
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }
        
        }
        
    }
    
    public static void main(String [] args){
        
     new Signup1();   
        
    }

 
}

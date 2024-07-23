import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeGUI extends JFrame {

    private JTextField surnameField;
    private JTextField firstnameField;
    private JTextField dobField;
    private JTextField addressField;
    private JTextField contactNumField;
    private JTextField genderField;
    private JTextField maritalStatusField;
    private JButton printButton;

    private Employee employee = new Employee();

    public EmployeeGUI() {
        setTitle("Employee Management");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Create labels and text fields
        JLabel surnameLabel = new JLabel("Surname:");
        surnameField = new JTextField(50);

        JLabel firstnameLabel = new JLabel("Firstname:");
        firstnameField = new JTextField(50);

        JLabel dobLabel = new JLabel("DOB (YYYYMMDD):");
        dobField = new JTextField(50);

        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField(50);

        JLabel contactNumLabel = new JLabel("Contact Number:");
        contactNumField = new JTextField(50);

        JLabel genderLabel = new JLabel("Gender:");
        genderField = new JTextField(50);

        JLabel maritalStatusLabel = new JLabel("Marital Status:");
        maritalStatusField = new JTextField(50);

        printButton = new JButton("Print Details");

        // Add components to panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(surnameLabel, gbc);
        gbc.gridx = 1;
        panel.add(surnameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(firstnameLabel, gbc);
        gbc.gridx = 1;
        panel.add(firstnameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(dobLabel, gbc);
        gbc.gridx = 1;
        panel.add(dobField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(addressLabel, gbc);
        gbc.gridx = 1;
        panel.add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(contactNumLabel, gbc);
        gbc.gridx = 1;
        panel.add(contactNumField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(genderLabel, gbc);
        gbc.gridx = 1;
        panel.add(genderField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(maritalStatusLabel, gbc);
        gbc.gridx = 1;
        panel.add(maritalStatusField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        panel.add(printButton, gbc);

        // Add panel to frame
        add(panel);

        // Add action listeners
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the employee data from the text fields
                employee.setSurname(surnameField.getText());
                employee.setFirstname(firstnameField.getText());
                employee.setDob(Integer.parseInt(dobField.getText()));
                employee.setAddress(addressField.getText());
                employee.setContactNum(Integer.parseInt(contactNumField.getText()));
                employee.setGender(genderField.getText());
                employee.setMaritalStatus(maritalStatusField.getText());

                // Print the employee details
                employee.printDetails();
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeGUI();
            }
        });
    }
}

class Employee implements Supermarket {
    private String surname;
    private String firstname;
    private int dob;
    private String address;
    private int contactNum;
    private String gender;
    private String maritalStatus;

    @Override
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Surname: " + surname);
        System.out.println("Firstname: " + firstname);
        System.out.println("DOB: " + dob);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNum);
        System.out.println("Gender: " + gender);
        System.out.println("Marital Status: " + maritalStatus);
    }

    // Getters and Setters
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNum() {
        return contactNum;
    }

    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}

interface SupermarketGUI {
    void printDetails();
}

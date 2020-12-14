import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AnimalRegistrationWindow extends Animal{

private JFrame frame;
private JTextField name;
private JTextField age;
private JTextField timeInShelter;



    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                AnimalRegistrationWindow window = new AnimalRegistrationWindow();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
}


    public AnimalRegistrationWindow() {

        initialize();
    }
    private void initialize() {
        frame = new JFrame("Dzīvnieku reģistrācija");
        frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 13));
        frame.setType(Window.Type.POPUP);
        frame.setForeground(Color.LIGHT_GRAY);
        frame.setFont(new Font("Arial", Font.BOLD, 12));
        frame.getContentPane().setBackground(SystemColor.control);
        frame.setBackground(SystemColor.desktop);
        frame.setBounds(800, 250, 450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        JLabel NewLabel = new JLabel("Dzīvnieka tips");
        NewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        NewLabel.setBounds(10, 187, 201, 42);
        frame.getContentPane().add(NewLabel);

        String[] animalType = new String[] {"Suns ", "Kaķis", "Cits"};


        JComboBox<?> comboBox = new JComboBox<Object>(animalType);
        comboBox.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
        comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        comboBox.setBounds(200, 188, 226, 42);
        frame.getContentPane().add(comboBox);

        JLabel NewLabel_1 = new JLabel("Vārds");
        NewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
        NewLabel_1.setBounds(10, 31, 155, 42);
        frame.getContentPane().add(NewLabel_1);

        name = new JTextField();
        name.setFont(new Font("Arial", Font.PLAIN, 12));
        name.setBounds(200, 33, 226, 42);
        frame.getContentPane().add(name);
        name.setColumns(10);

        JLabel NewLabel_2 = new JLabel("Dzīvnieka vecums");
        NewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
        NewLabel_2.setBounds(10, 83, 155, 42);
        frame.getContentPane().add(NewLabel_2);

        age = new JTextField();
        age.setFont(new Font("Arial", Font.PLAIN, 12));
        age.setColumns(10);
        age.setBounds(200, 137, 226, 42);
        frame.getContentPane().add(age);

        JLabel NewLabel_3 = new JLabel("Dzīvnieka lielums");
        NewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
        NewLabel_3.setBounds(10, 187, 201, 42);
        frame.getContentPane().add(NewLabel_3);

        String[] animalSize = new String[] {"Mazs ", "Vidējs", "Liels"};


        JComboBox<?> comboBox2 = new JComboBox<Object>(animalSize);
        comboBox2.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
        comboBox2.setFont(new Font("Arial", Font.PLAIN, 12));
        comboBox2.setBounds(200, 188, 226, 42);
        frame.getContentPane().add(comboBox2);

        JLabel NewLabel_4 = new JLabel("Pavadītais laiks patversmē");
        NewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
        NewLabel_4.setBounds(10, 135, 163, 42);
        frame.getContentPane().add(NewLabel_4);

        timeInShelter = new JTextField();
        timeInShelter.setFont(new Font("Arial", Font.PLAIN, 12));
        timeInShelter.setColumns(10);
        timeInShelter.setBounds(200, 85, 226, 42);
        frame.getContentPane().add(timeInShelter);

        JLabel NewLabel_5 = new JLabel("Patversme");
        NewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
        NewLabel_5.setBounds(10, 187, 201, 42);
        frame.getContentPane().add(NewLabel_5);

        String[] animalShelter = new String[] {"Ulubele ", "Labās Mājas", "Dzīvnieku draugs" , "Rīgas pilsētas dzīvnieku patversme"};


        JComboBox<?> comboBox3 = new JComboBox<Object>(animalShelter);
        comboBox3.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
        comboBox3.setFont(new Font("Arial", Font.PLAIN, 12));
        comboBox3.setBounds(200, 188, 226, 42);
        frame.getContentPane().add(comboBox3);

        JButton btnNewButton = new JButton("Iesniegt");
        btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
        btnNewButton.addActionListener(arg0 -> {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/pieteikumi_kursiem?serverTimezone=UTC", "root", "Darynda123");
                System.out.println("Connection is made!");
                String strInsert = "insert into pieteikumi (vards, talrunis, epasts, programma) values (?, ?,?, ?)";
                PreparedStatement stmt = conn.prepareStatement(strInsert);

                stmt.setString(1, name.getText());
                stmt.setString (2, timeInShelter.getText());
                stmt.setString(3, age.getText());
                String animalType1;
                animalType1 = comboBox.getSelectedItem().toString();
                stmt.setString(4, animalType1);
                stmt.executeUpdate();

            }
            catch (Exception e) {
                System.out.println("Connection failed!");
            }
        });
    }
}

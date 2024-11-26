import java.awt.*;
import javax.swing.*;
//import java.awt.event.*;

public class VehicleFrame extends JFrame
{
    //Labels
    JLabel welcome = new JLabel("Choose the Kind of Vehicle: ");

    //Fonts
    Font defaultFont = new Font("Berlin Sans FB", 0, 17);
    Font deriveFont = defaultFont.deriveFont(Font.BOLD, 36);

    //buttons
    JButton submit = new JButton("Submit Choice");

    //JComboBox
    String[] vcb = {"SUV", "Van", "Mini Van", "Sedan", "Motorcycle"};
    JComboBox<String> vehicles = new JComboBox <> (vcb);

    public VehicleFrame()
    {
        super("V-Lease");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        welcome.setFont(deriveFont);
        add(Box.createHorizontalStrut(220));
        add(welcome);
        add(Box.createHorizontalStrut(230));
        add(vehicles);
        add(submit);

    }
}

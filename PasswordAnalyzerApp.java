import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PasswordAnalyzerApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Password Strength Analyzer");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1));

        JLabel title = new JLabel("Password Analyzer", JLabel.CENTER);
        JTextField passwordField = new JTextField();
        JLabel resultLabel = new JLabel("Strength: ", JLabel.CENTER);

        JButton checkBtn = new JButton("Check Strength");
        JButton generateBtn = new JButton("Generate Password");

        checkBtn.addActionListener(e -> {
            String pwd = passwordField.getText();
            String strength = PasswordChecker.checkStrength(pwd);
            resultLabel.setText("Strength: " + strength);
        });

        generateBtn.addActionListener(e -> {
            String generated = PasswordGenerator.generate();
            passwordField.setText(generated);
            resultLabel.setText("Strength: STRONG");
        });

        frame.add(title);
        frame.add(new JLabel("Enter Password:", JLabel.CENTER));
        frame.add(passwordField);
        frame.add(checkBtn);
        frame.add(generateBtn);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}

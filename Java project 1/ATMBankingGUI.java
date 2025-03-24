import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ATMBankingGUI extends JFrame {
    private double balance = 10000; // Initial balance
    private JLabel balanceLabel;
    private JTextField amountField;
    private DecimalFormat currencyFormat = new DecimalFormat("$#,##0.00");

    public ATMBankingGUI() {
        setTitle("ATM Banking System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        balanceLabel = new JLabel("Your balance: " + currencyFormat.format(balance), SwingConstants.CENTER);
        add(balanceLabel);

        amountField = new JTextField();
        add(amountField);

        JButton checkBalanceBtn = new JButton("Check Balance");
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton exitBtn = new JButton("Exit");

        add(checkBalanceBtn);
        add(depositBtn);
        add(withdrawBtn);
        add(exitBtn);

        checkBalanceBtn.addActionListener(e -> updateBalance());
        depositBtn.addActionListener(e -> deposit());
        withdrawBtn.addActionListener(e -> withdraw());
        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void updateBalance() {
        balanceLabel.setText("Your balance: " + currencyFormat.format(balance));
    }

    private void deposit() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount > 0) {
                balance += amount;
                JOptionPane.showMessageDialog(this, "Deposited " + currencyFormat.format(amount) + " successfully!");
                updateBalance();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid deposit amount!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount!");
        }
    }

    private void withdraw() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                JOptionPane.showMessageDialog(this, "Withdrawn " + currencyFormat.format(amount) + " successfully!");
                updateBalance();
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient balance or invalid amount!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid amount!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ATMBankingGUI::new);
    }
}

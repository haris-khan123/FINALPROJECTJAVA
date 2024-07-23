import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SupermarketManagementSystem extends JFrame {

    private CardLayout cardLayout = new CardLayout();
    private JPanel mainPanel = new JPanel(cardLayout);

    public SupermarketManagementSystem() {
        setTitle("Supermarket Management System");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize panels for different sections
        JPanel homePanel = createHomePanel();
        JPanel employeePanel = createEmployeePanel();
        JPanel productPanel = createProductPanel();
        JPanel stockPanel = createStockPanel();
        JPanel salesPanel = createSalesPanel();

        // Add panels to mainPanel
        mainPanel.add(homePanel, "Home");
        mainPanel.add(employeePanel, "Employee");
        mainPanel.add(productPanel, "Product");
        mainPanel.add(stockPanel, "Stock");
        mainPanel.add(salesPanel, "Sales");

        // Add mainPanel to JFrame
        add(mainPanel);
        cardLayout.show(mainPanel, "Home");

        setVisible(true);
    }

    private JPanel createHomePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JButton employeeButton = createStyledButton("Manage Employees");
        JButton productButton = createStyledButton("Manage Products");
        JButton stockButton = createStyledButton("Manage Stock");
        JButton salesButton = createStyledButton("Manage Sales");

        panel.add(employeeButton);
        panel.add(productButton);
        panel.add(stockButton);
        panel.add(salesButton);

        employeeButton.addActionListener(e -> cardLayout.show(mainPanel, "Employee"));
        productButton.addActionListener(e -> cardLayout.show(mainPanel, "Product"));
        stockButton.addActionListener(e -> cardLayout.show(mainPanel, "Stock"));
        salesButton.addActionListener(e -> cardLayout.show(mainPanel, "Sales"));

        return panel;
    }

    private JPanel createEmployeePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Employee Management", SwingConstants.CENTER);
        panel.add(label, BorderLayout.NORTH);

        JButton backButton = createStyledButton("Back");
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "Home"));
        panel.add(backButton, BorderLayout.SOUTH);

        // Add more components for managing employees

        return panel;
    }

    private JPanel createProductPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Product Management", SwingConstants.CENTER);
        panel.add(label, BorderLayout.NORTH);

        JButton backButton = createStyledButton("Back");
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "Home"));
        panel.add(backButton, BorderLayout.SOUTH);

        // Add more components for managing products

        return panel;
    }

    private JPanel createStockPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Stock Management", SwingConstants.CENTER);
        panel.add(label, BorderLayout.NORTH);

        JButton backButton = createStyledButton("Back");
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "Home"));
        panel.add(backButton, BorderLayout.SOUTH);

        // Add more components for managing stock

        return panel;
    }

    private JPanel createSalesPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Sales Management", SwingConstants.CENTER);
        panel.add(label, BorderLayout.NORTH);

        JButton backButton = createStyledButton("Back");
        backButton.addActionListener(e -> cardLayout.show(mainPanel, "Home"));
        panel.add(backButton, BorderLayout.SOUTH);

        // Add more components for managing sales

        return panel;
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.ITALIC, 50)); // Change size as needed
        return button;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SupermarketManagementSystem());
    }
}

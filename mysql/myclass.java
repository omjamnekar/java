import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class RegistrationForm extends JFrame {
    private JTextField rollNoField, nameField, addressField, ageField;
    private DefaultTableModel tableModel;
    private JTable dataTable;

    public RegistrationForm() {
        setTitle("Student Registration Form");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        rollNoField = new JTextField(10);
        nameField = new JTextField(30);
        addressField = new JTextField(50);
        ageField = new JTextField(5);

        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton updateButton = new JButton("Update");

        // Create table
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Roll No");
        tableModel.addColumn("Name");
        tableModel.addColumn("Address");
        tableModel.addColumn("Age");

        dataTable = new JTable(tableModel);

        // Create panel for form
        JPanel formPanel = new JPanel(new GridLayout(5, 2));
        formPanel.add(new JLabel("Roll No:"));
        formPanel.add(rollNoField);
        formPanel.add(new JLabel("Name:"));
        formPanel.add(nameField);
        formPanel.add(new JLabel("Address:"));
        formPanel.add(addressField);
        formPanel.add(new JLabel("Age:"));
        formPanel.add(ageField);
        formPanel.add(addButton);
        formPanel.add(deleteButton);
        formPanel.add(updateButton);

        // Create panel for table
        JScrollPane tableScrollPane = new JScrollPane(dataTable);

        // Add panels to frame
        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRecord();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteRecord();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRecord();
            }
        });

        // Load data into table on startup
        loadData();

        setVisible(true);
    }

    private Connection getConnection() throws SQLException {
        // TODO: Replace the connection URL, username, and password with your database details
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "system";
        return DriverManager.getConnection(url, username, password);
    }

    private void addRecord() {
        try (Connection connection = getConnection()) {
            int rollNo = Integer.parseInt(rollNoField.getText());
            String name = nameField.getText();
            String address = addressField.getText();
            int age = Integer.parseInt(ageField.getText());

            String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, rollNo);
                statement.setString(2, name);
                statement.setString(3, address);
                statement.setInt(4, age);

                statement.executeUpdate();
                loadData(); // Refresh table data
            }
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    private void deleteRecord() {
        int selectedRow = dataTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        int rollNoToDelete = (int) tableModel.getValueAt(selectedRow, 0);

        try (Connection connection = getConnection()) {
            String sql = "DELETE FROM student WHERE roll_no = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, rollNoToDelete);
                statement.executeUpdate();
                loadData(); // Refresh table data
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateRecord() {
        int selectedRow = dataTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        int rollNoToUpdate = (int) tableModel.getValueAt(selectedRow, 0);

        try (Connection connection = getConnection()) {
            String name = nameField.getText();
            String address = addressField.getText();
            int age = Integer.parseInt(ageField.getText());

            String sql = "UPDATE student SET name = ?, address = ?, age = ? WHERE roll_no = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, name);
                statement.setString(2, address);
                statement.setInt(3, age);
                statement.setInt(4, rollNoToUpdate);

                statement.executeUpdate();
                loadData(); // Refresh table data
            }
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    private void loadData() {
        tableModel.setRowCount(0); // Clear existing data
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM student";
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    int rollNo = resultSet.getInt("roll_no");
                    String name = resultSet.getString("name");
                    String address = resultSet.getString("address");
                    int age = resultSet.getInt("age");

                    Object[] row = {rollNo, name, address, age};
                    tableModel.addRow(row);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationForm();
            }
        });
    }
}

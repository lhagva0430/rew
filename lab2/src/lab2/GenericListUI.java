package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericListUI<T extends Number & Comparable<T>> extends JFrame {
    private List<T> myList = new ArrayList<>();
    private T a[];  // Variable to store a numerical value

    public GenericListUI() {
        // Prompt the user to enter a numerical value for 'a'
        String input = JOptionPane.showInputDialog(this, "Enter a numerical value for 'a':");
        try {
            []a = (T) Double.valueOf(input);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a numeric value.");
        }

        setTitle("Generic List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addButton = new JButton("Add Element");
        JButton displayButton = new JButton("Display Elements");
        JButton removeButton = new JButton("Remove Element");
        JButton sortButton = new JButton("Sort Elements");
        JButton checkEmptyButton = new JButton("Check if Empty");
        JButton sumButton = new JButton("Get Sum");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addElement();
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayElements();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeElement();
            }
        });

        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sortElements();
            }
        });

        checkEmptyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkEmpty();
            }
        });

        sumButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getSum();
            }
        });

        setLayout(new GridLayout(3, 2));
        add(addButton);
        add(displayButton);
        add(removeButton);
        add(sortButton);
        add(checkEmptyButton);
        add(sumButton);
    }

    private void addElement() {
        String input = JOptionPane.showInputDialog(this, "Enter element:");
        try {
            T element = (T) Double.valueOf(input);
            myList.add(element);
            JOptionPane.showMessageDialog(this, "Element added.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a numeric value.");
        }
    }

    private void displayElements() {
        JOptionPane.showMessageDialog(this, "Elements in the list: " + myList);
    }

    private void removeElement() {
        String input = JOptionPane.showInputDialog(this, "Enter element to remove:");
        try {
            T element = (T) Double.valueOf(input);
            if (myList.contains(element)) {
                myList.remove(element);
                JOptionPane.showMessageDialog(this, "Element removed.");
            } else {
                JOptionPane.showMessageDialog(this, "Element not found.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a numeric value.");
        }
    }

    private void sortElements() {
        Collections.sort(myList, Comparator.naturalOrder());
        JOptionPane.showMessageDialog(this, "Elements sorted: " + myList);
    }

    private void checkEmpty() {
        if (myList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "The list is empty.");
        } else {
            JOptionPane.showMessageDialog(this, "The list is not empty. Elements: " + myList);
        }
    }

    private void getSum() {
        if (myList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "The list is empty. Sum: 0");
        } else {
            double sum = 0;
            for (T element : myList) {
                sum += element.doubleValue();
            }
            JOptionPane.showMessageDialog(this, "Sum of elements: " + sum);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GenericListUI<Double>().setVisible(true);
            }
        });
    }
}

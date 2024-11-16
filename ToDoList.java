import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoList{

    public static void main(String[]args) {

        JFrame frame = new JFrame();
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.YELLOW);
        //Making the label
        JLabel label = new JLabel(" To-Do list.");
        Font font = new Font("Elephant", Font.BOLD, 25);
        label.setForeground(Color.CYAN);
        label.setBounds(20, 40, 200, 50);
        label.setFont(font);

        frame.add(label); //adding the label to frame.

        // making the pannel

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.magenta);
        topPanel.setBounds(30, 30, 310, 80);
        frame.add(topPanel);
        topPanel.add(label); //the label contains the costumized "logo tittle"

        JLabel guide = new JLabel("Enter tasks below :");
        guide.setBounds(15, 320, 300, 60);
        guide.setForeground(Color.magenta);
        Font guideFont = new Font("Elephant", Font.BOLD, 21);
        guide.setFont(guideFont);
        frame.add(guide);

        //making the task area for displaying task entered text field
        JTextArea area = new JTextArea();
        area.setBounds(20, 140, 330, 190);
        area.setBackground(Color.PINK);
        frame.add(area);

        //making the textfield for user to write tasks.

        JTextField taskField = new JTextField();
        taskField.setBounds(30, 380, 290, 50);
        frame.add(taskField);

        //making the button for entering tasks for them to be captured
        JButton enterButton = new JButton("Save Task");
        enterButton.setBounds(60, 440, 230, 50);
        enterButton.setBackground(Color.blue);
        frame.add(enterButton);
        

        enterButton.addActionListener(
              new ActionListener(){
                  @Override
                  public void actionPerformed(ActionEvent e) {
      String task=taskField.getText();//getting the input.
                      area.append(task + "\n"); //appending the task to the text area.
                      taskField.setText("");// clearing the text field after saving the task.

                  }
              });


    }
}
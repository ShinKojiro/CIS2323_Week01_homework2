import javax.swing.*;
public class CIS2323_Week01_Homework2 {
    CIS2323_Week01_Homework2(){
        JFrame frame = new JFrame("Business Card");
        
        //without this, must close with task manager !
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextArea textArea = new JTextArea(
        "=============================================================\n" + 
        "James A Hall\n" + 
        "\n" +
        "Student Programmer, Oklahoma State University - Oklahoma City\n" +
        "Delivery Driver, Mazzios Italian Eatery - Edmond\n" +
        "\n" +
        "12401 N MacArthur Blvd               p: (405) 229-8067\n" +
        "Oklahoma City, OK 73142           e: james.a.hall@okstate.edu\n" +
        "                                                          g: github.com/shinkojiro\n" +
        "=============================================================");
        /*textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);*/
        textArea.setEditable(false);

        frame.add(textArea);
        textArea.setBounds(10,10, 430,160);
        frame.setSize(465, 220);
        frame.setLayout(null);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new CIS2323_Week01_Homework2();

        JOptionPane.showMessageDialog(null, "=============================================================\n"+
        "James A Hall\n\n"+
        "Student Programmer, Oklahoma State University - Oklahoma City\n"+
        "Delivery Driver, Mazzios Italian Eatery - Edmond\n\n"+
        "12401 N MacArthur Blvd             p: (405) 229-8067\n"+
        "Oklahoma City, OK 73142           e: james.a.hall@okstate.edu\n"+
        "                                                           g: github.com/shinkojiro\n"+
        "=============================================================", 
        "Business Card", 
        JOptionPane.INFORMATION_MESSAGE);

        //They both work :o
    }
}
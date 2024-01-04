package t001;

import javax.swing.*;

public class Form {
    private JFrame frame1;
    private int count;


    public Form() {
        frame1 = new JFrame("Hello");
    }

    public Form(JFrame jFrame) {
        this.frame1 = jFrame;
    }

    public void initConfig() {
        frame1.setLayout(null);  //khong su dung trinh quan ly hệ thoosng
        frame1.setSize(400, 500);
        frame1.setLocation(100, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//    JButton buttonCal = new JButton("Handle");
//    buttonCal.setText("Handle" +count);
//
//    buttonCal.setBounds(0,0,100,50);
//    frame1.add(buttonCal);
//        JButton button1 = new JButton("Phép cộng");
//        button1.setBounds(80,350,100,50);
//        frame1.add(button1);
//
//        JButton button2 = new JButton("Phép Trừ");
//        button2.setBounds(220,350,100,50);
//        frame1.add(button2);
//
//        JLabel jLabel = new JLabel();
//        jLabel.setText("Kết Quả Thực Hiện: ");
//        jLabel.setBounds(20,410,300,20);
//        JTextField jTextField = new JTextField();
//        jTextField.setBounds();
//        frame1.add(jLabel);
//
        JLabel jLabel = new JLabel();
        jLabel.setText("Login");
       jLabel.setSize(10,50);

       JTextField jTextField1 = new JTextField("Email");
       jTextField1.setSize(100,50);
       jTextField1.setBounds(60,100,100,50);

        JTextField jTextField2 = new JTextField("Password");
        jTextField2.setSize(100,50);
        jTextField2.setBounds(60,200,100,50);

        frame1.add(jLabel);
        frame1.add(jTextField1);
        frame1.add(jTextField2);
    }

    public void run() {
        frame1.setVisible(true);


    }
}

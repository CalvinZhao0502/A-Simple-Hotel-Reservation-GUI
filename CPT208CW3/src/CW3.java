import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;




public class CW3 {

    public static void main(String[] args){

        JFrame jframe=new JFrame("Hotel Reservation Window");
        ImageIcon bg=new ImageIcon("src/background.JPG");
        JLabel label1=new JLabel(bg);
        label1.setSize(800,600);
        jframe.getLayeredPane().add(label1,new Integer(Integer.MIN_VALUE));
        JPanel pan=(JPanel)jframe.getContentPane();
        pan.setOpaque(false);
        pan.setLayout(new FlowLayout());
        jframe.setLayout(null);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setSize(800,600);
        jframe.setLocation(200,100);

        Border titleBorder1 = BorderFactory.createTitledBorder( null ," Hotel Addresses ", TitledBorder.CENTER,TitledBorder.TOP);

        JPanel jpanel1=new JPanel();
        jpanel1.setBorder(titleBorder1);
        jpanel1.setSize(350,500);
        jpanel1.setLocation(20,50);
        jpanel1.setOpaque(false);


        JLabel label2= new JLabel();
        label2.setSize(300,450);
        ImageIcon  image = new ImageIcon("src/map2.png");
        image.setImage(image.getImage().getScaledInstance(300, 450,Image.SCALE_DEFAULT));
        Image img = image.getImage();
        img = img.getScaledInstance(300, 450, Image.SCALE_DEFAULT);
        image.setImage(img);

        ImageIcon  imageIcon1 = new ImageIcon("src/lvguan.png");
        imageIcon1.setImage(imageIcon1.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT));
        JButton button1 = new JButton(imageIcon1);
        button1.setSize(50,50);
        button1.setLocation(50,50);
        JButton button1_1 = new JButton(imageIcon1);
        button1_1.setSize(50,50);
        button1_1.setLocation(50,50);

        ImageIcon  imageIcon2 = new ImageIcon("src/jiudian.png");
        imageIcon2.setImage(imageIcon2.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT));
        JButton button2 = new JButton(imageIcon2);
        button2.setSize(50,50);
        button2.setLocation(170,140);
        JButton button2_1 = new JButton(imageIcon2);
        button2_1.setSize(50,50);
        button2_1.setLocation(170,140);


        ImageIcon  imageIcon3 = new ImageIcon("src/jiudian1.png");
        imageIcon3.setImage(imageIcon3.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT));
        JButton button3 = new JButton(imageIcon3);
        button3.setSize(50,50);
        button3.setLocation(100,310);

        JButton button3_1 = new JButton(imageIcon3);
        button3_1.setSize(50,50);
        button3_1.setLocation(100,310);
        label2.add(button1);
        label2.add(button2);
        label2.add(button3 );
        label2.setIcon(image);


        jpanel1.add(label2);

        jframe.add(jpanel1);




        JPanel jpanel2=new JPanel();
        jpanel2.setSize(350,420);
        jpanel2.setLocation(400,100);
        jpanel2.setOpaque(true);
        Border border=BorderFactory.createLineBorder(Color.black,3,true);
        jpanel2.setBorder(border);

        JLabel label3=new JLabel("Welcome to our hotel reservation system!" );
        label3.setFont(new Font("Calibri",Font.BOLD,16));
        JLabel label4=new JLabel("You can choose the buttons bellow.");
        label4.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label5=new JLabel("Each button stands for a specific hotel!");
        label5.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label6=new JLabel("You can view the detailed information");
        label6.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label7=new JLabel("of the hotel you have chosen.");
        label7.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label8=new JLabel("The buttons are also labelled on the");
        label8.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label81=new JLabel("map on the left with the same functions.");
        label81.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label84=new JLabel("The buttons on the map an be chose to ");
        label84.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label85=new JLabel("view hotel's information too!");
        label85.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label82=new JLabel("After choosing the hotel,do not forget to");
        label82.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label83=new JLabel("fill in your information to order rooms.");
        label83.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label86=new JLabel("Thank you so much for your cooperation!.");
        label86.setFont(new Font("Calibri",Font.BOLD,12));
        JLabel label87=new JLabel("                 Below are the buttons:                   ");
        label87.setFont(new Font("Calibri",Font.BOLD,15));

        jpanel2.add(label3);
        jpanel2.add(label4);
        jpanel2.add(label5);
        jpanel2.add(label6);
        jpanel2.add(label7);
        jpanel2.add(label8);
        jpanel2.add(label81);
        jpanel2.add(label84);
        jpanel2.add(label85);
        jpanel2.add(label82);
        jpanel2.add(label83);
        jpanel2.add(label87);
        jpanel2.add(button1_1);
        jpanel2.add(button2_1);
        jpanel2.add(button3_1);
        jpanel2.add(label86);


        jframe.add(jpanel2);

        JLabel label9=new JLabel("No.1 Hotel" );
        label9.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label10=new JLabel("Address:15 No.1 Street，Block 17" );
        label10.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label11=new JLabel("Provide meals and free WI-Fi" );
        label11.setFont(new Font("Calibri",Font.BOLD,15));
        JButton buttonBack=new JButton("Previous Page");
        JLabel label12=new JLabel("Close to the train station" );
        label12.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label13=new JLabel("Smoking is forbidden here" );
        label13.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label16=new JLabel("Price:About 150RMB-250RMB each guest" );
        label16.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label14=new JLabel();

        ImageIcon room=new ImageIcon("src/room.jpg");
        room.setImage(room.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        label14.setIcon(room);

        JLabel label17=new JLabel();
        ImageIcon room2=new ImageIcon("src/room1.jpg");
        room2.setImage(room2.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        label17.setIcon(room2);
        JLabel label18=new JLabel();
        ImageIcon room3=new ImageIcon("src/room2.png");
        room3.setImage(room3.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        label18.setIcon(room3);
        ImageIcon  lastPic = new ImageIcon("src/zuojiantou.png");
        lastPic.setImage(lastPic.getImage().getScaledInstance(10, 10,Image.SCALE_DEFAULT));
        JButton buttonLast = new JButton(lastPic);
        buttonLast.setSize(10,10);
        buttonLast.setEnabled(false);
        JButton buttonLast1 = new JButton(lastPic);
        buttonLast1.setSize(10,10);
        JButton buttonLast2 = new JButton(lastPic);
        buttonLast2.setSize(10,10);

        ImageIcon  nextPic = new ImageIcon("src/ico_rightarrow.png");
        nextPic.setImage(nextPic.getImage().getScaledInstance(10, 10,Image.SCALE_DEFAULT));
        JButton buttonNext = new JButton(nextPic);
        buttonNext.setSize(10,10);

        JButton buttonNext1 = new JButton(nextPic);
        buttonNext1.setSize(10,10);

        JButton buttonNext2 = new JButton(nextPic);
        buttonNext1.setSize(10,10);
        buttonNext2.setEnabled(false);



        buttonBack.setPreferredSize(new Dimension(150,30));
        JButton buttonConfirm=new JButton("Confirm");
        buttonConfirm.setPreferredSize(new Dimension(160,30));

        JButton buttonConfirm2=new JButton("Confirm");
        buttonConfirm2.setPreferredSize(new Dimension(160,30));

        JButton buttonConfirm3=new JButton("Confirm");
        buttonConfirm3.setPreferredSize(new Dimension(160,30));

        button1.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label9);
            jpanel2.add(label10 );
            jpanel2.add(label11 );
            jpanel2.add(label12 );
            jpanel2.add(label13 );
            jpanel2.add(label16 );
            jpanel2.add(buttonLast );
            jpanel2.add(label14);
            jpanel2.add(buttonNext);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm );

            jpanel2.repaint();
            jpanel2.validate();
        }));

        button1_1.addActionListener((actionEvent -> {
                jpanel2.removeAll();
                jpanel2.add(label9);
                jpanel2.add(label10 );
                jpanel2.add(label11 );
                jpanel2.add(label12 );
                jpanel2.add(label13 );
                jpanel2.add(label16 );
                jpanel2.add(buttonLast );
                jpanel2.add(label14);
                jpanel2.add(buttonNext);
                jpanel2.add(buttonBack);
                jpanel2.add(buttonConfirm );

                jpanel2.repaint();
                jpanel2.validate();
            }));

        JLabel label_1=new JLabel("No.2 Hotel");
        label_1.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_2=new JLabel("Address:472 No.56 Street，Block 1");
        label_2.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_3=new JLabel("Provide a shuttle service");
        label_3.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_4=new JLabel("Has a gym and a swimming pool");
        label_4.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_5=new JLabel("Price:About 250RMB-350RMB each guest");
        label_5.setFont(new Font("Calibri",Font.BOLD,15));

        JLabel hotel2room1label=new JLabel();
        ImageIcon hotel2room1=new ImageIcon("src/hotel2room1.png");
        hotel2room1.setImage(hotel2room1.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        hotel2room1label.setIcon(hotel2room1);

        JLabel hotel2room2label=new JLabel();
        ImageIcon hotel2room2=new ImageIcon("src/hotel2room2.png");
        hotel2room2.setImage(hotel2room2.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        hotel2room2label.setIcon(hotel2room2);

        JLabel hotel2room3label=new JLabel();
        ImageIcon hotel2room3=new ImageIcon("src/hotel2room3.png");
        hotel2room3.setImage(hotel2room3.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        hotel2room3label.setIcon(hotel2room3);

        JButton hotel2room1last = new JButton(lastPic);
        hotel2room1last.setSize(10,10);
        hotel2room1last.setEnabled(false);
        JButton hotel2room1next = new JButton(nextPic);
        hotel2room1next.setSize(10,10);


        JButton hotel2room2last = new JButton(lastPic);
        hotel2room1last.setSize(10,10);
        JButton hotel2room2next = new JButton(nextPic);
        hotel2room1last.setSize(10,10);

        JButton hotel2room3last = new JButton(lastPic);
        hotel2room3last.setSize(10,10);
        JButton hotel2room3next = new JButton(nextPic);
        hotel2room3last.setSize(10,10);
        hotel2room3next.setEnabled(false);

        button2.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_1);
            jpanel2.add(label_2);
            jpanel2.add(label_3);
            jpanel2.add(label_4);
            jpanel2.add(label_5);
            jpanel2.add(hotel2room1last);
            jpanel2.add(hotel2room1label);
            jpanel2.add(hotel2room1next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm2 );

            jpanel2.repaint();
            jpanel2.validate();
        }));
        button2_1.addActionListener((actionEvent -> {
                jpanel2.removeAll();
                jpanel2.add(label_1);
                jpanel2.add(label_2);
                jpanel2.add(label_3);
                jpanel2.add(label_4);
                jpanel2.add(label_5);
                jpanel2.add(hotel2room1last);
                jpanel2.add(hotel2room1label);
                jpanel2.add(hotel2room1next);
                jpanel2.add(buttonBack);
                jpanel2.add(buttonConfirm2 );

                jpanel2.repaint();
                jpanel2.validate();
            }));
        hotel2room1next.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_1);
            jpanel2.add(label_2);
            jpanel2.add(label_3);
            jpanel2.add(label_4);
            jpanel2.add(label_5);
            jpanel2.add(hotel2room2last);
            jpanel2.add(hotel2room2label);
            jpanel2.add(hotel2room2next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm2 );

            jpanel2.repaint();
            jpanel2.validate();
        }));
        hotel2room2last.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_1);
            jpanel2.add(label_2);
            jpanel2.add(label_3);
            jpanel2.add(label_4);
            jpanel2.add(label_5);
            jpanel2.add(hotel2room1last);
            jpanel2.add(hotel2room1label);
            jpanel2.add(hotel2room1next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm2 );

            jpanel2.repaint();
            jpanel2.validate();
        }));
        hotel2room2next.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_1);
            jpanel2.add(label_2);
            jpanel2.add(label_3);
            jpanel2.add(label_4);
            jpanel2.add(label_5);
            jpanel2.add(hotel2room3last);
            jpanel2.add(hotel2room3label);
            jpanel2.add(hotel2room3next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm2 );

            jpanel2.repaint();
            jpanel2.validate();
        }));
        hotel2room3last.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_1);
            jpanel2.add(label_2);
            jpanel2.add(label_3);
            jpanel2.add(label_4);
            jpanel2.add(label_5);
            jpanel2.add(hotel2room2last);
            jpanel2.add(hotel2room2label);
            jpanel2.add(hotel2room2next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm2 );

            jpanel2.repaint();
            jpanel2.validate();
        }));

        JLabel label_31=new JLabel("No.3 Hotel");
        label_31.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_32=new JLabel("Address:2 No.15 Street，Block 17");
        label_32.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_33=new JLabel("Close to the airport");
        label_33.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_34=new JLabel("WI-Fi is free,but meals need to be paid");
        label_34.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_35=new JLabel("Can pick the guests at the airport");
        label_35.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel label_36=new JLabel("Price:About 100RMB-200RMB each guest");
        label_36.setFont(new Font("Calibri",Font.BOLD,15));

        JLabel hotel3room1label=new JLabel();
        ImageIcon hotel3room1=new ImageIcon("src/hotel3room1.png");
        hotel3room1.setImage(hotel3room1.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        hotel3room1label.setIcon(hotel3room1);

        JLabel hotel3room2label=new JLabel();
        ImageIcon hotel3room2=new ImageIcon("src/hotel3room2.png");
        hotel3room2.setImage(hotel3room2.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        hotel3room2label.setIcon(hotel3room2);

        JLabel hotel3room3label=new JLabel();
        ImageIcon hotel3room3=new ImageIcon("src/hotel3room3.png");
        hotel3room3.setImage(hotel3room3.getImage().getScaledInstance(270, 180,Image.SCALE_DEFAULT));
        hotel3room3label.setIcon(hotel3room3);

        JButton hotel3room1last = new JButton(lastPic);
        hotel3room1last.setSize(10,10);
        hotel3room1last.setEnabled(false);
        JButton hotel3room1next = new JButton(nextPic);
        hotel3room1next.setSize(10,10);

        JButton hotel3room2last = new JButton(lastPic);
        hotel3room2last.setSize(10,10);
        JButton hotel3room2next = new JButton(nextPic);
        hotel3room2next.setSize(10,10);

        JButton hotel3room3last = new JButton(lastPic);
        hotel3room3last.setSize(10,10);
        JButton hotel3room3next = new JButton(nextPic);
        hotel3room3next.setSize(10,10);
        hotel3room3next.setEnabled(false);

        button3.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_31);
            jpanel2.add(label_32);
            jpanel2.add(label_33);
            jpanel2.add(label_34);
            jpanel2.add(label_35);
            jpanel2.add(label_36);
            jpanel2.add(label_36);
            jpanel2.add(hotel3room1last);
            jpanel2.add(hotel3room1label);
            jpanel2.add(hotel3room1next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm3);
            jpanel2.repaint();
            jpanel2.validate();
        }));
        button3_1.addActionListener((actionEvent -> {
                jpanel2.removeAll();
                jpanel2.add(label_31);
                jpanel2.add(label_32);
                jpanel2.add(label_33);
                jpanel2.add(label_34);
                jpanel2.add(label_35);
                jpanel2.add(label_36);
                jpanel2.add(label_36);
                jpanel2.add(hotel3room1last);
                jpanel2.add(hotel3room1label);
                jpanel2.add(hotel3room1next);
                jpanel2.add(buttonBack);
                jpanel2.add(buttonConfirm3);
                jpanel2.repaint();
                jpanel2.validate();
            }));
        hotel3room1next.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_31);
            jpanel2.add(label_32);
            jpanel2.add(label_33);
            jpanel2.add(label_34);
            jpanel2.add(label_35);
            jpanel2.add(label_36);
            jpanel2.add(label_36);
            jpanel2.add(hotel3room2last);
            jpanel2.add(hotel3room2label);
            jpanel2.add(hotel3room2next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm3);
            jpanel2.repaint();
            jpanel2.validate();
        }));
        hotel3room2last.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_31);
            jpanel2.add(label_32);
            jpanel2.add(label_33);
            jpanel2.add(label_34);
            jpanel2.add(label_35);
            jpanel2.add(label_36);
            jpanel2.add(label_36);
            jpanel2.add(hotel3room1last);
            jpanel2.add(hotel3room1label);
            jpanel2.add(hotel3room1next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm3);
            jpanel2.repaint();
            jpanel2.validate();
        }));
        hotel3room2next.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_31);
            jpanel2.add(label_32);
            jpanel2.add(label_33);
            jpanel2.add(label_34);
            jpanel2.add(label_35);
            jpanel2.add(label_36);
            jpanel2.add(label_36);
            jpanel2.add(hotel3room3last);
            jpanel2.add(hotel3room3label);
            jpanel2.add(hotel3room3next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm3);
            jpanel2.repaint();
            jpanel2.validate();
        }));
        hotel3room3last.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label_31);
            jpanel2.add(label_32);
            jpanel2.add(label_33);
            jpanel2.add(label_34);
            jpanel2.add(label_35);
            jpanel2.add(label_36);
            jpanel2.add(label_36);
            jpanel2.add(hotel3room2last);
            jpanel2.add(hotel3room2label);
            jpanel2.add(hotel3room2next);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm3);
            jpanel2.repaint();
            jpanel2.validate();
        }));

        buttonBack.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label3);
            jpanel2.add(label4);
            jpanel2.add(label5);
            jpanel2.add(label6);
            jpanel2.add(label7);
            jpanel2.add(label8);
            jpanel2.add(label81);
            jpanel2.add(label84);
            jpanel2.add(label85);
            jpanel2.add(label82);
            jpanel2.add(label83);
            jpanel2.add(label87);
            jpanel2.add(button1_1);
            jpanel2.add(button2_1);
            jpanel2.add(button3_1);
            jpanel2.add(label86);

            jpanel2.repaint();
            jpanel2.validate();

        }));

        buttonNext.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label9);
            jpanel2.add(label10 );
            jpanel2.add(label11 );
            jpanel2.add(label12 );
            jpanel2.add(label13 );
            jpanel2.add(label16 );
            jpanel2.add(buttonLast1 );
            jpanel2.add(label17);
            jpanel2.add(buttonNext1);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm );

            jpanel2.repaint();
            jpanel2.validate();
        }));

        buttonLast1.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label9);
            jpanel2.add(label10 );
            jpanel2.add(label11 );
            jpanel2.add(label12 );
            jpanel2.add(label13 );
            jpanel2.add(label16 );
            jpanel2.add(buttonLast );
            jpanel2.add(label14);
            jpanel2.add(buttonNext);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm );

            jpanel2.repaint();
            jpanel2.validate();
        }));

        buttonNext1.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label9);
            jpanel2.add(label10 );
            jpanel2.add(label11 );
            jpanel2.add(label12 );
            jpanel2.add(label13 );
            jpanel2.add(label16 );
            jpanel2.add(buttonLast2 );
            jpanel2.add(label18);
            jpanel2.add(buttonNext2);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm );

            jpanel2.repaint();
            jpanel2.validate();
        }));
        jframe.setVisible(true);

        buttonLast2.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(label9);
            jpanel2.add(label10 );
            jpanel2.add(label11 );
            jpanel2.add(label12 );
            jpanel2.add(label13 );
            jpanel2.add(label16 );
            jpanel2.add(buttonLast1 );
            jpanel2.add(label17);
            jpanel2.add(buttonNext1);
            jpanel2.add(buttonBack);
            jpanel2.add(buttonConfirm );

            jpanel2.repaint();
            jpanel2.validate();
        }));


        JLabel title1=new JLabel("You have chosen our hotel No.1!");
        title1.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel title2=new JLabel("You have chosen our hotel No.2!");
        title2.setFont(new Font("Calibri",Font.BOLD,15));
        JLabel title3=new JLabel("You have chosen our hotel No.3!");
        title3.setFont(new Font("Calibri",Font.BOLD,15));

        JLabel warning=new JLabel("Please fill in your personal information");
        warning.setFont(new Font("Calibri",Font.BOLD,13));


        JComboBox genderChooser=new JComboBox();
        genderChooser.addItem("Choose your gender");
        genderChooser.addItem("Male");
        genderChooser.addItem("Female");

        JComboBox genderChooser2=new JComboBox();
        genderChooser2.addItem("Choose your gender");
        genderChooser2.addItem("Male");
        genderChooser2.addItem("Female");

        JComboBox genderChooser3=new JComboBox();
        genderChooser3.addItem("Choose your gender");
        genderChooser3.addItem("Male");
        genderChooser3.addItem("Female");




        JComboBox date=new JComboBox();
        JComboBox date1=new JComboBox();
        date.addItem("Choose your arrive date   ");
        date1.addItem("Choose your leaving date");
        JComboBox date2=new JComboBox();
        JComboBox date12=new JComboBox();
        date2.addItem("Choose your arrive date   ");
        date12.addItem("Choose your leaving date");
        JComboBox date3=new JComboBox();
        JComboBox date13=new JComboBox();
        date3.addItem("Choose your arrive date   ");
        date13.addItem("Choose your leaving date");

        ArrayList Date0=new ArrayList();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal=Calendar.getInstance();
        for (int i = 0; i <20 ; i++) {
                Date0.add(format.format(cal.getTime()));
                cal.add(cal.DATE,1);
            }
        String[] Date1=new String[Date0.size()];
        for (int i = 0; i <Date0.size() ; i++) {
                Date1[i]=Date0.get(i).toString();
                date.addItem(Date1[i]);
                date1.addItem(Date1[i]);
                date2.addItem(Date1[i]);
                date12.addItem(Date1[i]);
                date3.addItem(Date1[i]);
                date13.addItem(Date1[i]);
            }




            JLabel nameLabel=new JLabel("              Your Name");
            JLabel genderLabel=new JLabel("         Your Gender");
            JLabel phoneLabel=new JLabel("Your Phone Number");

            JLabel nameLabel2=new JLabel("              Your Name");
            JLabel genderLabel2=new JLabel("         Your Gender");
            JLabel phoneLabel2=new JLabel("Your Phone Number");

            JLabel nameLabel3=new JLabel("              Your Name");
            JLabel genderLabel3=new JLabel("         Your Gender");
            JLabel phoneLabel3=new JLabel("Your Phone Number");


            JTextField nameTextfield2=new JTextField("",15);
            nameTextfield2.setSize(160,20);

            JTextField nameTextfield3=new JTextField("",15);
            nameTextfield3.setSize(160,20);


        JTextField nameTextfield=new JTextField("",15);
        nameTextfield.setSize(160,20);

        JLabel idNumberLabel=new JLabel("      Your ID number");
            JLabel idNumberLabel2=new JLabel("      Your ID number");
            JLabel idNumberLabel3=new JLabel("      Your ID number");

        JTextField idTextfield=new JTextField("",15);
        idTextfield.setSize(160,20);

            JTextField idTextfield2=new JTextField("",15);
            idTextfield2.setSize(160,20);

            JTextField idTextfield3=new JTextField("",15);
            idTextfield3.setSize(160,20);


            JTextField phoneTextfield=new JTextField("",15);
            phoneTextfield.setSize(160,20);

            JTextField phoneTextfield2=new JTextField("",15);
            phoneTextfield2.setSize(160,20);

            JTextField phoneTextfield3=new JTextField("",15);
            phoneTextfield3.setSize(160,20);

        JLabel roomFormatLabel=new JLabel("         Select room");
        JComboBox roomSelection=new JComboBox();
        roomSelection.setSize(150,20);
        roomSelection.addItem("Choose your room type");
        roomSelection.addItem("Type1(150RMB one day)   "   );
        roomSelection.addItem("Type2(250RMB one day)");
        roomSelection.addItem("Type3(350RMB one day)");
        roomSelection.addItem("Type4(450RMB one day)");

            JLabel roomFormatLabel2=new JLabel("         Select room");
            JComboBox roomSelection2=new JComboBox();
            roomSelection2.setSize(150,20);
            roomSelection2.addItem("Choose your room type");
            roomSelection2.addItem("Type1(150RMB one day)   "   );
            roomSelection2.addItem("Type2(250RMB one day)");
            roomSelection2.addItem("Type3(350RMB one day)");
            roomSelection2.addItem("Type4(450RMB one day)");

            JLabel roomFormatLabel3=new JLabel("         Select room");
            JComboBox roomSelection3=new JComboBox();
            roomSelection3.setSize(150,20);
            roomSelection3.addItem("Choose your room type");
            roomSelection3.addItem("Type1(150RMB one day)   "   );
            roomSelection3.addItem("Type2(250RMB one day)");
            roomSelection3.addItem("Type3(350RMB one day)");
            roomSelection3.addItem("Type4(450RMB one day)");

        JLabel numOfguests=new JLabel("Number of guests");


        JLabel chenkInLabel=new JLabel("       CheckIn date");
            chenkInLabel.setSize(150,20);
            JLabel checkOutLabel=new JLabel("    CheckOut date");
            chenkInLabel.setSize(150,20);

            JLabel chenkInLabel2=new JLabel("       CheckIn date");
            chenkInLabel2.setSize(150,20);
            JLabel checkOutLabel2=new JLabel("    CheckOut date");
            chenkInLabel2.setSize(150,20);

            JLabel chenkInLabel3=new JLabel("       CheckIn date");
            chenkInLabel3.setSize(150,20);
            JLabel checkOutLabel3=new JLabel("    CheckOut date");
            chenkInLabel3.setSize(150,20);

            JLabel adults=new JLabel();
            JLabel kids=new JLabel();
            JTextField numOfadults=new JTextField();
            JTextField numOfkids=new JTextField();


            JButton addButton1=new JButton("Add");
            addButton1.setPreferredSize(new Dimension(100,30));
            JButton addButton2=new JButton("Add");
            addButton2.setPreferredSize(new Dimension(100,30));
            JButton addButton3=new JButton("Add");
            addButton3.setPreferredSize(new Dimension(100,30));
            JButton resetButton=new JButton("Reset");
            resetButton.setPreferredSize(new Dimension(100,30));
            JButton resetButton_2=new JButton("Reset");
            resetButton_2.setPreferredSize(new Dimension(100,30));
            JButton resetButton_3=new JButton("Reset");
            resetButton_3.setPreferredSize(new Dimension(100,30));
            JButton backButton1=new JButton("Back");
            backButton1.setPreferredSize(new Dimension(100,30));
            JButton backButton2=new JButton("Back");
            backButton2.setPreferredSize(new Dimension(100,30));
            JButton backButton3=new JButton("Back");
            backButton3.setPreferredSize(new Dimension(100,30));
            JButton finalConfirmButton=new JButton("Confirm my order");
            finalConfirmButton.setPreferredSize(new Dimension(150,30));

            JButton finalConfirmButton2=new JButton("Confirm my order");
            finalConfirmButton2.setPreferredSize(new Dimension(150,30));

            JButton finalConfirmButton3=new JButton("Confirm my order");
            finalConfirmButton2.setPreferredSize(new Dimension(150,30));

            JButton resetButton2=new JButton("Clear notice board");
            resetButton2.setPreferredSize(new Dimension(150,30));
            JButton resetButton22=new JButton("Clear notice board");
            resetButton22.setPreferredSize(new Dimension(150,30));
            JButton resetButton23=new JButton("Clear notice board");
            resetButton23.setPreferredSize(new Dimension(150,30));
            JTextArea showInfo=new JTextArea("");
            showInfo.setFont(new Font("Calibri",Font.BOLD,10));
            showInfo.setEditable(false);
            showInfo.setLineWrap(true);
            Border titleBorder2 = BorderFactory.createTitledBorder( null ,"Order status or order info", TitledBorder.CENTER,TitledBorder.TOP);

            String userinfo1="";
            showInfo.setBorder(titleBorder2);
            showInfo.setColumns(25);
            showInfo.setRows(3);
            showInfo.append(userinfo1);
            System.out.println( showInfo.getSize());

            JTextArea showInfo2=new JTextArea("");
            showInfo2.setFont(new Font("Calibri",Font.BOLD,10));
            showInfo2.setLineWrap(true);
            showInfo2.setEditable(false);
            Border titleBorder22 = BorderFactory.createTitledBorder( null ,"Order status or order info", TitledBorder.CENTER,TitledBorder.TOP);

            String userinfo12="";
            showInfo2.setBorder(titleBorder22);
            showInfo2.setColumns(25);
            showInfo2.setRows(3);
            showInfo2.append(userinfo12);


            JTextArea showInfo3=new JTextArea("");
            showInfo3.setFont(new Font("Calibri",Font.BOLD,10));
            showInfo3.setLineWrap(true);
            showInfo3.setEditable(false);
            Border titleBorder23 = BorderFactory.createTitledBorder( null ,"Order status or order info", TitledBorder.CENTER,TitledBorder.TOP);

            String userinfo13="";
            showInfo3.setBorder(titleBorder22);
            showInfo3.setColumns(25);
            showInfo3.setRows(3);
            showInfo3.append(userinfo12);

        buttonConfirm.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(title1);
            jpanel2.add(chenkInLabel);
            jpanel2.add(date);
            jpanel2.add(checkOutLabel);
            jpanel2.add(date1);
            jpanel2.add(roomFormatLabel);
            jpanel2.add(roomSelection);
            jpanel2.add(warning);
            jpanel2.add(nameLabel);
            jpanel2.add(nameTextfield);
            jpanel2.add(idNumberLabel);
            jpanel2.add(idTextfield);
            jpanel2.add(genderLabel);
            jpanel2.add(genderChooser);
            jpanel2.add(phoneLabel);
            jpanel2.add(phoneTextfield);
            jpanel2.add(backButton1);
            jpanel2.add(addButton1);
            jpanel2.add(resetButton);

            jpanel2.add(showInfo);
            jpanel2.add(resetButton2);
            jpanel2.add(finalConfirmButton);


            jpanel2.repaint();
            jpanel2.validate();
        }));


        addButton1.addActionListener((actionEvent -> {

                jpanel2.removeAll();
                jpanel2.add(title1);
                jpanel2.add(chenkInLabel);
                jpanel2.add(date);
                jpanel2.add(checkOutLabel);
                jpanel2.add(date1);
                jpanel2.add(roomFormatLabel);
                jpanel2.add(roomSelection);
                jpanel2.add(warning);
                jpanel2.add(nameLabel);
                jpanel2.add(nameTextfield);
                jpanel2.add(idNumberLabel);
                jpanel2.add(idTextfield);
                jpanel2.add(genderLabel);
                jpanel2.add(genderChooser);
                jpanel2.add(phoneLabel);
                jpanel2.add(phoneTextfield);
                jpanel2.add(backButton1);
                jpanel2.add(addButton1);
                jpanel2.add(resetButton);
                String showNull="";
                showInfo.setText(showNull);
                jpanel2.add(showInfo);
                String inDate=date.getSelectedItem().toString();
                String[] dates=inDate.split("-");
                
                String outDate=date1.getSelectedItem().toString();
                String[] dates1=outDate.split("-");
                if(inDate.equals("Choose your arrive date   ")||outDate.equals("Choose your leaving date"))
                {
                    String showTo="You haven't choose arrive or leaving date!";
                    showInfo.append(showTo);
                    jpanel2.add(showInfo);

                }
                else{
                    if(Integer.parseInt(dates[1]) == Integer.parseInt(dates1[1])){
                    System.out.println(Integer.parseInt(dates[2]));
                    System.out.println(Integer.parseInt(dates1[2]));
                    if((Integer.parseInt(dates[2]) < Integer.parseInt(dates1[2]))){

                        String roomType=roomSelection.getSelectedItem().toString();
                        String userName=nameTextfield.getText();
                        String userGender=genderChooser.getSelectedItem().toString();
                        String userPhone=phoneTextfield.getText();
                        String userID=idTextfield.getText();

                        if(roomType.equals("Choose your room type")){
                            String showTo="You haven't choose room type!";
                            showInfo.append(showTo);
                            jpanel2.add(showInfo);
                        }
                        else{
                            if(userName.equals("")||userGender.equals("Choose your gender")||userPhone.equals("")||userID .equals(""))
                            {
                                String showTo="You didn't fill in all the required information!";
                                showInfo.append(showTo);
                                jpanel2.add(showInfo);
                            }
                            else{
                                if(userPhone.matches("^-?[1-9]\\d*$")==false||userID.matches("^-?[1-9]\\d*$")==false)
                                {
                                    String showTo="Phone or ID number must be numbers!";
                                    showInfo.append(showTo);
                                    jpanel2.add(showInfo);

                                }
                                else{
                                    if(roomSelection.getSelectedIndex() == 1){

                                       int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                       int price=index*150;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo.append(showTo);
                                        jpanel2.add(showInfo);
                                    }
                                    if(roomSelection.getSelectedIndex() == 2){

                                        int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                        int price=index*250;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo.append(showTo);
                                        jpanel2.add(showInfo);
                                    }
                                    if(roomSelection.getSelectedIndex() == 3){

                                        int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                        int price=index*350;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo.append(showTo);
                                        jpanel2.add(showInfo);
                                    }
                                    if(roomSelection.getSelectedIndex() == 4){

                                        int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                        int price=index*450;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo.append(showTo);
                                        jpanel2.add(showInfo);
                                    }
                                    date.setSelectedIndex(0);
                                    date1.setSelectedIndex(0);
                                    roomSelection.setSelectedIndex(0);
                                    nameTextfield.setText("");
                                    idTextfield.setText("");
                                    genderChooser.setSelectedIndex(0);
                                    phoneTextfield.setText("");


                                }
                            }
                        }
                      }

                    else{
                        String showTo="The date format is incorrect!";
                        showInfo.append(showTo);
                        jpanel2.add(showInfo);

                    }
                }
                    else if((Integer.parseInt(dates[1]) > Integer.parseInt(dates1[1]))){
                    String showTo="The date format is incorrect!";
                    showInfo.append(showTo);
                    jpanel2.add(showInfo);
                }
                    else{
                        String roomType=roomSelection.getSelectedItem().toString();
                        String userName=nameTextfield.getText();
                        String userGender=genderChooser.getSelectedItem().toString();
                        String userPhone=phoneTextfield.getText();
                        String userID=idTextfield.getText();

                        if(roomType.equals("Choose your room type")){
                            String showTo="You haven't choose room type!";
                            showInfo.append(showTo);
                            jpanel2.add(showInfo);
                        }
                        else{
                            if(userName.equals("")||userGender.equals("Choose your gender")||userPhone.equals("")||userID .equals(""))
                            {
                                String showTo="You didn't fill in all the required information!";
                                showInfo.append(showTo);
                                jpanel2.add(showInfo);
                            }
                            else{
                                if(userPhone.matches("^-?[1-9]\\d*$")==false||userID.matches("^-?[1-9]\\d*$")==false)
                                {
                                    String showTo="Phone or ID number must be numbers!";
                                    showInfo.append(showTo);
                                    jpanel2.add(showInfo);

                                }
                                else{
                                    if(roomSelection.getSelectedIndex() == 1){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*150;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo.append(showTo);
                                        jpanel2.add(showInfo);
                                    }
                                    if(roomSelection.getSelectedIndex() == 2){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*250;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo.append(showTo);
                                        jpanel2.add(showInfo);
                                    }
                                    if(roomSelection.getSelectedIndex() == 3){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*350;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo.append(showTo);
                                        jpanel2.add(showInfo);
                                    }
                                    if(roomSelection.getSelectedIndex() == 4){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*450;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo.append(showTo);
                                        jpanel2.add(showInfo);
                                    }
                                    date.setSelectedIndex(0);
                                    date1.setSelectedIndex(0);
                                    roomSelection.setSelectedIndex(0);
                                    nameTextfield.setText("");
                                    idTextfield.setText("");
                                    genderChooser.setSelectedIndex(0);
                                    phoneTextfield.setText("");
                                }
                            }
                        }

                }
                }

                jpanel2.add(resetButton2);
                jpanel2.add(finalConfirmButton);


                jpanel2.repaint();
                jpanel2.validate();
            }));
        addButton2.addActionListener((actionEvent -> {

                jpanel2.removeAll();
                jpanel2.add(title2);
                jpanel2.add(chenkInLabel2);
                jpanel2.add(date2);
                jpanel2.add(checkOutLabel2);
                jpanel2.add(date12);
                jpanel2.add(roomFormatLabel2);
                jpanel2.add(roomSelection2);
                jpanel2.add(warning);
                jpanel2.add(nameLabel2);
                jpanel2.add(nameTextfield2);
                jpanel2.add(idNumberLabel2);
                jpanel2.add(idTextfield2);
                jpanel2.add(genderLabel2);
                jpanel2.add(genderChooser2);
                jpanel2.add(phoneLabel2);
                jpanel2.add(phoneTextfield2);
                jpanel2.add(backButton2);
                jpanel2.add(addButton2);
                jpanel2.add(resetButton_2);
                String showNull="";
                showInfo2.setText(showNull);
                jpanel2.add(showInfo2);
                String inDate=date2.getSelectedItem().toString();
                String[] dates=inDate.split("-");

                String outDate=date12.getSelectedItem().toString();
                String[] dates1=outDate.split("-");
                if(inDate.equals("Choose your arrive date   ")||outDate.equals("Choose your leaving date"))
                {
                    String showTo="You haven't choose arrive or leaving date!";
                    showInfo2.append(showTo);
                    jpanel2.add(showInfo2);

                }
                else{
                    if(Integer.parseInt(dates[1]) == Integer.parseInt(dates1[1])){

                        if((Integer.parseInt(dates[2]) < Integer.parseInt(dates1[2]))){

                            String roomType=roomSelection2.getSelectedItem().toString();
                            String userName=nameTextfield2.getText();
                            String userGender=genderChooser2.getSelectedItem().toString();
                            String userPhone=phoneTextfield2.getText();
                            String userID=idTextfield2.getText();

                            if(roomType.equals("Choose your room type")){
                                String showTo="You haven't choose room type!";
                                showInfo2.append(showTo);
                                jpanel2.add(showInfo2);
                            }
                            else{
                                if(userName.equals("")||userGender.equals("Choose your gender")||userPhone.equals("")||userID .equals(""))
                                {
                                    String showTo="You didn't fill in all the required information!";
                                    showInfo2.append(showTo);
                                    jpanel2.add(showInfo2);
                                }
                                else{
                                    if(userPhone.matches("^-?[1-9]\\d*$")==false||userID.matches("^-?[1-9]\\d*$")==false)
                                    {
                                        String showTo="Phone or ID number must be numbers!";
                                        showInfo2.append(showTo);
                                        jpanel2.add(showInfo2);

                                    }
                                    else{
                                        if(roomSelection2.getSelectedIndex() == 1){

                                            int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                            int price=index*150;
                                            String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                            showInfo2.append(showTo);
                                            jpanel2.add(showInfo2);
                                        }
                                        if(roomSelection2.getSelectedIndex() == 2){

                                            int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                            int price=index*250;
                                            String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                            showInfo2.append(showTo);
                                            jpanel2.add(showInfo2);
                                        }
                                        if(roomSelection2.getSelectedIndex() == 3){

                                            int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                            int price=index*350;
                                            String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                            showInfo2.append(showTo);
                                            jpanel2.add(showInfo2);
                                        }
                                        if(roomSelection2.getSelectedIndex() == 4){

                                            int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                            int price=index*450;
                                            String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                            showInfo2.append(showTo);
                                            jpanel2.add(showInfo2);
                                        }
                                        date2.setSelectedIndex(0);
                                        date12.setSelectedIndex(0);
                                        roomSelection2.setSelectedIndex(0);
                                        nameTextfield2.setText("");
                                        idTextfield2.setText("");
                                        genderChooser2.setSelectedIndex(0);
                                        phoneTextfield2.setText("");
                                    }
                                }
                            }
                        }

                        else{
                            String showTo="The date format is incorrect!";
                            showInfo2.append(showTo);
                            jpanel2.add(showInfo2);

                        }
                    }
                    else if((Integer.parseInt(dates[1]) > Integer.parseInt(dates1[1]))){
                        String showTo="The date format is incorrect!";
                        showInfo2.append(showTo);
                        jpanel2.add(showInfo2);
                    }
                    else{
                        String roomType=roomSelection2.getSelectedItem().toString();
                        String userName=nameTextfield2.getText();
                        String userGender=genderChooser2.getSelectedItem().toString();
                        String userPhone=phoneTextfield2.getText();
                        String userID=idTextfield2.getText();

                        if(roomType.equals("Choose your room type")){
                            String showTo="You haven't choose room type!";
                            showInfo2.append(showTo);
                            jpanel2.add(showInfo2);
                        }
                        else{
                            if(userName.equals("")||userGender.equals("Choose your gender")||userPhone.equals("")||userID .equals(""))
                            {
                                String showTo="You didn't fill in all the required information!";
                                showInfo2.append(showTo);
                                jpanel2.add(showInfo2);
                            }
                            else{
                                if(userPhone.matches("^-?[1-9]\\d*$")==false||userID.matches("^-?[1-9]\\d*$")==false)
                                {
                                    String showTo="Phone or ID number must be numbers!";
                                    showInfo2.append(showTo);
                                    jpanel2.add(showInfo2);

                                }
                                else{
                                    if(roomSelection2.getSelectedIndex() == 1){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*150;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo2.append(showTo);
                                        jpanel2.add(showInfo2);
                                    }
                                    if(roomSelection2.getSelectedIndex() == 2){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*250;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo2.append(showTo);
                                        jpanel2.add(showInfo2);
                                    }
                                    if(roomSelection2.getSelectedIndex() == 3){

                                        int index= Integer.parseInt(dates1[2]) +31- Integer.parseInt(dates[2]);
                                        int price=index*350;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo2.append(showTo);
                                        jpanel2.add(showInfo2);
                                    }
                                    if(roomSelection2.getSelectedIndex() == 4){

                                        int index= Integer.parseInt(dates1[2]) +31- Integer.parseInt(dates[2]);
                                        int price=index*450;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo2.append(showTo);
                                        jpanel2.add(showInfo2);
                                    }
                                    date2.setSelectedIndex(0);
                                    date12.setSelectedIndex(0);
                                    roomSelection2.setSelectedIndex(0);
                                    nameTextfield2.setText("");
                                    idTextfield2.setText("");
                                    genderChooser2.setSelectedIndex(0);
                                    phoneTextfield2.setText("");
                                }
                            }
                        }

                    }
                }

                jpanel2.add(resetButton22);
                jpanel2.add(finalConfirmButton2);


                jpanel2.repaint();
                jpanel2.validate();
            }));
        addButton3.addActionListener((actionEvent -> {

                jpanel2.removeAll();
                jpanel2.add(title3);
                jpanel2.add(chenkInLabel3);
                jpanel2.add(date3);
                jpanel2.add(checkOutLabel3);
                jpanel2.add(date13);
                jpanel2.add(roomFormatLabel3);
                jpanel2.add(roomSelection3);
                jpanel2.add(warning);
                jpanel2.add(nameLabel3);
                jpanel2.add(nameTextfield3);
                jpanel2.add(idNumberLabel3);
                jpanel2.add(idTextfield3);
                jpanel2.add(genderLabel3);
                jpanel2.add(genderChooser3);
                jpanel2.add(phoneLabel3);
                jpanel2.add(phoneTextfield3);
                jpanel2.add(backButton3);
                jpanel2.add(addButton3);
                jpanel2.add(resetButton_3);
                String showNull="";
                showInfo3.setText(showNull);
                jpanel2.add(showInfo3);
                String inDate=date3.getSelectedItem().toString();
                String[] dates=inDate.split("-");

                String outDate=date13.getSelectedItem().toString();
                String[] dates1=outDate.split("-");
                if(inDate.equals("Choose your arrive date   ")||outDate.equals("Choose your leaving date"))
                {
                    String showTo="You haven't choose arrive or leaving date!";
                    showInfo3.append(showTo);
                    jpanel2.add(showInfo3);

                }
                else{
                    if(Integer.parseInt(dates[1]) == Integer.parseInt(dates1[1])){

                        if((Integer.parseInt(dates[2]) < Integer.parseInt(dates1[2]))){

                            String roomType=roomSelection3.getSelectedItem().toString();
                            String userName=nameTextfield3.getText();
                            String userGender=genderChooser3.getSelectedItem().toString();
                            String userPhone=phoneTextfield3.getText();
                            String userID=idTextfield3.getText();

                            if(roomType.equals("Choose your room type")){
                                String showTo="You haven't choose room type!";
                                showInfo3.append(showTo);
                                jpanel2.add(showInfo3);
                            }
                            else{
                                if(userName.equals("")||userGender.equals("Choose your gender")||userPhone.equals("")||userID .equals(""))
                                {
                                    String showTo="You didn't fill in all the required information!";
                                    showInfo3.append(showTo);
                                    jpanel2.add(showInfo3);
                                }
                                else{
                                    if(userPhone.matches("^-?[1-9]\\d*$")==false||userID.matches("^-?[1-9]\\d*$")==false)
                                    {
                                        String showTo="Phone or ID number must be numbers!";
                                        showInfo3.append(showTo);
                                        jpanel2.add(showInfo3);

                                    }
                                    else{
                                        if(roomSelection3.getSelectedIndex() == 1){

                                            int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                            int price=index*150;
                                            String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                            showInfo3.append(showTo);
                                            jpanel2.add(showInfo3);
                                        }
                                        if(roomSelection3.getSelectedIndex() == 2){

                                            int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                            int price=index*250;
                                            String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                            showInfo3.append(showTo);
                                            jpanel2.add(showInfo3);
                                        }
                                        if(roomSelection3.getSelectedIndex() == 3){

                                            int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                            int price=index*350;
                                            String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                            showInfo3.append(showTo);
                                            jpanel2.add(showInfo3);
                                        }
                                        if(roomSelection3.getSelectedIndex() == 4){

                                            int index= Integer.parseInt(dates1[2]) - Integer.parseInt(dates[2]);
                                            int price=index*450;
                                            String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                            showInfo3.append(showTo);
                                            jpanel2.add(showInfo3);
                                        }
                                        date3.setSelectedIndex(0);
                                        date13.setSelectedIndex(0);
                                        roomSelection3.setSelectedIndex(0);
                                        nameTextfield3.setText("");
                                        idTextfield3.setText("");
                                        genderChooser3.setSelectedIndex(0);
                                        phoneTextfield3.setText("");
                                    }
                                }
                            }
                        }

                        else{
                            String showTo="The date format is incorrect!";
                            showInfo3.append(showTo);
                            jpanel2.add(showInfo3);

                        }
                    }
                    else if((Integer.parseInt(dates[1]) > Integer.parseInt(dates1[1]))){
                        String showTo="The date format is incorrect!";
                        showInfo3.append(showTo);
                        jpanel2.add(showInfo3);
                    }
                    else{
                        String roomType=roomSelection3.getSelectedItem().toString();
                        String userName=nameTextfield3.getText();
                        String userGender=genderChooser3.getSelectedItem().toString();
                        String userPhone=phoneTextfield3.getText();
                        String userID=idTextfield3.getText();

                        if(roomType.equals("Choose your room type")){
                            String showTo="You haven't choose room type!";
                            showInfo3.append(showTo);
                            jpanel2.add(showInfo3);
                        }
                        else{
                            if(userName.equals("")||userGender.equals("Choose your gender")||userPhone.equals("")||userID .equals(""))
                            {
                                String showTo="You didn't fill in all the required information!";
                                showInfo3.append(showTo);
                                jpanel2.add(showInfo3);
                            }
                            else{
                                if(userPhone.matches("^-?[1-9]\\d*$")==false||userID.matches("^-?[1-9]\\d*$")==false)
                                {
                                    String showTo="Phone or ID number must be numbers!";
                                    showInfo3.append(showTo);
                                    jpanel2.add(showInfo3);

                                }
                                else{
                                    if(roomSelection3.getSelectedIndex() == 1){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*150;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo3.append(showTo);
                                        jpanel2.add(showInfo3);
                                    }
                                    if(roomSelection3.getSelectedIndex() == 2){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*250;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo3.append(showTo);
                                        jpanel2.add(showInfo3);
                                    }
                                    if(roomSelection3.getSelectedIndex() == 3){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*350;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo3.append(showTo);
                                        jpanel2.add(showInfo3);
                                    }
                                    if(roomSelection3.getSelectedIndex() == 4){

                                        int index= Integer.parseInt(dates1[2])+31 - Integer.parseInt(dates[2]);
                                        int price=index*450;
                                        String showTo="Your Info:Name:"+userName+" ,gender:"+userGender +" ,phone:"+userPhone+".You will pay:"+price+"RMB";
                                        showInfo3.append(showTo);
                                        jpanel2.add(showInfo3);
                                    }
                                    date3.setSelectedIndex(0);
                                    date13.setSelectedIndex(0);
                                    roomSelection3.setSelectedIndex(0);
                                    nameTextfield3.setText("");
                                    idTextfield3.setText("");
                                    genderChooser3.setSelectedIndex(0);
                                    phoneTextfield3.setText("");
                                }
                            }
                        }

                    }
                }

                jpanel2.add(resetButton23);
                jpanel2.add(finalConfirmButton3);


                jpanel2.repaint();
                jpanel2.validate();
            }));
        backButton1.addActionListener((actionEvent -> {

                jpanel2.removeAll();
                jpanel2.add(label9 );
                jpanel2.add(label10 );
                jpanel2.add(label11 );
                jpanel2.add(label12 );
                jpanel2.add(label13 );
                jpanel2.add(label16 );
                jpanel2.add(buttonLast );
                jpanel2.add(label14);
                jpanel2.add(buttonNext);
                jpanel2.add(buttonBack);
                jpanel2.add(buttonConfirm );
                jpanel2.repaint();
                jpanel2.validate();
            }));
        backButton2.addActionListener((actionEvent -> {

                jpanel2.removeAll();//移除面板中的所有组件
                jpanel2.add(label_1);
                jpanel2.add(label_2);
                jpanel2.add(label_3);
                jpanel2.add(label_4);
                jpanel2.add(label_5);
                jpanel2.add(hotel2room1last);
                jpanel2.add(hotel2room1label);
                jpanel2.add(hotel2room1next);
                jpanel2.add(buttonBack);
                jpanel2.add(buttonConfirm2 );
                jpanel2.repaint();
                jpanel2.validate();
                date.setSelectedIndex(0);
                date1.setSelectedIndex(0);
                roomSelection.setSelectedIndex(0);
                nameTextfield.setText("");
                idTextfield.setText("");
                genderChooser.setSelectedIndex(0);
                phoneTextfield.setText("");

            }));
        backButton3.addActionListener((actionEvent -> {

                jpanel2.removeAll();
                jpanel2.add(label_31);
                jpanel2.add(label_32);
                jpanel2.add(label_33);
                jpanel2.add(label_34);
                jpanel2.add(label_35);
                jpanel2.add(label_36);
                jpanel2.add(label_36);
                jpanel2.add(hotel3room1last);
                jpanel2.add(hotel3room1label);
                jpanel2.add(hotel3room1next);
                jpanel2.add(buttonBack);
                jpanel2.add(buttonConfirm3);

                jpanel2.repaint();
                jpanel2.validate();

            }));


        resetButton.addActionListener((actionEvent -> {
                date.setSelectedIndex(0);
                date1.setSelectedIndex(0);
                roomSelection.setSelectedIndex(0);
                nameTextfield.setText("");
                idTextfield.setText("");
                genderChooser.setSelectedIndex(0);
                phoneTextfield.setText("");

            }));
        resetButton_2.addActionListener((actionEvent -> {
                date2.setSelectedIndex(0);
                date12.setSelectedIndex(0);
                roomSelection2.setSelectedIndex(0);
                nameTextfield2.setText("");
                idTextfield2.setText("");
                genderChooser2.setSelectedIndex(0);
                phoneTextfield2.setText("");

            }));
        resetButton_3.addActionListener((actionEvent -> {
                date3.setSelectedIndex(0);
                date13.setSelectedIndex(0);
                roomSelection3.setSelectedIndex(0);
                nameTextfield3.setText("");
                idTextfield3.setText("");
                genderChooser3.setSelectedIndex(0);
                phoneTextfield3.setText("");

            }));
        resetButton2.addActionListener((actionEvent -> {
               showInfo.setText("");
            }));
        resetButton22.addActionListener((actionEvent -> {
                showInfo2.setText("");
            }));
        resetButton23.addActionListener((actionEvent -> {
                showInfo3.setText("");
            }));

        buttonConfirm2.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(title2);
            jpanel2.add(chenkInLabel2);
            jpanel2.add(date2);
            jpanel2.add(checkOutLabel2);
            jpanel2.add(date12);
            jpanel2.add(roomFormatLabel2);
            jpanel2.add(roomSelection2);
            jpanel2.add(warning);
            jpanel2.add(nameLabel2);
            jpanel2.add(nameTextfield2);
            jpanel2.add(idNumberLabel2);
            jpanel2.add(idTextfield2);
            jpanel2.add(genderLabel2);
            jpanel2.add(genderChooser2);
            jpanel2.add(phoneLabel2);
            jpanel2.add(phoneTextfield2);
            jpanel2.add(backButton2);
            jpanel2.add(addButton2);
            jpanel2.add(resetButton_2);

            jpanel2.add(showInfo2);
            jpanel2.add(resetButton22);
            jpanel2.add(finalConfirmButton2);
            jpanel2.repaint();
            jpanel2.validate();
        }));
        buttonConfirm3.addActionListener((actionEvent -> {
            jpanel2.removeAll();
            jpanel2.add(title3);
            jpanel2.add(chenkInLabel3);
            jpanel2.add(date3);
            jpanel2.add(checkOutLabel3);
            jpanel2.add(date13);
            jpanel2.add(roomFormatLabel3);
            jpanel2.add(roomSelection3);
            jpanel2.add(warning);
            jpanel2.add(nameLabel3);
            jpanel2.add(nameTextfield3);
            jpanel2.add(idNumberLabel3);
            jpanel2.add(idTextfield3);
            jpanel2.add(genderLabel3);
            jpanel2.add(genderChooser3);
            jpanel2.add(phoneLabel3);
            jpanel2.add(phoneTextfield3);
            jpanel2.add(backButton3);
            jpanel2.add(addButton3);
            jpanel2.add(resetButton_3);


            jpanel2.add(showInfo3);
            jpanel2.add(resetButton23);
            jpanel2.add(finalConfirmButton3);
            jpanel2.repaint();
            jpanel2.validate();
        }));
        finalConfirmButton.addActionListener((actionEvent -> {
           if(showInfo.getText().equals("")) {
               showInfo.setText("Can not confirm order!");
           }
           else{
               if(
                       (showInfo.getText().equals("You haven't choose arrive or leaving date!"))||
                               (showInfo.getText().equals("The date format is incorrect!"))||
                               (showInfo.getText().equals("You haven't choose room type!"))||
                               (showInfo.getText().equals("You didn't fill in all the required information!"))||
                               (showInfo.getText().equals("Phone or ID number must be numbers!"))||
                               (showInfo.getText().equals("Can not confirm order!"))

               ){
                   showInfo.setText("Can not confirm order!");

               }
             else{
                   showInfo.setText("Order successfully!");
               }

           }

            }));
        finalConfirmButton2.addActionListener((actionEvent -> {
                if(showInfo2.getText().equals("")) {
                    showInfo2.setText("Can not confirm order!");
                }
                else{
                    if(
                            (showInfo2.getText().equals("You haven't choose arrive or leaving date!"))||
                                    (showInfo2.getText().equals("The date format is incorrect!"))||
                                    (showInfo2.getText().equals("You haven't choose room type!"))||
                                    (showInfo2.getText().equals("You didn't fill in all the required information!"))||
                                    (showInfo2.getText().equals("Phone or ID number must be numbers!"))||
                                    (showInfo2.getText().equals("Can not confirm order!"))

                    ){
                        showInfo2.setText("Can not confirm order!");
                    }
                    else{
                        showInfo2.setText("Order successfully!");
                    }
                }
            }));
        finalConfirmButton3.addActionListener((actionEvent -> {
                if(showInfo3.getText().equals("")) {
                    showInfo3.setText("Can not confirm order!");
                }
                else{
                    if(
                            (showInfo3.getText().equals("You haven't choose arrive or leaving date!"))||
                                    (showInfo3.getText().equals("The date format is incorrect!"))||
                                    (showInfo3.getText().equals("You haven't choose room type!"))||
                                    (showInfo3.getText().equals("You didn't fill in all the required information!"))||
                                    (showInfo3.getText().equals("Phone or ID number must be numbers!"))||
                                    (showInfo3.getText().equals("Can not confirm order!"))

                    ){
                        showInfo3.setText("Can not confirm order!");
                    }
                    else{
                        showInfo3.setText("Order successfully!");
                    }
                }
            }));
        jframe.setVisible(true);
    }
}

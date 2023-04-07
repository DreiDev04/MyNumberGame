package numgameforms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JTextField;

public class GameForms extends javax.swing.JFrame implements ActionListener, FocusListener {

    static int randomNum;
    static int howManyNum = 0;
    static int currentGuess;
    static boolean isButtonClickable = false;

    private static final int MIN_NUMBER = 1000;
    private static final int MAX_NUMBER = 9999;
    private static final int NUMBER_LENGTH = 4;

    int currentIndex = 0;

    private JTextField[] inputs = new JTextField[10];
    private JTextField[] numOutput = new JTextField[10];
    private JTextField[] posOutput = new JTextField[10];

    public GameForms() {
        
        randomNum = generateRandomNumber();
        System.out.println("Random Number: " + randomNum);

        initComponents();

        inputs[0] = guessInput1;
        inputs[1] = guessInput2;
        inputs[2] = guessInput3;
        inputs[3] = guessInput4;
        inputs[4] = guessInput5;
        inputs[5] = guessInput6;
        inputs[6] = guessInput7;
        inputs[7] = guessInput8;
        inputs[8] = guessInput9;
        inputs[9] = guessInput10;

        numOutput[0] = numOutput1;
        numOutput[1] = numOutput2;
        numOutput[2] = numOutput3;
        numOutput[3] = numOutput4;
        numOutput[4] = numOutput5;
        numOutput[5] = numOutput6;
        numOutput[6] = numOutput7;
        numOutput[7] = numOutput8;
        numOutput[8] = numOutput9;
        numOutput[9] = numOutput10;

        posOutput[0] = posOutput1;
        posOutput[1] = posOutput2;
        posOutput[2] = posOutput3;
        posOutput[3] = posOutput4;
        posOutput[4] = posOutput5;
        posOutput[5] = posOutput6;
        posOutput[6] = posOutput7;
        posOutput[7] = posOutput8;
        posOutput[8] = posOutput9;
        posOutput[9] = posOutput10;

        for (JTextField currentInput : inputs) {
            currentInput.addKeyListener(new KeyAdapter() {
                @Override
                public void keyReleased(KeyEvent e) {
                    String text = currentInput.getText().trim();
                    boolean hasLetter = text.matches(".*[a-zA-Z].*"); // regex pattern to check if string has a letter

                    if (text.length() == 4 && !hasLetter) {
                        currentGuess = Integer.valueOf(currentInput.getText());
//                        System.out.println("mod: " + currentGuess);
                        enterIcon.setEnabled(true); // Enable the button if text length is 4
                        isButtonClickable = true;
                    } else {
                        enterIcon.setEnabled(false); // Disable the button otherwise
                        isButtonClickable = false;
                    }
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        GridContainer = new javax.swing.JPanel();
        guessContainer = new javax.swing.JPanel();
        lbl_Guess = new javax.swing.JLabel();
        guessInput1 = new javax.swing.JTextField();
        guessInput2 = new javax.swing.JTextField();
        guessInput3 = new javax.swing.JTextField();
        guessInput4 = new javax.swing.JTextField();
        guessInput5 = new javax.swing.JTextField();
        guessInput6 = new javax.swing.JTextField();
        guessInput7 = new javax.swing.JTextField();
        guessInput8 = new javax.swing.JTextField();
        guessInput9 = new javax.swing.JTextField();
        guessInput10 = new javax.swing.JTextField();
        numPosContainer = new javax.swing.JPanel();
        lbl_numbers = new javax.swing.JLabel();
        lbl_positions = new javax.swing.JLabel();
        numOutput1 = new javax.swing.JTextField();
        posOutput1 = new javax.swing.JTextField();
        numOutput2 = new javax.swing.JTextField();
        posOutput2 = new javax.swing.JTextField();
        numOutput3 = new javax.swing.JTextField();
        posOutput3 = new javax.swing.JTextField();
        numOutput4 = new javax.swing.JTextField();
        posOutput4 = new javax.swing.JTextField();
        numOutput5 = new javax.swing.JTextField();
        posOutput5 = new javax.swing.JTextField();
        numOutput6 = new javax.swing.JTextField();
        posOutput6 = new javax.swing.JTextField();
        numOutput7 = new javax.swing.JTextField();
        posOutput7 = new javax.swing.JTextField();
        numOutput8 = new javax.swing.JTextField();
        posOutput8 = new javax.swing.JTextField();
        numOutput9 = new javax.swing.JTextField();
        posOutput9 = new javax.swing.JTextField();
        numOutput10 = new javax.swing.JTextField();
        posOutput10 = new javax.swing.JTextField();
        KeyboardContainer = new javax.swing.JPanel();
        buttonIconContainer = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        backspaceIcon = new javax.swing.JLabel();
        enterIcon = new javax.swing.JLabel();
        hamburgerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guessing Game");
        setName(""); // NOI18N
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(68, 60, 104));
        MainPanel.setForeground(java.awt.Color.white);
        MainPanel.setLayout(null);

        GridContainer.setBackground(new java.awt.Color(255, 255, 255));
        GridContainer.setLayout(new java.awt.BorderLayout());

        guessContainer.setBackground(new java.awt.Color(25, 24, 37));
        guessContainer.setLayout(new java.awt.GridLayout(11, 1));

        lbl_Guess.setBackground(new java.awt.Color(25, 24, 37));
        lbl_Guess.setForeground(java.awt.Color.white);
        lbl_Guess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Guess.setText("YOUR GUESS");
        lbl_Guess.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_Guess.setFocusable(false);
        guessContainer.add(lbl_Guess);

        guessInput1.setBackground(new java.awt.Color(25, 24, 37));
        guessInput1.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput1.setForeground(new java.awt.Color(238, 237, 239));
        guessInput1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput1);

        guessInput2.setEditable(false);
        guessInput2.setBackground(new java.awt.Color(25, 24, 37));
        guessInput2.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput2.setForeground(new java.awt.Color(238, 237, 239));
        guessInput2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput2);

        guessInput3.setEditable(false);
        guessInput3.setBackground(new java.awt.Color(25, 24, 37));
        guessInput3.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput3.setForeground(new java.awt.Color(238, 237, 239));
        guessInput3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput3);

        guessInput4.setEditable(false);
        guessInput4.setBackground(new java.awt.Color(25, 24, 37));
        guessInput4.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput4.setForeground(new java.awt.Color(238, 237, 239));
        guessInput4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput4);

        guessInput5.setEditable(false);
        guessInput5.setBackground(new java.awt.Color(25, 24, 37));
        guessInput5.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput5.setForeground(new java.awt.Color(238, 237, 239));
        guessInput5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput5);

        guessInput6.setEditable(false);
        guessInput6.setBackground(new java.awt.Color(25, 24, 37));
        guessInput6.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput6.setForeground(new java.awt.Color(238, 237, 239));
        guessInput6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput6);

        guessInput7.setEditable(false);
        guessInput7.setBackground(new java.awt.Color(25, 24, 37));
        guessInput7.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput7.setForeground(new java.awt.Color(238, 237, 239));
        guessInput7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput7);

        guessInput8.setEditable(false);
        guessInput8.setBackground(new java.awt.Color(25, 24, 37));
        guessInput8.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput8.setForeground(new java.awt.Color(238, 237, 239));
        guessInput8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput8);

        guessInput9.setEditable(false);
        guessInput9.setBackground(new java.awt.Color(25, 24, 37));
        guessInput9.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput9.setForeground(new java.awt.Color(238, 237, 239));
        guessInput9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput9);

        guessInput10.setEditable(false);
        guessInput10.setBackground(new java.awt.Color(25, 24, 37));
        guessInput10.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        guessInput10.setForeground(new java.awt.Color(238, 237, 239));
        guessInput10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guessInput10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guessInput10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guessInput1KeyPressed(evt);
            }
        });
        guessContainer.add(guessInput10);

        GridContainer.add(guessContainer, java.awt.BorderLayout.CENTER);

        numPosContainer.setBackground(new java.awt.Color(25, 24, 37));
        numPosContainer.setLayout(new java.awt.GridLayout(11, 2));

        lbl_numbers.setBackground(new java.awt.Color(25, 24, 37));
        lbl_numbers.setForeground(java.awt.Color.white);
        lbl_numbers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_numbers.setText(" Numbers");
        lbl_numbers.setToolTipText("");
        lbl_numbers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_numbers.setFocusable(false);
        numPosContainer.add(lbl_numbers);

        lbl_positions.setBackground(new java.awt.Color(25, 24, 37));
        lbl_positions.setForeground(java.awt.Color.white);
        lbl_positions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_positions.setText("Position");
        lbl_positions.setToolTipText("");
        lbl_positions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_positions.setFocusable(false);
        numPosContainer.add(lbl_positions);

        numOutput1.setEditable(false);
        numOutput1.setBackground(new java.awt.Color(25, 24, 37));
        numOutput1.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput1.setForeground(new java.awt.Color(238, 237, 239));
        numOutput1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput1);

        posOutput1.setEditable(false);
        posOutput1.setBackground(new java.awt.Color(25, 24, 37));
        posOutput1.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput1.setForeground(new java.awt.Color(238, 237, 239));
        posOutput1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput1);

        numOutput2.setEditable(false);
        numOutput2.setBackground(new java.awt.Color(25, 24, 37));
        numOutput2.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput2.setForeground(new java.awt.Color(238, 237, 239));
        numOutput2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput2);

        posOutput2.setEditable(false);
        posOutput2.setBackground(new java.awt.Color(25, 24, 37));
        posOutput2.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput2.setForeground(new java.awt.Color(238, 237, 239));
        posOutput2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput2);

        numOutput3.setEditable(false);
        numOutput3.setBackground(new java.awt.Color(25, 24, 37));
        numOutput3.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput3.setForeground(new java.awt.Color(238, 237, 239));
        numOutput3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput3);

        posOutput3.setEditable(false);
        posOutput3.setBackground(new java.awt.Color(25, 24, 37));
        posOutput3.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput3.setForeground(new java.awt.Color(238, 237, 239));
        posOutput3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput3);

        numOutput4.setEditable(false);
        numOutput4.setBackground(new java.awt.Color(25, 24, 37));
        numOutput4.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput4.setForeground(new java.awt.Color(238, 237, 239));
        numOutput4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput4);

        posOutput4.setEditable(false);
        posOutput4.setBackground(new java.awt.Color(25, 24, 37));
        posOutput4.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput4.setForeground(new java.awt.Color(238, 237, 239));
        posOutput4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput4);

        numOutput5.setEditable(false);
        numOutput5.setBackground(new java.awt.Color(25, 24, 37));
        numOutput5.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput5.setForeground(new java.awt.Color(238, 237, 239));
        numOutput5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput5);

        posOutput5.setEditable(false);
        posOutput5.setBackground(new java.awt.Color(25, 24, 37));
        posOutput5.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput5.setForeground(new java.awt.Color(238, 237, 239));
        posOutput5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput5);

        numOutput6.setEditable(false);
        numOutput6.setBackground(new java.awt.Color(25, 24, 37));
        numOutput6.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput6.setForeground(new java.awt.Color(238, 237, 239));
        numOutput6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput6);

        posOutput6.setEditable(false);
        posOutput6.setBackground(new java.awt.Color(25, 24, 37));
        posOutput6.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput6.setForeground(new java.awt.Color(238, 237, 239));
        posOutput6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput6);

        numOutput7.setEditable(false);
        numOutput7.setBackground(new java.awt.Color(25, 24, 37));
        numOutput7.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput7.setForeground(new java.awt.Color(238, 237, 239));
        numOutput7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput7);

        posOutput7.setEditable(false);
        posOutput7.setBackground(new java.awt.Color(25, 24, 37));
        posOutput7.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput7.setForeground(new java.awt.Color(238, 237, 239));
        posOutput7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput7);

        numOutput8.setEditable(false);
        numOutput8.setBackground(new java.awt.Color(25, 24, 37));
        numOutput8.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput8.setForeground(new java.awt.Color(238, 237, 239));
        numOutput8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput8);

        posOutput8.setEditable(false);
        posOutput8.setBackground(new java.awt.Color(25, 24, 37));
        posOutput8.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput8.setForeground(new java.awt.Color(238, 237, 239));
        posOutput8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput8);

        numOutput9.setEditable(false);
        numOutput9.setBackground(new java.awt.Color(25, 24, 37));
        numOutput9.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput9.setForeground(new java.awt.Color(238, 237, 239));
        numOutput9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput9);

        posOutput9.setEditable(false);
        posOutput9.setBackground(new java.awt.Color(25, 24, 37));
        posOutput9.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput9.setForeground(new java.awt.Color(238, 237, 239));
        posOutput9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput9);

        numOutput10.setEditable(false);
        numOutput10.setBackground(new java.awt.Color(25, 24, 37));
        numOutput10.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        numOutput10.setForeground(new java.awt.Color(238, 237, 239));
        numOutput10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOutput10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(numOutput10);

        posOutput10.setEditable(false);
        posOutput10.setBackground(new java.awt.Color(25, 24, 37));
        posOutput10.setFont(new java.awt.Font("Sitka Heading", 0, 30)); // NOI18N
        posOutput10.setForeground(new java.awt.Color(238, 237, 239));
        posOutput10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posOutput10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        numPosContainer.add(posOutput10);

        GridContainer.add(numPosContainer, java.awt.BorderLayout.LINE_END);

        MainPanel.add(GridContainer);
        GridContainer.setBounds(55, 60, 290, 400);

        KeyboardContainer.setBackground(new java.awt.Color(24, 18, 43));

        buttonIconContainer.setBackground(new java.awt.Color(24, 18, 43));
        buttonIconContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 6));

        jButton1.setBackground(new java.awt.Color(25, 24, 37));
        jButton1.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(238, 237, 239));
        jButton1.setText("1");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton1);

        jButton2.setBackground(new java.awt.Color(25, 24, 37));
        jButton2.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(238, 237, 239));
        jButton2.setText("2");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton2);

        jButton3.setBackground(new java.awt.Color(25, 24, 37));
        jButton3.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(238, 237, 239));
        jButton3.setText("3");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton3);

        jButton4.setBackground(new java.awt.Color(25, 24, 37));
        jButton4.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(238, 237, 239));
        jButton4.setText("4");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton4);

        jButton5.setBackground(new java.awt.Color(25, 24, 37));
        jButton5.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton5.setForeground(new java.awt.Color(238, 237, 239));
        jButton5.setText("5");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton5);

        jButton6.setBackground(new java.awt.Color(25, 24, 37));
        jButton6.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton6.setForeground(new java.awt.Color(238, 237, 239));
        jButton6.setText("6");
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton6);

        jButton7.setBackground(new java.awt.Color(25, 24, 37));
        jButton7.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton7.setForeground(new java.awt.Color(238, 237, 239));
        jButton7.setText("7");
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton7);

        jButton8.setBackground(new java.awt.Color(25, 24, 37));
        jButton8.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton8.setForeground(new java.awt.Color(238, 237, 239));
        jButton8.setText("8");
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton8);

        jButton9.setBackground(new java.awt.Color(25, 24, 37));
        jButton9.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton9.setForeground(new java.awt.Color(238, 237, 239));
        jButton9.setText("9");
        jButton9.setBorderPainted(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton9);

        jButton0.setBackground(new java.awt.Color(25, 24, 37));
        jButton0.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        jButton0.setForeground(new java.awt.Color(238, 237, 239));
        jButton0.setText("0");
        jButton0.setBorderPainted(false);
        jButton0.setFocusPainted(false);
        jButton0.setFocusable(false);
        jButton0.setMaximumSize(new java.awt.Dimension(41, 42));
        jButton0.setMinimumSize(new java.awt.Dimension(41, 42));
        jButton0.setPreferredSize(new java.awt.Dimension(41, 42));
        jButton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton0MouseClicked(evt);
            }
        });
        buttonIconContainer.add(jButton0);

        jPanel4.setBackground(new java.awt.Color(24, 18, 43));
        jPanel4.setFocusable(false);

        backspaceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backspace.png"))); // NOI18N
        backspaceIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backspaceIconMouseClicked(evt);
            }
        });

        enterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow.png"))); // NOI18N
        enterIcon.setEnabled(false);
        enterIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(backspaceIcon)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(backspaceIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout KeyboardContainerLayout = new javax.swing.GroupLayout(KeyboardContainer);
        KeyboardContainer.setLayout(KeyboardContainerLayout);
        KeyboardContainerLayout.setHorizontalGroup(
            KeyboardContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KeyboardContainerLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(buttonIconContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        KeyboardContainerLayout.setVerticalGroup(
            KeyboardContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeyboardContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(KeyboardContainerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buttonIconContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        MainPanel.add(KeyboardContainer);
        KeyboardContainer.setBounds(0, 470, 400, 140);

        hamburgerButton.setBackground(new java.awt.Color(68, 60, 104));
        hamburgerButton.setForeground(new java.awt.Color(68, 60, 104));
        hamburgerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu-burger.png"))); // NOI18N
        hamburgerButton.setBorder(null);
        hamburgerButton.setFocusPainted(false);
        hamburgerButton.setFocusable(false);
        hamburgerButton.setOpaque(false);
        hamburgerButton.setPreferredSize(new java.awt.Dimension(40, 40));
        hamburgerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hamburgerButtonMouseClicked(evt);
            }
        });
        MainPanel.add(hamburgerButton);
        hamburgerButton.setBounds(0, 0, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterIconMouseClicked
        if (!isButtonClickable) {
        return;
        }

        System.out.println("Current Guess: " + currentGuess);

        if (currentGuess == randomNum) {
            System.out.println("You Win");
            numOutput[currentIndex].setText("/");
            posOutput[currentIndex].setText("/");
            System.out.println("You Win");
            YouWinForms youWinForms = new YouWinForms();
            youWinForms.setVisible(true);
            this.setVisible(false);
            this.dispose();
            
        } else {
            if (currentIndex + 1 == 10) {
                int numCorrect = countCorrectDigits(randomNum, currentGuess);
                int numCorrectPos = countCorrectPositions(randomNum, currentGuess);
                numOutput[9].setText(String.valueOf(numCorrect));
                posOutput[9].setText(String.valueOf(numCorrectPos));
                System.out.println("You Failed");
                YouLoseForms youLoseForms = new YouLoseForms();
                youLoseForms.setVisible(true);
                this.setVisible(false);
                this.dispose();
                
                return;
            }

            inputs[currentIndex].setEditable(false);
            inputs[currentIndex].transferFocus();
            enterIcon.setEnabled(false);
            isButtonClickable = false;
            currentIndex++;
            inputs[currentIndex].setEditable(true);
            gameChecker();
        }
        

    }//GEN-LAST:event_enterIconMouseClicked

    private void guessInput1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guessInput1KeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

            enterIcon.dispatchEvent(new MouseEvent(enterIcon, MouseEvent.MOUSE_CLICKED,
                    System.currentTimeMillis(), 0, 0, 0, 1, false, MouseEvent.BUTTON1));
        }
    }//GEN-LAST:event_guessInput1KeyPressed

    // <editor-fold defaultstate="collapsed" desc="On Screen Events">
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_1);
            robot.keyRelease(KeyEvent.VK_1);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_2);
            robot.keyRelease(KeyEvent.VK_2);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_3);
            robot.keyRelease(KeyEvent.VK_3);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_5);
            robot.keyRelease(KeyEvent.VK_5);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_6);
            robot.keyRelease(KeyEvent.VK_6);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_7);
            robot.keyRelease(KeyEvent.VK_7);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_8);
            robot.keyRelease(KeyEvent.VK_8);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_9);
            robot.keyRelease(KeyEvent.VK_9);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton0MouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_0);
            robot.keyRelease(KeyEvent.VK_0);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton0MouseClicked

    private void backspaceIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backspaceIconMouseClicked
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_backspaceIconMouseClicked

    private void hamburgerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hamburgerButtonMouseClicked
        MenuForms menuforms = new MenuForms();
    }//GEN-LAST:event_hamburgerButtonMouseClicked
    // </editor-fold>  

    public static void main(String args[]) {

        
        // <editor-fold defaultstate="collapsed" desc="Generated Code">        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForms().setVisible(true);
//                new GameForms().setVisible(true);
            }
        });
        // </editor-fold>   

    }

    // <editor-fold defaultstate="collapsed" desc="Variable Declaration Code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GridContainer;
    private javax.swing.JPanel KeyboardContainer;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel backspaceIcon;
    private javax.swing.JPanel buttonIconContainer;
    private javax.swing.JLabel enterIcon;
    private javax.swing.JPanel guessContainer;
    private javax.swing.JTextField guessInput1;
    private javax.swing.JTextField guessInput10;
    private javax.swing.JTextField guessInput2;
    private javax.swing.JTextField guessInput3;
    private javax.swing.JTextField guessInput4;
    private javax.swing.JTextField guessInput5;
    private javax.swing.JTextField guessInput6;
    private javax.swing.JTextField guessInput7;
    private javax.swing.JTextField guessInput8;
    private javax.swing.JTextField guessInput9;
    private javax.swing.JButton hamburgerButton;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_Guess;
    private javax.swing.JLabel lbl_numbers;
    private javax.swing.JLabel lbl_positions;
    private javax.swing.JTextField numOutput1;
    private javax.swing.JTextField numOutput10;
    private javax.swing.JTextField numOutput2;
    private javax.swing.JTextField numOutput3;
    private javax.swing.JTextField numOutput4;
    private javax.swing.JTextField numOutput5;
    private javax.swing.JTextField numOutput6;
    private javax.swing.JTextField numOutput7;
    private javax.swing.JTextField numOutput8;
    private javax.swing.JTextField numOutput9;
    private javax.swing.JPanel numPosContainer;
    private javax.swing.JTextField posOutput1;
    private javax.swing.JTextField posOutput10;
    private javax.swing.JTextField posOutput2;
    private javax.swing.JTextField posOutput3;
    private javax.swing.JTextField posOutput4;
    private javax.swing.JTextField posOutput5;
    private javax.swing.JTextField posOutput6;
    private javax.swing.JTextField posOutput7;
    private javax.swing.JTextField posOutput8;
    private javax.swing.JTextField posOutput9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // </editor-fold>   
    @Override
    public void focusGained(FocusEvent fe) {

    }

    @Override
    public void focusLost(FocusEvent fe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void gameChecker() {
        int numCorrect = countCorrectDigits(randomNum, currentGuess);
        int numCorrectPos = countCorrectPositions(randomNum, currentGuess);

        numOutput[currentIndex - 1].setText(String.valueOf(numCorrect));
        posOutput[currentIndex - 1].setText(String.valueOf(numCorrectPos));

    }

    private static int countCorrectDigits(int a, int b) {
        int numCorrect = 0;
        char[] randomNumArr = new char[NUMBER_LENGTH];
        char[] currentGuessArr = new char[NUMBER_LENGTH];

        for (int i = 0; i < NUMBER_LENGTH; i++) {
            randomNumArr[i] = String.valueOf(a).charAt(i);
            currentGuessArr[i] = String.valueOf(b).charAt(i);
        }
        for (int j = 0; j < randomNumArr.length; j++) {
            for (int k = 0; k < currentGuessArr.length; k++) {
                if (randomNumArr[j] == currentGuessArr[k]) {
                    numCorrect++;
                }
            }
        }
        return numCorrect;
    }

    private static int countCorrectPositions(int a, int b) {
        int numCorrectPos = 0;
        char[] randomNumArr = new char[NUMBER_LENGTH];
        char[] currentGuessArr = new char[NUMBER_LENGTH];

        for (int i = 0; i < NUMBER_LENGTH; i++) {
            randomNumArr[i] = String.valueOf(a).charAt(i);
            currentGuessArr[i] = String.valueOf(b).charAt(i);

            if (randomNumArr[i] == currentGuessArr[i]) {
                numCorrectPos++;
            }
        }
        return numCorrectPos;
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 0;

        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(9 - i);
            int digit = digits[index];
            digits[index] = digits[8 - i];
            num = num * 10 + digit;
        }

        return num;
    }
}

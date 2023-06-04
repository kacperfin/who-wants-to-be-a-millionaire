package com.wolvesdevelopment.game;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import com.formdev.flatlaf.FlatLightLaf;

public class MillionaireGameGUI extends JFrame implements ActionListener {
    private Facade facade;
    private JLabel questionLabel;
    private JButton[] answerButtons;
    private JButton lifelineButton;
    private JButton endButton;
    private JLabel moneyLabel1;
    private JLabel moneyLabel2;
    private JLabel moneyLabel3;

    public MillionaireGameGUI() {
        FlatLightLaf.setup();

        facade = new Facade();

        setTitle("Who Wants to Be a Millionaire");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(500, 250));
        setPreferredSize(new Dimension(700, 350));
        setLayout(new BorderLayout());

        JPanel questionPanel = new JPanel();
        questionLabel = new JLabel();
        questionPanel.add(questionLabel);

        JPanel answerPanel = new JPanel(new GridLayout(2, 2));
        answerPanel.setBorder(new EmptyBorder(10, 0, 10, 10));
        answerButtons = new JButton[4];
        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JButton();
            answerButtons[i].addActionListener(this);
            answerPanel.add(answerButtons[i]);
        }

        JPanel leftPanel = new JPanel(new GridLayout(5, 1));
        leftPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        moneyLabel1 = new JLabel();
        moneyLabel2 = new JLabel();
        moneyLabel3 = new JLabel();
        leftPanel.add(moneyLabel1);
        leftPanel.add(moneyLabel2);
        leftPanel.add(moneyLabel3);

        lifelineButton = new JButton("Koło ratunkowe");
        lifelineButton.addActionListener(this);
        leftPanel.add(lifelineButton);

        endButton = new JButton("Zakończ grę");
        endButton.addActionListener(this);
        leftPanel.add(endButton);

        add(questionPanel, BorderLayout.NORTH);
        add(answerPanel, BorderLayout.CENTER);
        add(leftPanel, BorderLayout.WEST);

        pack();
        setLocationRelativeTo(null);

        startNewGame();
        setVisible(true);
    }

    private void startNewGame() {
        facade.startGame();
        showQuestionAndAnswers();
        updateMoney();
    }

    private void showQuestionAndAnswers() {
        questionLabel.setText(facade.getQuestion());
        String[] answers = facade.getAnswers();
        for (int i = 0; i < 4; i++) {
            answerButtons[i].setText(answers[i]);
        }
    }

    private void updateMoney() {
        moneyLabel1.setText( "Grasz o: " + facade.getMoney()[2]);
        moneyLabel2.setText( "Posiadasz: " + facade.getMoney()[1]);
        moneyLabel3.setText( "Nagroda gwarantowana: " + facade.getMoney()[0]);
    }

    private void handleAnswer(int answerIndex) {
        int result = facade.isAnswerCorrect(answerIndex);
        if (result == 0) {
            JOptionPane.showMessageDialog(this, "Błędna odpowiedź! Twoja nagroda gwarantowana to: " + facade.getMoney()[0] + "zł");
            System.exit(0);
        } else if (result == 1) {
            showQuestionAndAnswers();
            updateMoney();

            for (JButton button : answerButtons) {
                button.setEnabled(true);
            }
        } else if (result == 2) {
            JOptionPane.showMessageDialog(this, "Gratulaje! Wygrałeś milion zł!");
            System.exit(0);
        }
    }

    private void useLifeline() {
        facade.useLifebelt();

        int[] answersToHide = facade.getAnswersToHide();

        for (int i : answersToHide) {
            answerButtons[i].setEnabled(false);
        }

        lifelineButton.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lifelineButton) {
            useLifeline();
        }
        else if (e.getSource() == endButton) {
            JOptionPane.showMessageDialog(this, "Congratulations! Kończysz grę z: " + facade.getMoney()[1] + "zł");
            System.exit(0);
        }
        else {
            for (int i = 0; i < 4; i++) {
                if (e.getSource() == answerButtons[i]) {
                    handleAnswer(i);
                    break;
                }
            }
        }
    }
}

package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static SimpleCalculator.keysAndOperationsTypes.keyType.NON_NUMERIC;
import static SimpleCalculator.keysAndOperationsTypes.keyType.NUMERIC;
import static SimpleCalculator.keysAndOperationsTypes.operationType.*;


/**
 * Created by vmishra on 5/14/2018.
 */
public class Calculator extends functions {
    private Float ans = 0f;

    private JButton btnNum1;
    private JButton btnNum2;
    private JButton btnNum3;
    private JButton btnNum4;
    private JButton btnNum5;
    private JButton btnNum6;
    private JButton btnNum7;
    private JButton btnNum8;
    private JButton btnNum9;
    private JButton btnNum0;
    private JButton btnSum;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnDelete;
    private JButton btnClear;
    private JTextArea textAreaResult;
    private JPanel mainPanel;
    private JButton btnMultiply;
    private JButton btnEqual;
    private JButton btnPoint;

    public Calculator() {


        btnNum9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("9");
            }
        });
        btnNum8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("8");
            }
        });

        btnNum7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("7");
            }
        });

        btnNum6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("6");
            }
        });

        btnNum5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("5");
            }
        });

        btnNum4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("4");
            }
        });

        btnNum3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("3");
            }
        });

        btnNum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("2");
            }
        });

        btnNum1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("1");
            }
        });

        btnNum0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyActionPerformed("0");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String typedNumber = textAreaResult.getText();

                setPrevKeyType(NUMERIC);
                Pattern pattern = Pattern.compile("[.]{1}");
                Matcher matcher = pattern.matcher(typedNumber);
                int count = 0;
                while (matcher.find()) {
                    count++;
                }
                if (getPrevKeyType() != NUMERIC) {
                    if (count == 0) {
                        textAreaResult.setText(".");
                    }
                } else {
                    if (count == 0) {
                        textAreaResult.setText(typedNumber + ".");
                    }
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaResult.setText("");
                ans = 0f;
            }
        });

        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationActionPerformed(SUM);
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationActionPerformed(MINUS);
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationActionPerformed(MULTIPLICATION);
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationActionPerformed(DIVIDE);
            }
        });


        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operationActionPerformed(null);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currVal = textAreaResult.getText();
                if (getPrevKeyType() == NUMERIC) {
                    textAreaResult.setText(currVal.substring(0, currVal.length() - 1));
                }
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().mainPanel);
        frame.setVisible(true);
        frame.setSize(300, 400);
    }

    private void operationActionPerformed(operationType ot) {
        float a;
        float b;
        a = ans;
        b = Float.valueOf(textAreaResult.getText());
        if (getPreviousOperationType() != null) {
            ans = callOperation(getPreviousOperationType(), a, b);
            textAreaResult.setText(ans.toString());
        } else {
            ans = Float.valueOf(textAreaResult.getText());
            textAreaResult.setText("");
        }
        setPreviousOperationType(ot);
        setPrevKeyType(NON_NUMERIC);
    }

    private void keyActionPerformed(String num) {
        if (getPrevKeyType() != NUMERIC) {
            textAreaResult.setText(num);
        } else {
            textAreaResult.setText(textAreaResult.getText() + num);
        }
        setPrevKeyType(NUMERIC);
    }
}


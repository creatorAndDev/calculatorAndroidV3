package yuri.kl.com.ua.calculator_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**Переменная текстбокса*/
    EditText calcDialogDisplay;

    /**Переменные кнопок*/
    Button zero, one, two, three, four, five, six, seven, eight, nine,
            division, multiply, plus, subtract, equals, allClear;

    //TextView binary;
    //TextView decimal;
    //TextView addition;

    /**Результат который заносится в масив для обработки*/
    ArrayList<Float> result = new ArrayList<Float>();

    /**Первое введенное число*/
    float number1;

    /**Второе введенное число*/
    float number2;

    int currentOperation = 0;
    int nextOperation;

    /**Сложение*/
    final static int ADD = 1;

    /**Вычитание*/
    final static int SUBTRACT = 2;

    /**Умножение*/
    final static int MULTIPLY = 3;

    /**Деление*/
    final static int DIVISION = 4;

    /**Равно*/
    final static int EQUALS = 5;

//    /**Нахождение целого значение из двоичного числа*/
//    final static int DECIMAL = 6;

//    /**Нахождение двоичного числа из целого*/
//    final static int BINARY = 7;

    final static int CLEAR = 1;
    final static int DONT_CLEAR = 0;
    int clearCalcDisplay = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**Привязываем кнопки/поле по id*/
        zero = (Button) findViewById(R.id.button0);
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six =(Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);

        division =(Button) findViewById(R.id.buttonDiv);
        multiply = (Button) findViewById(R.id.buttonMul);
        plus = (Button) findViewById(R.id.buttonAdd);
        subtract = (Button) findViewById(R.id.buttonSub);
        equals = (Button) findViewById(R.id.buttonEql);

        allClear = (Button) findViewById(R.id.buttonC);

        calcDialogDisplay = (EditText) findViewById(R.id.viewDisplay);
        calcDialogDisplay.setKeyListener(DigitsKeyListener.getInstance(true,true));


        //binary = (TextView) findViewById(R.id.buttonDot);
        //decimal = (TextView) findViewById(R.id.button16);
        //addition = (TextView) findViewById(R.id.addition);


        /**Вызов обработки нажатия на экран*/
        registerListeners();
    }

    /**Метод. Обработка нажатия на экран*/
    public void registerListeners () {

        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (clearCalcDisplay == CLEAR) {
                    calcDialogDisplay.setText("");
                }
                clearCalcDisplay = DONT_CLEAR;
                calcDialogDisplay.append("9");

            }
        });

        division.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!calcDialogDisplay.getText().toString().isEmpty()) {
                    calcLogic(DIVISION);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!calcDialogDisplay.getText().toString().isEmpty()) {
                    calcLogic(MULTIPLY);
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!calcDialogDisplay.getText().toString().isEmpty()) {
                    calcLogic(ADD);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!calcDialogDisplay.getText().toString().isEmpty()) {
                    calcLogic(SUBTRACT);
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!calcDialogDisplay.getText().toString().isEmpty()) {
                    calcLogic(EQUALS);
                }

            }
        });

        allClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                calcDialogDisplay.setText("");
                number1 = 0;
                number2 = 0;
                result.removeAll(result);
                currentOperation = 0;
                nextOperation = 0;
            }
        });

//        decimal.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                calcLogic(DECIMAL);
//            }
//        });

//        binary.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                calcLogic(BINARY);
//
//            }
//        });
    }

    /*Функция перевода из десятичного в двоичное значение*/
//    private float decToBin(float bin) {
//        int i, b;
//        long result = 0;
//
//        for(i=0; bin > 0; i++)  {
//            b = (int) (bin % 2);
//            bin = (bin-b)/2;
//            result += b * Math.pow(10,i);
//        }
//        return result;
//    }

    /*Функция перевода из двличного в десятичное значение*/
//    private float binToDec(float dec) {
//        int result = 0;
//        int mult = 1;
//
//        while(dec > 0) {
//            result += mult * ((int)dec % 10);
//            dec /= 10;
//            mult *= 2;
//        }
//        return result;
//    }

    /**Функция расчета введенных значений*/
    private void calcLogic(int operator) {

        result.add(Float.parseFloat(calcDialogDisplay.getText().toString()));

        if (operator != EQUALS) {
            nextOperation = operator;
        }else if (operator == EQUALS){
            nextOperation = 0;
        }

        switch (currentOperation) {

            /**Прибавление*/
            case ADD:
                number1 = result.get(0);
                number2 = result.get(1);

                result.removeAll(result);

                result.add(number1 + number2);

                calcDialogDisplay.setText(String.format("%.0f", result.get(0)));
                break;

            /**Вычитание*/
            case SUBTRACT:
                number1 = result.get(0);
                number2 = result.get(1);

                result.removeAll(result);

                result.add(number1 - number2);

                calcDialogDisplay.setText(String.format("%.0f", result.get(0)));
                break;

            /**Умножение*/
            case MULTIPLY:
                number1 = result.get(0);
                number2 = result.get(1);

                result.removeAll(result);

                result.add(number1 * number2);

                calcDialogDisplay.setText(String.format("%.0f", result.get(0)));
                break;

            /**Деление*/
            case DIVISION:
                number1 = result.get(0);
                number2 = result.get(1);

                result.removeAll(result);

                result.add(number1 / number2);

                calcDialogDisplay.setText(String.format("%.0f", result.get(0)));
                break;

//          /**Получание двоичного числа*/
//            case DECIMAL:
//                number2 = result.get(1);
//
//                result.removeAll(result);
//
//                result.add(decToBin(number2));
//
//                calcDialogDisplay.setText(String.format("%.0f", result.get(0)));
//                break;

//            /**Получение десятичного числа*/
//            case BINARY:
//                number2 = result.get(1);
//
//                result.removeAll(result);
//
//                result.add(binToDec(number2));
//
//                calcDialogDisplay.setText(String.format("%.0f", result.get(0)));
//                break;
        }

        clearCalcDisplay = CLEAR;
        currentOperation = nextOperation;
        if (operator == EQUALS) {
            number1 = 0;
            number2 = 0;
            result.removeAll(result);
        }
    }
}
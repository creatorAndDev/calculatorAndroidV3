package yuri.kl.com.ua.calculator_one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //текстовое поле для вывода результата
    TextView resultField;

    //поле для ввода числа
    EditText numberField;

    //кнопки чисел
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    //кнопки операций
    Button multiply, divide, minus, plus, equally, clearAll;

    //доп операции
    Button square, cubed, precent, dot;

    //Результат который заносится в масив для обработки
    //ArrayList<Float> result = new ArrayList<Float>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // получаем все поля по id из activity_main.xml
        resultField = (TextView) findViewById(R.id.resultField);
        numberField = (EditText) findViewById(R.id.numberField);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        minus = (Button) findViewById(R.id.minus);
        plus = (Button) findViewById(R.id.plus);
        equally = (Button) findViewById(R.id.equally);
        clearAll = (Button) findViewById(R.id.clearAll);

        //Вызов обработки нажатия на экран//
        registerListeners();
    }

    //метод - обработка нажатия на экран
    public void registerListeners () {
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numberField.getText().toString().equals("")) {
                    // Здесь код, если EditText пуст
                    numberField.setText("");
                } else {
                    // если есть текст, то здесь другой код
                    numberField.append(button0.getText());
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button1.getText());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button2.getText());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button3.getText());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button4.getText());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button5.getText());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button6.getText());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button7.getText());
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button8.getText());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberField.append(button9.getText());
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numberField.getText().toString().equals("")) {
                    // Здесь код, если EditText пуст
                    numberField.setText("");
                } else {
                    // если есть текст, то здесь другой код
//                    numberField.setText(numberField.getText().toString() + plus.getText());
                }
            }
        });
    }


    //обработка нажатия очистки экрана
    public void onClear(View view) {
        numberField.setText("");
    }
}
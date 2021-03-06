package yuri.kl.com.ua.calculator_one;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //создаем счетчик наших операторов
    int currentOperation = 0;

    //операторы, case'ы для switch
    final static int ADD = 1;

    // флаг проверки нажатия, false - не нажималась
    boolean isPressed = false;

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
    ArrayList<Float> result = new ArrayList<Float>();

    //первое введенное число
    float number1;

    //второе введенное число
    float number2;

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

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        equally = (Button) findViewById(R.id.equally);
        clearAll = (Button) findViewById(R.id.clearAll);

//        numberField.setKeyListener(DigitsKeyListener.getInstance(true,true));

        //Вызов обработки нажатия на экран//
        //устанавливаем один обработчик для всех кнопок
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        plus.setOnClickListener(this);
    }

    // Метод для слушателя, который имплементируется от основного класса. Всего один метод для всех кнопок
    @Override
    public void onClick(View v){

        // Анализируем, какая кнопка была нажата.
        switch (v.getId()) {
            case R.id.button0:
                //проверяем не пустое ли поле ввода. Если пустое, тогда не ставим 0, иначе ставим.
                if (!numberField.getText().toString().equals("")) {
                    numberField.append(button0.getText());
                }
                break;

            case R.id.button1:
                numberField.append(button1.getText());
                break;

            case R.id.button2:
                numberField.append(button2.getText());
                break;

            case R.id.button3:
                numberField.append(button3.getText());
                break;

            case R.id.button4:
                numberField.append(button4.getText());
                break;

            case R.id.button5:
                numberField.append(button5.getText());
                break;

            case R.id.button6:
                numberField.append(button6.getText());
                break;

            case R.id.button7:
                numberField.append(button7.getText());
                break;

            case R.id.button8:
                numberField.append(button8.getText());
                break;

            case R.id.button9:
                numberField.append(button9.getText());
                if (isPressed == true) {
                    resultField.setText("Test 2");
                }
                break;

            case R.id.plus:
                if (!numberField.getText().toString().equals("")) {
                    // действие, когда кнопка нажималась хотя бы раз
                    if (isPressed == false) {
                        // действия, когда кнопка нажималась хотя бы раз
                        calcLogic(ADD);
                    }
                }

                /**шаб проверки на пустое поле из двух рядов*/
//                if (numberField.getText().toString().equals("")) {
//                    // Здесь код, если EditText пуст
//                    numberField.setText("");
//                } else {
//                    //передаем методу счетчика операторов наш оператор
//                    calcLogic(ADD);
//                    // если есть текст, то здесь другой код
//                }
                /** */
                break;
        }
    }

    //метод для счета чисел
    private void calcLogic(int operator) {
        //записываем по клику число/символ в переменную result
//         result.add(Float.parseFloat(numberField.getText().toString()));


        //при помощи switch находим нужный нам case (наш оператор под нужным числом который ранее сохранили)
        switch (operator) {
            case ADD:
                //выводим знак оператора
                numberField.append(plus.getText());


                //заносим числа введенных чисел в ячейку number1 и второе число в number2 и берем текущий оператор
//                toCount(number1, number2, ADD);

//                number1 = result.get(0);
//                number2 = result.get(1);

//                result.removeAll(result);

//                result.add(number1 + number2);

//                numberField.setText(String.format("%.0f", result.get(0)));

                //ставим флаг что была нажата
                isPressed = true;

                break;
        }
    }

    //метод счета
    public void toCount(float number1, float number2, int operator) {
//        result.add(Float.parseFloat(numberField.getText().toString()));

        switch (operator) {
            case ADD:
                resultField.setText("Test 1");

                break;
        }
    }

    //обработка нажатия очистки экрана
    public void onClear(View view) {
        numberField.setText("");
        resultField.setText("0");
        result.removeAll(result);
        isPressed = false;
    }
}
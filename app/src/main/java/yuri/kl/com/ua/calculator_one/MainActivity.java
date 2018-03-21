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

    final static int ADD = 1;

    //Результат который заносится в масив для обработки
    //ArrayList<Float> result = new ArrayList<Float>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // получаем все поля по id из activity_main.xml
        resultField =(TextView) findViewById(R.id.resultField);
        numberField = (EditText) findViewById(R.id.numberField);
    }

    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // получаем все поля по id из activity_main.xml
        resultField =(TextView) findViewById(R.id.resultField);
        numberField = (EditText) findViewById(R.id.numberField);
    }

    // обработка нажатия на числовую кнопку
    public void onNumberClick(View view){
        Button button = (Button) view;
        numberField.append(button.getText());
    }

    //обработка нажатия на операции
    public void onOperationClick(View view){
        Button button = (Button) view;
        String buttonValue = button.getText().toString();

        if (numberField.getText().toString() == "") {
            numberField.setText("");
        }

        switch (numberField) {
            case ADD:
//                buttonValue =+ buttonValue;
                break;
        }

//        numberField.setText(numberField.getText() + buttonValue);
//        resultField.setText();
    }

    //обработка нажатия на равно, результат
    public void onResult(View view){

    }

    //обработка нажатия очистки экрана
    public void onClear(View view) {
        numberField.setText("");
    }
}

//https://metanit.com/java/android/4.13.php
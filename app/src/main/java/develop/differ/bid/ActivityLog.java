package develop.differ.bid;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityLog extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        Log.d("MyAppLog", "Log My App");

        try {
            // Код, который может вызвать ошибку
            int[] numbers = {1, 2, 3};
            Log.d("MyAppLog", "numbers[3] = " + numbers[3]); // Попытка доступа к несуществующему индексу массива

        } catch (ArrayIndexOutOfBoundsException e) {
            // Код для обработки исключения
            Log.e("MyAppLog","ArrayIndexOutOfBoundsException " + e);
        }

    }
}

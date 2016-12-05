package by.bsu.fpm.atroschens.lab32;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUrl = (EditText) findViewById(R.id.edit_url);
    }


    public void onGoClick(View view) {
        try {
            String text = editUrl.getText().toString();
            Uri uri = Uri.parse(text);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        } catch (Exception ex) {
            editUrl.setError(ex.getLocalizedMessage());
        }
    }
}

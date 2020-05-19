package nebiyou.imageandvideoviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnplaysound, btnloadimage, btnplayvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnplaysound(android.view.View button) {
        Intent intent = new Intent(this, PlaySoundActivity.class);
        startActivity(intent);
    }

    public void btnloadimage(android.view.View button) {
        Intent intent = new Intent(this, ImageLoadActivity.class);
        startActivity(intent);
    }

    public void btnplayvideo(android.view.View button) {
        Intent intent = new Intent(this, PlayVideoActivity.class);
        startActivity(intent);
    }

}


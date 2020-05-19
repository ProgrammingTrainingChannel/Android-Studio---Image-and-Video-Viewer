package nebiyou.imageandvideoviewer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public class PlayVideoActivity extends AppCompatActivity {
    Button btnplayvideo;
    VideoView videoViewvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        btnplayvideo=(Button)findViewById(R.id.btnplayvideo);
        videoViewvideo=(VideoView) findViewById(R.id.videoViewvideo);
    }

    public void btnplayvideo(android.view.View Button){
        VideoView videoViewTraining = (VideoView) findViewById(R.id.videoViewvideo);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.training);
        videoViewTraining.setVideoURI(uri);
        videoViewTraining.start();
    }
}

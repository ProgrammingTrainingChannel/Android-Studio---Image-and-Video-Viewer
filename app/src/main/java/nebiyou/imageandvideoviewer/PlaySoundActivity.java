package nebiyou.imageandvideoviewer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class PlaySoundActivity extends AppCompatActivity {
    Button btnplayCheeringSound,btnplayinCorrectSound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_sound);

        btnplayCheeringSound=(Button) findViewById(R.id.btnplayCheeringSound);
        btnplayinCorrectSound=(Button) findViewById(R.id.btnplayinCorrectSound);

    }

    public void BtnplayCheeringSound(android.view.View Button)
    {
        final SoundPlayer soundPlayer = new SoundPlayer(this);
        final Context context = this;
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    soundPlayer.PlayCheeringSound();
                }
            }
        };
        timerThread.start();
    }

    public void BtnplayinCorrectSound(android.view.View Button)
    {
        final SoundPlayer soundPlayer = new SoundPlayer(this);
        final Context context = this;
        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                finally{
                    soundPlayer.PlayinCorrectSound();
                }
            }
        };
        timerThread.start();
    }
}

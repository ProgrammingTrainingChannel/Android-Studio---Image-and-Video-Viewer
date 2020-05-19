package nebiyou.imageandvideoviewer;

import android.content.res.AssetManager;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class ImageLoadActivity extends AppCompatActivity {
    Button btnloadimage;
    ImageView imgvwlogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_load);

        btnloadimage=(Button) findViewById(R.id.btnloadimage);
        imgvwlogo=(ImageView)findViewById(R.id.imgvwlogo);
    }

    private void LoadImage(String filename, ImageView imageView){
        AssetManager assetManager = getAssets();
        try {
            InputStream image = assetManager.open(filename);
            imageView.setImageBitmap(BitmapFactory.decodeStream(image));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void btnLoadImage(android .view.View button){
        LoadImage("home.png", imgvwlogo);
    }

}

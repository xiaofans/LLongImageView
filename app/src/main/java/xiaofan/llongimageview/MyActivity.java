package xiaofan.llongimageview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import xiaofan.llongimageview.view.SubsamplingScaleImageView;


public class MyActivity extends ActionBarActivity {

    private SubsamplingScaleImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        setUpViews();
    }

    private void setUpViews() {
        imageView = (SubsamplingScaleImageView) findViewById(R.id.large_imageview_local);
        imageView.setFitScreen(true);
        imageView.setImageUrl("http://ww1.sinaimg.cn/bmiddle/61e9ece0gw1ekolcnx770j20c8c2akjm.jpg");
       // imageView.setScaleAndCenter(2.0f,new PointF(540f,0f));
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

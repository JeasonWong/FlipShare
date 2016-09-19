package me.wangyuwei.flipshare;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnLeftTop;
    private Button mBtnMiddleTop;
    private Button mBtnRightTop;
    private Button mBtnLeftBottom;
    private Button mBtnMiddleBottom;
    private Button mBtnRightBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLeftTop = (Button) findViewById(R.id.btn_left_top);
        mBtnMiddleTop = (Button) findViewById(R.id.btn_middle_top);
        mBtnRightTop = (Button) findViewById(R.id.btn_right_top);
        mBtnLeftBottom = (Button) findViewById(R.id.btn_left_bottom);
        mBtnMiddleBottom = (Button) findViewById(R.id.btn_middle_bottom);
        mBtnRightBottom = (Button) findViewById(R.id.btn_right_bottom);
        mBtnLeftTop.setOnClickListener(this);
        mBtnMiddleTop.setOnClickListener(this);
        mBtnRightTop.setOnClickListener(this);
        mBtnLeftBottom.setOnClickListener(this);
        mBtnMiddleBottom.setOnClickListener(this);
        mBtnRightBottom.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_left_top:
                FlipShareView share = new FlipShareView.Builder(this, mBtnLeftTop)
                        .addItem(new ShareItem("Facebook", Color.WHITE, 0xff43549C, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_facebook)))
                        .addItem(new ShareItem("Twitter", Color.WHITE, 0xff4999F0, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_twitter)))
                        .addItem(new ShareItem("Google+", Color.WHITE, 0xffD9392D, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_google)))
                        .addItem(new ShareItem("http://www.wangyuwei.me", Color.WHITE, 0xff57708A))
                        .setBackgroundColor(0x60000000)
                        .create();

                share.setOnFlipClickListener(new FlipShareView.OnFlipClickListener() {
                    @Override
                    public void onItemClick(int position) {
                        Toast.makeText(MainActivity.this, "position " + position + " is clicked.", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void dismiss() {

                    }
                });

                break;
            case R.id.btn_middle_top:

                new FlipShareView.Builder(this, mBtnMiddleTop)
                        .addItem(new ShareItem("Facebook", Color.WHITE, 0xff43549C, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_facebook)))
                        .addItem(new ShareItem("Wangyuwei", Color.WHITE, 0xff4999F0))
                        .addItem(new ShareItem("Wangyuweiwangyuwei", Color.WHITE, 0xffD9392D))
                        .addItem(new ShareItem("纯文字也可以", Color.WHITE, 0xff57708A))
                        .setAnimType(FlipShareView.TYPE_HORIZONTAL)
                        .create();
                break;
            case R.id.btn_right_top:
                new FlipShareView.Builder(this, mBtnRightTop)
                        .addItem(new ShareItem("Facebook", Color.WHITE, 0xff43549C, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_facebook)))
                        .addItem(new ShareItem("Twitter", Color.WHITE, 0xff4999F0, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_twitter)))
                        .addItem(new ShareItem("Google+", Color.WHITE, 0xffD9392D, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_google)))
                        .addItem(new ShareItem("http://www.wangyuwei.me", Color.WHITE, 0xff57708A))
                        .setItemDuration(500)
                        .setBackgroundColor(0x60000000)
                        .setAnimType(FlipShareView.TYPE_SLIDE)
                        .create();
                break;
            case R.id.btn_left_bottom:
                new FlipShareView.Builder(this, mBtnLeftBottom)
                        .addItem(new ShareItem("Facebook"))
                        .addItem(new ShareItem("Twitter"))
                        .addItem(new ShareItem("Google+"))
                        .addItem(new ShareItem("http://www.wangyuwei.me", Color.WHITE, 0xff57708A))
                        .addItem(new ShareItem("http://www.wangyuwei.me", Color.WHITE, 0xff57708A))
                        .setSeparateLineColor(0x30000000)
                        .setAnimType(FlipShareView.TYPE_HORIZONTAL)
                        .create();
                break;
            case R.id.btn_middle_bottom:
                FlipShareView shareBottom = new FlipShareView.Builder(this, mBtnMiddleBottom)
                        .addItem(new ShareItem("Facebook"))
                        .addItem(new ShareItem("Twitter"))
                        .addItem(new ShareItem("Google+"))
                        .addItem(new ShareItem("http://www.wangyuwei.me", Color.WHITE, 0xff57708A))
                        .setSeparateLineColor(0x30000000)
                        .setBackgroundColor(0x60000000)
                        .setAnimType(FlipShareView.TYPE_SLIDE)
                        .create();
                shareBottom.setOnFlipClickListener(new FlipShareView.OnFlipClickListener() {
                    @Override
                    public void onItemClick(int position) {
                        Toast.makeText(MainActivity.this, "position " + position + " is clicked.", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void dismiss() {

                    }
                });
                break;
            case R.id.btn_right_bottom:
                new FlipShareView.Builder(this, mBtnRightBottom)
                        .addItem(new ShareItem("Facebook", Color.WHITE, 0xff43549C, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_facebook)))
                        .addItem(new ShareItem("Twitter", Color.WHITE, 0xff4999F0, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_twitter)))
                        .addItem(new ShareItem("Google+", Color.WHITE, 0xffD9392D, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_google)))
                        .addItem(new ShareItem("http://www.wangyuwei.me", Color.WHITE, 0xff57708A))
                        .create();
                break;
        }
    }
}

package com.andrewgiang.textspritzer.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.SeekBar;

import com.andrewgiang.textspritzer.lib.SpritzerTextView;

public class MainActivity extends ActionBarActivity {

    public static final String TAG = MainActivity.class.getName();
    private SpritzerTextView mSpritzerTextView;
    private SeekBar mSeekBarTextSize;
    private SeekBar mSeekBarWpm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpritzerTextView = (SpritzerTextView) findViewById(R.id.spritzTV);
        mSpritzerTextView.setSpritzText("OpenSpritz has nothing to do with Spritz Incorporated. " +
                "This is an open source, community created project, made with love because Spritz is " +
                "such an awesome technique for reading with.");
        mSeekBarTextSize = (SeekBar) findViewById(R.id.seekBarTextSize);
        mSeekBarWpm = (SeekBar) findViewById(R.id.seekBarWpm);

        setupSeekBars();
        mSeekBarWpm.setProgress(mSpritzerTextView.getWpm());
        mSeekBarTextSize.setProgress((int) mSpritzerTextView.getTextSize());

    }

    private void setupSeekBars() {
        if (mSeekBarWpm != null && mSeekBarTextSize != null) {
            mSeekBarWpm.setMax(mSpritzerTextView.getWpm() * 2);

            mSeekBarTextSize.setMax((int) mSpritzerTextView.getTextSize() * 2);
            mSeekBarWpm.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if (progress > 0) {
                        mSpritzerTextView.setWpm(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });
            mSeekBarTextSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    mSpritzerTextView.setTextSize(progress);

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
    }


}

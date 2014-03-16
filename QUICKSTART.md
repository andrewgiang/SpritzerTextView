Quick Start Guide
===========

Usage
------------

This library is released to maven central as an `aar` so all you need to do is add the following dependency to your `build.gradle`

```
dependencies {  
    compile 'com.andrewgiang.spritzertextview:library:(insert latest version)'
}
```

###Add the SpritzerTextView to your layout

```
    <com.andrewgiang.textspritzer.lib.SpritzerTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:typeface="monospace"
        app:clickControls="true"/>
```
######Note:
* Font must be a monospaced type font
* Add ```xmlns:app="http://schemas.android.com/apk/res-auto"``` to your root layout to use `clickControls`



#### Retrieve the view

```
final SpritzerTextView spritzerTV = (SpritzerTextView) findViewById(R.id.spritzTV);

```
####Set Spritzter Text
```
 spritzerTV.setSpritzText("add the spritz text here");
```

####Play and Pause the Spritzer

```
spritzerTV.play(); // Play the text set in method setSpritzText()
spritzerTV.pause(); // Pauses the spritzer can be resumed with the play() method
```

Customizations
------------

###Set a `OnClickControlsListener` listener
```
spritzerTV.setOnClickControlListener(new SpritzerTextView.OnClickControlListener() {

            /** This listener will be called when a user clicks on the
              * TextView  to play or pause the spritzer, it will only work
              * if clickControls are enabled
              */
            @Override
            public void onPause() {
                Toast.makeText(MainActivity.this, "Spritzer has been paused", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onPlay() {
                Toast.makeText(MainActivity.this, "Spritzer is playing", Toast.LENGTH_SHORT).show();

            }
        });
```

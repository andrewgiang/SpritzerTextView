SpritzerTextView   
============
[![Build Status](https://travis-ci.org/andrewgiang/SpritzerTextView.png?branch=master)](https://travis-ci.org/andrewgiang/SpritzerTextView)    
A simplified TextView wrapper that uses the Spritzer from  [OpenSpritz-Android](https://github.com/OnlyInAmerica/OpenSpritz-Android) to "spritz" text. 

Note: This library has nothing to do with SpritzInc. 

![SpritzerTextView example](http://i.imgur.com/2fXxNcm.gif)

Usage
------------
######This library is a preview, api may change between versions.

The library is released to maven central as an aar so all your need to do is add the following dependency to your build.gradle

```
dependencies {  
    compile 'com.andrewgiang.spritzertextview:library:0.1.0'
}
```

Add to your layout

```
 <!-- Add xmlns:app="http://schemas.android.com/apk/res-auto" to your root layout to use clickControls attribute
 
  Note: clickControls is optional and defaults to false, 
  if set to true the TextView will act a simple play/pause button when clicked. -->

    <com.andrewgiang.textspritzer.lib.SpritzerTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:clickControls="true"
        />
```

Note:  


Set Spritz Text and play or pause


```
 final SpritzerTextView view = (SpritzerTextView) findViewById(R.id.spritzTV);
 view.setSpritzText("add the spritz text here");
 view.play(); // Play the text set in method setSpritzText()
 view.pause(); // Pauses the spritzer can be resumed with the play() method
```


Contributing
------------
Please feel free to fork and contribute in any way. 


License
------------
```
                    GNU GENERAL PUBLIC LICENSE
                       Version 3, 29 June 2007

 Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.

                            Preamble

  The GNU General Public License is a free, copyleft license for
software and other kinds of works.

  The licenses for most software and other practical works are designed
to take away your freedom to share and change the works.  By contrast,
the GNU General Public License is intended to guarantee your freedom to
share and change all versions of a program--to make sure it remains free
software for all its users.  We, the Free Software Foundation, use the
GNU General Public License for most of our software; it applies also to
any other work released this way by its authors.  You can apply it to
your programs, too.
```

SpritzerTextView   
============
[![Build Status](https://travis-ci.org/andrewgiang/SpritzerTextView.png?branch=master)](https://travis-ci.org/andrewgiang/SpritzerTextView)    
A simplified TextView wrapper that uses the Spritzer from  [OpenSpritz-Android](https://github.com/OnlyInAmerica/OpenSpritz-Android) to "spritz" text. 

Note: This library has nothing to do with SpritzInc. 

![SpritzerTextView example](http://i.imgur.com/mkeViYY.gif)

Usage
------------
######This library is a preview, api may change between versions.

The library is released to maven central as an aar so all your need to do is add the following dependency to your build.gradle

```
dependencies {  
    compile 'com.andrewgiang.spritzertextview:library:0.2.0+'
}
```

Add to your layout, be sure to use a monospaced font

```
 <!-- Add xmlns:app="http://schemas.android.com/apk/res-auto" 
      to your root layout to use clickControls attribute -->
      
<!-- Note: clickControls is optional and defaults to false, 
  if set to true the TextView will act a simple play/pause button when clicked. -->

    <com.andrewgiang.textspritzer.lib.SpritzerTextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:typeface="monospace"
        app:clickControls="true"
        />
```

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
Copyright [2014] [Andrew Giang]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

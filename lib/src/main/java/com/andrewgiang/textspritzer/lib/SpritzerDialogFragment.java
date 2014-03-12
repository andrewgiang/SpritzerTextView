package com.andrewgiang.textspritzer.lib;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by andrewgiang on 3/12/14.
 */
public class SpritzerDialogFragment extends DialogFragment {

    private static final String ARG_SPRITZER_TEXT = "key_spritzer_text";
    private SpritzerTextView mSpritzerTextView;

    public static SpritzerDialogFragment newInstance(String text) {
        SpritzerDialogFragment frag = new SpritzerDialogFragment();

        frag.setStyle(DialogFragment.STYLE_NO_TITLE, 0);
        Bundle args = new Bundle();
        args.putString(ARG_SPRITZER_TEXT, text);
        frag.setArguments(args);

        return frag;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.spritzer_dialog_fragment, container);
        mSpritzerTextView = (SpritzerTextView) root.findViewById(R.id.spriter_text_view);

        mSpritzerTextView.setSpritzText(getArguments().getString(ARG_SPRITZER_TEXT));
        return root;

    }
}

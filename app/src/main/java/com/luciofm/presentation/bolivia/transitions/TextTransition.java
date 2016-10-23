package com.luciofm.presentation.bolivia.transitions;

import android.transition.Transition;
import android.transition.TransitionValues;

/**
 * Created by luciofm on 18/10/16.
 */

public class TextTransition extends Transition {
    private static final String PROPERTY_BOUNDS = "textTransition:bounds";
    private static final String PROPERTY_POSITION = "textTransition:position";
    private static final String PROPERTY_TEXTSIZE = "textTransition:size";
    private static final String PROPERTY_IMAGE = "textTransition:image";

    private static final String[] TRANSITION_PROPERTIES = {
            PROPERTY_BOUNDS,
            PROPERTY_POSITION,
            PROPERTY_TEXTSIZE
    };

    @Override
    public void captureStartValues(TransitionValues transitionValues) {

    }

    @Override
    public void captureEndValues(TransitionValues transitionValues) {

    }
}

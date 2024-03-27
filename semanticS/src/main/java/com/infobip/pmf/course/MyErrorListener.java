package com.infobip.pmf.course;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class MyErrorListener extends BaseErrorListener {

    SemVerValidator validator;

    public MyErrorListener(SemVerValidator sval) {

        validator = sval;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        validator.message = msg;
    }
}

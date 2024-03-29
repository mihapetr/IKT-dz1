package com.infobip.pmf.course;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;

public class SemVerValidator {

    public String major, minor, patch, build, message;
    public ArrayList<String> pre = new ArrayList<>();

    public String validate(String sample) {

        // resetting values
        message = major = minor = patch  = build = null;
        pre.clear();

        SemVerLexer lexer = new SemVerLexer(CharStreams.fromString(sample));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SemVerParser parser = new SemVerParser(tokens);
        // adding custom listener
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener(this));

        // Parser will report via message if the form isn't correct
        ParseTree tree = parser.compilationUnit();

        // Walking the tree and reading values
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener(this);
        walker.walk(listener, tree);

        return message;
    }

    @Deprecated
    public String getData() {

        return "major %s, minor %s, patch %s, pre %s, build %s".formatted(
                major, minor, patch, pre.toString(), build
        );
    }
}

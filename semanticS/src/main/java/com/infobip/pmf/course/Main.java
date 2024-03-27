package com.infobip.pmf.course;

import com.infobip.pmf.course.SemVerLexer;
import com.infobip.pmf.course.SemVerParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Map;

public class Main {



    static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Service s = new Service();
        Map<String, String> m1 = new HashMap<>();
        Map<String, String> m2 = new HashMap<>();
        m1.put("v", "0.3.12-ab.cd--+23-");
        m1.put("type", "MAJOR");

        print(s.processNext(m1));

        m1.put("type", "MINOR");
        print(s.processNext(m1));

        m1.put("type", "PATCH");
        print(s.processNext(m1));

        m1.put("v", "0.01.3");
        print(s.processNext(m1));

        m1.put("typ", "");
        print(s.processNext(m1));

        print("---- max ----");

        m2.put("v1", "0.3.13");
        m2.put("v2", "0.4.12");
        print(s.processMax(m2));

        m2.put("v1", "0.4.234");
        m2.put("v2", "0.4.234-bebe.haha+23");
        print(s.processMax(m2));
    }
}

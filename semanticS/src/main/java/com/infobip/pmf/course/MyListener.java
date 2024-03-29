package com.infobip.pmf.course;

public class MyListener extends SemVerBaseListener {

    SemVerValidator validator;

    public MyListener(SemVerValidator sval) {

        validator = sval;
    }

    @Override
    public void enterMajor(SemVerParser.MajorContext ctx) {
        String value = ctx.getText();
        //System.out.println("Major: " + value);
        validator.major = value;
    }

    @Override
    public void enterMinor(SemVerParser.MinorContext ctx) {
        String value = ctx.getText();
        //System.out.println("Minor: " + value);
        validator.minor = value;
    }

    @Override
    public void enterPatch(SemVerParser.PatchContext ctx) {
        String value = ctx.getText();
        //System.out.println("Patch: " + value);
        validator.patch = value;
    }

    @Override
    public void enterPre_release_id(SemVerParser.Pre_release_idContext ctx) {
        String value = ctx.getText();
        //System.out.println("Pre: " + value);
        validator.pre.add(value);
    }

    @Override
    public void enterBuild(SemVerParser.BuildContext ctx) {
        String value = ctx.getText();
        //System.out.println("Build: " + value);
        validator.build = value;
    }


}

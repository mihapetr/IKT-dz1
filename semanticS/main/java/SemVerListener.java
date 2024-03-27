// Generated from SemVer.g4 by ANTLR 4.7.1
package com.infobip.pmf.course;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SemVerParser}.
 */
public interface SemVerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SemVerParser#anum_id}.
	 * @param ctx the parse tree
	 */
	void enterAnum_id(SemVerParser.Anum_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#anum_id}.
	 * @param ctx the parse tree
	 */
	void exitAnum_id(SemVerParser.Anum_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#numeric_id}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_id(SemVerParser.Numeric_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#numeric_id}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_id(SemVerParser.Numeric_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#sem_ver}.
	 * @param ctx the parse tree
	 */
	void enterSem_ver(SemVerParser.Sem_verContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#sem_ver}.
	 * @param ctx the parse tree
	 */
	void exitSem_ver(SemVerParser.Sem_verContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#version_core}.
	 * @param ctx the parse tree
	 */
	void enterVersion_core(SemVerParser.Version_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#version_core}.
	 * @param ctx the parse tree
	 */
	void exitVersion_core(SemVerParser.Version_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#major}.
	 * @param ctx the parse tree
	 */
	void enterMajor(SemVerParser.MajorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#major}.
	 * @param ctx the parse tree
	 */
	void exitMajor(SemVerParser.MajorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#minor}.
	 * @param ctx the parse tree
	 */
	void enterMinor(SemVerParser.MinorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#minor}.
	 * @param ctx the parse tree
	 */
	void exitMinor(SemVerParser.MinorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#patch}.
	 * @param ctx the parse tree
	 */
	void enterPatch(SemVerParser.PatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#patch}.
	 * @param ctx the parse tree
	 */
	void exitPatch(SemVerParser.PatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#pre_release}.
	 * @param ctx the parse tree
	 */
	void enterPre_release(SemVerParser.Pre_releaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#pre_release}.
	 * @param ctx the parse tree
	 */
	void exitPre_release(SemVerParser.Pre_releaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#dot_sep_pre_release}.
	 * @param ctx the parse tree
	 */
	void enterDot_sep_pre_release(SemVerParser.Dot_sep_pre_releaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#dot_sep_pre_release}.
	 * @param ctx the parse tree
	 */
	void exitDot_sep_pre_release(SemVerParser.Dot_sep_pre_releaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#pre_release_id}.
	 * @param ctx the parse tree
	 */
	void enterPre_release_id(SemVerParser.Pre_release_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#pre_release_id}.
	 * @param ctx the parse tree
	 */
	void exitPre_release_id(SemVerParser.Pre_release_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuild(SemVerParser.BuildContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuild(SemVerParser.BuildContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemVerParser#build_id}.
	 * @param ctx the parse tree
	 */
	void enterBuild_id(SemVerParser.Build_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemVerParser#build_id}.
	 * @param ctx the parse tree
	 */
	void exitBuild_id(SemVerParser.Build_idContext ctx);
}
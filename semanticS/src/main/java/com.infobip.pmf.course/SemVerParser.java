// Generated from SemVer.g4 by ANTLR 4.7.1
package com.infobip.pmf.course;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SemVerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39;
	public static final int
		RULE_compilationUnit = 0, RULE_version_core = 1, RULE_major = 2, RULE_minor = 3, 
		RULE_patch = 4, RULE_pre_release = 5, RULE_dot_sep_pre_release = 6, RULE_pre_release_id = 7, 
		RULE_build = 8, RULE_build_id = 9, RULE_anum_id = 10, RULE_numeric_id = 11, 
		RULE_number = 12, RULE_nonzero = 13, RULE_anum = 14, RULE_zero = 15;
	public static final String[] ruleNames = {
		"compilationUnit", "version_core", "major", "minor", "patch", "pre_release", 
		"dot_sep_pre_release", "pre_release_id", "build", "build_id", "anum_id", 
		"numeric_id", "number", "nonzero", "anum", "zero"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'+'", "'.'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", 
		"'7'", "'8'", "'9'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", 
		"'h'", "'i'", "'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", 
		"'r'", "'s'", "'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SemVer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SemVerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public Version_coreContext version_core() {
			return getRuleContext(Version_coreContext.class,0);
		}
		public Pre_releaseContext pre_release() {
			return getRuleContext(Pre_releaseContext.class,0);
		}
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				version_core();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				version_core();
				setState(34);
				match(T__0);
				setState(35);
				pre_release();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				version_core();
				setState(38);
				match(T__1);
				setState(39);
				build();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				version_core();
				setState(42);
				match(T__0);
				setState(43);
				pre_release();
				setState(44);
				match(T__1);
				setState(45);
				build();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Version_coreContext extends ParserRuleContext {
		public MajorContext major() {
			return getRuleContext(MajorContext.class,0);
		}
		public MinorContext minor() {
			return getRuleContext(MinorContext.class,0);
		}
		public PatchContext patch() {
			return getRuleContext(PatchContext.class,0);
		}
		public Version_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterVersion_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitVersion_core(this);
		}
	}

	public final Version_coreContext version_core() throws RecognitionException {
		Version_coreContext _localctx = new Version_coreContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_version_core);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			major();
			setState(50);
			match(T__2);
			setState(51);
			minor();
			setState(52);
			match(T__2);
			setState(53);
			patch();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MajorContext extends ParserRuleContext {
		public Numeric_idContext numeric_id() {
			return getRuleContext(Numeric_idContext.class,0);
		}
		public MajorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_major; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterMajor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitMajor(this);
		}
	}

	public final MajorContext major() throws RecognitionException {
		MajorContext _localctx = new MajorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_major);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			numeric_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinorContext extends ParserRuleContext {
		public Numeric_idContext numeric_id() {
			return getRuleContext(Numeric_idContext.class,0);
		}
		public MinorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterMinor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitMinor(this);
		}
	}

	public final MinorContext minor() throws RecognitionException {
		MinorContext _localctx = new MinorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_minor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			numeric_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatchContext extends ParserRuleContext {
		public Numeric_idContext numeric_id() {
			return getRuleContext(Numeric_idContext.class,0);
		}
		public PatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterPatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitPatch(this);
		}
	}

	public final PatchContext patch() throws RecognitionException {
		PatchContext _localctx = new PatchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_patch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			numeric_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_releaseContext extends ParserRuleContext {
		public Dot_sep_pre_releaseContext dot_sep_pre_release() {
			return getRuleContext(Dot_sep_pre_releaseContext.class,0);
		}
		public Pre_releaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_release; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterPre_release(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitPre_release(this);
		}
	}

	public final Pre_releaseContext pre_release() throws RecognitionException {
		Pre_releaseContext _localctx = new Pre_releaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pre_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			dot_sep_pre_release();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dot_sep_pre_releaseContext extends ParserRuleContext {
		public Pre_release_idContext pre_release_id() {
			return getRuleContext(Pre_release_idContext.class,0);
		}
		public Dot_sep_pre_releaseContext dot_sep_pre_release() {
			return getRuleContext(Dot_sep_pre_releaseContext.class,0);
		}
		public Dot_sep_pre_releaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_sep_pre_release; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterDot_sep_pre_release(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitDot_sep_pre_release(this);
		}
	}

	public final Dot_sep_pre_releaseContext dot_sep_pre_release() throws RecognitionException {
		Dot_sep_pre_releaseContext _localctx = new Dot_sep_pre_releaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dot_sep_pre_release);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				pre_release_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				pre_release_id();
				setState(65);
				match(T__2);
				setState(66);
				dot_sep_pre_release();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_release_idContext extends ParserRuleContext {
		public Anum_idContext anum_id() {
			return getRuleContext(Anum_idContext.class,0);
		}
		public Pre_release_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_release_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterPre_release_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitPre_release_id(this);
		}
	}

	public final Pre_release_idContext pre_release_id() throws RecognitionException {
		Pre_release_idContext _localctx = new Pre_release_idContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pre_release_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			anum_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildContext extends ParserRuleContext {
		public Build_idContext build_id() {
			return getRuleContext(Build_idContext.class,0);
		}
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitBuild(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_build);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			build_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_idContext extends ParserRuleContext {
		public Anum_idContext anum_id() {
			return getRuleContext(Anum_idContext.class,0);
		}
		public Build_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterBuild_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitBuild_id(this);
		}
	}

	public final Build_idContext build_id() throws RecognitionException {
		Build_idContext _localctx = new Build_idContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_build_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			anum_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anum_idContext extends ParserRuleContext {
		public List<AnumContext> anum() {
			return getRuleContexts(AnumContext.class);
		}
		public AnumContext anum(int i) {
			return getRuleContext(AnumContext.class,i);
		}
		public Anum_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anum_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterAnum_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitAnum_id(this);
		}
	}

	public final Anum_idContext anum_id() throws RecognitionException {
		Anum_idContext _localctx = new Anum_idContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_anum_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				anum();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_idContext extends ParserRuleContext {
		public ZeroContext zero() {
			return getRuleContext(ZeroContext.class,0);
		}
		public NonzeroContext nonzero() {
			return getRuleContext(NonzeroContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Numeric_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterNumeric_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitNumeric_id(this);
		}
	}

	public final Numeric_idContext numeric_id() throws RecognitionException {
		Numeric_idContext _localctx = new Numeric_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numeric_id);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				zero();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				nonzero();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
					{
					{
					setState(83);
					number();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonzeroContext extends ParserRuleContext {
		public NonzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonzero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterNonzero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitNonzero(this);
		}
	}

	public final NonzeroContext nonzero() throws RecognitionException {
		NonzeroContext _localctx = new NonzeroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nonzero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnumContext extends ParserRuleContext {
		public AnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterAnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitAnum(this);
		}
	}

	public final AnumContext anum() throws RecognitionException {
		AnumContext _localctx = new AnumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_anum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZeroContext extends ParserRuleContext {
		public ZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitZero(this);
		}
	}

	public final ZeroContext zero() throws RecognitionException {
		ZeroContext _localctx = new ZeroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_zero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)f\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\62\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bG\n\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\6\fP\n\f\r\f\16\fQ\3\r\3\r\3\r\7\rW\n\r"+
		"\f\r\16\rZ\13\r\5\r\\\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\6\17\3\2\7\17"+
		"\4\2\3\3\6)\2\\\2\61\3\2\2\2\4\63\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\n=\3\2"+
		"\2\2\f?\3\2\2\2\16F\3\2\2\2\20H\3\2\2\2\22J\3\2\2\2\24L\3\2\2\2\26O\3"+
		"\2\2\2\30[\3\2\2\2\32]\3\2\2\2\34_\3\2\2\2\36a\3\2\2\2 c\3\2\2\2\"\62"+
		"\5\4\3\2#$\5\4\3\2$%\7\3\2\2%&\5\f\7\2&\62\3\2\2\2\'(\5\4\3\2()\7\4\2"+
		"\2)*\5\22\n\2*\62\3\2\2\2+,\5\4\3\2,-\7\3\2\2-.\5\f\7\2./\7\4\2\2/\60"+
		"\5\22\n\2\60\62\3\2\2\2\61\"\3\2\2\2\61#\3\2\2\2\61\'\3\2\2\2\61+\3\2"+
		"\2\2\62\3\3\2\2\2\63\64\5\6\4\2\64\65\7\5\2\2\65\66\5\b\5\2\66\67\7\5"+
		"\2\2\678\5\n\6\28\5\3\2\2\29:\5\30\r\2:\7\3\2\2\2;<\5\30\r\2<\t\3\2\2"+
		"\2=>\5\30\r\2>\13\3\2\2\2?@\5\16\b\2@\r\3\2\2\2AG\5\20\t\2BC\5\20\t\2"+
		"CD\7\5\2\2DE\5\16\b\2EG\3\2\2\2FA\3\2\2\2FB\3\2\2\2G\17\3\2\2\2HI\5\26"+
		"\f\2I\21\3\2\2\2JK\5\24\13\2K\23\3\2\2\2LM\5\26\f\2M\25\3\2\2\2NP\5\36"+
		"\20\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\27\3\2\2\2S\\\5 \21\2T"+
		"X\5\34\17\2UW\5\32\16\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2"+
		"\2\2ZX\3\2\2\2[S\3\2\2\2[T\3\2\2\2\\\31\3\2\2\2]^\t\2\2\2^\33\3\2\2\2"+
		"_`\t\3\2\2`\35\3\2\2\2ab\t\4\2\2b\37\3\2\2\2cd\7\6\2\2d!\3\2\2\2\7\61"+
		"FQX[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
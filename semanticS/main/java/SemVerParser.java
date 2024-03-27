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
		T__0=1, T__1=2, T__2=3, T__3=4, ALPHA=5, NUM=6, NON_ZERO=7;
	public static final int
		RULE_anum_id = 0, RULE_numeric_id = 1, RULE_sem_ver = 2, RULE_version_core = 3, 
		RULE_major = 4, RULE_minor = 5, RULE_patch = 6, RULE_pre_release = 7, 
		RULE_dot_sep_pre_release = 8, RULE_pre_release_id = 9, RULE_build = 10, 
		RULE_build_id = 11;
	public static final String[] ruleNames = {
		"anum_id", "numeric_id", "sem_ver", "version_core", "major", "minor", 
		"patch", "pre_release", "dot_sep_pre_release", "pre_release_id", "build", 
		"build_id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'0'", "'+'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ALPHA", "NUM", "NON_ZERO"
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
	public static class Anum_idContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(SemVerParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(SemVerParser.ALPHA, i);
		}
		public List<TerminalNode> NUM() { return getTokens(SemVerParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SemVerParser.NUM, i);
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
		enterRule(_localctx, 0, RULE_anum_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ALPHA) | (1L << NUM))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ALPHA) | (1L << NUM))) != 0) );
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
		public TerminalNode NON_ZERO() { return getToken(SemVerParser.NON_ZERO, 0); }
		public List<TerminalNode> NUM() { return getTokens(SemVerParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SemVerParser.NUM, i);
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
		enterRule(_localctx, 2, RULE_numeric_id);
		int _la;
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__1);
				}
				break;
			case NON_ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(NON_ZERO);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(31);
					match(NUM);
					}
					}
					setState(36);
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

	public static class Sem_verContext extends ParserRuleContext {
		public Version_coreContext version_core() {
			return getRuleContext(Version_coreContext.class,0);
		}
		public Pre_releaseContext pre_release() {
			return getRuleContext(Pre_releaseContext.class,0);
		}
		public BuildContext build() {
			return getRuleContext(BuildContext.class,0);
		}
		public Sem_verContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_ver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).enterSem_ver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SemVerListener ) ((SemVerListener)listener).exitSem_ver(this);
		}
	}

	public final Sem_verContext sem_ver() throws RecognitionException {
		Sem_verContext _localctx = new Sem_verContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sem_ver);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				version_core();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				version_core();
				setState(41);
				match(T__0);
				setState(42);
				pre_release();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				version_core();
				setState(45);
				match(T__2);
				setState(46);
				build();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				version_core();
				setState(49);
				match(T__0);
				setState(50);
				pre_release();
				setState(51);
				match(T__2);
				setState(52);
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
		enterRule(_localctx, 6, RULE_version_core);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			major();
			setState(57);
			match(T__3);
			setState(58);
			minor();
			setState(59);
			match(T__3);
			setState(60);
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
		enterRule(_localctx, 8, RULE_major);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		enterRule(_localctx, 10, RULE_minor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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
		enterRule(_localctx, 12, RULE_patch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
		enterRule(_localctx, 14, RULE_pre_release);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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
		enterRule(_localctx, 16, RULE_dot_sep_pre_release);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				pre_release_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				pre_release_id();
				setState(72);
				match(T__3);
				setState(73);
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
		enterRule(_localctx, 18, RULE_pre_release_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		enterRule(_localctx, 20, RULE_build);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		enterRule(_localctx, 22, RULE_build_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\tV\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\3\3\7\b\2P\2\33\3\2\2\2\4\'\3\2"+
		"\2\2\68\3\2\2\2\b:\3\2\2\2\n@\3\2\2\2\fB\3\2\2\2\16D\3\2\2\2\20F\3\2\2"+
		"\2\22M\3\2\2\2\24O\3\2\2\2\26Q\3\2\2\2\30S\3\2\2\2\32\34\t\2\2\2\33\32"+
		"\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37(\7"+
		"\4\2\2 $\7\t\2\2!#\7\b\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%"+
		"(\3\2\2\2&$\3\2\2\2\'\37\3\2\2\2\' \3\2\2\2(\5\3\2\2\2)9\5\b\5\2*+\5\b"+
		"\5\2+,\7\3\2\2,-\5\20\t\2-9\3\2\2\2./\5\b\5\2/\60\7\5\2\2\60\61\5\26\f"+
		"\2\619\3\2\2\2\62\63\5\b\5\2\63\64\7\3\2\2\64\65\5\20\t\2\65\66\7\5\2"+
		"\2\66\67\5\26\f\2\679\3\2\2\28)\3\2\2\28*\3\2\2\28.\3\2\2\28\62\3\2\2"+
		"\29\7\3\2\2\2:;\5\n\6\2;<\7\6\2\2<=\5\f\7\2=>\7\6\2\2>?\5\16\b\2?\t\3"+
		"\2\2\2@A\5\4\3\2A\13\3\2\2\2BC\5\4\3\2C\r\3\2\2\2DE\5\4\3\2E\17\3\2\2"+
		"\2FG\5\22\n\2G\21\3\2\2\2HN\5\24\13\2IJ\5\24\13\2JK\7\6\2\2KL\5\22\n\2"+
		"LN\3\2\2\2MH\3\2\2\2MI\3\2\2\2N\23\3\2\2\2OP\5\2\2\2P\25\3\2\2\2QR\5\30"+
		"\r\2R\27\3\2\2\2ST\5\2\2\2T\31\3\2\2\2\7\35$\'8M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
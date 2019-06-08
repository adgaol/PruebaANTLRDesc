package ejemploantlr;

// Generated from gramatica.g4 by ANTLR 4.7.2

    import apicreatorxml.Writer;
    import apicreatorxml.Node;
    import apicreatorxml.Paso;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Number=4;
	public static final int
		RULE_exp = 0, RULE_a = 1, RULE_b = 2, RULE_c = 3, RULE_puntocoma = 4, 
		RULE_mas = 5, RULE_por = 6, RULE_numb = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"exp", "a", "b", "c", "puntocoma", "mas", "por", "numb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Number"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    private Writer writer= new Writer("./gramatica.txt","./descendent","./cadenaDePrueba.txt",true);


	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpContext extends ParserRuleContext {
		public Exp expO;
		public BContext bO;
		public AContext aO;
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        Paso paso=writer.addPasoPrimero("EXP", null, null);
			        Node node=writer.addNode("EXP", false,false);
			        
			    
			setState(17);
			((ExpContext)_localctx).bO = b(node,true);
			setState(18);
			((ExpContext)_localctx).aO = a(((ExpContext)_localctx).bO.bO.getResult(),node,true,false);
			setState(19);
			puntocoma(node,false);

			        ((ExpContext)_localctx).bO.bO.getPaso().setRegla("EXP::= B A ;");
			        Exp expO=new Exp();
			        expO.setResult(((ExpContext)_localctx).aO.aO.getResult());
			        System.out.println(((ExpContext)_localctx).aO.aO.getResult());
			        _localctx.expO=expO;   
			        writer.writeXML();
			        
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

	public static class AContext extends ParserRuleContext {
		public Integer her;
		public Node nodeAnt;
		public Boolean haveBrother;
		public Boolean a1;
		public A aO;
		public MasContext masO;
		public BContext bO;
		public AContext aeO;
		public MasContext mas() {
			return getRuleContext(MasContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AContext(ParserRuleContext parent, int invokingState, Integer her, Node nodeAnt, Boolean haveBrother, Boolean a1) {
			super(parent, invokingState);
			this.her = her;
			this.nodeAnt = nodeAnt;
			this.haveBrother = haveBrother;
			this.a1 = a1;
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitA(this);
		}
	}

	public final AContext a(Integer her,Node nodeAnt,Boolean haveBrother,Boolean a1) throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState(), her, nodeAnt, haveBrother, a1);
		enterRule(_localctx, 2, RULE_a);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				 
				        Paso paso;
				        Node node;
				        if(a1){
				            node=writer.addNode("A1", false, haveBrother);
				            paso=writer.addPaso(false,null,"A1","A1.valor="+her+" A1.result=null", null, nodeAnt.getId());
				        }
				        else{
				            node=writer.addNode("A", false, haveBrother);
				            paso=writer.addPaso(false,null,"A","A.valor="+her+" A.result=null", null, nodeAnt.getId());
				        }
				        node.setFatherNode(nodeAnt);
				        
				        
				        
				setState(23);
				((AContext)_localctx).masO = mas(node,true);
				setState(24);
				((AContext)_localctx).bO = b(node,true);
				setState(25);
				((AContext)_localctx).aeO = a(((AContext)_localctx).bO.bO.getResult()+her,node,false,true);

				        ((AContext)_localctx).masO.m.getPaso().setRegla("A::= + B A1");
				        A aO=new A();
				        aO.setResult(((AContext)_localctx).aeO.aO.getResult());
				        aO.setPaso(paso);
				        aO.setNode(node);
				        _localctx.aO=aO;
				        
				        
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{

				        Paso paso;
				        Node node;
				        if(a1){
				            node=writer.addNode("A1", false, haveBrother);
				            paso=writer.addPaso(false,null,"A1","A1.valor="+her+" A1.result=null", null, nodeAnt.getId());
				        }
				        else{
				            node=writer.addNode("A", false, haveBrother);
				            paso=writer.addPaso(false,null,"A","A.valor="+her+" A.result=null", null, nodeAnt.getId());
				        }
				        node.setFatherNode(nodeAnt);
				        Paso pasoL=writer.addPaso(true,null,"λ", null, "A::= λ",paso.getId());
				        Node nodeL=writer.addNode("λ", true,false);
				        nodeL.setFatherNode(node);
				        


				        A aO=new A();
				        aO.setResult(her);
				        aO.setPaso(paso);
				        Node nodeAux=node;
				        while(!nodeAux.getHaveBrother()){

				            pasoL.getChangedNodes().add(nodeAux.getId());
				            Paso pasoAux =writer.getStep(nodeAux.getId());
				            String values=pasoAux.getValor();
				            
				            values=values.replace("null",aO.getResult().toString() );
				            pasoL.getChanges().add(values); 
				            nodeAux=nodeAux.getFatherNode();
				        }
				            pasoL.getChangedNodes().add(nodeAux.getId());
				            Paso pasoAux =writer.getStep(nodeAux.getId());
				            String values=pasoAux.getValor();
				            
				            values=values.replace("null",aO.getResult().toString() );
				            pasoL.getChanges().add(values); 
				            _localctx.aO=aO;
				        
				        
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

	public static class BContext extends ParserRuleContext {
		public Node nodeAnt;
		public Boolean haveBrother;
		public B bO;
		public NumbContext numO;
		public CContext cO;
		public NumbContext numb() {
			return getRuleContext(NumbContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BContext(ParserRuleContext parent, int invokingState, Node nodeAnt, Boolean haveBrother) {
			super(parent, invokingState);
			this.nodeAnt = nodeAnt;
			this.haveBrother = haveBrother;
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitB(this);
		}
	}

	public final BContext b(Node nodeAnt,Boolean haveBrother) throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState(), nodeAnt, haveBrother);
		enterRule(_localctx, 4, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        Paso paso=writer.addPaso(false,null,"B", "B.result=null", null,nodeAnt.getId());
			        Node node=writer.addNode("B", false,haveBrother);
			        node.setFatherNode(nodeAnt);
			      
			    
			setState(33);
			((BContext)_localctx).numO = numb(node,true);
			setState(34);
			((BContext)_localctx).cO = c(((BContext)_localctx).numO.numO.getValue(),node,false,false);

			        ((BContext)_localctx).numO.numO.getPaso().setRegla("B::= num C");
			        B bO=new B();
			        bO.setResult(((BContext)_localctx).cO.cO.getResult());
			        bO.setPaso(paso);
			        _localctx.bO=bO;
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

	public static class CContext extends ParserRuleContext {
		public Integer her;
		public Node nodeAnt;
		public Boolean haveBrother;
		public Boolean c1;
		public C cO;
		public PorContext porO;
		public NumbContext numO;
		public CContext ceO;
		public PorContext por() {
			return getRuleContext(PorContext.class,0);
		}
		public NumbContext numb() {
			return getRuleContext(NumbContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CContext(ParserRuleContext parent, int invokingState, Integer her, Node nodeAnt, Boolean haveBrother, Boolean c1) {
			super(parent, invokingState);
			this.her = her;
			this.nodeAnt = nodeAnt;
			this.haveBrother = haveBrother;
			this.c1 = c1;
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitC(this);
		}
	}

	public final CContext c(Integer her,Node nodeAnt,Boolean haveBrother,Boolean c1) throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState(), her, nodeAnt, haveBrother, c1);
		enterRule(_localctx, 6, RULE_c);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{

				        Paso paso;
				        Node node;
				        if(c1){
				            node=writer.addNode("C1", false, haveBrother);
				            paso=writer.addPaso(false,null,"C1", "C1.valor="+her+"C1.result=null", null,nodeAnt.getId());
				        }
				        else{
				            node=writer.addNode("C", false, haveBrother);
				            paso=writer.addPaso(false,null,"C", "C.valor="+her+"C.result=null", null,nodeAnt.getId());
				        }
				        node.setFatherNode(nodeAnt);
				        
				    
				setState(38);
				((CContext)_localctx).porO = por(node,true);
				setState(39);
				((CContext)_localctx).numO = numb(node,true);
				setState(40);
				((CContext)_localctx).ceO = c(her*((CContext)_localctx).numO.numO.getValue(),node,false,true);

				        ((CContext)_localctx).porO.pr.getPaso().setRegla("C::= * num C1");
				        C cO=new C();
				        cO.setResult(((CContext)_localctx).ceO.cO.getResult());
				        cO.setPaso(paso);
				        _localctx.cO=cO;
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{

				        
				        Paso paso;
				        Node node;
				        if(c1){
				            node=writer.addNode("C1", false, haveBrother);
				            paso=writer.addPaso(false,null,"C1", "C1.valor="+her+" C1.result=null", null,nodeAnt.getId());
				        }
				        else{
				            node=writer.addNode("C", false, haveBrother);
				            paso=writer.addPaso(false,null,"C", "C.valor="+her+" C.result=null", null,nodeAnt.getId());
				        }
				        node.setFatherNode(nodeAnt);
				        paso=writer.addPaso(true,null,"λ", null, "C::= λ",paso.getId());
				        Node nodeL=writer.addNode("λ", true,false);
				        nodeL.setFatherNode(node);
				        

				        C cO=new C();

				        cO.setResult(her);
				        cO.setPaso(paso);
				        Node nodeAux=node;
				        while(!nodeAux.getHaveBrother()){

				            paso.getChangedNodes().add(nodeAux.getId());
				            Paso pasoAux =writer.getStep(nodeAux.getId());
				            String values=pasoAux.getValor();
				           
				            
				            values=values.replace("null",cO.getResult().toString() );
				            paso.getChanges().add(values); 
				            nodeAux=nodeAux.getFatherNode();
				        }
				            paso.getChangedNodes().add(nodeAux.getId());
				            Paso pasoAux =writer.getStep(nodeAux.getId());
				            String values=pasoAux.getValor();
				            
				            
				            values=values.replace("null",cO.getResult().toString() );
				            paso.getChanges().add(values); 
				        
				        _localctx.cO=cO;
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

	public static class PuntocomaContext extends ParserRuleContext {
		public Node nodeAnt;
		public Boolean haveBrother;
		public PuntoComa pc;
		public PuntocomaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PuntocomaContext(ParserRuleContext parent, int invokingState, Node nodeAnt, Boolean haveBrother) {
			super(parent, invokingState);
			this.nodeAnt = nodeAnt;
			this.haveBrother = haveBrother;
		}
		@Override public int getRuleIndex() { return RULE_puntocoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPuntocoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPuntocoma(this);
		}
	}

	public final PuntocomaContext puntocoma(Node nodeAnt,Boolean haveBrother) throws RecognitionException {
		PuntocomaContext _localctx = new PuntocomaContext(_ctx, getState(), nodeAnt, haveBrother);
		enterRule(_localctx, 8, RULE_puntocoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);

			        Paso paso=writer.addPaso(true,";",";", null, null,nodeAnt.getId());
			        Node node=writer.addNode(";", true,haveBrother);
			        PuntoComa pc=new PuntoComa();
			        node.setFatherNode(nodeAnt);
			        pc.setPaso(paso);
			        _localctx.pc=pc;
			    
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

	public static class MasContext extends ParserRuleContext {
		public Node nodeAnt;
		public Boolean haveBrother;
		public Mas m;
		public MasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MasContext(ParserRuleContext parent, int invokingState, Node nodeAnt, Boolean haveBrother) {
			super(parent, invokingState);
			this.nodeAnt = nodeAnt;
			this.haveBrother = haveBrother;
		}
		@Override public int getRuleIndex() { return RULE_mas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMas(this);
		}
	}

	public final MasContext mas(Node nodeAnt,Boolean haveBrother) throws RecognitionException {
		MasContext _localctx = new MasContext(_ctx, getState(), nodeAnt, haveBrother);
		enterRule(_localctx, 10, RULE_mas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__1);

			        {
			        Paso paso=writer.addPaso(true,"+","+", null, null,nodeAnt.getId());
			        Node node=writer.addNode("+", true,haveBrother);
			        Mas m=new Mas();
			        node.setFatherNode(nodeAnt);
			        m.setPaso(paso);
			        _localctx.m=m;
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

	public static class PorContext extends ParserRuleContext {
		public Node nodeAnt;
		public Boolean haveBrother;
		public Por pr;
		public PorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PorContext(ParserRuleContext parent, int invokingState, Node nodeAnt, Boolean haveBrother) {
			super(parent, invokingState);
			this.nodeAnt = nodeAnt;
			this.haveBrother = haveBrother;
		}
		@Override public int getRuleIndex() { return RULE_por; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPor(this);
		}
	}

	public final PorContext por(Node nodeAnt,Boolean haveBrother) throws RecognitionException {
		PorContext _localctx = new PorContext(_ctx, getState(), nodeAnt, haveBrother);
		enterRule(_localctx, 12, RULE_por);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__2);

			        Paso paso=writer.addPaso(true,"*","*", null, null,nodeAnt.getId());
			        Node node=writer.addNode("*", true,haveBrother);
			        Por pr=new Por();
			        node.setFatherNode(nodeAnt);
			        pr.setPaso(paso);
			        _localctx.pr=pr;
			    
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

	public static class NumbContext extends ParserRuleContext {
		public Node nodeAnt;
		public Boolean haveBrother;
		public Num numO;
		public TerminalNode Number() { return getToken(gramaticaParser.Number, 0); }
		public NumbContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NumbContext(ParserRuleContext parent, int invokingState, Node nodeAnt, Boolean haveBrother) {
			super(parent, invokingState);
			this.nodeAnt = nodeAnt;
			this.haveBrother = haveBrother;
		}
		@Override public int getRuleIndex() { return RULE_numb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNumb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNumb(this);
		}
	}

	public final NumbContext numb(Node nodeAnt,Boolean haveBrother) throws RecognitionException {
		NumbContext _localctx = new NumbContext(_ctx, getState(), nodeAnt, haveBrother);
		enterRule(_localctx, 14, RULE_numb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(Number);

			        Paso paso=writer.addPaso(true,this._ctx.getText(),"num", "num.vlex="+this._ctx.getText(), null,nodeAnt.getId());
			        Node node= writer.addNode("num", true,haveBrother);
			        Num numO=new Num();
			        numO.setValue(Integer.parseInt(this._ctx.getText()));
			        numO.setPaso(paso);
			        node.setFatherNode(nodeAnt);
			        _localctx.numO=numO;
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2\67\2\22\3\2\2\2\4"+
		" \3\2\2\2\6\"\3\2\2\2\b/\3\2\2\2\n\61\3\2\2\2\f\64\3\2\2\2\16\67\3\2\2"+
		"\2\20:\3\2\2\2\22\23\b\2\1\2\23\24\5\6\4\2\24\25\5\4\3\2\25\26\5\n\6\2"+
		"\26\27\b\2\1\2\27\3\3\2\2\2\30\31\b\3\1\2\31\32\5\f\7\2\32\33\5\6\4\2"+
		"\33\34\5\4\3\2\34\35\b\3\1\2\35!\3\2\2\2\36\37\b\3\1\2\37!\b\3\1\2 \30"+
		"\3\2\2\2 \36\3\2\2\2!\5\3\2\2\2\"#\b\4\1\2#$\5\20\t\2$%\5\b\5\2%&\b\4"+
		"\1\2&\7\3\2\2\2\'(\b\5\1\2()\5\16\b\2)*\5\20\t\2*+\5\b\5\2+,\b\5\1\2,"+
		"\60\3\2\2\2-.\b\5\1\2.\60\b\5\1\2/\'\3\2\2\2/-\3\2\2\2\60\t\3\2\2\2\61"+
		"\62\7\3\2\2\62\63\b\6\1\2\63\13\3\2\2\2\64\65\7\4\2\2\65\66\b\7\1\2\66"+
		"\r\3\2\2\2\678\7\5\2\289\b\b\1\29\17\3\2\2\2:;\7\6\2\2;<\b\t\1\2<\21\3"+
		"\2\2\2\4 /";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package ejemploantlr;

// Generated from gramatica.g4 by ANTLR 4.7.2

    import apicreatorxml.Writer;
    import apicreatorxml.Node;
    import apicreatorxml.Paso;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(gramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(gramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(gramaticaParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(gramaticaParser.AContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(gramaticaParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(gramaticaParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(gramaticaParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(gramaticaParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#puntocoma}.
	 * @param ctx the parse tree
	 */
	void enterPuntocoma(gramaticaParser.PuntocomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#puntocoma}.
	 * @param ctx the parse tree
	 */
	void exitPuntocoma(gramaticaParser.PuntocomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#mas}.
	 * @param ctx the parse tree
	 */
	void enterMas(gramaticaParser.MasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#mas}.
	 * @param ctx the parse tree
	 */
	void exitMas(gramaticaParser.MasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#por}.
	 * @param ctx the parse tree
	 */
	void enterPor(gramaticaParser.PorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#por}.
	 * @param ctx the parse tree
	 */
	void exitPor(gramaticaParser.PorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#numb}.
	 * @param ctx the parse tree
	 */
	void enterNumb(gramaticaParser.NumbContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#numb}.
	 * @param ctx the parse tree
	 */
	void exitNumb(gramaticaParser.NumbContext ctx);
}
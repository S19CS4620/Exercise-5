/*
 * ExprEvalDriver.java
 *
 * usage: 
 *   java ExprEval [--one-pass-eval | --two-pass-eval | --two-pass-mips ] infile
 *
 * This driver calls one of three possible expression evaluation parsers.
 * The default parser is the one-pass-eval.
 *
 */

package ast_visitors;

import ast.node.IntegerExp;
import ast.node.MinusExp;
import ast.node.MulExp;
import ast.node.Node;
import ast.node.PlusExp;
import ast.visitor.DepthFirstVisitor;


public class TestVisitor extends DepthFirstVisitor {
	private Node root;

	public TestVisitor(Node r){
		this.root=r;
	}

	/**
	 * Override the default action taken at each visited node -- print out dot
	 * node with parse tree node's text as a label. Also print out edge from
	 * parent to this node.
	 */
	public void defaultCase(Node node) {
		
	}
	public void defaultIn(Node node) {
		System.out.println("Get in a node.");
	}

	public void defaultOut(Node node) {
		System.out.println("Get out of a node.");
	}
	
	public void inIntegerExp(IntegerExp node){
		defaultIn(node);
	}

	public void outIntegerExp(IntegerExp node){
		defaultOut(node);
	}

	public void outPlusExp(PlusExp node){
		defaultOut(node);
	}
	
	public void outMinusExp(MinusExp node){
		defaultOut(node);
	}
	
	public void outMulExp(MulExp node){
		defaultOut(node);
	}
	public void inPlusExp(PlusExp node){
		defaultIn(node);
	}
	
	public void inMinusExp(MinusExp node){
		defaultIn(node);
	}
	
	public void inMulExp(MulExp node){
		defaultIn(node);
	}
}

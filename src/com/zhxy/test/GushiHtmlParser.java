package com.zhxy.test;

import java.io.FileNotFoundException;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.lexer.Page;
import org.htmlparser.nodes.TextNode;
import org.htmlparser.tags.Bullet;
import org.htmlparser.tags.Div;
import org.htmlparser.tags.HeadingTag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;
import org.htmlparser.visitors.NodeVisitor;

public class GushiHtmlParser {

	public static void main(String[] args) throws FileNotFoundException, Exception {

		
		
		Parser parser = new Parser("src/gushifunction.html");

		parser.setEncoding("UTF-8");
		NodeFilter dlfilter = new NodeFilter() {
			
			@Override
			public boolean accept(Node node) {
				if(node.getText().startsWith("dl"))
					return true;
				return false;
			}
		};
		
		
		Parser contentParser = new Parser("src/gushicontent.html");
		contentParser.setEncoding("UTF-8");
		NodeFilter contentDlFilter = new NodeFilter() {
			
			@Override
			public boolean accept(Node node) {
				if(node.getText().startsWith("dl"))
					return true;
				return false;
			}
		};
		
		NodeList contentdlList = contentParser.extractAllNodesThatMatch(contentDlFilter);
		
		NodeList dlList = parser.extractAllNodesThatMatch(dlfilter);
		for(int i=0;i<dlList.size();i++){
			Node dl = dlList.elementAt(i);
			NodeList ddtList = dl.getChildren();
			
			Node contentDl = contentdlList.elementAt(i);
			NodeList contentDdtList = contentDl.getChildren();
			
			for(int j=0;j<ddtList.size();j++) {
				Node ddt = ddtList.elementAt(j);
				if(ddt.getText().startsWith("dt")) { //获取dt标签
					Node dt = ddt;
					NodeList dtChildList = dt.getChildren();
					NodeList newDtChildList = new NodeList(); //
					for(int k=0;k<dtChildList.size();k++) {
						Node dtchild = dtChildList.elementAt(k);
						if(dtchild.getText().startsWith("div")) { //tpbox
							Node tbBoxNode = dtchild;
							NodeList lrDivList = tbBoxNode.getChildren();
							NodeList newLrNodeList = new NodeList();
							for(int l=0;l<lrDivList.size();l++) {
								Node lrDivNode = lrDivList.elementAt(l);
								if(lrDivNode.getText().startsWith("div")) {
									Div divNode = (Div) lrDivNode;
									if(divNode.getAttribute("class") .equals("tpbox_left")) { //left div. 获取a节点
										NodeList divChildNodeList = divNode.getChildren();
										for(int m=0;m<divChildNodeList.size();m++) {
											Node divChild = divChildNodeList.elementAt(m);
											if(divChild.getText().startsWith("a")) {
												LinkTag ATag = (LinkTag) divChild; //a //
												LinkTag newATag = ATag; // 内容A标签
												divNode.setChildren(new NodeList(newATag));
											}
										}
										
									}else if(divNode.getAttribute("class").equals("tpbox_right")) { //right div ／／获取p节点
										System.out.println(divNode.toHtml());
									}
									lrDivNode = divNode;
								}
								
								newLrNodeList.add(lrDivNode);
							}
							tbBoxNode.setChildren(newLrNodeList);
						}
						
						newDtChildList.add(dt);
						
					}
					dt.setChildren(newDtChildList);
					
				}else if(ddt.getText().startsWith("dd")){ //获取dd标签
					Node dd = ddt;
				}
			}
		}
		
		
		
		
	}
	

}

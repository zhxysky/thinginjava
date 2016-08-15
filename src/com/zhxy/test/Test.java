package com.zhxy.test;

import java.io.FileNotFoundException;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.nodes.TextNode;
import org.htmlparser.tags.Bullet;
import org.htmlparser.tags.HeadingTag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.util.NodeList;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, Exception {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("src/liuxingyu-vote副本.html")), "UTF-8"));
//		
//		String line = "";
//		while((line = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		
//		
//			
//		br.close();
		
		
		Parser parser = new Parser("src/function.html");

		parser.setEncoding("UTF-8");
		NodeFilter lifilter = new NodeFilter() {
			
			@Override
			public boolean accept(Node node) {
				if(node.getText().startsWith("li"))
					return true;
				return false;
			}
		};
		
		
		Parser contentParser = new Parser("src/content.html");
		contentParser.setEncoding("UTF-8");
		NodeFilter contentLiFilter = new NodeFilter() {
			
			@Override
			public boolean accept(Node node) {
				// TODO Auto-generated method stub
				if(node.getText().startsWith("li"))
					return true;
				return false;
			}
		};
		
		Bullet ul = new Bullet();
		ul.setTagName("ul");
		NodeList ulChildList = new NodeList();
		
		
		
		NodeList contentNodeList = contentParser.extractAllNodesThatMatch(contentLiFilter);
		NodeList nodeList = parser.extractAllNodesThatMatch(lifilter);
		NodeList childList = null;
		NodeList contentChildList = null;
		for(int i=0;i<nodeList.size();i++){
			Bullet li = new Bullet();
			li.setTagName("li");
			
			NodeList newChildList = new NodeList();
			
			Node node = nodeList.elementAt(i);
			childList = node.getChildren();
			
			Node contentNode = contentNodeList.elementAt(i);
			contentChildList = contentNode.getChildren();
			
			
			for(int j=0;j<childList.size();j++){
				Node child = childList.elementAt(j);
				if(child.getText().startsWith("h3")){
					Node firstChild =  child.getFirstChild();
					LinkTag linkChild = (LinkTag) firstChild;
					
					LinkTag contentLinkTag = null;
					for(int k=0;k<contentChildList.size();k++){
						Node contentChild = contentChildList.elementAt(k);
						if(contentChild.getText().startsWith("h3")) {
							NodeList h3ChildList = contentChild.getChildren();
							for(int n = 0;n<h3ChildList.size();n++) {
								Node aNode = h3ChildList.elementAt(n);
								if(aNode instanceof LinkTag) {
									contentLinkTag = (LinkTag) aNode;
								}
							}
						}
					}
					
					
					
					linkChild.setAttribute("href", contentLinkTag.getAttribute("href"));
					linkChild.setChildren(new NodeList(new TextNode(contentLinkTag.getLinkText())));
					
//					HeadingTag h3 = new HeadingTag();
//					h3.setTagName("h3");
//					
//					h3.setChildren(new NodeList(linkChild));
//					child = h3;
					
					child.setChildren(new NodeList(linkChild));
				}
				newChildList.add(child);
			}
			//li.setChildren(newChildList);
			node.setChildren(newChildList);
//			ulChildList.add(li);
			ulChildList.add(node);
		}
		ul.setChildren(ulChildList);
		System.out.println(ul.toHtml());
		
	}
	

}

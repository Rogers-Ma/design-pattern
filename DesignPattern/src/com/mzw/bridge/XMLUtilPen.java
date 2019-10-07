package com.mzw.bridge;

//使用java反射创建具体的颜色和画笔
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtilPen {
//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean(String args) {
		try {
			// 创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;

			doc = builder.parse(new File("src/com/mzw/bridge/configPen.xml"));
			NodeList nl = null;
			Node classNode = null;
			String cName = null;
			nl = doc.getElementsByTagName("className");

			if (args.equals("color")) {
				// 获取包含类名的文本节点
				classNode = nl.item(0).getFirstChild();

			} else if (args.equals("pen")) {
				// 获取包含类名的文本节点
				classNode = nl.item(1).getFirstChild();
			}

			cName = classNode.getNodeValue();
			// 通过类名生成实例对象并将其返回
			Class<?> c = Class.forName("com.mzw.bridge." + cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
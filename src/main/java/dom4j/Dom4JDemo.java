package dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;

public class Dom4JDemo {

    Document document = DocumentHelper.createDocument();
    Element mapper = document.addElement("mapper");

    /**
     * 创建格式化输出xml
     *
     * @throws Exception
     */
    public void createXml() throws Exception {
        String fileName = "dom4j/mapper/XxxMapper.xml";
        document.addDocType("mapper", "-//mybatis.org//DTD Mapper 3.0//EN", "http://mybatis.org/dtd/mybatis-3-mapper.dtd");
        mapper.addAttribute("namespace", "");
        this.resultMap();
        this.baseColumnList();
        this.whereClause();
        this.insert();
        this.deleteByPrimaryKey();
        this.deleteByWhereClause();
        this.update();
        this.updateByPrimaryKey();
        this.select();
        this.selectByPrimaryKey();
        prettyWriteDocument(document, fileName);
    }

    public void resultMap() {
        Element resultMap = mapper.addElement("resultMap");
        resultMap.addAttribute("id", "BaseResultMap").addAttribute("type", "");
    }

    public void baseColumnList() {
        Element sql = mapper.addElement("sql");
        sql.addAttribute("id", "baseColumnList");
    }

    public void whereClause() {
        Element sql = mapper.addElement("sql");
        sql.addAttribute("id", "whereClause");
    }

    public void insert() {
        Element insert = mapper.addElement("insert");
        insert.addAttribute("id", "insert").addAttribute("parameterType", "");
    }

    public void deleteByPrimaryKey() {
        Element delete = mapper.addElement("delete");
        delete.addAttribute("id", "deleteByPrimaryKey").addAttribute("parameterType", "");

    }
    public void deleteByWhereClause() {
        Element delete = mapper.addElement("delete");
        delete.addAttribute("id", "deleteByWhereClause").addAttribute("parameterType", "");

    }

    public void updateByPrimaryKey() {
        Element update = mapper.addElement("update");
        update.addAttribute("id", "updateByPrimaryKey").addAttribute("parameterType", "");

    }
    public void update() {
        Element update = mapper.addElement("update");
        update.addAttribute("id", "update").addAttribute("parameterType", "");

    }

    public void selectByPrimaryKey() {
        Element select = mapper.addElement("select");
        select.addAttribute("id", "selectByPrimaryKey").addAttribute("parameterType", "").addAttribute("resultMap", "");

    }

    public void select() {
        Element select = mapper.addElement("select");
        select.addAttribute("id", "select").addAttribute("parameterType", "java.lang.Integer").addAttribute("resultMap", "BaseResultMap");

    }


    /**
     * 格式化并输出xml到文件
     * 默认输出格式为utf-8
     *
     * @param document
     * @param fileName
     * @throws Exception
     */
    public static void prettyWriteDocument(Document document, String fileName) throws Exception {
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        File file = new File(fileName);
        File dir = file.getParentFile();
        if (!dir.exists()) {
            dir.mkdirs();
        }
        // 格式化输出流
        XMLWriter xmlWriter = new XMLWriter(new FileWriter(file), format);
        xmlWriter.write(document);
        xmlWriter.close();
    }


}

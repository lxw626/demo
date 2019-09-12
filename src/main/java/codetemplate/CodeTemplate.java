package codetemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiewen
 * @create 2019-09-12 11:30
 */
public class CodeTemplate {
    /**
     * id
     */
    private Integer id;
    private Integer age;
    private String name;
    /**
     * 工作
     */
    private String job;
    private String[] inster = {};
    // loggerDefineThis
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
    }

    // test
    public void test(String[] msg) {
        // soutm
        System.out.println("HHH.test");
        // soutp
        System.out.println("msg = [" + msg + "]");
        int sal = 100;
        int comm = 200;
         /*soutv 输出变量,默认最近的一个,弹出选择框,
         顺序:根据距离有近及远的局部变量,方法参数,按照定义顺序的成员变量*/
        System.out.println("comm = " + comm);
        // ifn 判断当前范围内变量为空,默认最近的,弹出可选矿
        if (age == null) {

        }
        // id.nn
        if (id != null) {

        }
        // id.null
        if (id == null) {

        }
        // lazy
        if (id == null) {
            id = new Integer(1);
        }
        List<Integer> ids = new ArrayList();
        List ages = new ArrayList();
        int[] sals = {};
        int[] comms = {};
        // itar 遍历当前范围内可选数组,默认最近的一个,弹出可选框
        for (int i = 0; i < sals.length; i++) {
            int sal1 = sals[i];

        }
        // iter 遍历当前范围内可选数组与集合,默认最近的一个,弹出可选框
        for (int i : sals) {

        }
        // ids.for
        for (Integer integer : ids) {

        }
        // ids.fori
        for (int i = 0; i < ids.size(); i++) {

        }

    }
}

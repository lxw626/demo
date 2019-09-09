package other;

import org.mybatis.generator.api.ShellRunner;

/**
 * @autor lixiewen
 * @date 2019/1/12-8:18
 */
public class MybatisGeneratorApp {
    public static void main(String[] args) {
        args = new String[]{"-configfile", "src\\main\\resources\\mybatis\\mbg.xml", "-overwrite"};
        ShellRunner.main(args);
    }
}

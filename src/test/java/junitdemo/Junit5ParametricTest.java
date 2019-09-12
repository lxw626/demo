package junitdemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * 参数化测试:使用不同参数多次运行测试方法
 * 必须声明至少一个源，该源将为每次调用提供参数，然后使用测试方法中的参数即可,
 * 需要添加
 * <dependency>
     <groupId>org.junit.jupiter</groupId>
     <artifactId>junit-jupiter-params</artifactId>
     <version>5.2.0</version>
     <scope>test</scope>
 </dependency>
 */
public class Junit5ParametricTest {


    @ParameterizedTest
    @ValueSource(strings = { "张三", "李四", "王五" })
    void valueSourceStrings(String name) {
        System.out.println(name);
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void valueSourceInts(int num) {
        System.out.println(num);
    }

    /**
     *@MethodSource允许引用测试类或外部类的一个或多个工厂方法,
     * 此类工厂方法必须返回流、可迭代、迭代器或参数数组,
     * 此外，这种工厂方法不能接受任何参数,
     * 测试类中的工厂方法必须是静态的，除非用@TestInstance(Lifecycle.PER_CLASS)注释测试类,
     * 外部类中的工厂方法必须是静态的。
     * @param name
     */
    @ParameterizedTest
    @MethodSource(value = {"getNames1", "getNames2"})
    public void test1(String name){
        System.out.println("hello:"+name);

    }
     public static List<String> getNames1(){
        List <String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        return names;
    }

    /**
     * 如果测试方法只需要一个参数，可以返回一个指定类型的流 Stream(流)
     * @return
     */
    public static Stream<String> getNames2() {
        return Stream.of("王五", "赵六");
    }
    /**
     * 如果测试方法需要多个参数,需要返回参数实例的集合或流
     * @param name
     * @param age
     * @param interest
     */
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String name, int age, List<String> interest) {
        System.out.println("name:"+name+",age:"+age+",interest:"+interest);
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                Arguments.of("张三", 18, Arrays.asList("足球", "篮球")),
                Arguments.of("李四", 2, Arrays.asList("java", "mysql"))
        );
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithSimpleMethodSource(String argument) {
        System.out.println(argument);
        assertNotNull(argument);
    }

    static Stream<String> stringProvider() {
        return Stream.of("foo", "bar");
    }
    @ParameterizedTest
    @MethodSource("range")
    void testWithRangeMethodSource(int argument) {
        System.out.println(argument);
        assertNotEquals(9, argument);
    }

    static IntStream range() {
        return IntStream.range(0, 20).skip(10);
    }



    /**
     * @CsvSource 测试方法有多个参数时,允许将参数列表表示为逗号分隔的值。
     * @CsvSource使用一个单引号作为它的引号字符(字符串用单引号表示)。
     * @param name
     * @param position
     */
    @ParameterizedTest
    @CsvSource({ "张无忌, 教主", "白眉鹰王, ''", "青翼福王, " })
    void testWithCsvSource(String name, String position) {
        System.out.println("name:"+name+",position:"+position);
    }

    /**
     * 参数聚合:ArgumentsAccessor
     * 解决了多参数造成方法签名过大问题
     * @param arguments
     */
    @ParameterizedTest
    @CsvSource({
            "张三, 8000, 1990-05-20",
            "李四, 10000, 1990-10-22"
    })
    void testWithArgumentsAccessor(ArgumentsAccessor arguments) {
        String name = arguments.getString(0);
        Double sal = arguments.getDouble(1);
        LocalDate birthday = arguments.get(2, LocalDate.class);
        System.out.println(name);
        System.out.println(sal);
        System.out.println(birthday);

    }

}

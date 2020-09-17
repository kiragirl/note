import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

//@RunWith(MockitoJUnitRunner.class)
public class StreamTest {
    @Test
    public void testSomething(){

        List<String> names = Arrays.asList("张三", "李四", "王老五", "李三", "刘老四", "王小二", "张四", "张五六七");

        String maxLenStartWithZ = names.stream()
                .filter(name -> name.startsWith("张"))
                .mapToInt(String::length)
                .max()
                .toString();
    }
}

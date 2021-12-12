package ro.ase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLister {

    private static final List<Class<?>> TEST_LIST = List.of(ApplicationTest.class);

    public static List<String> listTests() {
        List<String> result = new ArrayList<>();

        for(var clazz : TEST_LIST) {
            for(var method : clazz.getMethods()) {
                for(var annotation : method.getAnnotations()) {
                    if(annotation instanceof Test) {
                        var testName = String.format("%s#%s", clazz.getSimpleName(), method.getName());
                        result.add(testName);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var tests = listTests();
        for(var test : tests) {
            System.out.println(test);
        }
    }
}

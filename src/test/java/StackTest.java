import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.skvortsov.MyStack;
import com.skvortsov.StackException;

public class StackTest {
    @Test
    void shouldThrowFullStackException() throws StackException {
        MyStack stack = new MyStack(3);
        stack.addElement("1");
        stack.addElement("1");
        stack.addElement("1");
        StackException fullStackException = Assertions.assertThrows(StackException.class, () -> stack.addElement("1"));
        Assertions.assertEquals(fullStackException.getMessage(), "Cant add element. Stack is full");
    }

    @Test
    void shouldThrowEmptyStackException() throws StackException {
        MyStack stack = new MyStack(3);
        stack.addElement("1");
        stack.deleteElement();
        StackException emptyStackException = Assertions.assertThrows(StackException.class, () -> stack.deleteElement());
        Assertions.assertEquals(emptyStackException.getMessage(), "Cant delete element. Stack is empty");
    }

    @Test
    void optionalTestObjectIsPresent() throws StackException {
        MyStack stack = new MyStack(3);
        stack.addElement("1");
        String element = stack.showTopElement();
        Object objectElement = stack.showTopElement();
        Assertions.assertEquals(element, "1");
        Assertions.assertEquals(objectElement, "1");
        Assertions.assertTrue(element.equals("1"));
        Assertions.assertTrue(objectElement.equals("1"));

    }

    @Test
    void optionalTestObjectIsNull() throws StackException {
        MyStack stack = new MyStack(3);
        stack.addElement(null);
        String element = stack.showTopElement();
        Object objectElement = stack.showTopElement();
        Assertions.assertEquals(element, "Object is null");
        Assertions.assertEquals(objectElement, "Object is null");
        Assertions.assertTrue(element.equals("Object is null"));
        Assertions.assertTrue(objectElement.equals("Object is null"));
    }
}
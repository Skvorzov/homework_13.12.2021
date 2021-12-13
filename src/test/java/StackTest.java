import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.skvortsov.MyStack;
import com.skvortsov.StackException;

import java.util.Optional;

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
    void optionalTest() throws StackException {
        MyStack stack = new MyStack(3);
        stack.addElement("1");
        String element = stack.showTopElement().get();
        Object objectElement = stack.showTopElement().get();
        Assertions.assertEquals(element, "1");
        Assertions.assertEquals(objectElement, "1");
        Assertions.assertTrue(element.equals("1"));
        Assertions.assertTrue(objectElement.equals("1"));
    }
}
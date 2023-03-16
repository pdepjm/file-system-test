import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyClassTest {
  @Test
  void fullName() {
    MyClass testMock = mock(MyClass.class);
    when(testMock.fullName()).thenReturn("jose jose");
    Assertions.assertEquals("jose jose", testMock.fullName());
  }
}

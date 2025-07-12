import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
public class MyServiceTest {
    @Test
    public void testExternalApi(){
    ExternalApi mockApi = mock(ExternalApi.class);
    when(mockApi.getDate()).thenReturn("Mock Data");
    MyService service = new MyService(mockApi);
    String result = service.fetchData();
    assertEquals("Mock Data",result);
   
}
}


import org.example.ExternalApi;
import org.example.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {
    @Test
    void test(){
        ExternalApi mockob= Mockito.mock(ExternalApi.class);
        when(mockob.add(5,10)).thenReturn(15);

        MyService service=new MyService(mockob);
        int res=service.addTwoNum();
        assertEquals(15,res);

        verify(mockob).add(5,10);
    }
}

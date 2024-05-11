import org.testng.annotations.DataProvider;

public class dataforact8 {

    @DataProvider(name = "Information")
    public Object[][] credentials(){
        return new Object[][] {
                {"Sujeevi", "CA", "sujeevi@test.com", "7760400249", "Message1"},
                {"Vismaya", "CA", "vismaya@test.com", "7899479489", "Message2"},
                {"Megha", "CV", "megha@test.com", "9448166117", "Message3"}};
    }
}

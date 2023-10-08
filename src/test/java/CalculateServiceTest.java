import git.homework4.CalculateService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/CalculateData.csv")
    public void CalculateServiceAutoTest() {
    }
}
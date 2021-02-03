package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {

    @Test
    public void split() {
        String[] values = "1,2".split(",");
        assertThat(values).contains("1","2");
        assertThat(values).containsExactly("1","2");
    }
}

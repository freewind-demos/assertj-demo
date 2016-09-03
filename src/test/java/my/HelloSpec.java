package my;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloSpec {

    @Test
    public void shouldSayHello() throws Exception {
        String greeting = Hello.hello("fest");
        assertThat(greeting).isEqualTo("Hello, fest");
    }

}

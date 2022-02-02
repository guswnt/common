package com.example.commonTest

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TempTest {
    @Test
    fun temp(){
        assertThat(1).isEqualTo(1)

    }
}
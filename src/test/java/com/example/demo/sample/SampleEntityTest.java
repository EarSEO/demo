package com.example.demo.sample;

import com.example.demo.entity.SampleEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SampleEntityTest {

    @Test
    @DisplayName("SampleEntity 객체를 Builder로 생성하고 검증한다.")
    void createSampleEntity() {
        // Given: 테스트용 데이터 준비
        Long expectedId = 1L;
        String expectedTitle = "테스트 제목";
        String expectedDescription = "테스트 설명";
        int expectedCount = 10;

        // When: SampleEntity 객체 생성
        SampleEntity entity = SampleEntity.builder()
                .id(expectedId)
                .title(expectedTitle)
                .description(expectedDescription)
                .count(expectedCount)
                .build();

        // Then: 생성된 객체 검증
        assertThat(entity).isNotNull();
        assertThat(entity.getId()).isEqualTo(expectedId);
        assertThat(entity.getTitle()).isEqualTo(expectedTitle);
        assertThat(entity.getDescription()).isEqualTo(expectedDescription);
        assertThat(entity.getCount()).isEqualTo(expectedCount);
    }
}

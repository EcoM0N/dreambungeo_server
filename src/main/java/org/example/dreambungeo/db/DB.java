package org.example.dreambungeo.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DB {

    private static List<DataEntity> dataStore = new ArrayList<>();

    // 데이터 저장
    public void save(DataEntity dataEntity) {
        dataStore.add(dataEntity);
    }

    // 데이터 조회 (ID로)
    public Optional<DataEntity> findById(String id) {
        return dataStore.stream()
                .filter(data -> data.getId() == id)
                .findFirst();
    }

    // 데이터 수정
    public void update(String id, int value) {
        findById(id).ifPresent(data -> data.setValue(value));
    }

    // 데이터 삭제
    public void delete(String id) {
        dataStore.removeIf(data -> data.getId() == id);
    }

    // 모든 데이터 조회
    public List<DataEntity> findAll() {
        return dataStore;
    }

    // 데이터 엔티티 클래스
    public static class DataEntity {
        private String id;
        private int value;

        public DataEntity(String id, int value) {
            this.id = id;
            this.value = value;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = String.valueOf(id);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}

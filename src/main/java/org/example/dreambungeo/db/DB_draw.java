package org.example.dreambungeo.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DB_draw {

    private static List<DataEntity> dataStore = new ArrayList<>();

    // 데이터 저장
    public void save(DataEntity dataEntity) {
        dataStore.add(dataEntity);
    }

    // 데이터 조회 (ID로)
    public Optional<DataEntity> findById(int id) {
        String ID = String.valueOf(id);
        return dataStore.stream()
                .filter(data -> data.getId() == ID)
                .findFirst();
    }



    // 모든 데이터 조회
    public List<DataEntity> findAll() {
        return dataStore;
    }

    // 데이터 엔티티 클래스
    public static class DataEntity {
        private String id;

        public DataEntity(String id) {
            this.id = id;

        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = String.valueOf(id);
        }

    }
}

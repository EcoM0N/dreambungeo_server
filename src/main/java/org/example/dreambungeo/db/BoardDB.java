package org.example.dreambungeo.db;

import org.example.dreambungeo.게시판.CalculationResult;

public class BoardDB {

    public static void main(String[] args) {
        DB db = new DB();
        CalculationResult calculationResult = new CalculationResult();
        Integer minus = calculationResult.getMinus();
        Integer remain = calculationResult.getRemain();

        // 데이터 저장
        db.save(new DB.DataEntity("minus", minus));
        db.save(new DB.DataEntity("remain", remain));



    }
}

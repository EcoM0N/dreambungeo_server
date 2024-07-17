package org.example.dreambungeo.db;

import org.example.dreambungeo.게시판.CalculationResult;
import org.example.dreambungeo.도감조회.DrawReqDTO;

public class draw {
    public static void main(String[] args) {
        DB db = new DB();
        DrawReqDTO drawReqDTO = new DrawReqDTO();
        Integer index = drawReqDTO.getIndex();

        db.save(new DB.DataEntity(index));

    }
}

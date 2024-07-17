package org.example.dreambungeo.db;

import java.util.ArrayList;
import java.util.List;

public class FishDB {
    private static List<Fish> fishList = new ArrayList<>();

    static {
        // 임시 데이터 추가
        fishList.add(new Fish(7, "토끼피쉬", "내가 헤엄칠 물이 점점 줄고 있어ㅠㅠ"));
        fishList.add(new Fish(6, "금붕어", "나의 금빛 비늘을 뽐내야하는데 살 곳이 없어서 뽐낼 수가 없어ㅠ"));
        fishList.add(new Fish(3, "민초피쉬", "아니 반민초파라고? 민초를 왜 안먹어? 난 민초가 아니라 물이 오염되서 썩은 곰팡이 무늬를 가지고 있는고얌 ㅠㅠ"));
        fishList.add(new Fish(2, "대한피쉬", "동해물과 백두산이 마르고 닳기전에 말라 죽을판이야 ㅠㅠㅠ"));
        fishList.add(new Fish(5, "바오피쉬", "푸바오 할머니 보고싶엉 헤엄쳐서 가고싶은데 헤엄칠 물이 없어ㅠ"));
        fishList.add(new Fish(4, "바비 물고기", "암어 바비 피쉬 인더 바비 워터~ 웁스 나는 깨끗한 물에서만 사는데ㅠ 물이 너무 더티해서 살 수가 없어"));
        fishList.add(new Fish(1, "니모임?", "니모임을 찾아서! 그런데.. 나는 내가 살 곳을 찾고있지…"));
        fishList.add(new Fish(9, "형광물고기", "내가 사는 곳에 물이 다 메말랐어 ㅠㅠ 물이 없으면 형광빛을 못 내는데ㅠㅠㅠ"));
        fishList.add(new Fish(8, "꿀꿀이", "꿀꿀 먹을게없다꿀. 먹어도먹어도 배가고프다꿀. 점점 먹을게 없어지고 있다꿀"));
    }

    // 모든 Fish 목록 반환
    public static List<Fish> getAllFish() {
        return fishList;
    }

    // index로 Fish 찾기
    public static Fish getFishByIndex(int index) {
        for (Fish fish : fishList) {
            if (fish.getIndex() == index) {
                return fish;
            }
        }
        return null;
    }
}


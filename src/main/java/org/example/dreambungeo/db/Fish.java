package org.example.dreambungeo.db;


public class Fish {
    private int index;
    private String name;
    private String content;

    // 기본 생성자
    public Fish() {
    }

    // 생성자
    public Fish(int index, String name, String content) {
        this.index = index;
        this.name = name;
        this.content = content;
    }

    // Getter 및 Setter
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

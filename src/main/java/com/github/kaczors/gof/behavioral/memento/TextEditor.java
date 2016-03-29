package com.github.kaczors.gof.behavioral.memento;

class TextEditor {

    private String content = "";

    void addText(String text){
        content += text;
    }

    Snapshot save(){
        return new Snapshot(content);
    }

     void restore(Snapshot snapshot){
        this.content = snapshot.getContent();
    }

    public String getContent() {
        return content;
    }
}

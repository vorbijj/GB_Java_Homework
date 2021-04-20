package com.company.lesson8;

public enum MarkObstacle {

    RUN("Running Track"),
    JUMP("Wall");

    private final String nameAction;

    MarkObstacle(String nameAction) {
        this.nameAction = nameAction;
    }

    public String getNameAction() {
        return nameAction;
    }
}

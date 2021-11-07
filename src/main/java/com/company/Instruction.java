package com.company;

public enum Instruction {
    MOVE('M'),
    LEFT('L'),
    RIGHT('R');
    private Character shortName;

    Instruction(Character shortName) {
        this.shortName = shortName;
    }

    public Character getShortName() {
        return shortName;
    }
}

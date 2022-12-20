package ru.mirea.task2.opt3;

class Shape {
    String nameOfShape;

    public Shape(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }
    @Override
    public String toString() {
        return "Название фигуры " + nameOfShape;
    }
}

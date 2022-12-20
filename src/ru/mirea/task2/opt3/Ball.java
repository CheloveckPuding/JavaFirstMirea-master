package ru.mirea.task2.opt3;

class Ball {
    String WhatBall;
    int Size;
    public Ball(String WhatBall, int Size){
        this.WhatBall = WhatBall;
        this.Size = Size;
    }
    public String Print(){
        return "У вас есть "+ WhatBall+" Он имеет размер "+Size;
    }
}

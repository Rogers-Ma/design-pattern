package com.mzw.principle.ocp.improve;

public class Ocp {

    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OrtherGraphic());
    }

}

// 方法2

// 把创建的Shape类做成抽象类，并提供一个抽象的方法draw，让子类去实现即可，这样我们有新的图形时，只需要让新的图形继承Shape类，并实现draw方法即可，使用方的代码无需修改
//这是一个用于绘图的类 [使用方]

class GraphicEditor {
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}

//提供方
//Shape类，基类
abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

class OrtherGraphic extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制其他图形");
    }
}
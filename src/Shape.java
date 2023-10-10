class Shape {

    int getcorner(){
        return 0;
    }
}

class Rectangle extends Shape{

    int getcorner(){
        return 4;
    }

    int getparentcorner() {
        return super.getcorner();

    }
}


package mouse;

/**
 * * 2 Создайте класс Компьютерная мышь. В классе определите метод click(), который принимает координаты x и у клика на экране.
 * * Метод должен возвращать расстояние между точкой прошлого клика мыши и точкой текущего клика. Например,
 * * Первый клик: x=5, y=10. Второй клик: x=3, y=15. Расстояние: 5,39
 */
public class Mouse {
    private Integer lastX;
    private Integer lastY;

    public Mouse(int lastX, int lastY) {
        this.lastX = lastX;
        this.lastY = lastY;
    }

    public double click(int currentX, int currentY) {
        if (lastX == null && lastY == null) {
            lastX = currentX;
            lastY = currentY;
            return 0;
        } else {
            return Math.sqrt(Math.pow(currentX - lastX, 2) +
                    Math.pow(currentY - lastY, 2));
        }
    }
}

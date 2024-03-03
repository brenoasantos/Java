// Point.java
public class Point {
    public int x = 0, y = 0;

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public void moveBy(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    // Sobrescrevendo o método equals para comparação de objetos Point
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    // Sobrescrevendo o método toString para representação em String
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public static void main(String[] args) {
        // Código para testar a classe Point
        Point point = new Point();
        point.setX(5);
        point.setY(10);
        System.out.println(point.toString());
    }
}

class ScreenPoint extends Point {
    // Sobrescrevendo os setters para garantir o invariante de classe
    @Override
    public void setX(int x) {
        if (validateCoordinate(x)) {
            super.setX(x);
        } else {
            throw new IllegalArgumentException("A coordenada X deve estar entre 0 e 300");
        }
    }

    @Override
    public void setY(int y) {
        if (validateCoordinate(y)) {
            super.setY(y);
        } else {
            throw new IllegalArgumentException("A coordenada Y deve estar entre 0 e 300");
        }
    }

    // Método para validar se uma coordenada está dentro do intervalo [0, 300]
    private boolean validateCoordinate(int coordinate) {
        return coordinate >= 0 && coordinate <= 300;
    }
}

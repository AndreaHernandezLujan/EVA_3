
package eva3_8_5d;

public class EVA3_8_5D {

    
    public static void main(String[] args) {
        int cubo[][][][][] = new int[10][5][3][2][4]; // 1200 enteros (10 * 5 * 3 * 2 * 4)
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    for (int l = 0; l < cubo[i][j][k].length; l++) {
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                            cubo[i][j][k][l][m] = (int) (Math.random() * 100);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    for (int l = 0; l < cubo[i][j][k].length; l++) {
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                            System.out.println("[" + cubo[i][j][k][l][m] + "]");
                        }
                    }
                }
            }
        }
    }
}

    


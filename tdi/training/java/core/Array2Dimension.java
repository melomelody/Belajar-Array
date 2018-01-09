package tdi.training.java.core ;
public class Array2Dimension{

    public static void main(String[] args){
        Integer[][] values = {{1, 2, 3}, {2, 3, 5}, {3, 4, 5}};

        // menampilkan data pada index ke 0 dan 2
        System.out.println(values[0][2]);

        // menampilkan isi yang ada di array 2 dimention
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                    System.out.print(values[i][j]);
            }
            System.out.println();
            }
        }
    }
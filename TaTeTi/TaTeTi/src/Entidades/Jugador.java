
package Entidades;


public class Jugador {
    private String nombre;
    private imagenAsociada tipoImg;
    private int tablero[][];

    public Jugador() {
        tablero=new int[3][3];
        limpiar();
    }

    public Jugador(String nombre, imagenAsociada tipoImg) {
        this.nombre = nombre;
        this.tipoImg = tipoImg;
        tablero=new int[3][3];
        limpiar();
    }

    

    public Jugador(imagenAsociada tipoImg) {
        this.tipoImg = tipoImg;
        tablero=new int[3][3];
    }
    
    public void limpiar(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j]=0;
            }
        }
    }
    
    public imagenAsociada tresEnRaya(Jugador jugadorRival){
        if(tablero[0][0]==1 && tablero[0][1]==1 && tablero[0][2]==1)return imagenAsociada.LINEA1;
        if(tablero[1][0]==1 && tablero[1][1]==1 && tablero[1][2]==1)return imagenAsociada.LINEA2;
        if(tablero[2][0]==1 && tablero[2][1]==1 && tablero[2][2]==1)return imagenAsociada.LINEA3;
        if(tablero[0][0]==1 && tablero[1][0]==1 && tablero[2][0]==1)return imagenAsociada.LINEA4;
        if(tablero[0][1]==1 && tablero[1][1]==1 && tablero[2][1]==1)return imagenAsociada.LINEA5;
        if(tablero[0][2]==1 && tablero[1][2]==1 && tablero[2][2]==1)return imagenAsociada.LINEA6;
        if(tablero[2][0]==1 && tablero[1][1]==1 && tablero[0][2]==1)return imagenAsociada.LINEA8;
        if(tablero[0][0]==1 && tablero[1][1]==1 && tablero[2][2]==1)return imagenAsociada.LINEA7;
        
        int contador=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(tablero[i][j]==1){
                    contador++;
                }
                if(jugadorRival.getTablero()[i][j]==1){
                    contador++;
                }
            }
        }
        
        if(contador==9)return imagenAsociada.EMPATE;
        
        return null;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public imagenAsociada getTipoImg() {
        return tipoImg;
    }

    public void setTipoImg(imagenAsociada tipoImg) {
        this.tipoImg = tipoImg;
    }
    
    
}

public class SmartPhone {
    private String marca;
    private String modelo;
    private int memoria;
    private int pantalla;
    private String sistemaOperativo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getPantalla() {
        return pantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public SmartPhone(String marca, String modelo, int memoria, int pantalla, String sistemaOperativo) {
        this.marca = marca;
        this.modelo= modelo;
        this.sistemaOperativo= sistemaOperativo;
        this.memoria= memoria;
        this.pantalla= pantalla;
    }

    void showHora(){
        System.out.println("Mostar la hora actual");
    }
    void conectarInternet(){
        System.out.println("Conectarse a Internet");
    }
    void hacerLlamada(){
        System.out.println("Hacer llamada");
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Celular{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", memoria='" + memoria +" Gb" +'\'' +
                ", pantalla='" + pantalla +" Pulg." + '\'' +
                ", Sistama Operativo='" + sistemaOperativo  + '\'' +
                '}';
    }

    public static void main(String[] args){
        SmartPhone celular = new SmartPhone("Sony","E231", 256,5,"Oreo Android");
        SmartPhone celular2 = new SmartPhone("Samsung","A1", 128,5,"KitKat Android");
        System.out.println(celular.toString());
        System.out.println(celular2.toString());
    }
}

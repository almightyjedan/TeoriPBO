public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim Pesan ke Nomor : " + nomorTujuan);
        System.out.println("Dengan isi pesan adalah : " + pesan);
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("Mengirim Pesan ke Nomor : " + nomorTujuan1 + " dan " + nomorTujuan2);
        System.out.println("Dengan isi pesan adalah : " + pesan);
    }
    
    public void kirimPesan(String[] daftarNomor, String pesan) {
        for (String nomor : daftarNomor) {
            System.out.println("Mengirim Pesan ke Nomor : " + nomor);
            System.out.println("Dengan isi pesan adalah : " + pesan);
        }
    }
}
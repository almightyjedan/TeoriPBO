public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim Pesan ke Nomor : " + nomorTujuan);
        System.out.println("Dengan isi pesan adalah : " + pesan);
    }

    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim e-Mail ke : " + emailTujuan);
        System.out.println("Dengan Subjek      : " + subjek);
        System.out.println("Dengan Isi Pesan   : " + pesan);
    }


    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}
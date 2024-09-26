public class Main {
    public static void main(String[] args) {
        // Membuat array atau list dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Iphone", "14 Promax");
        daftarHandphone[1] = new FeaturePhone("Samsung", "Z Flip 4");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.kirimPesan("08123456789", "Halo Saya Zaidan"); // Mengirim pesan ke satu nomor
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).kirimPesan("zswyert@gmail.com", "Praktikum PBO", "Muhammad Zaidan Ahbab - 4523210081");
            } else {
                hp.kirimPesan("085812345678", "081234567891", "Aku Zaidan, Kamu siapa?");
            }
        
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                // Cast ke objek Smartphone dan panggil metode aksesInternet
                ((Smartphone) hp).aksesInternet();
                // Kirim email menggunakan metode overload
            } else if (hp instanceof FeaturePhone) {
                // Cast ke objek FeaturePhone dan panggil metode mainGameSnake
                ((FeaturePhone) hp).mainGameSnake();
            } 
        }

        // Contoh mengirim pesan ke beberapa nomor sekaligus
        String[] daftarNomor = {"082345678912", "083456789123", "084567890123"};
        System.out.println("\nMengirim pesan ke beberapa nomor sekaligus:");
        for (Handphone hp : daftarHandphone) {
            hp.kirimPesan(daftarNomor, "Haloooo nama Saya Zaidan");
        }
    }
}
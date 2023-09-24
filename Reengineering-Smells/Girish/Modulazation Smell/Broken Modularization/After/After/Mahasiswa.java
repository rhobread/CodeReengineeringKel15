package After;

public class Mahasiswa {
    private DataMahasiswa data;

    public Mahasiswa(DataMahasiswa data) {
        this.data = data;
    }

    public String getNIM() {
        return data.getNIM();
    }

    //...
}

// jadi Mahasiswa ngakses NIM pake setter getter yang ada di DataMahasiswa
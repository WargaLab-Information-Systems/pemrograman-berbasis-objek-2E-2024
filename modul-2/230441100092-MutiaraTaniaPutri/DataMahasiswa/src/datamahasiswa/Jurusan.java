package datamahasiswa;

public class Jurusan {
    private static final String[][]JURUSAN = {
        {"41", "Teknik Informatika"},
        {"42", "Teknik Industri"},
        {"43", "Teknik Elektro"},
        {"44", "Sistem Informasi"},
        {"45", "Teknik Mesin"},
        {"46", "Teknik Mekatronika"},
    };
    
    public static String getJurusan(String jurusanCode){
        for (String[] pair : JURUSAN){
            if (pair[0].equals(jurusanCode)){
                return pair[1];
            }
        }
        return null;
    }
}
